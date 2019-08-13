package com.twu.biblioteca;

public class Movie {

    private String name;
    private int year;
    private String director;
    private double rating;

    public Movie(String name, int year, String director, double rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getDetails() {
        return this.name + " (" + this.year + ") | " + this.director + " | " + this.rating;
    }
}
