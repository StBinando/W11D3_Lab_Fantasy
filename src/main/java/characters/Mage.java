package characters;

import behaviours.*;

import java.util.ArrayList;

public abstract class Mage extends Player implements ITakeDamage, IAttack {
    private ArrayList<ISpell> spells;
    private ISpell selectedSpell;
    private IDefend defender;
    private int totAttackValue;

    public Mage(int healthPoints, String name, IDefend _defender) {
        super(healthPoints, name);
        this.selectedSpell = null;
        this.spells = new ArrayList<>();
        this.defender = _defender;
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

    public void attack(ITakeDamage opponent){
        this.totAttackValue = this.selectedSpell.getDamage();
        this.totAttackValue += this.defender.getDefenceMethod();
        opponent.getDamaged((this.totAttackValue));
    }
}