package characters;

import behaviours.ISpell;
import behaviours.IWeapon;

import java.util.ArrayList;

public abstract class Mage extends Player {
    private ArrayList<ISpell> spells;
    private ISpell selectedSpell;

    public Mage(int healthPoints, String name) {
        super(healthPoints, name);
        this.selectedSpell = null;
        this.spells = new ArrayList<>();
    }

    public void addSpell(ISpell _spell){
        this.spells.add(_spell);
    }

    public void chooseSpell(String _spellName){
        if (this.selectedSpell != null){
            this.spells.add(this.selectedSpell);
        }
        if (spells.size()>0){
            for (ISpell s : spells) {
                if (s.getName() == _spellName) {
                    this.selectedSpell = s;
                    this.spells.remove(s);
                }
            }
        }
    }

    public ISpell getSelectedSpell() {
        return this.selectedSpell;
    }

    public ArrayList<ISpell> getSpells() {
        return this.spells;
    }
}