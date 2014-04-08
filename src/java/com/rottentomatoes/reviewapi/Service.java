/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rottentomatoes.reviewapi;

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

    //Getting reviews by RT's URL
    public static void getReviews(String reviewsUrl) {
        String getUrl = reviewsUrl
                + "?" + Configs.RT_API_KEY_LABEL + "=" + Configs.RT_API_KEY_VALUE;
        
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            conn.setConnectTimeout(Configs.TIME_OUT_MS);
            
            Gson gson = new Gson();
            ReviewResults rrs = gson.fromJson(new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8")), ReviewResults.class);
            System.out.println(rrs.getReviews().get(0).getQuote());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "URL Error", ex);
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "Connection Error", ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "http://api.rottentomatoes.com/api/public/v1.0/movies/770672122/reviews.json";
        getReviews(url);
    }
    
}
