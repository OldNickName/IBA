package com.iba.YourReview.repository;

import com.iba.YourReview.entity.UserReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserReviewRepo extends CrudRepository<UserReview, Integer> {

    public List<UserReview> findByNickName(String nickName);
}
