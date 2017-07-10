package oop.model.product.travel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by mayukh42 on 5/6/17.
 *
 * An abstraction for commute from point A to point B
 * Example: Our daily trips to office and back
 */
public class Commute {

    private final String origin;
    private final String destination;
    private double distance;

    /* Strategy for commute */
    private final Transport transport;

    public Commute(String origin, String destination, Transport transport) {
        this.origin = origin;
        this.destination = destination;
        this.transport = transport;
        this.distance = RoadMap.get(origin, destination);
    }

    public double getTravelTime() {
        return new BigDecimal(transport.travelTime(this.distance)).setScale(2,
                RoundingMode.HALF_UP).doubleValue();
    }

    /* number of zeros after 1 determines number of decimal places */
    public double getCost() {
        return Math.round(transport.costOfTravel(this.distance) * 100d)/100d;
    }

    @Override
    public String toString() {
        return origin + " to " + destination + ": " + distance + " @ " + getTravelTime();
    }
}
