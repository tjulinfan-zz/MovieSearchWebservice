/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.config;

/**
 *
 * @author LinFan
 */
public class Configs {
    //-----------------TMD api configs---------------------------------
    public static final String TMD_API_BASE_URL = "https://api.themoviedb.org/3";
    
    public static final String TMD_API_KEY_LABEL = "api_key";
    public static final String TMD_API_KEY_VALUE = "73fe138b382e90fbdcbb53d875711bdd";
    
    public static final String TMD_QUERY_LABEL = "query";
    
    public static final String TMD_POSTER_BASE_URL_W185 = "http://image.tmdb.org/t/p/w185";
    //--------------------------------------------------------------------
    
    //----------------OMD api configs----------------------------------
    public static final String OMD_API_BASE_URL = "http://www.omdbapi.com/";
    public static final String OMD_IMDBID_LABEL = "t";
    //--------------------------------------------------------------------        
    
    //-----------------MAF api configs----------------------------------
    public static final String MAF_API_BASE_URL = "http://www.myapifilms.com/search";
    public static final String MAF_IMDBID_LABEL = "idIMDB";
    public static final String MAF_FORMAT_LABEL = "format";
    //--------------------------------------------------------------------
    
    //-----------------Trailer api configs--------------------------------
    public static final String TRAILER_API_BASE_URL = "http://api.traileraddict.com/";
    public static final String TRAILER_IMDBID_LABEL = "imdb";
    public static final String TRAILER_WIDTH_LABEL = "width";
    //--------------------------------------------------------------------
    
    //----------------RT api configs-------------------------------------
    public static final String RT_API_BASE_URL = "http://api.rottentomatoes.com/api/public/v1.0";
    public static final String RT_API_KEY_LABEL = "apikey";
    public static final String RT_API_KEY_VALUE = "5chxqkcunky9usnqyj7djm48";
    public static final String RT_ALIAS_TYPE_LABEL = "type";
    public static final String RT_ALIAS_TYPE_VALUE = "imdb";
    public static final String RT_IMDBID_LABEL = "id";
           
    public static final int TIME_OUT_MS = 30 * 1000;
}
