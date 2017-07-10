package oop.patterns.gof;

import oop.model.games.GameActor;
import oop.patterns.gof.Factory;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayukh42 on 26/5/17.
 *
 * Test the Factory Design Pattern
 */
public class FactoryTest {

    @Test
    public void testFarCryActorCreation() {
        String[] friends = {"Sabal", "Amita"};
        String[] enemies = {"Pagan", "dePleur", "Noore", "Yuma"};
        Factory factory = new Factory();

        List<GameActor> goldenPathMembers = new ArrayList<>();
        for (String name : friends)
            goldenPathMembers.add(factory.createGoldenPath(name));

        List<GameActor> nationalGuards = new ArrayList<>();
        for (String name : enemies)
            nationalGuards.add(factory.createNationalGuard(name));

        long countGoldenPathFaction = goldenPathMembers.stream().filter(m -> m.getFaction().contains("Golden Path")).count();
        assertTrue("Golden Path should have 2 members with faction name as Golden Path", countGoldenPathFaction == 2);

        long countNationalGuards = nationalGuards.stream().filter(m -> m.getFaction().contains("National Guard")).count();
        assertTrue("National Guard should have 4 members with faction name as National Guard", countNationalGuards == 4);
    }
}
