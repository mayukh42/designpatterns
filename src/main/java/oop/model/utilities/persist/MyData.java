package oop.model.utilities.persist;

import oop.model.utilities.ds.Pair;

import java.util.Observable;

/**
 * Created by mayukh42 on 3/6/17.
 *
 * Observable data; Notifies observers when its state is changed
 */
public class MyData extends Observable {

    private String label;
    private String data;

    public void changeData(String label, String data) {
        this.label = label;
        this.data = data;
        setChanged();
        notifyObservers(new Pair<>(label, data));
    }
}
