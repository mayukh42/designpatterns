package oop.model.utilities.expr;

/**
 * Created by mayukh42 on 4/6/17.
 */
public class MultiplyE extends Expression {

    private Expression first;
    private Expression second;

    public MultiplyE(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Double evaluate() {
        return first.evaluate() * second.evaluate();
    }
}
