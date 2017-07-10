package oop.patterns.gof;

import oop.model.product.drink.BasicCoffee;
import oop.model.product.drink.CappuccinoDecorator;
import oop.model.product.drink.CoffeeDecorator;
import oop.model.product.drink.MochaDecorator;

/**
 * Created by mayukh42 on 13/5/17.
 *
 * The Decorator design pattern
 * Decorator object is a sibling of the actual object being decorated, originating from the same parent interface
 *  but along a different branch of the type hierarchy. The sibling contains a reference of the actual object, and
 *  itself overrides the same methods that the parent interface defines. Within its own implementation of those
 *  methods, it delegates a part of evaluation to the object composed in it (i.e. field) and adds something else
 *  to the result. This adding is the decoration.
 *
 *  The sibling contains a reference to the actual object being decorated, passed to it during cons.
 */
public class Decorator {

    public static void createCappuccino() {
        CoffeeDecorator cappuccino = new CappuccinoDecorator(new BasicCoffee());
        System.out.println("Cappuccino contains " + cappuccino.getIngredients() +
                " at a price of " + cappuccino.getPrice());
    }

    public static void createMocha() {
        // similar to java.io.BufferedReader or PrintWriter
        CoffeeDecorator mocha = new MochaDecorator(new CappuccinoDecorator(new BasicCoffee()));
        System.out.println("Mocha contains " + mocha.getIngredients() +
                " at a price of " + mocha.getPrice());
    }
}
