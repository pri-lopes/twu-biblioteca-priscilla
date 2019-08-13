package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieList {

    private ArrayList<Movie> listOfMovies = new ArrayList<Movie>();

    public MovieList() {
        this.listOfMovies.add(new Movie("Capitain Fantastic", 2016, "Matt Ross", 7.9));
        this.listOfMovies.add(new Movie("The Godfather", 1972, "Francis Ford Coppola", 9.2));
        this.listOfMovies.add(new Movie("The Dark Knight", 2008, "Christopher Nolan", 9.0));
        this.listOfMovies.add(new Movie("Fight Club", 1999, "David Fincher", 8.8));
        this.listOfMovies.add(new Movie("Forrest Gump", 1994, "Robert Zemeckis", 8.8));
        this.listOfMovies.add(new Movie("Inception", 2010, "Christopher Nolan", 8.8));
        this.listOfMovies.add(new Movie("The Matrix", 1999, "Lana Wachowski", 8.7));
        this.listOfMovies.add(new Movie("Se7en", 1995, "David Fincher", 8.6));
        this.listOfMovies.add(new Movie("The Silence of the Lambs", 1991, "Jonathan Demme", 8.6));
        this.listOfMovies.add(new Movie("The Green Mile", 1999, "Frank Darabont", 8.6));
    }

    public ArrayList<Movie> getMovies(boolean onlyAvailable) {
        if(onlyAvailable) {
            return listOfMovies;
        } else {
            return listOfMovies;
        }
    }
}
