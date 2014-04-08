/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapifilms.movieapi;

import com.myapifilms.data.MAFMovie;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.me.config.Configs;

/**
 *
 * @author LinFan
 */
public class Service {
    
    private static final String GET_URL = Configs.MAF_API_BASE_URL;
    private static final String MAF_FORMAT_VALUE = "XML";
    
    public static MAFMovie getMovie(String IMDBId) {
        String getUrl = GET_URL
                + "?" + Configs.MAF_IMDBID_LABEL + "=" + IMDBId
                + "&" + Configs.MAF_FORMAT_LABEL + "=" + MAF_FORMAT_VALUE;
        
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            conn.setConnectTimeout(Configs.TIME_OUT_MS);
            
            JAXBContext jc = JAXBContext.newInstance(com.myapifilms.data.MAFMovie.class);
            Unmarshaller um = jc.createUnmarshaller();
            com.myapifilms.data.MAFMovie movie = (com.myapifilms.data.MAFMovie)um.unmarshal(conn.getInputStream());
            
            return movie;
        } catch (MalformedURLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "URL Error", ex);
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, "Connection Error", ex);
        } catch (JAXBException ex) {
            System.out.println("JAXBException:  " + ex.getMessage());
        }
        return null;
    }
    
    public static void main(String[] args) {
        getMovie("tt0810913");
    }
}
