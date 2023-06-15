package com.levelup.forestsandmonsters;
import java.awt.Point;

public class Position {

    private Point coordinates;

    public Position(int xCoordinates, int yCoordinates){
        coordinates = new Point();
        this.coordinates.x=xCoordinates;
        this.coordinates.y=yCoordinates;
    }

    public Point getCoordinates(){
        return this.coordinates;
    }

    public Position getPosition() {
        return null;
    }
}
