package com.iba.YourReview.entity;

import javax.persistence.*;

@Entity
@Table(name = "userreviews")
public class UserReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "review")
    private String review;

    UserReview() {}

    public UserReview(String title, String nickName, String review) {
        this.title = title;
        this.nickName = nickName;
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
