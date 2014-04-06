
package org.themoviedb.searchapi;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Result {

    @Expose
    private Boolean adult;
    @Expose
    private Object backdrop_path;
    @Expose
    private Integer id;
    @Expose
    private String original_title;
    @Expose
    private Object release_date;
    @Expose
    private Object poster_path;
    @Expose
    private Double popularity;
    @Expose
    private String title;
    @Expose
    private Double vote_average;
    @Expose
    private Integer vote_count;

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public Object getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(Object backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public Object getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Object release_date) {
        this.release_date = release_date;
    }

    public Object getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(Object poster_path) {
        this.poster_path = poster_path;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVote_average() {
        return vote_average;
    }

    public void setVote_average(Double vote_average) {
        this.vote_average = vote_average;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

}
