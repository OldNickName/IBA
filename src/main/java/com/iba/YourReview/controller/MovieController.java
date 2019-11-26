package com.iba.YourReview.controller;

import com.iba.YourReview.entity.Movie;
import com.iba.YourReview.repository.MovieRepo;
import com.iba.YourReview.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieRepo movieRepo;

    @GetMapping("/showAll")
    public List<Movie> showAll(){
        return (List<Movie>) movieRepo.findAll();
    }

    @GetMapping("/showByGenre/{genre}")
    public List<Movie> showByGenre(@PathVariable String genre){
        return (List<Movie>) movieService.findByGenre(genre);
    }

    @GetMapping("/showByTitle/{title}")
    public Movie showByTitle(@PathVariable String title){
        return movieService.findByTitle(title);
    }

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name){
        return "Hello, " + name;
    }
}
