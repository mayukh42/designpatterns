package oop.patterns.gof;

import oop.model.product.travel.Agent;
import oop.model.product.travel.Tout;
import oop.model.product.travel.Traveler;

/**
 * Created by mayukh42 on 8/6/17.
 *
 * The Proxy design pattern
 *  Wrapper on a type to allow
 *      Lazy evaluation (of time-consuming methods including cons, if designed accordingly),
 *      Access control based on authority,
 *      Lightweight object representing a heavyweight object to type-check without doing actual work
 */
public class Proxy {

    /** Book using a tout. Booking does not happen because the tout is not registered.
     * The proxy pattern ensures that the time consuming operation of creating list of hotels for the Tout is avoided.
     */
    public boolean tamilnaduTourByTout() {
        Agent dreamholidays = new Tout(null);

        Traveler alice = new Traveler("Alice", "Boston", 33);
        boolean aliceBooked = dreamholidays.book(alice, 8);

        Traveler bob = new Traveler("Bob", "San Francisco", 34);
        boolean bobBooked = dreamholidays.book(bob, 6);

        return aliceBooked || bobBooked;    // either should be false since tout does not have license to book
    }

    /** Book using an agent. Booking does not happen for Alice but happens for Bob because the agent is registered by
     *  the time Bob contacts him.
     * The proxy pattern ensures that the time consuming operation of creating list of hotels for the Tout is deferred
     *  till the tout is granted license.
     */
    public boolean tamilnaduTourByAgent() {
        Agent dreamholidays = new Tout(null);

        Traveler alice = new Traveler("Alice", "Boston", 33);
        boolean aliceBooked = dreamholidays.book(alice, 8);

        dreamholidays.grant("tamilnadu");   // promotes a tout to an agent

        Traveler bob = new Traveler("Bob", "San Francisco", 34);
        boolean bobBooked = dreamholidays.book(bob, 6);

        return !aliceBooked && bobBooked;
    }

}
