package com.iba.YourReview.repository;

import com.iba.YourReview.entity.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends CrudRepository<Movie, Long> {

    Movie findByTitle(String title);

    List<Movie> findByGenre(String genre);

    //@Query(value = "select f.title, f.rating, f.duration, f.genre, c.critic_name, c.review from films f inner join criticreviews c on f.title = c.title")



}
