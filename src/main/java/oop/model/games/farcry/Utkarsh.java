package oop.model.games.farcry;

import oop.model.games.GameState;
import oop.model.games.StateMachine;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * From Utkarsh, Ajay can only go to Fortress
 */
public class Utkarsh implements GameState {

    @Override
    public void go(String location, StateMachine sm) {
        sm.changeState(new Fortress());
    }

    @Override
    public String toString() {
        return "Utkarsh";
    }
}
