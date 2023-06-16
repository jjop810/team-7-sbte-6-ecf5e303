package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    static String DEFAULT_NAME;
    String name;
    Position position;
    GameMap gMap;


    Character(){
        DEFAULT_NAME = "Dragon";
    }

    Character(String name){
        this.setName(name);
    }

    public void move(DIRECTION direction){
        if(this.gMap == null){
            this.gMap = new GameMap();
        }
        gMap.calculatePosition(this.position, direction);
    }

    public String getDefaultName() {
        return DEFAULT_NAME;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.position;

    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void enterMap(GameMap gMap) {
        this.position = gMap.startingPosition;
    }
    
}
