package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    static String DEFAULT_NAME;
    String name;
    Position position;


    Character(){
        DEFAULT_NAME = "Dragon";
    }

    Character(String name){
        this.setName(name);
    }

    public void move(DIRECTION direction){
        switch (direction) {
            case NORTH:
            this.position.getCoordinates().y++;
                break;
            case SOUTH:
            this.position.getCoordinates().y--;
                break;
            case EAST:
            this.position.getCoordinates().x++;
                break;
            case WEST:
            this.position.getCoordinates().x--;
                break;
            default:
                break;
        }
    }

    public Object getDefaultName() {
        return DEFAULT_NAME;
    }

    public void setName(String name){
        this.name = name;

    }

    public Object getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.position;

    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void move(Object northh) {
    }
    
}
