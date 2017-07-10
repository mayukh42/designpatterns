package oop.model.games;

/**
 * Created by mayukh42 on 2/6/17.
 *
 * Parent interface of all states. Each state is a location
 */
public interface GameState {

    void go(String location, StateMachine sm);
    String toString();  // force implementing classes to override this
}
