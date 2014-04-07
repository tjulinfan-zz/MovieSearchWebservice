/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trailer.trailerapi;

import com.trailer.data.Trailer;
import com.trailer.data.Trailers;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
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
    
    private static final String GET_URL = Configs.TRAILER_API_BASE_URL;

    public static void getTrailers(String IMDBId) {
        String getUrl = GET_URL
                + "?" + Configs.TRAILER_IMDBID_LABEL + "=" + IMDBId;
        System.out.println(getUrl);
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            conn.setConnectTimeout(Configs.TIME_OUT_MS);
            
            JAXBContext jc = JAXBContext.newInstance(com.trailer.data.Trailers.class);
            Unmarshaller um = jc.createUnmarshaller();
            Trailers trailers = (Trailers)um.unmarshal(conn.getInputStream());
            
            List<Trailer> trailerList = trailers.getTrailer();
            System.out.println(trailerList.size());
           for (Trailer trailer : trailerList) {
               System.out.println(trailer.getEmbed());
           }
        } catch (MalformedURLException ex) {
            Logger.getLogger(com.myapifilms.movieapi.Service.class.getName()).log(Level.SEVERE, "URL Error", ex);
        } catch (IOException ex) {
            Logger.getLogger(com.myapifilms.movieapi.Service.class.getName()).log(Level.SEVERE, "Connection Error", ex);
        } catch (JAXBException ex) {
            System.out.println("JAXBException:  " + ex.getMessage());
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String IMDBId = "tt0810913";
        if (IMDBId.startsWith("tt")) {
            IMDBId = IMDBId.substring(2);
        }
        getTrailers(IMDBId);
    }
    
}
