package characterTest;

import characters.mages.Wizard;
import characters.defenders.Dragon;
import behaviours.IDefend;
import gameElements.spells.Fireball;
import gameElements.spells.LightningStrike;
import gameElements.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    private Wizard wizard;
    private Spell spell1;
    private Spell spell2;
    private IDefend defender;

    @Before
    public void before() {
        spell1 = new Fireball("Fred", 10);
        spell2 = new LightningStrike("Larry", 1);
        defender = new Dragon(3);
        wizard = new Wizard(100, "Suely", defender);
    }

    @Test
    public void hasName() {
        assertEquals("Suely", wizard.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void hasSelectedWeapon() {
        assertNull(wizard.getSelectedSpell());
    }

    @Test
    public void canAddWeapon(){
        wizard.addSpell(spell1);
        assertEquals(1, wizard.getSpells().size());
    }
    @Test
    public void canChooseWeapon(){
        wizard.addSpell(spell1);
        wizard.addSpell(spell2);
        wizard.chooseSpell(spell1.getName());
        assertEquals("Fred", wizard.getSelectedSpell().getName());
        assertEquals(1, wizard.getSpells().size());
    }
}
