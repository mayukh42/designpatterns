package oop.model.games;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * AbstractFactory interface for creating character
 */
public interface ActorCreator {

    GameActor create(String name);
}
