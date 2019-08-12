package com.twu.biblioteca;

import java.util.Date;

public class BookReservation {
    private Book book;
    private String user;
    private Date date;

    public BookReservation(Book book, String username) {
        this.book = book;
        this.user = username;
        this.date = new Date();
    }
}
