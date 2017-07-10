package oop.patterns.gof;

import oop.patterns.gof.Flyweight;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 14/5/17.
 */
public class FlyweightTest {

    @Test
    public void testBookStore() {
        assertEquals("Bengali Store should have 2 authors", 2, Flyweight.addBengaliSection());
        assertEquals("International Store should have 4 authors", 4, Flyweight.addEnglishSection());
    }
}
