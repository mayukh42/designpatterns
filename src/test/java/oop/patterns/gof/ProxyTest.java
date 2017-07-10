package oop.patterns.gof;

import oop.patterns.gof.Proxy;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 8/6/17.
 */
public class ProxyTest {

    @Test
    public void testProxyDoesNotBookHotel() {
        Proxy proxy = new Proxy();
        assertFalse("Tout should not be able to book hotel without license", proxy.tamilnaduTourByTout());
    }

    @Test
    public void testProxyBooksHotel() {
        Proxy proxy = new Proxy();
        assertTrue("Tout should be able to book hotel with license", proxy.tamilnaduTourByAgent());
    }
}
