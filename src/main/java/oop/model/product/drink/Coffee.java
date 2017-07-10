package oop.model.product.drink;

import java.util.List;

/**
 * Created by mayukh42 on 13/5/17.
 *
 * Coffee: parent interface to be used by Coffee implementors and decorators.
 *  Only these methods are common to both object and its decorator; as such, only these can be decorated.
 */
public interface Coffee {

    List<String> getIngredients();
    double getPrice();
}
