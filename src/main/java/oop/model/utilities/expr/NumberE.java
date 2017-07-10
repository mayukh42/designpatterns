package oop.model.utilities.expr;

/**
 * Created by mayukh42 on 4/6/17.
 */
public class NumberE extends Expression {

    private Double value;

    public NumberE(Double value) {
        this.value = value;
    }

    @Override
    public Double evaluate() {
        return value;
    }
}
