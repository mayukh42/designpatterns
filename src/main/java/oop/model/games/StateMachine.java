package oop.model.games;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * State machine for transitioning between states
 * Also maintain last 3 transitions
 */
public class StateMachine {

    private static final int MAX_DEPTH = 3;

    private GameState state;
    private Deque<GameState> last5states;    // Stack to hold last 5 transitions

    public StateMachine(GameState state) {
        this.state = state;
        last5states = new LinkedList<>();
    }

    /* State Transition */
    public void changeState(GameState newState) {
        this.state = newState;
        if (last5states.size() >= MAX_DEPTH) last5states.pollLast();

        last5states.addFirst(newState);
        System.out.println(last5states);
    }

    /* Rollback State */
    public void undoState() {
        if (last5states.size() > 0) {
            last5states.pollFirst();
            state = last5states.peekFirst();
            System.out.println(last5states);
        }
        else System.out.println("Undo not available");
    }

    public GameState getState() {
        return state;
    }

    public Deque<GameState> getLast5states() {
        return last5states;
    }

    @Override
    public String toString() {
        return "State: " + state;
    }
}
