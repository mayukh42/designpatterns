package oop.model.product.lit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mayukh42 on 14/5/17.
 *
 * Flyweight authors
 *  Author must be immutable
 *
 *  Author is not singleton, since multiple author objects are created, What it guarrantees is that no two authors with
 *  same name will be created. This is similar to java.util.Logger(String name) among others.
 */
public class Author {

    private static Map<String, Author> poolOfAuthors = new HashMap<>();
    private final String name;

    private Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * Flyweight authors; create one only if absent
     */
    public static Author get(String name) {
        synchronized (poolOfAuthors) {
            /* key: argument of lambda function, should not conflict with the local scope which already contains 'name'
                At runtime this lambda function will be called with the variable 'name'.
             */
            poolOfAuthors.computeIfAbsent(name, (key) -> new Author(key));
        }
        return poolOfAuthors.get(name);
    }

    public static int count() {
        return poolOfAuthors.size();
    }
}
