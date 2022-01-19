package characterTest;

import characters.enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrcTest {

    private Orc orc;

    @Before
    public void before() {
        orc = new Orc(100, 5);
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        orc.getDamaged(10);
        assertEquals(90, orc.getHealthPoints());
    }
}
