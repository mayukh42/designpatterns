package oop.patterns.gof;

import oop.model.product.travel.Agent;
import oop.model.product.travel.Hotel;
import oop.model.product.travel.Hotels;
import oop.model.product.travel.Traveler;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 31/5/17.
 *
 * The Mediator design pattern
 *
 * Adds new functionality while mediating between 2 separate entities which otherwise would have interacted with
 * each other directly. Used to decouple 2 types.
 *
 * Difference with Facade is that the latter is just a wrapper on top of existing functionality; it does not add any
 * new functionality; participating entities are not aware of the facade's existence. As a result, the facade is a
 * structural design pattern. Whereas mediator adds new functionality and could even force changes in the entities,
 * thereby making it a behavioral pattern.
 */
public class Mediator {

    /* Agent is the mediator between traveler and hotel */
    private Agent ktdc;

    public Mediator() {
        ktdc = new Agent("Kerala");
    }

    public String keralaTour() {
        Traveler alice = new Traveler("Alice", "Boston", 33);
        boolean aliceBooked = ktdc.book(alice, 8);

        Traveler bob = new Traveler("Bob", "San Francisco", 34);
        boolean bobBooked = ktdc.book(bob, 6);

        if (aliceBooked && bobBooked) return "success";
        else return "failed";
    }
}
