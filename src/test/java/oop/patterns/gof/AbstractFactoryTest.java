package oop.patterns.gof;

import oop.model.games.GameActor;
import oop.patterns.gof.AbstractFactory;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 25/5/17.
 */
public class AbstractFactoryTest {

    @Test
    public void createFarCryCharacters() {
        AbstractFactory abstractFactory = new AbstractFactory();
        List<GameActor> characters = Arrays.asList(abstractFactory.addSabal(), abstractFactory.addYuma());
        assertTrue("First character should be Sabal", characters.get(0).getName().equals("Sabal"));
        assertTrue("Second character should be Yuma", characters.get(1).getName().equals("Yuma"));
    }
}
