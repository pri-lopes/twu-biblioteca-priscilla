package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldGetBookDetails() {
        Book book = new Book("BOOK NAME", "BOOK AUTHOR", 1999);
        String bookDetails = "[1999] BOOK NAME | BOOK AUTHOR";
        assertEquals(bookDetails, book.getDetails());
    }
}
