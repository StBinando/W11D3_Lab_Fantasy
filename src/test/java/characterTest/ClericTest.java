package characterTest;

import characters.Cleric;
import characters.fighters.Dwarf;
import characters.fighters.Elf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    private Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric(100, "Benedict");
    }

    @Test
    public void hasName() {
        assertEquals("Benedict", cleric.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void canHeal() {
        Dwarf dwarf = new Dwarf(80, "Danny");
        cleric.heal(dwarf);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void canHealto100() {
        Elf elf = new Elf(95, "Eugene");
        cleric.heal(elf);
        assertEquals(100, elf.getHealthPoints());
    }

}
