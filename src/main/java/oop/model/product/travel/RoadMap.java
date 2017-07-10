package oop.model.product.travel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 5/6/17.
 *
 * Places: Home, Office, Mall, Garage
 * Distance Matrix:
 *  0, 10, 2, 12
 *  10, 0, 7, 20
 *  2, 7, 0, 14
 *  12, 20, 14, 0
 */
public class RoadMap {

    private static final List<String> places = Arrays.asList("Home", "Office", "Mall", "Garage");
    private static final double[][] distances = new double[][]{
            {0d, 10d, 2d, 12d},
            {10d, 0d, 7d, 20d},
            {2d, 7d, 0d, 14d},
            {12d, 20d, 14d, 0d}
    };

    public static double get(String origin, String destination) {
        int indexOrigin = places.indexOf(origin);
        int indexDestination = places.indexOf(destination);
        if (indexOrigin >= 0 && indexDestination >= 0)
            return distances[indexOrigin][indexDestination];
        else
            return Double.MAX_VALUE;    // troll the user
    }
}
