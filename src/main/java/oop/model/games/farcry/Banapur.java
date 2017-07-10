package oop.model.games.farcry;

import oop.model.games.GameState;
import oop.model.games.StateMachine;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * From Banapur, Ajay can go to either Shanath or Tirtha
 */
public class Banapur implements GameState {

    @Override
    public void go(String location, StateMachine sm) {
        if (location.equalsIgnoreCase("Shanath")) sm.changeState(new Shanath());
        else sm.changeState(new Tirtha());
    }

    @Override
    public String toString() {
        return "Banapur";
    }
}
