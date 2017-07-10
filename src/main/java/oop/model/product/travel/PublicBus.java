package oop.model.product.travel;

/**
 * Created by mayukh42 on 5/6/17.
 */
public class PublicBus implements Transport {

    /* Public bus wastes time on intermediate stops, and average speed is also less */
    @Override
    public double travelTime(double distance) {
        return 0.5 + distance/15.0;
    }

    /* A/C Volvo bus comes to around Rs. 4 per km in Bangalore, excluding last mile connectivity */
    @Override
    public double costOfTravel(double distance) {
        return distance * 4.0 + 30.0;
    }
}
