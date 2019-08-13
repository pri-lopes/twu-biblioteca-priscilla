package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovieListTest {

    MovieList listOfMovies = new MovieList();

    @Test
    public void shouldGetListOfAllMovies() {
        assertEquals(10, listOfMovies.getMovies(false).size());
    }

}