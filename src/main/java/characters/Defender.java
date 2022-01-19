package characters;

import behaviours.IDefend;

public abstract class Defender implements IDefend {
    private int defendMethod;

    public Defender(int defendMethod){
        this.defendMethod = defendMethod;
    }

    public int getDefenceMethod(){
        return this.defendMethod;
    }
}
