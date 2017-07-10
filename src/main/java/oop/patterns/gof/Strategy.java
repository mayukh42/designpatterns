package oop.patterns.gof;

import oop.model.product.travel.Commute;
import oop.model.product.travel.Transport;
import oop.model.utilities.ds.Pair;

/**
 * Created by mayukh42 on 5/6/17.
 *
 * The Strategy design pattern
 *  Decouple a method from class, by composing with a field of type function pointer (Functional Interface in Java),
 *  and call its implemented method instead. The field (hence the concrete implementation of the strategy) will be
 *  supplied during cons.
 *
 *  Similar to functions passed as argument to Higher Order functions in FPLs, or Functional Interfaces in Java (like
 *  Comparable; Comparator actually has 2 methods though the 2nd method is equals()).
 *
 *  In this example, the Strategy interface actually has 2 methods (and host class has 2 wrapper methods for them), but
 *  that is a minor detail.
 */
public class Strategy {

    public Pair<Double, Double> commuteStats(String origin, String destination, Transport vehicle) {
        Commute commute = new Commute(origin, destination, vehicle);
        return new Pair<>(commute.getTravelTime(), commute.getCost());
    }
}
