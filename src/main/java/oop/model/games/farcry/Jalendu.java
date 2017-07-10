package oop.model.games.farcry;

import oop.model.games.GameState;
import oop.model.games.StateMachine;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * From Jalendu, Ajay can only go to Utkarsh
 */
public class Jalendu implements GameState {

    @Override
    public void go(String location, StateMachine sm) {
        sm.changeState(new Utkarsh());
    }

    @Override
    public String toString() {
        return "Jalendu";
    }
}
