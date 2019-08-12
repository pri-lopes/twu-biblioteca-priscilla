package com.twu.biblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private int id;
    private String name;
    private int publishYear;
    private String author;
    private boolean isAvailable;

    private String username;
    private Date borrowedDate;

    private int countIds = 0;

    public Book() {

    }

    public Book(String name, String author, int year) {
        this.id = countIds + 1;
        this.name = name;
        this.author = author;
        this.publishYear = year;
        this.isAvailable = true;
    }

    public String getDetails() {
        return this.name + " | " + this.author + " | " + this.publishYear;
    }

    public String getName() {
        return this.name;
    }

    public boolean isBookAvailable() {
        return this.isAvailable;
    }

    public String checkAvailability() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return this.isAvailable ? "Available" : this.username + " borrowed in " + simpleDateFormat.format(this.borrowedDate);
    }

    public void checkout(String username) {
        this.isAvailable = false;
        this.username = username;
        this.borrowedDate = new Date();
    }

    public void returnBook() {
        this.isAvailable = true;
        this.username = null;
        this.borrowedDate = null;
    }
}
