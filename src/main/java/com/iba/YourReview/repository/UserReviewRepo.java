package com.iba.YourReview.repository;

import com.iba.YourReview.entity.UserReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserReviewRepo extends CrudRepository<UserReview, Long> {

    List<UserReview> findByNickName(String nickName);

    List<UserReview> findByTitle(String title);
}
