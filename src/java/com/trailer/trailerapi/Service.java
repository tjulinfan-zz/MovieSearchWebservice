/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trailer.trailerapi;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
import com.trailer.data.TATrailer;
import com.trailer.data.TATrailers;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.me.config.Configs;

/**
 *
 * @author LinFan
 */
public class Service {
    
    private static final String GET_URL = Configs.TRAILER_API_BASE_URL;

    public static List<TATrailer> getTrailers(String IMDBId) {
        if (IMDBId.startsWith("tt")) {
            IMDBId = IMDBId.substring(2);
        }
        
        String getUrl = GET_URL
                + "?" + Configs.TRAILER_IMDBID_LABEL + "=" + IMDBId;
        System.out.println(getUrl);
        try {
            URL getURL = new URL(getUrl);
            URLConnection conn = getURL.openConnection();
            conn.setConnectTimeout(Configs.TIME_OUT_MS);
            
            JAXBContext jc = JAXBContext.newInstance(com.trailer.data.TATrailers.class);
            Unmarshaller um = jc.createUnmarshaller();
            TATrailers trailers = (TATrailers)um.unmarshal(conn.getInputStream());
   
            return trailers.getTrailer();
//            Marshaller m = jc.createMarshaller();
//            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            m.setProperty(CharacterEscapeHandler.class.getName(),
//                new CharacterEscapeHandler() {
//                    @Override
//                    public void escape(char[] ac, int i, int j, boolean flag,
//                            Writer writer) throws IOException {
//                        writer.write(ac, i, j);
//                    }
//                });
//            m.marshal(trailers, System.out);
        } catch (MalformedURLException ex) {
            Logger.getLogger(com.myapifilms.movieapi.Service.class.getName()).log(Level.SEVERE, "URL Error", ex);
        } catch (IOException ex) {
            Logger.getLogger(com.myapifilms.movieapi.Service.class.getName()).log(Level.SEVERE, "Connection Error", ex);
        } catch (JAXBException ex) {
            System.out.println("JAXBException:  " + ex.getMessage());
        }
        return new ArrayList();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String IMDBId = "tt0137523";
        List<TATrailer> ts = getTrailers(IMDBId);
        System.out.println(ts.size());
    }
    
}
