/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rottentomatoes.movieapi;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.me.config.Configs;


/**
 *
 * @author LinFan
 */
public class Service {

    private static final String GET_URL = Configs.RT_API_BASE_URL + "/movie_alias.json";
    
    //Getting movie information by using IMDDId
    public static void getMovie(String IMDBId) {
        if (IMDBId.startsWith("tt")) {
            IMDBId = IMDBId.substring(2);
        }
        String getUrl = GET_URL
                + "?"+ Configs.RT_API_KEY_LABEL + "=" + Configs.RT_API_KEY_VALUE
                + "&" + Configs.RT_ALIAS_TYPE_LABEL + "=" + Configs.RT_ALIAS_TYPE_VALUE
                + "&" + Configs.RT_IMDBID_LABEL + "=" + IMDBId;
        System.out.println(getUrl);
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            conn.setConnectTimeout(Configs.TIME_OUT_MS);
            
            Gson gson = new Gson();
            RTMovie movie = gson.fromJson(new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8")), RTMovie.class);
            System.out.println(movie.getTitle());
        } catch (MalformedURLException ex) {
            Logger.getLogger(org.themoviedb.movieapi.Service.class.getName()).log(Level.SEVERE, "URL invalid", ex);
        } catch (IOException ex) {
            Logger.getLogger(org.themoviedb.movieapi.Service.class.getName()).log(Level.SEVERE, "Server Error", ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String IMDBId = "tt0810913";
        getMovie(IMDBId);
    }
    
}
