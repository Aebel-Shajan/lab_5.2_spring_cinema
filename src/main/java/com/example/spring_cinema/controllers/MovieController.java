package com.example.spring_cinema.controllers;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> postMovie() {
        Movie dummyMovie = new Movie("amongus", 5, 100);
        movieService.addMovieToCinema(dummyMovie);
        return new ResponseEntity<>(dummyMovie, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movieList = movieService.getAllMovies();
        return new ResponseEntity<>(movieList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable long id) {
        Optional<Movie> targetMovie = movieService.getMovieById(id);
        return new ResponseEntity<>(targetMovie.get(), HttpStatus.OK);
    }
}
