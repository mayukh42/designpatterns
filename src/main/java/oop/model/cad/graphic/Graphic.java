package oop.model.cad.graphic;

import oop.model.utilities.ds.Pair;
import oop.model.cad.Color;

/**
 * Created by mayukh42 on 30/5/17.
 *
 * Parent class for composite and individual types
 */
public abstract class Graphic {

    protected Pair<Double, Double> location;

    public Pair<Double, Double> getLocation() {
        return location;
    }

    public void setLocation(Pair<Double, Double> location) {
        this.location = location;
    }

    public abstract void paint(Color color);
    public abstract void add(Graphic object);
    public abstract void remove(Graphic object);
}
