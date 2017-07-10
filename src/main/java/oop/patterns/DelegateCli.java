package oop.patterns;

import oop.model.product.drink.CoffeeShop;

/**
 * Created by mayukh42 on 9/6/17.
 *
 * The Delegate pattern in MS CLI
 *  The delegate pattern defines a method and an object on which that method can be invoked. It is used in asynchronous
 *  programming to provide a callback function along with the object containing it. In simplest form, a delegate in Java
 *  is how we create an object of type 'interface' and define the methods on the fly, like an anonymous local class.
 */
public class DelegateCli {

    public static void runCoffeeShop() {
        CoffeeShop ccd = new CoffeeShop();

        // take orders and serve. don't forget the bill!
        ccd.cappuccino(3.0);
        ccd.coldcoffee(2.0);
        ccd.coldcoffee(5.0);

        // closing time
        System.out.println("Day's business: " + ccd.earnings());
    }
}
