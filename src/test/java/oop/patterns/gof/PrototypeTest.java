package oop.patterns.gof;

import oop.model.fauna.Sex;
import oop.model.fauna.Species;
import oop.patterns.gof.Prototype;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 14/5/17.
 */
public class PrototypeTest {

    @Test
    public void testProkaryotes() {
        Species[] prokaryotes = Prototype.cloneProkaryotes();
        assertFalse("Myco and Thermo should be separate objects", prokaryotes[0] == prokaryotes[1]);
        assertEquals("Myco should be named Bacteria", "Bacteria", prokaryotes[0].getName());
        assertEquals("Thermo should be named Bacteria", "Bacteria", prokaryotes[1].getName());
        assertEquals("Myco should be female", Sex.FEMALE, prokaryotes[0].getSex());
        assertEquals("Thermo should be female", Sex.FEMALE, prokaryotes[1].getSex());
    }

    @Test
    public void testEukaryotes() {
        Species[] eukaryotes = Prototype.cloneEukaryotes();
        assertFalse("Adam and Eve should be separate objects", eukaryotes[0] == eukaryotes[1]);
        assertEquals("Adam should be named Adam", "Adam", eukaryotes[0].getName());
        assertEquals("Eve should be named Eve", "Eve", eukaryotes[1].getName());
        assertEquals("Adam should be male", Sex.MALE, eukaryotes[0].getSex());
        assertEquals("Eve should be female", Sex.FEMALE, eukaryotes[1].getSex());
    }
}
