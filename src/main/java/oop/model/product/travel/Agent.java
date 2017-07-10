package oop.model.product.travel;

import java.util.List;

/**
 * Created by mayukh42 on 31/5/17.
 *
 * Mediator between Traveler and Hotel; A travel agent
 */
public class Agent {

    protected List<Hotel> hotels;

    public Agent(String place) {
        if (place != null) this.hotels = Hotels.list(place);
        else this.hotels = null;
    }

    /** booked()
     *  The mediator scans for first available hotel and books it. This is not simply a facade because the scanning is
     *  new functionality that mediator adds.
     */
    public boolean book(Traveler traveler, int numRooms) {
        if (hotels == null) return false;

        boolean booked = false;
        for (Hotel hotel : hotels) {
            if (hotel.isAvailable(numRooms))
                booked = hotel.bookRooms(traveler, numRooms);
            if (booked) break;
        }

        return booked;
    }

    /* methods to ensure type homogeneity between agent and proxy */
    public boolean registered(String place) {
        return hotels != null && hotels.size() > 0;
    }

    public void grant(String place) {
        if (hotels == null || hotels.size() == 0)
            hotels = Hotels.list(place);
    }
}
