package oop.model.games.farcry;

import oop.model.games.GameState;
import oop.model.games.StateMachine;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * From Shanath, Ajay can go to either Utkarsh or Jalendu
 */
public class Shanath implements GameState {

    @Override
    public void go(String location, StateMachine sm) {
        if (location.equalsIgnoreCase("Utkarsh")) sm.changeState(new Utkarsh());
        else sm.changeState(new Jalendu());
    }

    @Override
    public String toString() {
        return "Shanath";
    }
}
