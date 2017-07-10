package oop.patterns.gof;

import oop.model.games.StateMachine;
import oop.model.games.farcry.Banapur;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * The State Design Pattern
 *  Change state by moving to a new class that is of same interface (parent) type as current. The transition and
 *  current state is managed by a State Machine (which is referred to by the state transition method 'go()' of each
 *  state).
 */
public class State {

    public static void playFarCry4() {
        StateMachine sm = new StateMachine(new Banapur());
        sm.getState().go("visit a village", sm);            // Banapur -> Tirtha
        sm.getState().go("protect sculptures", sm);         // Tirtha -> Jalendu
        sm.getState().go("save village from mortar", sm);   // Jalendu -> Utkarsh
        sm.getState().go("destroy golden statue", sm);      // Utkarsh -> Fortress
        sm.getState().go("meet Lakshmana", sm);             // Fortress -> Palace
    }
}
