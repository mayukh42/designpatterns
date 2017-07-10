package oop.model.cad.graphic;

import oop.model.cad.Color;

/**
 * Created by mayukh42 on 30/5/17.
 */
public class House extends Graphic {

    private String material;

    public House(String material) {
        this.material = material;
    }

    @Override
    public void paint(Color color) {
        System.out.println(material + " house painted in " + color.name());
    }

    @Override
    public void add(Graphic object) {
        // Do nothing, since it is leaf type. only keep for type requirement
    }

    @Override
    public void remove(Graphic object) {
        // Do nothing, since it is leaf type. only keep for type requirement
    }
}
