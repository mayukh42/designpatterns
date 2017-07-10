package oop.model.utilities.persist;

import oop.model.utilities.ds.Pair;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by mayukh42 on 3/6/17.
 *
 * Observer which persists to an XML file on change of data
 * TODO: Refactor into Abstract Class with common content
 */
public class PersistXML implements Observer, PersistFile {

    private StringBuilder data;
    private int count;
    private final String filename;

    public PersistXML(String filename) {
        data = new StringBuilder("<root>\n");
        count = 0;
        this.filename = filename;
    }

    @Override
    public void add(Pair<String, String> row) {
        data
                .append("<").append(row.getFirst().trim()).append(">")
                .append(row.getSecond().trim())
                .append("</").append(row.getFirst().trim()).append(">\n");
        count++;
    }

    private String finalizeData() {
        return data.append("</root>\n").toString();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (count == MAX_ROWS) {
            persist(filename, finalizeData());
            data = new StringBuilder("<root>\n");
            count = 0;
        }
        Pair<String, String> row = (Pair<String, String>) arg;
        add(row);
    }
}
