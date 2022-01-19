package characters.mages;

import characters.Fighter;
import characters.Mage;
import behaviours.IDefend;

public class Warlock extends Mage {
    public Warlock(int healthPoints, String name, IDefend defender) {
        super(healthPoints, name, defender);
    }
}