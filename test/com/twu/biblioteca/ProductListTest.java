package com.twu.biblioteca;

import org.junit.Test;
import sun.plugin.perf.PluginRollup;

import static org.junit.Assert.*;

public class ProductListTest {

    ProductList listOfBooks = new ProductList("book");

    @Test
    public void shouldGetFormattedListOfAllBooks() {
        String expectedList = "[1985] The Handmaid's Tale | Margareth Atwood\n" +
                "[1981] Woman, Race and Class | Angela Davis\n" +
                "[2019] Feminism for the 99% | Cinzia Arruzza, Nancy Fraser, and Tithi Bhattacharya\n" +
                "[1993] Women, the State and Revolution | Wendy Goldman\n" +
                "[1996] Alias Grace | Margaret Atwood\n" +
                "[1949] 1984 | George Orwell\n" +
                "[1945] Animal farm | George Orwell\n" +
                "[1953] Fahrenheit 451 | Ray Bradbury\n" +
                "[1932] Brave New World | Aldous Huxley\n" +
                "[2014] We Should All Be Feminists | Chimamanda Ngozi Adichie\n";
        assertEquals(expectedList, listOfBooks.getFormattedList(false));
    }

    @Test
    public void shouldFindABookByName() {
        String search = "Animal farm";
        Product product = listOfBooks.findProduct(search);
        String productDetails = "[1945] Animal farm | George Orwell";
        assertEquals(productDetails, product.getDetails());
    }

    @Test
    public void shouldGetFormattedListOfAvailableBooks() {
        Product product = listOfBooks.findProduct("Animal farm");
        product.checkoutProduct();

        String expectedList = "[1985] The Handmaid's Tale | Margareth Atwood\n" +
                "[1981] Woman, Race and Class | Angela Davis\n" +
                "[2019] Feminism for the 99% | Cinzia Arruzza, Nancy Fraser, and Tithi Bhattacharya\n" +
                "[1993] Women, the State and Revolution | Wendy Goldman\n" +
                "[1996] Alias Grace | Margaret Atwood\n" +
                "[1949] 1984 | George Orwell\n" +
                "[1953] Fahrenheit 451 | Ray Bradbury\n" +
                "[1932] Brave New World | Aldous Huxley\n" +
                "[2014] We Should All Be Feminists | Chimamanda Ngozi Adichie\n";
        assertEquals(expectedList, listOfBooks.getFormattedList(true));
    }
}