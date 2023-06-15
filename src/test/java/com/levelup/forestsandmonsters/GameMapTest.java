package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GameMapTest {

    @Test
    public void testInitialize(){ 
        GameMap map = new GameMap(); 
        Position test = new Position(0,0); 

        int x =(map.getStartingPosition().getCoordinates().x); 
        int y =(map.getStartingPosition().getCoordinates().y); 
        assertEquals(x, test.getCoordinates().x); 
        assertEquals(y, test.getCoordinates().y); 

    }
}
