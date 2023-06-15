package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GameStatusTest {
    @Test
    public void characterHasName(){ 
        GameStatus gameStatus = new GameStatus(); 
        Character character= new Character();
        gameStatus.setCharacterName(character.getDefaultName());
        character.setName(character.getDefaultName());
        assertNotNull(gameStatus.getCharacterName(character));
    }
    @Test
    public void characterHascurrentposition(){ 
        GameStatus gameStatus = new GameStatus(); 
        Position position = new Position(0, 0);
        Character character= new Character();
        character.setPosition(position);
        gameStatus.setCurrentPosition(character);
        assertNotNull(gameStatus.getCurrentPosition());
        }
}
