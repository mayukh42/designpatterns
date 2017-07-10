package oop.model.utilities.expr;

/**
 * Created by mayukh42 on 4/6/17.
 */
public class DivideE extends Expression {

    private Expression first;
    private Expression second;

    public DivideE(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Double evaluate() {
        /* evaluate second expression only once */
        Double secondValue = second.evaluate();
        if (!secondValue.equals(0d)) return first.evaluate() / secondValue;
        else throw new IllegalArgumentException("Divide by Zero error");
    }
}
