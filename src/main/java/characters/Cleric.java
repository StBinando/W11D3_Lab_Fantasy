package characters;

import behaviours.IHeal;

public class Cleric extends Player implements IHeal {

    public Cleric(int healthPoints, String name) {
        super(healthPoints, name);
    }

    @Override
    public void heal(Player _player) {
        _player.addHealthPoints(10);
    }
}
