package oop.model.product.travel;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by mayukh42 on 31/5/17.
 *
 * Other end of the mediator
 */
public class Hotel {

    private static final int MAX_ROOMS = 10;

    private final String name;
    private final String place;
    private double rate;
    private Traveler[] guests;    // clever way of managing rooms; null: available, !null: booked

    private ReentrantLock hotelLock;

    public Hotel(String name, String place, double rate) {
        this.name = name;
        this.place = place;
        this.rate = rate;
        guests = new Traveler[MAX_ROOMS];
        hotelLock = new ReentrantLock();
    }

    private long roomsAvailable() {
        return Arrays.asList(guests).stream().filter(t -> t == null).count();
    }

    public boolean isAvailable(int numRooms) {
        boolean available;
        hotelLock.lock();
        try {
            available = numRooms <= roomsAvailable();
        } finally {
            hotelLock.unlock();
        }
        return available;
    }

    public boolean bookRooms(Traveler traveler, int numRooms) {
        if (numRooms <= 0 || numRooms > MAX_ROOMS) return false;

        int count = 0;
        hotelLock.lock();
        try {
            if (roomsAvailable() >= numRooms) {
            /* naive room-booking logic; agenda is to show mediator pattern, not build a hotel booking app */
                for (int i = 0; i < guests.length; i++) {
                    if (count == numRooms) break;

                    if (guests[i] == null) {
                        guests[i] = traveler;
                        count++;
                    }
                }
            }
        } finally {
            hotelLock.unlock();
        }

        boolean booked = count == numRooms;
        if (booked) System.out.println(traveler + " booked @ " + this);
        else System.out.println(traveler + " not booked @ " + this);
        return booked;
    }

    /* Another direction of hotel booking, where the hotel offers some loyalty to the traveler. If he does not show up
        and there is demand, the pre-booking is cancelled and demand met.

        Similar to visitor pattern
     */
    public boolean offerLoyalty(Traveler traveler) {
        return traveler.bookHotel(this, 1);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                name + '\'' +
                ", guests=" + Arrays.toString(guests) +
                '}';
    }
}
