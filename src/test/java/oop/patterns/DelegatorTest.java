package oop.patterns;

import org.junit.Test;

/**
 * Created by mayukh42 on 12/5/17.
 * Wrapper test class for Delegator pattern
 */
public class DelegatorTest {

    @Test
    public void testDelegators() {
        Delegator.testDelegatorInheritance();
        Delegator.testDelegatorComposition();
    }

}
