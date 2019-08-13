package com.twu.biblioteca;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovieListTest {

    MovieList listOfMovies = new MovieList();

    @Test
    public void shouldGetListOfAllMovies() {
        assertEquals(10, listOfMovies.getMovies(false).size());
    }

    @Test
    public void shouldSeeFormattedMoviesList() {
        String movies = "\n" +
                "Capitain Fantastic (2016) | Matt Ross | 7.9\n" +
                "The Godfather (1972) | Francis Ford Coppola | 9.2\n" +
                "The Dark Knight (2008) | Christopher Nolan | 9.0\n" +
                "Fight Club (1999) | David Fincher | 8.8\n" +
                "Forrest Gump (1994) | Robert Zemeckis | 8.8\n" +
                "Inception (2010) | Christopher Nolan | 8.8\n" +
                "The Matrix (1999) | Lana Wachowski | 8.7\n" +
                "Se7en (1995) | David Fincher | 8.6\n" +
                "The Silence of the Lambs (1991) | Jonathan Demme | 8.6\n" +
                "The Green Mile (1999) | Frank Darabont | 8.6";
        assertEquals(movies, listOfMovies.getFormattedList(false));
    }

}