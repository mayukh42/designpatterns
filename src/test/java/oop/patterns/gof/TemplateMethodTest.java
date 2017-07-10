package oop.patterns.gof;

import oop.patterns.gof.TemplateMethod;
import org.junit.Test;

/**
 * Created by mayukh on 14/5/17.
 */
public class TemplateMethodTest {

    @Test
    public void testOneWeekTrip() {
        TemplateMethod.estimateOneWeekPackage();
    }

    @Test
    public void testLongWeekendTrip() {
        TemplateMethod.estimateLongWeekendPackage();
    }
}
