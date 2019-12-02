package com.iba.YourReview.controller;

import com.iba.YourReview.entity.CriticReview;
import com.iba.YourReview.entity.Movie;
import com.iba.YourReview.repository.CriticReviewRepo;
import com.iba.YourReview.repository.MovieRepo;
import com.iba.YourReview.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private CriticReviewRepo criticReviewRepo;

    @Autowired
    private MovieRepo movieRepo;

    @GetMapping("/showAll")
    public List<Movie> showAll(){
        return (List<Movie>) movieRepo.findAll();
    }

    @GetMapping("/showByGenre/{genre}")
    public List<Movie> showByGenre(@PathVariable String genre){
        return (List<Movie>) movieRepo.findByGenre(genre);
    }

    @GetMapping("/showByTitle/{title}")
    public Movie showByTitle(@PathVariable String title){
        return movieRepo.findByTitle(title);
    }

    @GetMapping("find/{name}")
    public List<CriticReview> allReview(@PathVariable String name){
        return criticReviewRepo.findByCriticName(name);
    }
}
