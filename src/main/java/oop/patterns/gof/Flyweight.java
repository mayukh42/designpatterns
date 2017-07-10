package oop.patterns.gof;

import oop.model.product.lit.Author;
import oop.model.product.lit.Book;
import oop.model.product.lit.BookStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh on 14/5/17.
 *
 * The Flyweight design pattern
 *  Shared immutable objects or pool of objects. Not necessarily singleton objects.
 *  In this example, author is a flyweight object; there is only one author object per unique name, but not necessarily
 *  singleton. It is similar to String interning or Executor Pools.
 *
 * The Flyweight pattern can be easily managed in DB using well-known DML constraints.
 */
public class Flyweight {

    private static final BookStore store = new BookStore(new ArrayList<>());

    public static int addBengaliSection() {
        List<Book> bengaliBooks = Arrays.asList(
                new Book("Sonar Kella", 1971, Author.get("Satyajit Ray")),
                new Book("Joy Baba Felunath", 1980, Author.get("Satyajit Ray")),
                new Book("Satyanweshi", 1950, Author.get("Sharadindu Bandyopadhyay")),
                new Book("Shajarur Kaanta", 1980, Author.get("Sharadindu Bandyopadhyay"))
        );
        boolean added = store.addBooks(bengaliBooks);
        return Author.count();
    }

    public static int addEnglishSection() {
        List<Book> englishBooks = Arrays.asList(
                new Book("A study in scarlet", 1888, Author.get("Arthur Conan Doyle")),
                new Book("Murder on the Orient Express", 1920, Author.get("Agatha Christie")),
                new Book("Hound of the Baskervilles", 1894, Author.get("Arthur Conan Doyle"))
        );
        boolean added = store.addBooks(englishBooks);
        return Author.count();
    }

}
