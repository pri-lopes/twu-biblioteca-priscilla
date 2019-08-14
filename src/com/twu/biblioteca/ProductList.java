package com.twu.biblioteca;

import java.util.ArrayList;

public class ProductList {

    private static String BOOK_TYPE = "book";
    private static String MOVIE_TYPE = "movie";

    private ArrayList<Product> listOfProducts;

    public ProductList() {
        this.listOfProducts = new ArrayList<Product>();
    }

    public ProductList(String type) {
        this.listOfProducts = new ArrayList<Product>();

        if (type == BOOK_TYPE) {
            initializeBooksList();
        } else if (type == MOVIE_TYPE) {
            initializeMoviesList();
        }
    }

    private void initializeBooksList() {
        this.listOfProducts.add(new Book("The Handmaid's Tale", "Margareth Atwood", 1985));
        this.listOfProducts.add(new Book("Woman, Race and Class", "Angela Davis", 1981));
        this.listOfProducts.add(new Book("Feminism for the 99%", "Cinzia Arruzza, Nancy Fraser, and Tithi Bhattacharya", 2019));
        this.listOfProducts.add(new Book("Women, the State and Revolution", "Wendy Goldman", 1993));
        this.listOfProducts.add(new Book("Alias Grace", "Margaret Atwood", 1996));
        this.listOfProducts.add(new Book("1984", "George Orwell", 1949));
        this.listOfProducts.add(new Book("Animal farm", "George Orwell", 1945));
        this.listOfProducts.add(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
        this.listOfProducts.add(new Book("Brave New World", "Aldous Huxley", 1932));
        this.listOfProducts.add(new Book("We Should All Be Feminists", "Chimamanda Ngozi Adichie", 2014));
    }

    private void initializeMoviesList() {
        this.listOfProducts.add(new Movie("Capitain Fantastic", 2016, "Matt Ross", 7.9));
        this.listOfProducts.add(new Movie("The Godfather", 1972, "Francis Ford Coppola", 9.2));
        this.listOfProducts.add(new Movie("The Dark Knight", 2008, "Christopher Nolan", 9.0));
        this.listOfProducts.add(new Movie("Fight Club", 1999, "David Fincher", 8.8));
        this.listOfProducts.add(new Movie("Forrest Gump", 1994, "Robert Zemeckis", 8.8));
        this.listOfProducts.add(new Movie("Inception", 2010, "Christopher Nolan", 8.8));
        this.listOfProducts.add(new Movie("The Matrix", 1999, "Lana Wachowski", 8.7));
        this.listOfProducts.add(new Movie("Se7en", 1995, "David Fincher", 8.6));
        this.listOfProducts.add(new Movie("The Silence of the Lambs", 1991, "Jonathan Demme", 8.6));
        this.listOfProducts.add(new Movie("The Green Mile", 1999, "Frank Darabont", 8.6));
    }

    public String getFormattedList(boolean onlyAvailable) {
        String formattedList = "";
        for(Product p: this.listOfProducts) {
            if (!onlyAvailable || onlyAvailable && p.isAvailable()) {
                formattedList += p.getDetails() + "\n";
            }
        }

        return formattedList;
    }

    public Product findProduct(String search) {
        Product product = new Product();
        for(Product p: this.listOfProducts) {
            if (p.name.toLowerCase().equals(search.toLowerCase())) {
                product = p;
            }
        }

        return product;
    }
}
