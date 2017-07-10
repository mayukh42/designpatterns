package oop.model.games.farcry;

import oop.model.games.GameState;
import oop.model.games.StateMachine;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * From Tirtha, Ajay can only go to Jalendu
 */
public class Tirtha implements GameState {

    @Override
    public void go(String location, StateMachine sm) {
        sm.changeState(new Jalendu());
    }

    @Override
    public String toString() {
        return "Tirtha";
    }
}
