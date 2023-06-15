package com;
import java.awt.Point;

public class Position {

    private Point coordinates;

    public Position(int xCoordinates, int yCoordinates){
        this.coordinates.x=xCoordinates;
        this.coordinates.y=yCoordinates;
    }

    public Point getCoordinates(){
        return this.coordinates;
    }
}
