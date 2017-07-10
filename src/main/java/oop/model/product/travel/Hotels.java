package oop.model.product.travel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 8/6/17.
 *
 * Utility class to generate hotels
 */
public class Hotels {

    /* Add more places as necessary */
    public static List<Hotel> list(String place) {
        switch (place.toLowerCase()) {
            case "kerala":
                return kerala();
            case "tamilnadu":
                return tamilnadu();

            default:
                return null;
        }
    }

    /**
     * Represents potentially expensive methods, which might do a DB connect to fetch the data
     */
    private static List<Hotel> kerala() {
        return Arrays.asList(
                new Hotel("KTDC Samudra", "Kovalam", 4200d),
                new Hotel("KTDC Waterscapes", "Kumarakom", 4300d),
                new Hotel("KTDC Pepper Grove", "Sulthan Bathery", 1600d),
                new Hotel("KTDC Tea County", "Munnar", 6700d)
        );
    }

    private static List<Hotel> tamilnadu() {
        return Arrays.asList(
                new Hotel("TTDC Kanyakumari", "Kanyakumari", 2600d),
                new Hotel("TTDC Ooty", "Ooty", 2500d),
                new Hotel("TTDC Madurai", "Madurai", 2600d)
        );
    }
}
