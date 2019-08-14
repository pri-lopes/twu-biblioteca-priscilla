package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    static Menu menu;
    static String BOOK_TYPE = "book";
    static String MOVIE_TYPE = "movie";

    public static void main(String[] args) {
        printWelcomeMessage();
        menu = new Menu();
        loadMenu();
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to Biblioteca! Your one-stop-shop for great books titles in Bangalore");
    }

    public static void loadMenu() {
        printMenu();

        Scanner prompt = new Scanner(System.in);
        String userResponse = prompt.nextLine();
        int chosenOption = menu.parseMenuOption(userResponse);
        runOption(chosenOption);
    }

    public static void printMenu() {
        String menuOptions = menu.getMenu();
        System.out.println(menuOptions);
    }

    public static void runOption(int option) {
        String search;

        if (option == MenuOption.QUIT_OPTION.value) {
            System.out.println(menu.quitApplication());
        } else {
            if (option == MenuOption.LIST_BOOKS.value) {
                System.out.println(menu.getListOfProducts(BOOK_TYPE));
            } else if (option == MenuOption.CHECKOUT_BOOK.value) {
                search = getUserSearch(BOOK_TYPE);
                System.out.println(menu.checkoutProduct(search, BOOK_TYPE));
            } else if (option == MenuOption.RETURN_BOOK.value) {
                search = getUserSearch(BOOK_TYPE);
                System.out.println(menu.returnProduct(search, BOOK_TYPE));
            } else if (option == MenuOption.LIST_MOVIES.value) {
                System.out.println(menu.getListOfProducts(MOVIE_TYPE));
            } else if (option == MenuOption.CHECKOUT_MOVIE.value) {
                search = getUserSearch(MOVIE_TYPE);
                System.out.println(menu.checkoutProduct(search, MOVIE_TYPE));
            } else if (option == MenuOption.RETURN_MOVIE.value) {
                search = getUserSearch(MOVIE_TYPE);
                System.out.println(menu.returnProduct(search, MOVIE_TYPE));
            } else {
                System.out.println(menu.invalidOption());
            }

            loadMenu();
        }
    }

    static String getUserSearch(String type) {
        System.out.println("\nWhich " + type + "?");
        Scanner prompt = new Scanner(System.in);
        return prompt.nextLine();
    }

}
