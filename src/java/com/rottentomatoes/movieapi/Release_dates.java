
package com.rottentomatoes.movieapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Release_dates {

    @Expose
    private String theater;
    @Expose
    private String dvd;

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

}
