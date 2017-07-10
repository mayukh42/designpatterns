package oop.model.cad.shape;

import oop.model.cad.Color;

/**
 * Created by mayukh42 on 23/5/17.
 *
 * Shallow Shape: An abstraction for non-solid shapes like rings, donuts, etc.
 */
public class ShallowShape implements Draw {

    @Override
    public void draw(Color color) {
        System.out.println("Drawing a shallow shape");
        System.out.println("Filling outer area with Color " + color.name() +
                ", then filling inner area with Color " + color.inverse().name());
    }
}
