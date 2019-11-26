package com.iba.YourReview.service;

import com.iba.YourReview.entity.Movie;
import com.iba.YourReview.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService  {

    @Autowired
    private MovieRepo movieRepo;

    public Movie findByTitle(String title) {
        return movieRepo.findByTitle(title);
    }

    public List<Movie> findByGenre(String genre) {
        return (List<Movie>) movieRepo.findByGenre(genre);
    }
}
