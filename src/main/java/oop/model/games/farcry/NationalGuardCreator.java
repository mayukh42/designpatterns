package oop.model.games.farcry;

import oop.model.games.ActorCreator;
import oop.model.games.GameActor;

/**
 * Created by mayukh42 on 25/5/17.
 */
public class NationalGuardCreator implements ActorCreator {

    @Override
    public GameActor create(String name) {
        GameActor gameActor = new GameActor(name, 80.0d) {
            @Override
            public void play() {
                System.out.println("Long live Pagan Min!");
            }
        };
        gameActor.setAge(35);
        gameActor.setFaction("Kyrati National Guard");
        return gameActor;
    }
}
