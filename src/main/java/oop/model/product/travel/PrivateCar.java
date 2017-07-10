package oop.model.product.travel;

/**
 * Created by mayukh42 on 5/6/17.
 */
public class PrivateCar implements Transport {

    /* A small vehicle like car may have to travel 10% more due to U-turn constraints, parking, etc. and wait 15 mins
        in signals */
    @Override
    public double travelTime(double distance) {
        return 0.25 + (distance * 1.1)/20.0;
    }

    /* Fuel + Maintenance + Parking + Insurance */
    @Override
    public double costOfTravel(double distance) {
        return distance * 7.0;
    }
}
