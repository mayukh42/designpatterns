package oop.model.games.farcry;

import oop.model.games.ActorCreator;
import oop.model.games.GameActor;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * Golden Path: Pagan's Bane
 */
public class GoldenPathMemberCreator implements ActorCreator {

    @Override
    public GameActor create(String name) {
        GameActor gameActor = new GameActor(name, 80.0d) {
            @Override
            public void play() {
                System.out.println("Death to Pagan Min!");
            }
        };
        gameActor.setAge(25);
        gameActor.setFaction("Golden Path");
        return gameActor;
    }
}
