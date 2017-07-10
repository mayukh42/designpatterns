package oop.patterns.gof;

import oop.model.games.ActorCreator;
import oop.model.games.GameActor;
import oop.model.games.farcry.GoldenPathMemberCreator;
import oop.model.games.farcry.NationalGuardCreator;

/**
 * Created by mayukh42 on 26/5/17.
 *
 * The Factory Design Pattern
 *  Delegate creation of concrete type to subclasses. Client creates the concrete objects by calling factory method,
 *      rather than 'new' operator.
 *
 * The difference between Factory and Abstract Factory is that in the former we do create Factory using 'new',
 *  but in the latter even that is abstracted out.
 */
public class Factory {

    private GameActor createActor(ActorCreator factory, String name) {
        GameActor actor = factory.create(name);
        System.out.println(actor + " created");
        return actor;
    }

    public GameActor createGoldenPath(String name) {
        /* call new on the exact factory required. to eliminate even this 'new' for the factory, see AbstractFactory */
        ActorCreator factory = new GoldenPathMemberCreator();
        return createActor(factory, name);
    }

    public GameActor createNationalGuard(String name) {
        ActorCreator factory = new NationalGuardCreator();
        return createActor(factory, name);
    }

}
