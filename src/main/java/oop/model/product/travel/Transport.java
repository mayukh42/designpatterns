package oop.model.product.travel;

/**
 * Created by mayukh42 on 5/6/17.
 */
public interface Transport {

    /** A real-world complex strategy could be to factor in origin, destination and figure out distance from it,
     *  then calculate time and cost based on prevalent traffic conditions.
     */
    double travelTime(double distance);
    double costOfTravel(double distance);
}
