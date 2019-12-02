package com.iba.YourReview.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "criticreviews")
public class CriticReview {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @Column(name = "title")
    private String title;

    @Column(name = "criticName")
    private String criticName;

    @Column(name = "review")
    private String review;

    @ManyToOne
    @JoinColumn (name="title", insertable = false, updatable = false)
    @JsonBackReference
    private Movie movie;

    CriticReview() {}

    public CriticReview(String title, String criticName, String review, Movie movie) {
        this.title = title;
        this.criticName = criticName;
        this.review = review;
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCriticName() {
        return criticName;
    }

    public void setCriticName(String criticName) {
        this.criticName = criticName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
