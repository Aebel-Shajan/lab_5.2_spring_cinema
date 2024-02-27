package com.example.spring_cinema.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "title")
    String title;
    @Column(name = "rating")
    double rating;
    @Column(name = "duration")
    double duration;

    public Movie(long id, String title, double rating, double duration) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public Movie() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
