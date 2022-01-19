package weaponTest;

import gameElements.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class SwordTest {
    private Sword sword;

    @Before
    public void before() {
        sword = new Sword("Barry", 50);
    }

    @Test
    public void hasName() {
        assertEquals("Barry", sword.getName());
    }

    @Test
    public void hasDamagePoints() {
        assertEquals(50, sword.getDamage());
    }


}
