package characterTest;

import characters.enemies.Troll;
import characters.fighters.Elf;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrollTest {

    private Troll troll;

    @Before
    public void before() {
        troll = new Troll(100, 5);
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        troll.getDamaged(10);
        assertEquals(90, troll.getHealthPoints());
    }

    @Test
    public void canAttack() {
        Elf elf = new Elf(100, "Ernie");
        troll.attack(elf);
        assertEquals(95, elf.getHealthPoints());
    }
}
