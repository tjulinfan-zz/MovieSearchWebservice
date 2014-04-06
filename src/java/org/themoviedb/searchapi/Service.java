/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.themoviedb.searchapi;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.me.config.Configs;
import org.me.data.search.Movie;

/**
 *
 * @author LinFan
 */
public class Service {
    
    private static final String GET_URL = Configs.API_BASE_URL + "/search/movie";
    
    public static void getMovies(String keyword) throws UnsupportedEncodingException {
        String getUrl = GET_URL
                + "?" + Configs.API_KEY_LABEL + "=" + Configs.API_KEY_VALUE 
                + "&" + Configs.QUERY_LABEL + "=" + URLEncoder.encode(keyword, "utf-8");        
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            
            Gson gson = new Gson();
            SearchResults srs = gson.fromJson( new BufferedReader(new InputStreamReader(conn.getInputStream())), SearchResults.class);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "URL invalid", ex);
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "API Error", ex);
        }
    }
    
    public static void main(String[] args) {
        try {
            getMovies("twilight");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "URL param invalid", ex);
        }
    }
}
