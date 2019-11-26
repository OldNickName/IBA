package com.iba.YourReview.service;

import com.iba.YourReview.entity.UserReview;
import com.iba.YourReview.repository.UserReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class UserReviewService implements UserReviewRepo {

    @Autowired
    private UserReviewRepo userReviewRepo;

    @Override
    public List<UserReview> findByNickName(String nickName){
        return userReviewRepo.findByNickName(nickName);
    }
}
