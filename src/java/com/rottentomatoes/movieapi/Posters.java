
package com.rottentomatoes.movieapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Posters {

    @Expose
    private String thumbnail;
    @Expose
    private String profile;
    @Expose
    private String detailed;
    @Expose
    private String original;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

}
