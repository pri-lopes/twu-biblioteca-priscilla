package com.twu.biblioteca;

public class Product {

    protected String name;
    protected int year;
    protected boolean isAvailable;
    protected String type;

    public Product() {

    }

    public Product(String name, int year) {
        this.name = name;
        this.year = year;
        this.isAvailable = true;
    }

    public boolean isProductReal() {
        return this.name != null && this.type != null;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public String getType() {
        return this.type;
    }

    public String getDetails() {
        return this.name + " (" + this.year + ")";
    }

    public String checkoutProduct() {
        if (!this.isAvailable) {
            return "Sorry, that " + this.type + " is not available";
        }

        this.isAvailable = false;
        return "Thank you! Enjoy the book";
    }

    public String returnProduct() {
        if (this.isAvailable) {
            return "That is not a valid " + this.type + " to return";
        }

        this.isAvailable = true;
        return "Thank you for returning the " + this.type;
    }
}
