package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaApp {

    static BookList listOfBooks;

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        listOfBooks = new BookList();
        loadMenu();
    }

    public static String getWelcomeMessage() {
        return "Welcome to Biblioteca! Your one-stop-shop for great books titles in Bangalore";
    }

    public static void loadMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("Please choose an option:");
        System.out.println(getMenuOptions());
        Scanner prompt = new Scanner(System.in);

        String userResponse = prompt.nextLine();
        int menuOption = parseMenuChoice(userResponse);
        if (menuOption > 0) {
            if (menuOption != 4) {
                processMenuOption(menuOption);
                loadMenu();
            }
        } else {
            System.out.println("Please select a valid option!");
            loadMenu();
        }
    }

    public static String getMenuOptions() {
        return "1 - List of books\n2- Checkout a book\n3- Return a book\n4- Quit";
    }

    public static int parseMenuChoice(String userResponse) {
        try {
            int chosenOption = Integer.parseInt(userResponse);
            int[] validOptions = new int[]{1, 2, 3, 4};
            boolean isValid = Arrays.binarySearch(validOptions, chosenOption) >= 0;
            return isValid ? chosenOption : 0;
        } catch (Exception e) {
            return 0;
        }
    }

    static void processMenuOption(int menuOption) {
        switch (menuOption) {
            case 1:
                showBooksList();
                break;
            case 2:
                checkoutABook();
                break;
            case 3:
                returnABook();
                break;
            default:
                break;
        }
    }

    public static void showBooksList() {
        System.out.println(listOfBooks.getFormattedList());
    }

    public static void checkoutABook() {
        String search = getUserSearch();
        Book book = listOfBooks.findBook(search);

        if(book.getName() == null) {
            System.out.println("There is no book named '" + search + "'");
        } else {
            if(book.isBookAvailable()) {
                borrowTheBook(book);
                System.out.println("Thank you! Enjoy the book");
            } else {
                System.out.println("Sorry, that book is unavailable");
            }
        }
    }

    static String getUserSearch() {
        System.out.println("\nPlease inform the name of the book");
        Scanner prompt = new Scanner(System.in);
        return prompt.nextLine();
    }

    static void borrowTheBook(Book book) {
        System.out.println("\nPlease inform your name");
        Scanner prompt = new Scanner(System.in);
        String username = prompt.nextLine();
        book.checkout(username);
    }

    public static void returnABook() {
        System.out.println("\nPlease inform the book's name");
        Scanner prompt = new Scanner(System.in);
        String bookName = prompt.nextLine();
        Book book = listOfBooks.findBook(bookName);

        if(book.getName() == null) {
            System.out.println("There is no book named '" + bookName + "'");
        } else if(book.isBookAvailable()) {
            System.out.println("This book has already been returned");
        } else {
            book.returnBook();
            System.out.println("The book is now " + book.checkAvailability());
        }
    }

}
