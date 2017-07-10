package oop.patterns.gof;

import oop.model.utilities.expr.*;
import oop.model.utilities.types.*;
import oop.patterns.gof.Interpreter;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by mayukh42 on 4/6/17.
 *
 * Aside] One of the design priorities of a framework is to reduce verbosity, evident from how the raw language explodes
 * in this particular case.
 */
public class InterpreterTest {

    private RootType createOneKeyJson() {
        /* A Json is a 'list' of k, v pairs */
        RootType order = new JsonType(
                new PairType("order", new JsonType(
                        new PairType("number", new NumberType(10101)),
                        new PairType("item", new StringType("Far Cry 4")),
                        new PairType("quantity", new NumberType(4)),
                        new PairType("contacts", new ArrayType(Arrays.asList(
                                new StringType("1-599-234-766"),
                                new StringType("1-234-567-890")
                        )))
                ))
        );
        return order;
    }

    private RootType createJson() {
        RootType studens = new JsonType(
                new PairType("alice", new JsonType(
                        new PairType("name", new StringType("Alice Wonder")),
                        new PairType("age", new NumberType(23)),
                        new PairType("courses", new ArrayType(Arrays.asList(
                                new StringType("Computer Networks"),
                                new StringType("Logic"),
                                new StringType("Computer Architecture")
                        ))),
                        new PairType("marks", new ArrayType(Arrays.asList(
                                new NumberType(90),
                                new NumberType(80),
                                new NumberType(84)
                        ))),
                        new PairType("address", new JsonType(
                                new PairType("city", new StringType("Redwood City")),
                                new PairType("state", new StringType("CA")),
                                new PairType("zip", new NumberType(94065))
                        ))
                )),
                new PairType("bob", new JsonType(
                        new PairType("name", new StringType("Bob Harley")),
                        new PairType("age", new NumberType(22)),
                        new PairType("courses", new ArrayType(Arrays.asList(
                                new StringType("Advanced Algorithms"),
                                new StringType("Machine Learning"),
                                new StringType("Programming Languages")
                        ))),
                        new PairType("marks", new ArrayType(Arrays.asList(
                                new NumberType(80),
                                new NumberType(100),
                                new NumberType(90)
                        ))),
                        new PairType("address", new JsonType(
                                new PairType("city", new StringType("Santa Clara")),
                                new PairType("state", new StringType("CA")),
                                new PairType("zip", new NumberType(95053))
                        ))
                )));
        return studens;
    }

    /**
     * (5*5 - 4*4)/3 = 3
     */
    private Expression createValidExpression() {
        Expression a = new NumberE(5d);
        Expression b = new NumberE(4d);

        Expression e = new DivideE(
                new SubtractE(
                        new MultiplyE(a, a),
                        new MultiplyE(b, b)),
                new AddE(
                        new NumberE(2d),
                        new NumberE(1d))
        );
        return e;
    }

    @Test
    public void testValidExpression() {
        Expression expr = createValidExpression();
        Interpreter exprLang = new Interpreter();
        Double value = exprLang.evaluateExpression(expr);
        assertEquals("value of expression must be 3", 3d, value, 0.001);
    }

    @Test
    public void testOneKeyJson() {
        Interpreter jsonInterpreter = new Interpreter();
        String value = jsonInterpreter.evaluateJson(createOneKeyJson());
        System.out.println("JSON = \n" + value);
    }

    @Test
    public void testJson() {
        Interpreter jsonInterpreter = new Interpreter();
        String value = jsonInterpreter.evaluateJson(createJson());
        System.out.println("JSON = \n" + value);
    }
}
