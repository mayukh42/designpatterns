package oop.patterns.gof;

import oop.model.games.GameState;
import oop.patterns.gof.Memento;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mayukh42 on 2/6/17.
 */
public class MementoTest {

    @Test
    public void testUndo() {
        List<GameState> states = Memento.playFarCry4WithUndo();
        List<String> stateNames = states.stream().map(s -> s.toString()).collect(Collectors.toList());
        String[] expected = {"Tirtha", "Jalendu", "Tirtha", "Tirtha", "Jalendu", "Tirtha", "Utkarsh", "Jalendu",
                "Tirtha", "Fortress", "Utkarsh", "Jalendu", "Palace", "Fortress", "Utkarsh"};
        assertArrayEquals("Order of locations is incorrect", expected, stateNames.toArray());
    }
}
