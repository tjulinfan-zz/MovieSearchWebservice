
package com.rottentomatoes.reviewapi;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class ReviewResults {

    @Expose
    private Integer total;
    @Expose
    private List<RTReview> reviews = new ArrayList<RTReview>();
    @Expose
    private Links_ links;
    @Expose
    private String link_template;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<RTReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<RTReview> reviews) {
        this.reviews = reviews;
    }

    public Links_ getLinks() {
        return links;
    }

    public void setLinks(Links_ links) {
        this.links = links;
    }

    public String getLink_template() {
        return link_template;
    }

    public void setLink_template(String link_template) {
        this.link_template = link_template;
    }

}
