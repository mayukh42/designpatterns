package oop.patterns.gof;

import oop.model.games.ActorFactory;
import oop.model.games.GameActor;
import oop.model.games.ActorCreator;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * The Abstract Factory design pattern
 * Eliminating the use of 'new' to create objects. One layer of abstraction above the Factory Pattern, to get the
 *  factories themselves based on some configuration.
 *
 *  This example eliminates using 'new' even on factories, because they are obtained as singleton instances from yet
 *  another factory.
 */
public class AbstractFactory {

    public GameActor addSabal() {
        ActorCreator academy = ActorFactory.getGoldenPathFactory();
        GameActor sabal = academy.create("Sabal");
        System.out.println(sabal);
        return sabal;
    }

    public GameActor addYuma() {
        ActorCreator academy = ActorFactory.getNationalGuardFactory();
        GameActor yuma = academy.create("Yuma");
        System.out.println(yuma);
        return yuma;
    }
}
