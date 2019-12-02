package com.iba.YourReview.controller;

import com.iba.YourReview.entity.CriticReview;
import com.iba.YourReview.entity.UserReview;
import com.iba.YourReview.repository.CriticReviewRepo;
import com.iba.YourReview.repository.UserReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class UserReviewController {

    @Autowired
    private UserReviewRepo userReviewRepo;

    @GetMapping("/userReview")
    public List<UserReview> findAll(){
        return (List<UserReview>) userReviewRepo.findAll();
    }

    @PostMapping("/userReview/create")
    public UserReview createCriticReview(@RequestBody UserReview review){
        userReviewRepo.save(review);
        return review;
    }

    @PutMapping("userReview/{id}/update")
    public UserReview updateUserReview(@PathVariable("id") UserReview userReview,
                                     @RequestBody UserReview updateUserReview){
        userReview.setNickName(updateUserReview.getNickName());
        userReview.setReview(updateUserReview.getReview());
        userReview.setTitle(updateUserReview.getTitle());
        return userReview;
    }
}
