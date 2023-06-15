package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.Position;
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
    
}
