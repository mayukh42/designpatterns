package oop.model.product.drink;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 13/5/17.
 *
 * Concrete Coffee class
 */
public class BasicCoffee implements Coffee {

    @Override
    public List<String> getIngredients() {
        return Arrays.asList("coffee", "water");
    }

    @Override
    public double getPrice() {
        return 1d;
    }
}
