//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.5-2 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2014.04.08 时间 01:43:58 PM CST 
//


package org.me.data.movie;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.data.movie package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Movie_QNAME = new QName("http://assignment.lf.org/movieapi", "movie");
    private final static QName _ReviewLink_QNAME = new QName("http://assignment.lf.org/movieapi", "link");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.data.movie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Languages }
     * 
     */
    public Languages createLanguages() {
        return new Languages();
    }

    /**
     * Create an instance of {@link Reviews }
     * 
     */
    public Reviews createReviews() {
        return new Reviews();
    }

    /**
     * Create an instance of {@link Trailer }
     * 
     */
    public Trailer createTrailer() {
        return new Trailer();
    }

    /**
     * Create an instance of {@link Trailers }
     * 
     */
    public Trailers createTrailers() {
        return new Trailers();
    }

    /**
     * Create an instance of {@link Genres }
     * 
     */
    public Genres createGenres() {
        return new Genres();
    }

    /**
     * Create an instance of {@link Casts }
     * 
     */
    public Casts createCasts() {
        return new Casts();
    }

    /**
     * Create an instance of {@link Writers }
     * 
     */
    public Writers createWriters() {
        return new Writers();
    }

    /**
     * Create an instance of {@link Directors }
     * 
     */
    public Directors createDirectors() {
        return new Directors();
    }

    /**
     * Create an instance of {@link Countries }
     * 
     */
    public Countries createCountries() {
        return new Countries();
    }

    /**
     * Create an instance of {@link Review }
     * 
     */
    public Review createReview() {
        return new Review();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://assignment.lf.org/movieapi", name = "movie")
    public JAXBElement<Movie> createMovie(Movie value) {
        return new JAXBElement<Movie>(_Movie_QNAME, Movie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://assignment.lf.org/movieapi", name = "link", scope = Review.class)
    public JAXBElement<String> createReviewLink(String value) {
        return new JAXBElement<String>(_ReviewLink_QNAME, String.class, Review.class, value);
    }

}
