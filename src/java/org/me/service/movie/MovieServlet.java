/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.service.movie;

import com.myapifilms.data.MAFMovie;
import com.rottentomatoes.movieapi.Abridged_cast;
import com.rottentomatoes.movieapi.RTMovie;
import com.rottentomatoes.reviewapi.RTReview;
import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
import com.trailer.data.TATrailer;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.me.data.movie.Casts;
import org.me.data.movie.Countries;
import org.me.data.movie.Directors;
import org.me.data.movie.Genres;
import org.me.data.movie.Languages;
import org.me.data.movie.Movie;
import org.me.data.movie.ObjectFactory;
import org.me.data.movie.Review;
import org.me.data.movie.Reviews;
import org.me.data.movie.Trailer;
import org.me.data.movie.Trailers;
import org.me.data.movie.Writers;
import org.themoviedb.movieapi.TMDMovie;

/**
 *
 * @author LinFan
 */
@WebServlet(name = "MovieServlet", urlPatterns = {"/Movie"})
public class MovieServlet extends HttpServlet {

    private Movie getMovie(Integer TMDId) throws Exception {
        Movie movie = new Movie();

        //Getting movie from TMD API
        TMDMovie tmdMovie = org.themoviedb.movieapi.Service.getMovie(TMDId);
        if (tmdMovie == null) {
            throw new Exception("No Such Movie");
        }
        movie.setTMDId(BigInteger.valueOf(tmdMovie.getId()));
        movie.setIMDBId(tmdMovie.getImdb_id());
        movie.setOriginalTitle(tmdMovie.getOriginal_title());
        movie.setHomepage(tmdMovie.getHomepage());
        movie.setRuntime(BigInteger.valueOf(tmdMovie.getRuntime()));
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            movie.setReleaseDate(simpleDateFormat.parse(tmdMovie.getRelease_date()));
        } catch (ParseException ex) {
            System.out.println("Date ParseException:  " + ex.getMessage());
            movie.setReleaseDate(null);
        }

        //Getting movie from MAF API
        MAFMovie mafMovie = com.myapifilms.movieapi.Service.getMovie(movie.getIMDBId());
        if (mafMovie != null) {
            movie.setIMDBUrl(mafMovie.getUrlIMDB());
            movie.setTitle(mafMovie.getTitle());
            movie.setPosterImgUrl(mafMovie.getUrlPoster());
            movie.setPlot(mafMovie.getPlot());
            movie.setSimplePlot(mafMovie.getSimplePlot());

            List<String> mafCountries = mafMovie.getCountries().getCountry();
            ObjectFactory fac = new ObjectFactory();
            Countries countries = fac.createCountries();
            for (String c : mafCountries) {
                countries.getCountry().add(c);
            }
            movie.setCountries(countries);

            List<String> mafDirectors = mafMovie.getDirectors().getDirector();
            Directors directors = fac.createDirectors();
            for (String d : mafDirectors) {
                directors.getDirector().add(d);
            }
            movie.setDirectors(directors);

            List<String> mafWriters = mafMovie.getWriters().getWriter();
            Writers writers = fac.createWriters();
            for (String w : mafWriters) {
                writers.getWriter().add(w);
            }
            movie.setWriters(writers);

            List<String> mafGenres = mafMovie.getGenres().getGenre();
            Genres genres = fac.createGenres();
            for (String g : mafGenres) {
                genres.getGenre().add(g);
            }
            movie.setGenres(genres);

            List<String> mafLanguages = mafMovie.getLanguages().getLanguage();
            Languages languages = fac.createLanguages();
            for (String l : mafLanguages) {
                languages.getLanguage().add(l);
            }
            movie.setLanguages(languages);

        }

        //Getting movie from RT API
        RTMovie rtMovie = com.rottentomatoes.movieapi.Service.getMovie(movie.getIMDBId());
        if (rtMovie != null) {
            movie.setYear(BigInteger.valueOf(rtMovie.getYear()));
            movie.setCriticsConsensus(rtMovie.getCritics_consensus());
            List<Abridged_cast> rtCasts = rtMovie.getAbridged_cast();
            ObjectFactory fac = new ObjectFactory();
            Casts casts = fac.createCasts();
            for (Abridged_cast ac : rtCasts) {
                casts.getCast().add(ac.getName());
            }
            movie.setCasts(casts);
            
            Reviews reviews = fac.createReviews();
            List<RTReview> rtReviews = com.rottentomatoes.reviewapi.Service.getReviews(rtMovie.getLinks().getReviews());
            for (RTReview rtReview : rtReviews) {
                Review review = fac.createReview();
                review.setCritic(rtReview.getCritic());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                review.setDate(simpleDateFormat.parse(rtReview.getDate()));
                review.setQuote(rtReview.getQuote());
                review.setLink(rtReview.getLinks().getReview());
                reviews.getReview().add(review);
            }
            movie.setReviews(reviews);
        }
        
        //Getting movie from TA API
        ObjectFactory fac = new ObjectFactory();
        Trailers trailers = fac.createTrailers();
        List<TATrailer> taTrailers = com.trailer.trailerapi.Service.getTrailers(movie.getIMDBId());
        for (TATrailer taTrailer : taTrailers) {
            Trailer trailer = fac.createTrailer();
            trailer.setTitle(taTrailer.getTitle());
            trailer.setLink(taTrailer.getLink());
            trailer.setEmbed(taTrailer.getEmbed());
            trailers.getTrailer().add(trailer);
        }
        movie.setTrailers(trailers);

        return movie;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/xml;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String q = request.getParameter("tmdid");
            Integer tmdId = Integer.parseInt(q);
            try {
                System.out.println(tmdId);
                Movie movie = getMovie(tmdId);

                JAXBContext jc = JAXBContext.newInstance(Movie.class);
                Marshaller m = jc.createMarshaller();
                m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://assignment.lf.org/movieapi MovieXmlSchema.xsd");
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                m.setProperty(CharacterEscapeHandler.class.getName(),
                        new CharacterEscapeHandler() {
                            @Override
                            public void escape(char[] ac, int i, int j, boolean flag,
                                    Writer writer) throws IOException {
                                writer.write(ac, i, j);
                            }
                        });
                m.marshal(movie, out);

            } catch (JAXBException ex) {
                //Logger.getLogger(SearchServlet.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("JAXBException:  " + ex.getErrorCode());
            } catch (Exception ex) {
                Logger.getLogger(MovieServlet.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
                System.out.println(ex.getMessage());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
