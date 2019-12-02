package com.iba.YourReview.controller;

import com.iba.YourReview.entity.CriticReview;
import com.iba.YourReview.repository.CriticReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class CriticReviewController {

    @Autowired
    private CriticReviewRepo criticReviewRepo;

    @GetMapping("/critic")
    public List<CriticReview> findAll(){
        return (List<CriticReview>) criticReviewRepo.findAll();
    }

    @PutMapping("critic/{id}/update")
    public CriticReview updateCritic(@PathVariable("id") CriticReview critic,
                                     @RequestBody CriticReview updateCritic){
        critic.setCriticName(updateCritic.getCriticName());
        critic.setReview(updateCritic.getReview());
        return critic;
    }
}
