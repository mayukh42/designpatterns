package oop.model.games.farcry;

import oop.model.games.GameState;
import oop.model.games.StateMachine;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * From Palace, Ajay cannot go anywhere else
 */
public class Palace implements GameState {

    @Override
    public void go(String location, StateMachine sm) {
        System.out.println("Game Over");
    }

    @Override
    public String toString() {
        return "Palace";
    }
}
