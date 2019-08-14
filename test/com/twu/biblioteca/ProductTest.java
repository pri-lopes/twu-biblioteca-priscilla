package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    Product testObject = new Product("TEST", 1999);

    @Test
    public void shouldGetProductDetails() {
        String productDetails = "TEST (1999)";
        assertEquals(productDetails, testObject.getDetails());
    }

    @Test
    public void shouldNewProductBeAvailable() {
        assertEquals(true, testObject.isAvailable());
    }

    @Test
    public void shouldCheckoutedProductBeUnavailable() {
        testObject.checkoutProduct();
        assertEquals(false, testObject.isAvailable());
    }

    @Test
    public void shouldReturnedProductBeAvailable() {
        testObject.checkoutProduct();
        testObject.returnProduct();
        assertEquals(true, testObject.isAvailable());
    }

    @Test
    public void shouldGetRightProductType() {
        Book book = new Book("TEST", "TEST", 1999);
        assertEquals("book", book.getType());

        Movie movie = new Movie("TEST", 1999, "TEST", 9.9);
        assertEquals("movie", movie.getType());
    }
}