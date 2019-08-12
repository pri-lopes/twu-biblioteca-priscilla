package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookListTests {
    BookList listOfBooks = new BookList();

    @Test
    public void shouldReturnAListOfBooks() {
        assertEquals(listOfBooks.getList().size(), 10);
    }

    @Test
    public void shouldGetDetailedList() {
        String detailedList = listOfBooks.getFormattedList();
        assertEquals(detailedList, "\n" +
                "The Handmaid's Tale | Margareth Atwood | 1985\n" +
                "Woman, Race and Class | Angela Davis | 1981\n" +
                "Feminism for the 99% | Cinzia Arruzza, Nancy Fraser, and Tithi Bhattacharya | 2019\n" +
                "Women, the State and Revolution | Wendy Goldman | 1993\n" +
                "Alias Grace | Margaret Atwood | 1996\n" +
                "1984 | George Orwell | 1949\n" +
                "Animal farm | George Orwell | 1945\n" +
                "Fahrenheit 451 | Ray Bradbury | 1953\n" +
                "Brave New World | Aldous Huxley | 1932\n" +
                "We Should All Be Feminists | Chimamanda Ngozi Adichie | 2014");
    }
}
