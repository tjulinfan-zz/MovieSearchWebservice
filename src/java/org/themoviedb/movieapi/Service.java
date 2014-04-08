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

    private static final String GET_URL = Configs.TMD_API_BASE_URL + "/movie/";
    
    //Getting movie information by using TMDId
    public static TMDMovie getMovie(Integer id) {
        String getUrl = GET_URL + id
                + "?"+ Configs.TMD_API_KEY_LABEL + "=" + Configs.TMD_API_KEY_VALUE;
        System.out.println(getUrl);
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            conn.setConnectTimeout(Configs.TIME_OUT_MS);
            
            Gson gson = new Gson();
            TMDMovie movie = gson.fromJson(new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8")), TMDMovie.class);
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
        TMDMovie m = getMovie(testTMDId);
        System.out.println(m.getImdb_id());
    }
    
}
