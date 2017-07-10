package oop.model.product.lit;

import java.util.List;

/**
 * Created by mayukh42 on 14/5/17.
 */
public class BookStore {

    private final List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public boolean addBooks(List<Book> books) {
        boolean added = true;
        for (Book book : books)
            added = added && addBook(book);
        return added;
    }

    public List<Book> getBooks() {
        return books;
    }
}
