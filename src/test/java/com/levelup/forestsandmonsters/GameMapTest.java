package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {

    @Test
    public void testInitialize() {
        GameMap gMap = new GameMap();
        Position test = new Position(0, 0);

        int x = (gMap.getStartingPosition().getCoordinates().x);
        int y = (gMap.getStartingPosition().getCoordinates().y);
        assertEquals(x, test.getCoordinates().x);
        assertEquals(y, test.getCoordinates().y);

    }

    @Test
    public void testGetPositions() {
        GameMap gMap = new GameMap();
        Position[][] test = new Position[10][10];
        assertArrayEquals(test, gMap.getPositions());
    }

    @Test
    public void testTotalPosition() {
        GameMap gMap = new GameMap();
        int test = 100;
        assertEquals(test, gMap.getNumPositions());
    }

    @Test
    public void calculatePositionTest() {

        GameMap gMap = new GameMap();
        Character character = new Character("Northlane");
        character.enterMap(gMap);
        gMap.calculatePosition(character.getPosition(), DIRECTION.NORTH);

        assertEquals(0, character.getPosition().getCoordinates().x);
        assertEquals(1, character.getPosition().getCoordinates().y);
    }

    @Test
    public void isPositionValidNorthAt0_9Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Edge North");
        Position position = new Position(0, 9);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.NORTH);
        gMap.isPositionValid(character.getPosition().getCoordinates());

        assertEquals(0, character.getPosition().getCoordinates().x);
        assertEquals(9, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveNorthStartAt5_5Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Middle North");
        Position position = new Position(5, 5);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.NORTH);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(5, character.getPosition().getCoordinates().x);
        assertEquals(6, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveSouthStartAt5_5Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Middle South");
        Position position = new Position(5, 5);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.SOUTH);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(5, character.getPosition().getCoordinates().x);
        assertEquals(4, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveEastStartAt5_5Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Middle East");
        Position position = new Position(5, 5);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.EAST);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(6, character.getPosition().getCoordinates().x);
        assertEquals(5, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveWestStartAt5_5Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Middle West");
        Position position = new Position(5, 5);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.WEST);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(4, character.getPosition().getCoordinates().x);
        assertEquals(5, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveSouthStartAt0_0Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Ponce");
        Position position = new Position(0, 0);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.SOUTH);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(0, character.getPosition().getCoordinates().x);
        assertEquals(0, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveEastStartAt9_9Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Fajardo");
        Position position = new Position(9, 9);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.EAST);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(9, character.getPosition().getCoordinates().x);
        assertEquals(9, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveEastStartAt9_0Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("San Jaun");
        Position position = new Position(9, 0);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.EAST);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(9, character.getPosition().getCoordinates().x);
        assertEquals(0, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveNorthStartAt9_0Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Arsebo");
        Position position = new Position(9, 0);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.NORTH);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(9, character.getPosition().getCoordinates().x);
        assertEquals(1, character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveWestStartAt0_0Test() {
        GameMap gMap = new GameMap();
        Character character = new Character("Kanye West");
        Position position = new Position(0, 0);
        character.setPosition(position);
        gMap.calculatePosition(character.getPosition(), DIRECTION.WEST);
        gMap.isPositionValid(character.getPosition().getCoordinates());
        assertEquals(0, character.getPosition().getCoordinates().x);
        assertEquals(0, character.getPosition().getCoordinates().y);
    }

}
