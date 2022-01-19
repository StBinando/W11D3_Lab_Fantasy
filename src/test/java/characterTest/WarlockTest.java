package characterTest;

import characters.mages.Warlock;
import gameElements.weapons.Fireball;
import gameElements.weapons.LightningStrike;
import gameElements.weapons.Spell;
import characters.defenders.Unicorn;
import behaviours.IDefend;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {

    private Warlock warlock;
    private Spell spell1;
    private Spell spell2;
    private IDefend defender;

    @Before
    public void before() {
        spell1 = new Fireball("Fred", 10);
        spell2 = new LightningStrike("Larry", 1);
        defender = new Unicorn(1);
        warlock = new Warlock(100, "Suely", defender);
    }

    @Test
    public void hasName() {
        assertEquals("Suely", warlock.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void hasSelectedWeapon() {
        assertNull(warlock.getSelectedSpell());
    }

    @Test
    public void canAddWeapon(){
        warlock.addSpell(spell1);
        assertEquals(1, warlock.getSpells().size());
    }
    @Test
    public void canChooseWeapon(){
        warlock.addSpell(spell1);
        warlock.addSpell(spell2);
        warlock.chooseSpell(spell1.getName());
        assertEquals("Fred", warlock.getSelectedSpell().getName());
        assertEquals(1, warlock.getSpells().size());
    }
}
