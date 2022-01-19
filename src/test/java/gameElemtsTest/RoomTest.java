package gameElemtsTest;

import characters.enemies.Troll;
import gameElements.Directions;
import gameElements.Room;
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

    @Test
    public void roomHasExits(){
        assertTrue(room.getExits().size()>0);
        for(Directions d : room.getExits()){
            System.out.println(d);
        }
    }
}
