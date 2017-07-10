package oop.model.product.auto.customer;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * Command interface
 */
@FunctionalInterface
public interface DriverCommand {

    void apply(Car car);
}
