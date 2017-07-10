package oop.model.cad.shape;

import oop.model.utilities.ds.Pair;
import oop.model.cad.Color;

/**
 * Created by mayukh42 on 19/5/17.
 *
 * Abstraction #1: Shape
 *  A shape needs to be 'drawn' in order to exist. So it is dependent on something that can draw.
 *  By itself, a shape is abstract because unless we specify 'what' shape, we don't have a clue.
 */
public abstract class Shape {

    protected Pair<Double, Double> location;

    /* artist: one who draws
        A reference to the bridged abstraction 'Draw'
        The Pimpl (Pointer to Implementation) idiom or Opaque Pointer in C++
     */
    protected final Draw artist;

    public Shape(Draw artist) {
        this.artist = artist;
    }

    public Pair<Double, Double> getLocation() {
        return location;
    }

    public void setLocation(Pair<Double, Double> location) {
        this.location = location;
    }

    public Draw getArtist() {
        return artist;
    }

    /* Facade for the composed abstraction within */
    public void sketch(Color color) {
        artist.draw(color);
    }

    public abstract double getArea();

}
