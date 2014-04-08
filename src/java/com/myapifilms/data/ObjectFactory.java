//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.5-2 ��ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ���ʱ��: 2014.04.07 ʱ�� 08:11:04 PM CST 
//


package com.myapifilms.data;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myapifilms.data package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myapifilms.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MAFMovie }
     * 
     */
    public MAFMovie createMovie() {
        return new MAFMovie();
    }

    /**
     * Create an instance of {@link Movie.Countries }
     * 
     */
    public MAFMovie.Countries createMovieCountries() {
        return new MAFMovie.Countries();
    }

    /**
     * Create an instance of {@link Movie.Directors }
     * 
     */
    public MAFMovie.Directors createMovieDirectors() {
        return new MAFMovie.Directors();
    }

    /**
     * Create an instance of {@link Movie.Genres }
     * 
     */
    public MAFMovie.Genres createMovieGenres() {
        return new MAFMovie.Genres();
    }

    /**
     * Create an instance of {@link Movie.Languages }
     * 
     */
    public MAFMovie.Languages createMovieLanguages() {
        return new MAFMovie.Languages();
    }

    /**
     * Create an instance of {@link Movie.Writers }
     * 
     */
    public MAFMovie.Writers createMovieWriters() {
        return new MAFMovie.Writers();
    }

}
