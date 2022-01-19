package gameElements.weapons;

import gameElements.weapons.Directions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Room {

    private ArrayList<Directions> exits;
    private static HashMap<Integer, Directions> intToExit = new HashMap<>();


    public Room() {
        intToExit.put(0, Directions.WEST);
        intToExit.put(1, Directions.EAST);
        intToExit.put(2, Directions.NORTH);
        intToExit.put(3, Directions.SOUTH);
        exits = new ArrayList<>();

        Random random = new Random();
        int numberOfExits = random.nextInt(3) + 1;
        while (exits.size() < numberOfExits) {
            int exitNo = random.nextInt(3);
            if (!(exits.contains(intToExit.get(exitNo)))) {
                exits.add(intToExit.get(exitNo));
            }
        }
    }

    public ArrayList<Directions> getExits() {
        return this.exits;
    }
}
