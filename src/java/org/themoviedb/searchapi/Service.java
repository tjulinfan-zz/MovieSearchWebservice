/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.themoviedb.searchapi;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.me.config.Configs;

/**
 *
 * @author LinFan
 */
public class Service {
    
    private static final String GET_URL = Configs.TMD_API_BASE_URL + "/search/movie";
    
    //Searching movies from themoviedb by keyword
    public static void getMovies(String keyword, List<org.me.data.search.Movie> movies) throws UnsupportedEncodingException {
        String getUrl = GET_URL
                + "?" + Configs.TMD_API_KEY_LABEL + "=" + Configs.TMD_API_KEY_VALUE 
                + "&" + Configs.TMD_QUERY_LABEL + "=" + URLEncoder.encode(keyword, "utf-8");        
        
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            conn.setConnectTimeout(Configs.TIME_OUT_MS);
            
            Gson gson = new Gson();
            SearchResults srs = gson.fromJson( new BufferedReader(new InputStreamReader(conn.getInputStream())), SearchResults.class);
            List<Result> results = srs.getResults();
            for (Result result : results) {
                org.themoviedb.movieapi.Movie movieInfo = org.themoviedb.movieapi.Service.getMovie(result.getId());
                
                org.me.data.search.Movie movie = new org.me.data.search.Movie();
                
                movie.setIMDBId(movieInfo.getImdb_id());
                movie.setOriginalTitle(movieInfo.getOriginal_title());
                movie.setTitle(movieInfo.getTitle());
                movie.setTMDId(new BigInteger(String.valueOf(movieInfo.getId())));
                if (movieInfo.getPoster_path() != null && !movieInfo.getPoster_path().equals("")) {
                    movie.setPosterImgUrl(Configs.TMD_POSTER_BASE_URL_W185 + movieInfo.getPoster_path());
                } else {
                    movie.setPosterImgUrl(null);
                }
                
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    movie.setReleaseDate(simpleDateFormat.parse(movieInfo.getRelease_date()));
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                    movie.setReleaseDate(null);
                }
                
                movies.add(movie);
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "URL invalid", ex);
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "API Error", ex);
        }
    }
}
