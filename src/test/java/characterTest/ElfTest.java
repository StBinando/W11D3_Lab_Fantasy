package characterTest;

import characters.fighters.Elf;
import gameElements.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {

    private Elf elf;
    private Sword sword1;
    private Sword sword2;

    @Before
    public void before() {
        sword1 = new Sword("Excalibur", 10);
        sword2 = new Sword("Barry", 1);
        elf = new Elf(100, "Simon");
    }

    @Test
    public void hasName() {
        assertEquals("Simon", elf.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, elf.getHealthPoints());
    }

    @Test
    public void hasSelectedWeapon() {
        assertNull(elf.getSelectedWeapon());
    }

    @Test
    public void canAddWeapon(){
        elf.addWeapon(sword1);
        assertEquals(1, elf.getNumberOfWeapons().size());
    }
    @Test
    public void canChooseWeapon(){
        elf.addWeapon(sword1);
        elf.addWeapon(sword2);
        elf.chooseWeapon(sword1.getName());
        assertEquals("Excalibur", elf.getSelectedWeapon().getName());
        assertEquals(1, elf.getNumberOfWeapons().size());
    }
}
