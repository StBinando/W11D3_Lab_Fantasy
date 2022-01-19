package gameElements.weapons;

import gameElements.weapons.Directions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Room {

    private ArrayList<Directions> exits;
    private static HashMap<Integer, Directions> intToExit;
    intToExit.put(0, Directions.WEST);
    intToExit.put(1, Directions.EAST);
    intToExit.put(2, Directions.NORTH);
    intToExit.put(3, Directions.SOUTH);


    public Room() {
        Random random = new Random();
        int numberOfExits = random.nextInt(3) + 1;
        for (int i = 0; i < numberOfExits; i++) {
            int exitNo = random
        }
    }
}
