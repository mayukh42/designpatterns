package oop.patterns.gof;

import oop.model.games.GameState;
import oop.model.games.StateMachine;
import oop.model.games.farcry.Banapur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * The memento design pattern
 *  Keeps track of state transitions in a state machine and rolls back to previous state when requested. In this
 *  particular example, up to 3 states can be stored.
 */
public class Memento {

    public static List<GameState> playFarCry4WithUndo() {
        List<GameState> states = new ArrayList<>();
        StateMachine sm = new StateMachine(new Banapur());

        sm.getState().go("visit a village", sm);            // Banapur -> Tirtha
        states.addAll(sm.getLast5states());

        sm.getState().go("protect sculptures", sm);         // Tirtha -> Jalendu
        states.addAll(sm.getLast5states());

        sm.undoState();                                             // Back to South for some pending work
        states.addAll(sm.getLast5states());

        sm.getState().go("defuse bomb at Jalendu", sm);     // Tirtha -> Jalendu
        states.addAll(sm.getLast5states());

        sm.getState().go("save village from mortar", sm);   // Jalendu -> Utkarsh
        states.addAll(sm.getLast5states());

        sm.getState().go("destroy golden statue", sm);      // Utkarsh -> Fortress
        states.addAll(sm.getLast5states());

        sm.getState().go("meet Lakshmana", sm);             // Fortress -> Palace
        states.addAll(sm.getLast5states());

        return states;
    }
}
