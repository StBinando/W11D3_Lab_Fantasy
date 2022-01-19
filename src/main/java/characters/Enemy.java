package characters;

import behaviours.IAttack;
import behaviours.ITakeDamage;

public abstract class Enemy implements IAttack, ITakeDamage {

    private int healthPoints;
    private int damage;

    public Enemy(int _healthPoints, int _damage) {
        this.healthPoints = _healthPoints;
        this.damage = _damage;
    }

    public void getDamaged(int points) {
        this.healthPoints -= points;
    }

    public void attack(ITakeDamage opponent) {
        opponent.getDamaged(this.damage);
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }
}
