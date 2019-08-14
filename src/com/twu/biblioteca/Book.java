package com.twu.biblioteca;

public class Book extends Product {

    private String author;

    public Book(String name, String author, int year) {
        super(name, year);
        this.author = author;
        this.type = "book";
    }

    public String getDetails() {
        return "["+ this.year + "] " + this.name + " | " + this.author;
    }
}
