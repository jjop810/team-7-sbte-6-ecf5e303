package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
public class CharacterTest {
    @Test
    public void nameCharacterTest() {
        Character charater = new Character("Bob Maerley");
        assertEquals("Bob Maerley", charater.getName());
    }

    @Test
    public void defaultCharacterNameTest() {
        Character charater = new Character();
        assertEquals("Dragon",charater.getDefaultName());
    }

    @Test
    public void getCharacterPositionTest() {
        Character character = new Character();
        Position position = new Position(1,2);
        character.setPosition(position);
        assertEquals(1,character.getPosition().getCoordinates().x);
        assertEquals(2,character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveNorthStartAt5_5Test(){
        Character character = new Character("Middle North");

        Position position = new Position(5,5);
        character.setPosition(position);
        character.move(DIRECTION.NORTH);
        assertEquals(5,character.getPosition().getCoordinates().x);
        assertEquals(6,character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveSouthStartAt5_5Test(){
        Character character = new Character("Middle South");

        Position position = new Position(5,5);
        character.setPosition(position);
        character.move(DIRECTION.SOUTH);
        assertEquals(5,character.getPosition().getCoordinates().x);
        assertEquals(4,character.getPosition().getCoordinates().y);
    }
    @Test
    public void characterMoveEastStartAt5_5Test(){
        Character character = new Character("Middle East");

        Position position = new Position(5,5);
        character.setPosition(position);
        character.move(DIRECTION.EAST);
        assertEquals(6,character.getPosition().getCoordinates().x);
        assertEquals(5,character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveWestStartAt5_5Test(){
        Character character = new Character("Middle West");

        Position position = new Position(5,5);
        character.setPosition(position);
        character.move(DIRECTION.WEST);
        assertEquals(4,character.getPosition().getCoordinates().x);
        assertEquals(5,character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveNorthStartAt0_9Test(){
        Character character = new Character("Edge North");

        Position position = new Position(0,9);
        character.setPosition(position);
        character.move(DIRECTION.NORTH);
        assertEquals(0,character.getPosition().getCoordinates().x);
        assertEquals(9,character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveSouthStartAt0_0Test(){
        Character character = new Character("Edge South");

        Position position = new Position(0,0);
        character.setPosition(position);
        character.move(DIRECTION.SOUTH);
        assertEquals(0,character.getPosition().getCoordinates().x);
        assertEquals(0,character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveEastStartAt9_9Test(){
        Character character = new Character("Edge East");

        Position position = new Position(9,9);
        character.setPosition(position);
        character.move(DIRECTION.EAST);
        assertEquals(9,character.getPosition().getCoordinates().x);
        assertEquals(9,character.getPosition().getCoordinates().y);
    }

    @Test
    public void characterMoveWestStartAt0_0Test(){
        Character character = new Character("Kanye West");

        Position position = new Position(0,0);
        character.setPosition(position);
        character.move(DIRECTION.WEST);
        assertEquals(0,character.getPosition().getCoordinates().x);
        assertEquals(0,character.getPosition().getCoordinates().y);
    }
}
