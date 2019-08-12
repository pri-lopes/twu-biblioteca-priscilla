package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BookListTests {
    BookList listOfBooks = new BookList();

    @Test
    public void shouldReturnAListOfBooks() {
        assertEquals(10, listOfBooks.getList().size());
    }

    @Test
    public void shouldGetDetailedList() {
        String detailedList = listOfBooks.getFormattedList();
        assertEquals("\n" +
                "The Handmaid's Tale | Margareth Atwood | 1985\n" +
                "Woman, Race and Class | Angela Davis | 1981\n" +
                "Feminism for the 99% | Cinzia Arruzza, Nancy Fraser, and Tithi Bhattacharya | 2019\n" +
                "Women, the State and Revolution | Wendy Goldman | 1993\n" +
                "Alias Grace | Margaret Atwood | 1996\n" +
                "1984 | George Orwell | 1949\n" +
                "Animal farm | George Orwell | 1945\n" +
                "Fahrenheit 451 | Ray Bradbury | 1953\n" +
                "Brave New World | Aldous Huxley | 1932\n" +
                "We Should All Be Feminists | Chimamanda Ngozi Adichie | 2014", detailedList);
    }

    @Test
    public void shouldFindBookByName() {
        Book book = listOfBooks.findBook("The Handmaid's Tale");
        assertEquals("The Handmaid's Tale", book.getName());
    }

    @Test
    public void shouldNotFindBookByInvalidName() {
        Book book = listOfBooks.findBook("Test");
        assertNull(book.getName());
    }
}
