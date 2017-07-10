package oop.model.product.drink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayukh on 13/5/17.
 *
 * Cappuccino: adds milk to basic coffee
 * The main idea of decorator is to add this functionality without modifying or extending BasicCoffee.
 */
public class CappuccinoDecorator extends CoffeeDecorator {

    public CappuccinoDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public List<String> getIngredients() {
        List<String> contents = new ArrayList<>(coffee.getIngredients());

        /* Decorator 'decorates' output of the original object */
        contents.add("milk");
        return contents;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.5d;
    }
}
