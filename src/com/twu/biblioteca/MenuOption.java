package com.twu.biblioteca;

public enum MenuOption {
    INVALID_OPTION(-1),
    QUIT_OPTION(0),
    LIST_BOOKS(1),
    CHECKOUT_BOOK(2),
    RETURN_BOOK(3),
    LIST_MOVIES(4),
    CHECKOUT_MOVIE(5),
    RETURN_MOVIE(6);

    public final int value;

    MenuOption(int i) {
        this.value = i;
    }
}
