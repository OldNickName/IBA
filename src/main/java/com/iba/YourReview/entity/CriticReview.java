package com.iba.YourReview.entity;

import javax.persistence.*;

@Entity
@Table(name = "criticreviews")
public class CriticReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "title")
    private String title;

    @Column(name = "criticName")
    private String criticName;

    @Column(name = "review")
    private String review;

    CriticReview() {}

    public CriticReview(String title, String criticName, String review) {
        this.title = title;
        this.criticName = criticName;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
