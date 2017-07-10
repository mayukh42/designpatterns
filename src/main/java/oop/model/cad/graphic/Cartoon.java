package oop.model.cad.graphic;

import oop.model.cad.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayukh42 on 30/5/17.
 *
 * Composite type: collection of graphic objects
 * Backus-Naur form:
 *  graphic = animal | hill | house | person | river | tree | cartoon
 *  cartoon = null | graphic :: cartoon
 */
public class Cartoon extends Graphic {

    private List<Graphic> objects;

    public Cartoon() {
        objects = new ArrayList<>();
    }

    @Override
    public void paint(Color color) {
        for (Graphic graphic : objects)
            graphic.paint(color);
    }

    /**
     * Utility functions to add child objects to composite
     */
    @Override
    public void add(Graphic object) {
        objects.add(object);
    }

    @Override
    public void remove(Graphic object) {
        objects.remove(object);
    }
}
