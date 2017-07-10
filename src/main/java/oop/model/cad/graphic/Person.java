package oop.model.cad.graphic;

import oop.model.cad.Color;
import oop.model.fauna.Sex;

/**
 * Created by mayukh42 on 30/5/17.
 *
 * An object type in a cartoon
 */
public class Person extends Graphic {

    private String name;
    private Sex sex;

    public Person(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public void paint(Color color) {
        System.out.println(name + " painted in " + color.name());
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
