package oop.model.cad.shape;

/**
 * Created by mayukh42 on 23/5/17.
 *
 * A solid circle
 */
public class Circle extends Shape {

    private double radius;

    public Circle(Draw artist) {
        super(artist);
        radius = 0d;
    }

    public Circle(Draw artist, double radius) {
        super(artist);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
