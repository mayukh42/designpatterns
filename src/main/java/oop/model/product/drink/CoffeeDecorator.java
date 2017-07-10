package oop.model.product.drink;

/**
 * Created by mayukh on 13/5/17.
 *
 * CoffeeDecorator abstract class
 *  implements Coffee, but we need to extend it in order to create Concrete Decorators
 */
abstract public class CoffeeDecorator implements Coffee {

    protected Coffee coffee;    // instance of Coffee to which interface methods will be delegated to get the base return values

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
