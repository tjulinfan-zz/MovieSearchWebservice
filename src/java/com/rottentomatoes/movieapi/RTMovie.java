
package com.rottentomatoes.movieapi;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class RTMovie {

    @Expose
    private Integer id;
    @Expose
    private String title;
    @Expose
    private Integer year;
    @Expose
    private List<String> genres = new ArrayList<String>();
    @Expose
    private String mpaa_rating;
    @Expose
    private String runtime;
    @Expose
    private String critics_consensus;
    @Expose
    private Release_dates release_dates;
    @Expose
    private Ratings ratings;
    @Expose
    private String synopsis;
    @Expose
    private Posters posters;
    @Expose
    private List<Abridged_cast> abridged_cast = new ArrayList<Abridged_cast>();
    @Expose
    private List<Abridged_director> abridged_directors = new ArrayList<Abridged_director>();
    @Expose
    private String studio;
    @Expose
    private Alternate_ids alternate_ids;
    @Expose
    private Links links;
    @Expose
    private String link_template;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getMpaa_rating() {
        return mpaa_rating;
    }

    public void setMpaa_rating(String mpaa_rating) {
        this.mpaa_rating = mpaa_rating;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getCritics_consensus() {
        return critics_consensus;
    }

    public void setCritics_consensus(String critics_consensus) {
        this.critics_consensus = critics_consensus;
    }

    public Release_dates getRelease_dates() {
        return release_dates;
    }

    public void setRelease_dates(Release_dates release_dates) {
        this.release_dates = release_dates;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Posters getPosters() {
        return posters;
    }

    public void setPosters(Posters posters) {
        this.posters = posters;
    }

    public List<Abridged_cast> getAbridged_cast() {
        return abridged_cast;
    }

    public void setAbridged_cast(List<Abridged_cast> abridged_cast) {
        this.abridged_cast = abridged_cast;
    }

    public List<Abridged_director> getAbridged_directors() {
        return abridged_directors;
    }

    public void setAbridged_directors(List<Abridged_director> abridged_directors) {
        this.abridged_directors = abridged_directors;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Alternate_ids getAlternate_ids() {
        return alternate_ids;
    }

    public void setAlternate_ids(Alternate_ids alternate_ids) {
        this.alternate_ids = alternate_ids;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getLink_template() {
        return link_template;
    }

    public void setLink_template(String link_template) {
        this.link_template = link_template;
    }

}
