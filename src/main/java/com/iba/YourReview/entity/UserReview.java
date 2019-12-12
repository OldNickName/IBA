package com.iba.YourReview.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "userreviews")
public class UserReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "review")
    private String review;

    @ManyToOne
            @JoinColumn(name = "title", insertable = false, updatable = false)
            @JsonBackReference
            private Movie movie;

    UserReview() {}

    public UserReview(String title, String nickName, String review, Movie movie) {
        this.title = title;
        this.nickName = nickName;
        this.review = review;
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
