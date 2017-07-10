package oop.patterns.gof;

import oop.patterns.gof.Bridge;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 24/5/17.
 */
public class BridgeTest {

    @Test
    public void testSolidShape() {
        double area = Bridge.drawCircle();
        assertEquals("Area of circle should be 12.57 units", 12.57d, area, 0.01);
    }

    @Test
    public void testShallowShape() {
        double area = Bridge.drawRing();
        assertEquals("Area of ring should be 9.42 units", 9.42d, area, 0.01);
    }
}
