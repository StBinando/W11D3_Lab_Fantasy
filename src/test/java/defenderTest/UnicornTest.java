package defenderTest;

import characters.defenders.Unicorn;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnicornTest {

    private Unicorn unicorn;

    @Before
    public void before() {
        unicorn = new Unicorn( 25);
    }

    @Test
    public void hasDefenceMethod() {
        assertEquals(25, unicorn.getDefenceMethod());
    }
}


