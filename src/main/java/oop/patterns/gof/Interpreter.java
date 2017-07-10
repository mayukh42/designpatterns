package oop.patterns.gof;

import oop.model.utilities.expr.Expression;
import oop.model.utilities.types.*;

/**
 * Created by mayukh42 on 4/6/17.
 *
 * The Interpreter Design Pattern
 *  Interpret a Context-Free Grammar (CFG) using type information about the grammar. Implementation uses the Composite
 *  design pattern (ref. Composite class).
 *
 * Example 1: Json data type
 * Example 2: Expression evaluator
 */
public class Interpreter {

    public String evaluateJson(RootType json) {
        return json.toString();
    }

    public Double evaluateExpression(Expression expr) {
        return expr.evaluate();
    }
}
