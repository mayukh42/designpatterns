package oop.model.product.travel;

import java.util.List;

/**
 * Created by mayukh42 on 13/5/17.
 *
 * General trip class, which encaps a trip
 *  Finalizing itinerary and estimate cost is deferred to subclasses (template method design pattern)
 */
public abstract class Trip {

    protected final String origin;
    protected final String destination;
    protected int days;
    protected int persons;
    protected double cost;
    protected Budget budget;

    public Trip(String origin, String destination, int persons, Budget budget) {
        this.origin = origin;
        this.destination = destination;
        this.persons = persons;
        this.budget = budget;
        this.cost = estimateCost();     // call abstract method from cons
    }

    /**
     * The template method can be a standalone method or a method called from another method which is not abstract. At
     *  ground level, that called method has to be standalone if we go up the chain high enough.
     */
    protected abstract double estimateCost();

    /**
     * buildItinerary(): create itinerary of the trip
     *  Ideally, this would be created using an online form, which is dynamically created based on #days, etc.
     */
    protected abstract List<String> buildItinerary();

    @Override
    public String toString() {
        return origin + "-" + destination + " (" + days + "D/" + (days - 1) + "N, " + persons + "pac @ " + cost + ")";
    }
}
