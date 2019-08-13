package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTests {

    Movie movie = new Movie("Capitain Fantastic", 2016, "Matt Ross", 7.9);

    @Test
    public void shouldGetMovieDetails() {
        String movieDetails = "Capitain Fantastic (2016) | Matt Ross | 7.9";
        assertEquals(movieDetails, movie.getDetails());
    }
}
