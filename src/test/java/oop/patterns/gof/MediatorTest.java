package oop.patterns.gof;

import oop.patterns.gof.Mediator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 31/5/17.
 */
public class MediatorTest {

    @Test
    public void testHotelBooking() {
        Mediator ktdc = new Mediator();
        String result = ktdc.keralaTour();
        assertEquals("Alice and Bob both should be able to get bookings", "success", result);
    }
}
