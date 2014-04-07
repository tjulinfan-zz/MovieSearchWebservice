/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapifilms.movieapi;

import org.me.config.Configs;

/**
 *
 * @author LinFan
 */
public class Service {
    
    private static final String GET_URL = Configs.MAF_API_BASE_URL;
    private static final String MAF_FORMAT_VALUE = "XML";
    
    public static void getMovie(String IMDBId) {
        String getUrl = GET_URL
                + "?" + Configs.MAF_IMDBID_LABEL + " = " + IMDBId
                + "&" + Configs.MAF_FORMAT_LABEL + "=" + MAF_FORMAT_VALUE;
         
        
    }
    
}
