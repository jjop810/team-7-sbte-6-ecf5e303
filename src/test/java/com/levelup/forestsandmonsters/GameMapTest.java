package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertArrayEquals;
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
    @Test
    public void testGetPositions(){
        GameMap map = new GameMap();
        Position [][] test = new Position [10][10];  
        assertArrayEquals(test, map.getPositions());
    }
    @Test
    public void testTotalPosition(){
        GameMap map = new GameMap();
        int test = 100;
        assertEquals(test,map.getNumPositions());
    }

}
