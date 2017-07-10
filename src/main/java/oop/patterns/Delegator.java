package oop.patterns;

import oop.model.fauna.Dog;
import oop.model.fauna.SmartAnimal;
import oop.model.fauna.SmartDog;

/**
 * Created by mayukh42 on 12/5/17.
 * The Delegator design pattern
 * 2 variants using inheritance and composition
 */
public class Delegator {

    /**
     * Delegator pattern by Inheritance
     */
    public static void testDelegatorInheritance() {
        Dog tom = new Dog("Tom");   // Dog and Animal have 'is-a' relationship
        tom.work();
    }

    /**
     * Delegator pattern by Composition
     */
    public static void testDelegatorComposition() {
        SmartDog spike = new SmartDog(new SmartAnimal(), "Spike");  // SmartDog and SmartAnimal have 'has-a' relationship
        spike.work();   // same API as delegation by inheritance
    }
}
