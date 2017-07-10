package oop.model.games.farcry;

import oop.model.games.GameState;
import oop.model.games.StateMachine;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * From Fortress, Ajay can only go to Palace
 */
public class Fortress implements GameState {

    @Override
    public void go(String location, StateMachine sm) {
        sm.changeState(new Palace());
    }

    @Override
    public String toString() {
        return "Fortress";
    }
}
