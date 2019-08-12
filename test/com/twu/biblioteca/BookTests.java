package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTests {

    @Test
    public void shouldRegisterABook() {
        Book newBook = new Book("The Handmaid's Tale", "ATWOOD, Margareth", 1985);
        assertEquals(newBook.getDetails(), "The Handmaid's Tale | ATWOOD, Margareth | 1985");
    }
}
