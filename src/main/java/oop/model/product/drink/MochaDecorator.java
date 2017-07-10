package oop.model.product.drink;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayukh on 13/5/17.
 *
 * Mocha: Milk Coffee with Chocolate
 */
public class MochaDecorator extends CoffeeDecorator {

    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public List<String> getIngredients() {
        List<String> contents = new ArrayList<>(coffee.getIngredients());
        contents.add("chocolate");
        return contents;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 1d;
    }
}
