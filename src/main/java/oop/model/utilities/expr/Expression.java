package oop.model.utilities.expr;

/**
 * Created by mayukh42 on 4/6/17.
 *
 * Arithmetic Expression
 *
 * Backus-Naur form:
 *      Expression  := Number | AddE | SubtractE | MultiplyE | DivideE
 *      AddE        := Expresson + Expression
 *      SubtractE   := Expression - Expression
 *      MultiplyE   := Expresson * Expression
 *      DivideE     := Expresson / Expression
 */
public abstract class Expression {

    public abstract Double evaluate();
}
