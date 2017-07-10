package oop.patterns.gof;

import oop.model.product.travel.Budget;
import oop.model.product.travel.LongWeekendPackage;
import oop.model.product.travel.OneWeekPackage;
import oop.model.product.travel.Trip;

/**
 * Created by mayukh on 14/5/17.
 *
 * Template Method design pattern
 *  Delegate a subset of operations (or steps of an algorithm) to subclasses
 *  Mandate to the subclasses the methods to be overridden.
 */
public class TemplateMethod {

    public static void estimateLongWeekendPackage() {
        Trip trip = new LongWeekendPackage("Bangalore", "Kovalam", 2, Budget.COMFORT);
        System.out.println(trip);
    }

    public static void estimateOneWeekPackage() {
        Trip trip = new OneWeekPackage("Bangalore", "Gujarat", 2, Budget.LUXURY);
        System.out.println(trip);
    }
}
