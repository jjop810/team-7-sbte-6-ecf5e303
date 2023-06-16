package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
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
        assertEquals("Dragon", gameStatus.getCharacterName(character));
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

    @Test
    public void gameStatusHasToString(){
        GameStatus gameStatus = new GameStatus(); 
        Position position = new Position(0, 0);
        Character character= new Character();
        character.setPosition(position);
        gameStatus.setCurrentPosition(character);
        gameStatus.setCharacterName(character.getDefaultName());
        character.setName(character.getDefaultName());
        assertNotNull(gameStatus.toString());
        System.out.println(gameStatus.toString());
        assertEquals("Character name: Dragon Current position: 0,0", gameStatus.toString() );
        
    }
}
