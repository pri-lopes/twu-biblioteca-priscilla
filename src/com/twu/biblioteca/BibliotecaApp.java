package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaApp {

    private static BooksList listOfBooks = new BooksList();

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        loadMenu();
    }

    public static String getWelcomeMessage() {
        return "Welcome!";
    }

    public static void loadMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println(getMenuOptions());
        Scanner prompt = new Scanner(System.in);

        String userResponse = prompt.nextLine();
        int menuOption = parseMenuChoice(userResponse);
        if (menuOption > 0) {
            do {
                processMenuOption(menuOption);
                loadMenu();
            } while (menuOption != 4);
        } else {
            System.out.println("Invalid menu option. Let's try again");
            System.out.flush();
            loadMenu();
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

    private static void processMenuOption(int menuOption) {
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

    }

    public static void checkoutABook() {

    }

    public static void returnABook() {

    }

}
