package com.iba.YourReview.repository;

import com.iba.YourReview.entity.CriticReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CriticReviewRepo extends CrudRepository<CriticReview, Integer> {

    public CriticReview findByTitle(String title);

    public List<CriticReview> findByCriticName(String criticName);

}
