package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldGetMovieDetails() {
        Movie movie = new Movie("MOVIE NAME", 1999, "MOVIE DIRECTOR", 8.9);
        String movieDetails = "MOVIE NAME (1999) | MOVIE DIRECTOR | 8.9";
        assertEquals(movieDetails, movie.getDetails());
    }
}