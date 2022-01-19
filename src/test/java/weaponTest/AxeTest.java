package weaponTest;

import gameElements.weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class AxeTest {
    private Axe axe;

    @Before
    public void before() {
        axe = new Axe("Simon", 24);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", axe.getName());
    }

    @Test
    public void hasDamagePoints() {
        assertEquals(24, axe.getDamage());
    }


}
