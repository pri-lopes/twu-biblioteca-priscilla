package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTests {

    Book newBook = new Book("The Handmaid's Tale", "ATWOOD, Margareth", 1985);

    @Test
    public void shouldGetBooksInfo() {
        assertEquals(newBook.getDetails(), "The Handmaid's Tale | ATWOOD, Margareth | 1985");
    }

    @Test
    public void shouldGetBooksName() {
        assertEquals(newBook.getName(), "The Handmaid's Tale");
    }
}
