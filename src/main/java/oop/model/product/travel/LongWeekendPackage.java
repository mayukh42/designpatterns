package oop.model.product.travel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 14/5/17.
 *
 * 3-day vacation
 */
public class LongWeekendPackage extends Trip {

    public LongWeekendPackage(String origin, String destination, int persons, Budget budget) {
        super(origin, destination, persons, budget);
        this.days = 3;
    }

    @Override
    protected double estimateCost() {
        List<String> itinerary = buildItinerary();
        double factor = budget.getFactor();
        return (2000 + itinerary.size() * 1000) * factor;
    }

    @Override
    protected List<String> buildItinerary() {
        return Arrays.asList("Day 1: " + origin + "-" + destination,
                "Day 2: " + destination + " sight seeing",
                "Day 3: " + destination + "-" + origin);
    }
}
