package com.twu.biblioteca;

import java.util.Arrays;

public class Menu {

    public static final String BOOK_TYPE = "book";
    public static final String MOVIE_TYPE = "movie";

    private ProductList listOfBooks;
    private ProductList listOfMovies;

    public Menu() {
        listOfBooks = new ProductList(BOOK_TYPE);
        listOfMovies = new ProductList(MOVIE_TYPE);
    }

    public String getMenu() {
        return "\n" +
                "=== MENU ===\n" +
                "1- List of books\n" +
                "2- Checkout a book\n" +
                "3- Return a book\n" +
                "4- List of movies\n" +
                "5- Checkout a movie\n" +
                "6- Return a movie\n" +
                "0- Quit";
    }

    public int parseMenuOption(String selectedOption) {
        try {
            int chosenOption = Integer.parseInt(selectedOption);
            int[] validOptions = new int[]{0, 1, 2, 3, 4, 5, 6};
            return Arrays.binarySearch(validOptions, chosenOption) >= 0 ? chosenOption : MenuOption.INVALID_OPTION.value;
        } catch (Exception e) {
            return MenuOption.INVALID_OPTION.value;
        }
    }

    public String quitApplication() {
        return "Bye!";
    }

    public String invalidOption() {
        return "Please select a valid option!";
    }

    public String getListOfProducts(String type) {
        if (type == BOOK_TYPE) {
            return listOfBooks.getFormattedList(false);
        } else if (type == MOVIE_TYPE) {
            return listOfMovies.getFormattedList(false);
        } else {
            return invalidOption();
        }
    }

    private Product findProduct(String search, String type) {
        ProductList list;

        if (type == BOOK_TYPE) {
            list = listOfBooks;
        } else if (type == MOVIE_TYPE) {
            list = listOfMovies;
        } else {
            list = new ProductList();
        }

        return list.findProduct(search);
    }

    public String checkoutProduct(String search, String type) {
        Product product = findProduct(search, type);
        if (product.getType() == null) {
            return "Sorry, that " + type + " is not available";
        }

        return product.checkoutProduct();
    }

    public String returnProduct(String search, String type) {
        Product product = findProduct(search, type);
        if (product.getType() == null) {
            return "That is not a valid " + type + " to return";
        }

        return product.returnProduct();
    }
}
