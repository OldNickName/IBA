package com.iba.YourReview.controller;

import com.iba.YourReview.entity.CriticReview;
import com.iba.YourReview.repository.CriticReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CriticReviewController {

    @Autowired
    private CriticReviewRepo criticReviewRepo;

    @GetMapping("/critic")
    public List<CriticReview> findAll(){
        return (List<CriticReview>) criticReviewRepo.findAll();
    }

    @GetMapping("/criticReviews/{title}")
    public List<CriticReview> findByTitle(@PathVariable String title){
        return (List<CriticReview>) criticReviewRepo.findByTitle(title);
    }

    @PutMapping("critic/{id}/update")
    public CriticReview updateCritic(@PathVariable("id") CriticReview critic,
                                     @RequestBody CriticReview updateCritic){
        critic.setCriticName(updateCritic.getCriticName());
        critic.setReview(updateCritic.getReview());
        return critic;
    }
}
