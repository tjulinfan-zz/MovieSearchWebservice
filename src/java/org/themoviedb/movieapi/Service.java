/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.themoviedb.movieapi;

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

    private static final String GET_URL = Configs.API_BASE_URL + "/movie/";
    
    public static Movie getMovie(Integer id) {
        String getUrl = GET_URL + id
                + "?"+ Configs.API_KEY_LABEL + "=" + Configs.API_KEY_VALUE;
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            
            Gson gson = new Gson();
            Movie movie = gson.fromJson(new BufferedReader(new InputStreamReader(conn.getInputStream())), Movie.class);
            return movie;
        } catch (MalformedURLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "URL invalid", ex);
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "Server Error", ex);
        }
        return null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer testTMDId = 550;
        Movie m = getMovie(testTMDId);
        System.out.println(m.getImdb_id());
    }
    
}
