package oop.model.utilities.types;

/**
 * Created by mayukh42 on 4/6/17.
 */
public class NumberType extends RootType {

    private Number value;

    public NumberType(Number value) {
        this.value = value;
    }

    @Override
    public Number getObject() {
        return value;
    }

    @Override
    public String toString() {
        return "n'" + value.toString();
    }
}
