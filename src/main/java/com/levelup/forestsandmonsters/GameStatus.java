package com.levelup.forestsandmonsters;

public class GameStatus {

    Character character = new Character();
    String characterName = character.DEFAULT_NAME;
     Position currentPosition = new Position(0, 0); 

    //wait for character double
    public String getCharacterName(Character character) {
        return character.getName();
    }

    public void setCharacterName(String name) {
        this.characterName = name;
    }

    public void setCurrentPosition(Character character) { 
        this.currentPosition = character.getPosition();
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
    }

    public String toString(){
        return "Character name: " + this.characterName + " Current position: " + this.currentPosition.getCoordinates().x + "," + this.currentPosition.getCoordinates().y;
        //Character name: Dragon Current position: 0,0
    }
    
    
}
