package com.twu.biblioteca;

import org.hamcrest.core.StringContains;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaTests {

    BibliotecaApp app = new BibliotecaApp();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldReceiveAWelcomeMe() {
        String welcomeMsg = "Welcome to Biblioteca! Your one-stop-shop for great books titles in Bangalore\n";
        app.printWelcomeMessage();
        assertEquals(welcomeMsg, outContent.toString());
    }

    @Test
    public void shouldGetMenuOptions() {
        String menu = "\n" +
                "=== MENU ===\n" +
                "1- List of books\n" +
                "2- Checkout a book\n" +
                "3- Return a book\n" +
                "4- List of movies\n" +
                "5- Quit\n";
        app.printMenu();
        assertEquals(menu, outContent.toString());
    }

    @Test
    public void shouldReturnValidMenuChoice() {
        assertEquals(1, app.parseMenuChoice("1"));
    }

    @Test
    public void shouldReturnInvalidMenuChoice() {
        assertEquals(-1, app.parseMenuChoice("test"));
    }
}
