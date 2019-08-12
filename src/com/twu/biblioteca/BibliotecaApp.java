package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        BookList listOfBooks = new BookList();
        loadMenu(listOfBooks);
    }

    public static String getWelcomeMessage() {
        return "Welcome!";
    }

    public static void loadMenu(BookList listOfBooks) {
        System.out.println("\nPlease choose an option:");
        System.out.println(getMenuOptions());
        Scanner prompt = new Scanner(System.in);

        String userResponse = prompt.nextLine();
        int menuOption = parseMenuChoice(userResponse);
        if (menuOption > 0) {
            if (menuOption != 4) {
                processMenuOption(menuOption, listOfBooks);
                loadMenu(listOfBooks);
            }
        } else {
            System.out.println("Invalid menu option. Let's try again");
            System.out.flush();
            loadMenu(listOfBooks);
        }
    }

    public static String getMenuOptions() {
        return "1 - List all books\n2- Checkout a book\n3- Return a book\n4- Quit";
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

    private static void processMenuOption(int menuOption, BookList listOfBooks) {
        switch (menuOption) {
            case 1:
                showBooksList(listOfBooks);
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

    public static void showBooksList(BookList listOfBooks) {
        System.out.println(listOfBooks.getFormattedList());
    }

    public static void checkoutABook() {

    }

    public static void returnABook() {

    }

}
