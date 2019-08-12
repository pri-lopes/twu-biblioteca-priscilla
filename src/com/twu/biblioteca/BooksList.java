package com.twu.biblioteca;

import java.util.ArrayList;

public class BooksList {
    private ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public BooksList() {
        this.listOfBooks.add(new Book("The Handmaid's Tale", "Margareth Atwood", 1985));
        this.listOfBooks.add(new Book("Woman, Race and Class", "Angela Davis", 1981));
        this.listOfBooks.add(new Book("Feminism for the 99%", "Cinzia Arruzza, Nancy Fraser, and Tithi Bhattacharya", 2019));
        this.listOfBooks.add(new Book("Women, the State and Revolution", "Wendy Goldman", 1993));
        this.listOfBooks.add(new Book("Alias Grace", "Margaret Atwood", 1996));
        this.listOfBooks.add(new Book("1984", "George Orwell", 1949));
        this.listOfBooks.add(new Book("Animal farm", "George Orwell", 1945));
        this.listOfBooks.add(new Book("Fahrenheit 451", "Ray Bradbury", 1953));
        this.listOfBooks.add(new Book("Brave New World", "Aldous Huxley", 1932));
        this.listOfBooks.add(new Book("We Should All Be Feminists", "Chimamanda Ngozi Adichie", 2014));
    }
}
