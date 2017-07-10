package oop.model.utilities.persist;

import oop.model.utilities.ds.Pair;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mayukh42 on 3/6/17.
 *
 * Contract to persist to file
 */
public interface PersistFile {

    int MAX_ROWS = 3;   // persist to file at every 3 records

    void add(Pair<String, String> row);

    default void persist(String filename, String data) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename, true))) {
            pw.print(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
