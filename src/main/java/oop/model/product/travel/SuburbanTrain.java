package oop.model.product.travel;

/**
 * Created by mayukh42 on 5/6/17.
 */
public class SuburbanTrain implements Transport {

    /* Train travel is sensible when distance is larger, even though average speed is higher, because train can only
        be boarded at designated hours. */
    @Override
    public double travelTime(double distance) {
        return 1.0 + distance/30.0;
    }

    /* Govt. subsidized. Also includes last mile connectivity */
    @Override
    public double costOfTravel(double distance) {
        return distance * 1.0 + 50.0;
    }
}
