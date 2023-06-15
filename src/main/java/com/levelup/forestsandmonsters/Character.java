package com.levelup.forestsandmonsters;

public class Character {

    static String DEFAULT_NAME;
    String name;


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
    
}
