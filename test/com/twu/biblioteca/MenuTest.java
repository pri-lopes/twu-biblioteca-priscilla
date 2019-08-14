package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    Menu menu = new Menu();

    @Test
    public void shouldIdentifyValidMenuOption() {
        assertEquals(1, menu.parseMenuOption("1"));
    }

    @Test
    public void shouldIdentifyInvalidMenuOption() {
        assertEquals(-1, menu.parseMenuOption("Test"));
    }

}