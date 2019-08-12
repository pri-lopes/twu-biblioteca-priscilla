package com.twu.biblioteca;

public class Book {
    private int id;
    private String name;
    private int publishYear;
    private String author;
    private boolean isAvailable;

    private int countIds = 0;

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
}
