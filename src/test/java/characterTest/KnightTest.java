package characterTest;

import characters.fighters.Knight;
import gameElements.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    private Knight knight;
    private Sword sword1;
    private Sword sword2;

    @Before
    public void before() {
        sword1 = new Sword("Excalibur", 10);
        sword2 = new Sword("Barry", 1);
        knight = new Knight(100, "Simon");
    }

    @Test
    public void hasName() {
        assertEquals("Simon", knight.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasSelectedWeapon() {
        assertNull(knight.getSelectedWeapon());
    }

    @Test
    public void canAddWeapon(){
        knight.addWeapon(sword1);
        assertEquals(1, knight.getNumberOfWeapons().size());
    }
    @Test
    public void canChooseWeapon(){
        knight.addWeapon(sword1);
        knight.addWeapon(sword2);
        knight.chooseWeapon(sword1.getName());
        assertEquals("Excalibur", knight.getSelectedWeapon().getName());
        assertEquals(1, knight.getNumberOfWeapons().size());
    }

    @Test
    public void canGetDamaged() {
        knight.getDamaged(10);
        assertEquals(90, knight.getHealthPoints());
    }
}
