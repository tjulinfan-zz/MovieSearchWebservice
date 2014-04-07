
package com.rottentomatoes.movieapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Links {

    @Expose
    private String self;
    @Expose
    private String alternate;
    @Expose
    private String cast;
    @Expose
    private String clips;
    @Expose
    private String reviews;
    @Expose
    private String similar;
    @Expose
    private String canonical;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getAlternate() {
        return alternate;
    }

    public void setAlternate(String alternate) {
        this.alternate = alternate;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getClips() {
        return clips;
    }

    public void setClips(String clips) {
        this.clips = clips;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getSimilar() {
        return similar;
    }

    public void setSimilar(String similar) {
        this.similar = similar;
    }

    public String getCanonical() {
        return canonical;
    }

    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }

}
