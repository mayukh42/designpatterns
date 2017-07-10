package oop.model.product.travel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 14/5/17.
 */
public class OneWeekPackage extends Trip {

    public OneWeekPackage(String origin, String destination, int persons, Budget budget) {
        super(origin, destination, persons, budget);
        this.days = 7;
    }

    @Override
    protected double estimateCost() {
        List<String> itinerary = buildItinerary();
        double factor = budget.getFactor();
        double luxurySurcharge = (budget.equals(Budget.LUXURY) ? 1 : 0);    // only applicable for > 3 days trips
        return (3000 + itinerary.size() * 800) * (factor + luxurySurcharge);
    }

    @Override
    protected List<String> buildItinerary() {
        return Arrays.asList("Day 1: " + origin + "-" + destination,
                "Day 2: " + destination + " sight seeing",
                "Day 3: " + destination + " sight seeing",
                "Day 4: " + destination + " sight seeing",
                "Day 5: " + destination + " sight seeing",
                "Day 6: " + destination + " sight seeing",
                "Day 7: " + destination + "-" + origin);
    }
}
