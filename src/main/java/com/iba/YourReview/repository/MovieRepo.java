package com.iba.YourReview.repository;

import com.iba.YourReview.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends CrudRepository<Movie, Integer> {

    public Movie findByTitle(String title);

    public List<Movie> findByGenre(String genre);
}
