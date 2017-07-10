package oop.patterns.gof;

import oop.model.cad.*;
import oop.model.cad.shape.*;

/**
 * Created by mayukh42 on 23/5/17.
 *
 * The Bridge Design Pattern
 *  Bridges two abstractions by composition of one in another
 *  Also called Opaque Pointers in C++
 *
 *  2D abstraction
 *      Dimension 1: Shapes (Circle, Ring, Rectangle)
 *      Dimension 2: Rigidity (Solid, Shallow, Planar, 3D)
 */
public class Bridge {

    public static double drawCircle() {
        Draw solidShape = new SolidShape();
        Shape circle = new Circle(solidShape, 2.0d);

        solidShape.draw(Color.BLACK);
        double area = circle.getArea();
        System.out.printf("Area of the circle: %6.2f\n", area);
        return area;
    }

    public static double drawRing() {
        Draw shallowShape = new ShallowShape();
        Shape ring = new Ring(shallowShape, 2.0d, 1.0d);

        shallowShape.draw(Color.WHITE);
        double area = ring.getArea();
        System.out.printf("Area of the ring: %6.2f\n", area);
        return area;
    }
}
