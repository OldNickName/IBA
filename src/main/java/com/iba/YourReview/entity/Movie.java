package com.iba.YourReview.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "films")
public class Movie {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Id
    @Column(name = "title")
    private String title;
    @Column(name = "releaseDate")
    private String releaseDate;
    @Column(name = "genre")
    private String genre;
    @Column(name = "duration")
    private String duration;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "shortInfo")
    private String shortInfo;

    @Column(name = "PRODUCER")
    private String producer;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ACTORS_LIST")
    private String actorsList;

    @Column(name ="DESCRIPTION")
    private String description;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "movie")
            private Set<CriticReview> criticReviews = new HashSet<CriticReview>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "movie")
            private Set<UserReview> userReviews = new HashSet<UserReview>();

    Movie() {}

    public Movie(String title, String releaseDate, String genre, String duration, Double rating, String shortInfo, String producer, String country, String actorsList, String description, Set<CriticReview> criticReviews, Set<UserReview> userReviews) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        this.shortInfo = shortInfo;
        this.producer = producer;
        this.country = country;
        this.actorsList = actorsList;
        this.description = description;
        this.criticReviews = criticReviews;
        this.userReviews = userReviews;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActorsList() {
        return actorsList;
    }

    public void setActorsList(String actorsList) {
        this.actorsList = actorsList;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public Set<UserReview> getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(Set<UserReview> userReviews) {
        this.userReviews = userReviews;
    }

    public Set<CriticReview> getCriticReviews() {
        return criticReviews;
    }

    public void setCriticReviews(Set<CriticReview> criticReviews) {
        this.criticReviews = criticReviews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
