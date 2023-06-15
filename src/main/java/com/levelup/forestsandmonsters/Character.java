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
            if(this.position.getCoordinates().y > 9){
                this.position.getCoordinates().y = 9;
            }
                break;
            case SOUTH:
            this.position.getCoordinates().y--;
            if(this.position.getCoordinates().y < 0){
                this.position.getCoordinates().y = 0;
            }
                break;
            case EAST:
            this.position.getCoordinates().x++;
            if(this.position.getCoordinates().x > 9){
                this.position.getCoordinates().x = 9;
            }
                break;
            case WEST:
            this.position.getCoordinates().x--;
            if(this.position.getCoordinates().x < 0){
                this.position.getCoordinates().x = 0;
            }
                break;
            default:
                break;
        }
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

    public void move(Object north) {
    }
    
}
