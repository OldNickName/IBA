package com.iba.YourReview.controller;

import com.iba.YourReview.entity.UserReview;
import com.iba.YourReview.repository.UserReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserReviewController {

    @Autowired
    private UserReviewRepo userReviewRepo;

    @GetMapping("/userReview")
    public List<UserReview> findAll(){
        return (List<UserReview>) userReviewRepo.findAll();
    }

    @GetMapping("/usersReview/{title}")
    public List<UserReview> suersReviewByTitle(@PathVariable String title){
        return (List<UserReview>) userReviewRepo.findByTitle(title);
    }

    @PostMapping("/usersReview/add")
    public void add(@RequestBody UserReview userReview) {
        userReviewRepo.save(userReview);
        System.out.println("added");
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
