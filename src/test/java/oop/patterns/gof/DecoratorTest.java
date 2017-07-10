package oop.patterns.gof;

import oop.patterns.gof.Decorator;
import org.junit.Test;

/**
 * Created by mayukh42 on 13/5/17.
 */
public class DecoratorTest {

    @Test
    public void createCappucinoTest() {
        Decorator.createCappuccino();
    }

    @Test
    public void createMocha() {
        Decorator.createMocha();
    }
}
