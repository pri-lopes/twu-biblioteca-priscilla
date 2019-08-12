package com.twu.biblioteca;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        int menuOption = loadMenu();
    }

    public static int loadMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println(getMenuOptions());
        Scanner prompt = new Scanner(System.in);

        String userResponse = prompt.nextLine();
        int menuOption = parseMenuChoice(userResponse);
        if (menuOption > 0) {
            return menuOption;
        } else {
            System.out.println("Invalid menu option. Let's try again");
            System.out.flush();
            return loadMenu();
        }
    }

    public static String getWelcomeMessage() {
        return "Welcome!";
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
}
