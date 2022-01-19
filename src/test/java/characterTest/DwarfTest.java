package characterTest;

import characters.fighters.Dwarf;
import gameElements.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DwarfTest {

    private Dwarf dwarf;
    private Sword sword1;
    private Sword sword2;

    @Before
    public void before() {
        sword1 = new Sword("Excalibur", 10);
        sword2 = new Sword("Barry", 1);
        dwarf = new Dwarf(100, "Simon");
    }

    @Test
    public void hasName() {
        assertEquals("Simon", dwarf.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasSelectedWeapon() {
        assertNull(dwarf.getSelectedWeapon());
    }

    @Test
    public void canAddWeapon(){
        dwarf.addWeapon(sword1);
        assertEquals(1, dwarf.getNumberOfWeapons().size());
    }
    @Test
    public void canChooseWeapon(){
        dwarf.addWeapon(sword1);
        dwarf.addWeapon(sword2);
        dwarf.chooseWeapon(sword1.getName());
        assertEquals("Excalibur", dwarf.getSelectedWeapon().getName());
        assertEquals(1, dwarf.getNumberOfWeapons().size());
    }
}
