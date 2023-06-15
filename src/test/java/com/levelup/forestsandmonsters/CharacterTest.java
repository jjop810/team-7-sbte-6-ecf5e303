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
    public void characterMoveNorthTest(){
        Character character = new Character("Mover");

        Position position = new Position(0,0);
        character.setPosition(position);
        character.move(DIRECTION.NORTH);
        assertEquals(1,character.getPosition().getCoordinates().y);
        assertEquals(0,character.getPosition().getCoordinates().x);
    }
}
