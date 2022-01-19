package characters;

import behaviours.ITakeDamage;

public abstract class Player implements ITakeDamage {

    private String name;
    private int healthPoints;

    public Player(int healthPoints, String name) {
        this.healthPoints = healthPoints;
        this.name = name;
    }


    public String getName(){
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    protected void addHealthPoints(int additionalHealtPoints) {
        this.healthPoints += additionalHealtPoints;
        if (this.healthPoints > 100){
            this.healthPoints = 100;
        }
    }

    public void getDamaged(int points){
        this.healthPoints -= points;
    }
}
