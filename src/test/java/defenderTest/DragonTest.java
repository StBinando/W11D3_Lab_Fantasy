package defenderTest;

import characters.defenders.Dragon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DragonTest {

    private Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon( 25);
    }

   @Test
    public void hasDefenceMethod() {
        assertEquals(25, dragon.getDefenceMethod());
   }
}


