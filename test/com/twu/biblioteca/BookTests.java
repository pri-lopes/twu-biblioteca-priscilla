package com.twu.biblioteca;

import org.junit.Test;
import java.util.Date;
import java.text.SimpleDateFormat;
import static org.junit.Assert.assertEquals;

public class BookTests {

    Book book = new Book("The Handmaid's Tale", "ATWOOD, Margareth", 1985);

    @Test
    public void shouldGetBooksInfo() {
        assertEquals("The Handmaid's Tale | ATWOOD, Margareth | 1985", book.getDetails());
    }

    @Test
    public void shouldGetBooksName() {
        assertEquals("The Handmaid's Tale", book.getName());
    }

    @Test
    public void shouldBookBeAvailable() {
        assertEquals(true, book.isBookAvailable());
    }

    @Test
    public void shouldSeeBookAvailability() {
        assertEquals("Available", book.checkAvailability());
    }

    @Test
    public void shouldUserCheckoutABook() {
        book.checkout("Ana");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());

        assertEquals("Ana borrowed in " + date, book.checkAvailability());
    }
}
