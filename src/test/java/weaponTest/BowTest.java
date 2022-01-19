package weaponTest;

import gameElements.weapons.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class BowTest {
    private Bow bow;

    @Before
    public void before() {
        bow = new Bow("Leonardo", 15);
    }

    @Test
    public void hasName() {
        assertEquals("Leonardo", bow.getName());
    }

    @Test
    public void hasDamagePoints() {
        assertEquals(15, bow.getDamage());
    }


}
