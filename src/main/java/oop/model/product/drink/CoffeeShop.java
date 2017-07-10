package oop.model.product.drink;

import oop.model.utilities.ds.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 9/6/17.
 */
public class CoffeeShop {

    private final List<Pair<String, Double>> ledger;

    public CoffeeShop() {
        this.ledger = new ArrayList<>();
    }

    public double earnings() {
        return ledger.stream()
                .map(entry -> entry.getSecond())
                .reduce((a, b) -> a.doubleValue() + b.doubleValue()).get();
    }

    public Coffee cappuccino(double tendered) {
        /* We could have created an object of implemented type like BasicCoffee, but here we create it on the fly as an
        anonymous class, to show the Delegate pattern from CLI */
        Coffee cappuccino = new Coffee() {
            @Override
            public List<String> getIngredients() {
                return Arrays.asList("coffee", "hot milk", "sugar");
            }

            @Override
            public double getPrice() {
                return 1.0;
            }
        };

        /* coffee making time */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /* The delegate encapsulates both the method getPrice() and the object cappuccino. We can add another layer of
            abstraction by wrapping them in a separate type, like
              class CoffeeAndPrice(SimpleCoffeePOJO coffee, CoffeePriceCalculator)
              where coffeepriceCalculator implements the functional interface getPrice() and takes in a coffee
              reference (could be standardized as a decorator or otherwise).
         */
        if (tendered >= cappuccino.getPrice()) {
            System.out.println("Cappuccino served.");
            ledger.add(new Pair<>("Cappuccino", cappuccino.getPrice()));
            return cappuccino;
        }
        else throw new IllegalArgumentException("Cappuccino costs more, you miser!");

    }

    public Coffee coldcoffee(double tendered) {
        Coffee cc = new Coffee() {
            @Override
            public List<String> getIngredients() {
                return Arrays.asList("coffee", "ice", "milk", "sugar");
            }

            @Override
            public double getPrice() {
                return 1.5;
            }
        };

        /* coffee making time */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (tendered >= cc.getPrice()) {
            System.out.println("Cold Coffee served.");
            ledger.add(new Pair<>("Cold Coffee", cc.getPrice()));
            return cc;
        }
        else throw new IllegalArgumentException("Maybe you can order hot coffee and leave it to cool instead");

    }
}
