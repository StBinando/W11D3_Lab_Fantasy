package gameElemtsTest;

import characters.enemies.Troll;
import gameElements.weapons.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room;
    private Troll troll;


    @Before
    public void before(){
        room = new Room();

    }
}
