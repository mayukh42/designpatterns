package oop.model.cad.shape;

import oop.model.cad.Color;

/**
 * Created by mayukh42 on 23/5/17.
 *
 * Solid Shape: An abstraction for filled shapes.
 */
public class SolidShape implements Draw {

    @Override
    public void draw(Color color) {
        System.out.println("Drawing a solid shape");
        System.out.println("Filling the shape with Color " + color.name());
    }
}
