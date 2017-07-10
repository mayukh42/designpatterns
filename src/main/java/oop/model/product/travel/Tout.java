package oop.model.product.travel;

import java.util.List;

/**
 * Created by mayukh42 on 8/6/17.
 *
 * A tout is a proxy for agent. If he is registered, he is an agent, else his promises are fake. Beware of touts!
 *
 * To be used as a proxy for another type, the proxy should be of the same type. Commonly, a proxy inherits from the
 *  type it serves.
 */
public class Tout extends Agent {

    private String placeRegistered;

    /* when a tout is created, he does not have the license to book hotels. it is given to him at a later stage */
    public Tout(String place) {
        super(null);
        placeRegistered = null;
    }

    @Override
    public boolean registered(String place) {
        return place != null && place.equalsIgnoreCase(placeRegistered);
    }

    @Override
    public void grant(String place) {
        /* one time activity */
        if (placeRegistered == null && place != null) {
            placeRegistered = place;
            this.hotels = Hotels.list(place);   // lazy evaluation
        }
    }
}
