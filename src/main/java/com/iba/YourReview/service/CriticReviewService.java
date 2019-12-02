package com.iba.YourReview.service;

import com.iba.YourReview.entity.CriticReview;
import com.iba.YourReview.repository.CriticReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class CriticReviewService implements CriticReviewRepo {

    @Autowired
    private CriticReviewRepo criticReviewRepo;

    public CriticReview findByTitle(String Title){
        return criticReviewRepo.findByTitle(Title);
    }

    public List<CriticReview> findByCriticName(String criticName){
        return criticReviewRepo.findByCriticName(criticName);
    }
}
