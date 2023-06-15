package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
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
}
