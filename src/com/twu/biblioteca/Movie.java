package com.twu.biblioteca;

public class Movie extends Product {

    private String director;
    private double rating;

    public Movie(String name, int year, String director, double rating) {
        super(name, year);
        this.director = director;
        this.rating = rating;
        this.type = "movie";
    }

    public String getDetails() {
        return this.name + " (" + this.year + ") | " + this.director + " | " + this.rating;
    }
}