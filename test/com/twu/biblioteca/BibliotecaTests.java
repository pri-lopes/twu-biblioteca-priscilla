package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibliotecaTests {

    BibliotecaApp app = new BibliotecaApp();

    @Test
    public void shouldReceiveAWelcomeMe() {
        String welcomeMsg = app.getWelcomeMessage();
        assertEquals("Welcome to Biblioteca! Your one-stop-shop for great books titles in Bangalore", welcomeMsg);
    }

    @Test
    public void shouldGetMenuOptions() {
        String menu = "1 - List of books\n2- Checkout a book\n3- Return a book\n4- Quit";
        assertEquals(menu, app.getMenuOptions());
    }

    @Test
    public void shouldReturnValidMenuChoice() {
        assertEquals(1, app.parseMenuChoice("1"));
    }

    @Test
    public void shouldReturnInvalidMenuChoice() {
        assertEquals(0, app.parseMenuChoice("test"));
    }
}
