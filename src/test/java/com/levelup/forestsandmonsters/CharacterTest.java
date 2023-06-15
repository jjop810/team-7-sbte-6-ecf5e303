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
}
