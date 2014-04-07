
package com.rottentomatoes.movieapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Ratings {

    @Expose
    private String critics_rating;
    @Expose
    private Integer critics_score;
    @Expose
    private String audience_rating;
    @Expose
    private Integer audience_score;

    public String getCritics_rating() {
        return critics_rating;
    }

    public void setCritics_rating(String critics_rating) {
        this.critics_rating = critics_rating;
    }

    public Integer getCritics_score() {
        return critics_score;
    }

    public void setCritics_score(Integer critics_score) {
        this.critics_score = critics_score;
    }

    public String getAudience_rating() {
        return audience_rating;
    }

    public void setAudience_rating(String audience_rating) {
        this.audience_rating = audience_rating;
    }

    public Integer getAudience_score() {
        return audience_score;
    }

    public void setAudience_score(Integer audience_score) {
        this.audience_score = audience_score;
    }

}
