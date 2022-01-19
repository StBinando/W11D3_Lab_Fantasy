package characters.mages;

import characters.Mage;
import behaviours.IDefend;

public class Wizard extends Mage {
    public Wizard (int healthPoints, String name, IDefend defender) {
        super(healthPoints, name, defender);
    }
}
