package com.iba.YourReview.repository;

import com.iba.YourReview.entity.CriticReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CriticReviewRepo extends CrudRepository<CriticReview, Long> {

    List<CriticReview> findByTitle(String title);

    List<CriticReview> findByCriticName(String criticName);

}
