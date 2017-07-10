package oop.patterns.gof;

import oop.model.product.device.Laptop;
import oop.model.product.device.Phone;
import oop.patterns.gof.Adapter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 25/5/17.
 */
public class AdapterTest {

    @Test
    public void testPhoneCharging() {
        Phone iphone = new Phone("iphone");
        double chargeLeft = Adapter.chargeDevice(iphone);
        assertEquals("Phone should have 70% charge remaining after 1 charging session", 70d, chargeLeft, 0.1d);

        chargeLeft = Adapter.chargeDevice(iphone);
        assertEquals("Phone should have 90% charge remaining after 2 charging sessions", 90d, chargeLeft, 0.1d);
    }

    @Test
    public void testLaptopCharging() {
        Laptop laptop = new Laptop("Dell E6430");
        double chargeLeft = Adapter.chargeDevice(laptop);
        assertEquals("Laptop should have 60% charge remaining after 1 charging session", 60d, chargeLeft, 0.1d);

        chargeLeft = Adapter.chargeDevice(laptop);
        assertEquals("Laptop should have 70% charge remaining after 2 charging sessions", 70d, chargeLeft, 0.1d);
    }
}
