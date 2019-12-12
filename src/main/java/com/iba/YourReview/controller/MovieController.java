package com.iba.YourReview.controller;

import com.iba.YourReview.entity.Movie;
import com.iba.YourReview.repository.AppUserRepo;
import com.iba.YourReview.repository.CriticReviewRepo;
import com.iba.YourReview.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

    @Autowired
    private CriticReviewRepo criticReviewRepo;

    @Autowired
    private AppUserRepo appUserRepo;

    @Autowired
    private MovieRepo movieRepo;

    @RequestMapping(value = "/showAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> showAll() {
        return (List<Movie>) movieRepo.findAll();
    }

    @GetMapping("/findByTitle/{title}")
    public Movie showByTitle(@PathVariable String title) {
        return movieRepo.findByTitle(title);
    }

}
