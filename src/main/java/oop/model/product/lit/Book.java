package oop.model.product.lit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by mayukh42 on 14/5/17.
 *
 * Usage of flyweight authors
 *  Same book can have many copies in the book store, so not implemented like Authors
 */
public class Book {

    private final String name;
    private final List<Author> authors;
    private final int published;

    public Book(String name, int year, Author... authorsArray) {
        this.name = name;
        // authors cannot be changed once a book is published
        authors = Collections.unmodifiableList(Arrays.asList(authorsArray));
        published = year;
    }

    @Override
    public String toString() {
        return name + " (" + published + ") by " + authors;
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getPublished() {
        return published;
    }
}
