package oop.model.product.travel;

/**
 * Created by mayukh42 on 31/5/17.
 *
 * One end of the mediator
 */
public class Traveler {

    private String name;
    private String place;
    private int age;

    public Traveler(String name, String place, int age) {
        this.name = name;
        this.place = place;
        this.age = age;
    }

    /* Non-mediator way of booking hotel */
    public boolean bookHotel(Hotel hotel, int numRooms) {
        boolean booked = false;
        if (hotel.isAvailable(numRooms))
            booked = hotel.bookRooms(this, numRooms);

        if (booked)
            System.out.println(hotel + " booked in the name of " + name);
        else
            System.out.println(hotel + " could not be booked.");

        return booked;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " from " + place;
    }

    /** Up to this point, the design is tightly coupled where Traveler knows the existence of Hotel type, and calls its
     *      methods directly. But in order to ease the booking process, traveler might take the help of an agent or
     *      mediator. The agent may require extra methods (API) for both traveler and hotel types.
     */
}
