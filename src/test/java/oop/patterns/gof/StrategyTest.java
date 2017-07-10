package oop.patterns.gof;

import oop.model.product.travel.PrivateCar;
import oop.model.product.travel.PublicBus;
import oop.model.product.travel.SuburbanTrain;
import oop.model.utilities.ds.Pair;
import oop.patterns.gof.Strategy;
import org.junit.Test;

/**
 * Created by mayukh42 on 5/6/17.
 */
public class StrategyTest {

    @Test
    public void homeToOffice() {
        Strategy strategy = new Strategy();
        Pair<Double, Double> timeAndCost = strategy.commuteStats("Home", "Office", new PrivateCar());
        System.out.println("Home to Office in a private car: time = " + timeAndCost.getFirst() + ", cost = " +
                timeAndCost.getSecond());

        timeAndCost = strategy.commuteStats("Home", "Office", new PublicBus());
        System.out.println("Home to Office in a public bus: time = " + timeAndCost.getFirst() + ", cost = " +
                timeAndCost.getSecond());

        timeAndCost = strategy.commuteStats("Home", "Office", new SuburbanTrain());
        System.out.println("Home to Office in a suburban train: time = " + timeAndCost.getFirst() + ", cost = " +
                timeAndCost.getSecond());
    }

    @Test
    public void officeToMall() {
        Strategy strategy = new Strategy();
        Pair<Double, Double> timeAndCost = strategy.commuteStats("Office", "Mall", new PrivateCar());
        System.out.println("Office to Mall in a private car: time = " + timeAndCost.getFirst() + ", cost = " +
                timeAndCost.getSecond());

        timeAndCost = strategy.commuteStats("Office", "Mall", new PublicBus());
        System.out.println("Office to Mall in a public bus: time = " + timeAndCost.getFirst() + ", cost = " +
                timeAndCost.getSecond());

        timeAndCost = strategy.commuteStats("Office", "Mall", new SuburbanTrain());
        System.out.println("Office to Mall in a suburban train: time = " + timeAndCost.getFirst() + ", cost = " +
                timeAndCost.getSecond());
    }
}
