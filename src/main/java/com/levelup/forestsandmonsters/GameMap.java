package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    Position[][] positions = new Position[0][0];
    Position startingPosition = new Position(0, 0);
    int numPositions = 0;

    public GameMap() {
        Position startPos = new Position(0, 0);
        this.positions = new Position[10][10];
        this.startingPosition = startPos;
        this.numPositions = 100;
    }

    public Position[][] getPositions() {
        return this.positions;
    }

    public Position getStartingPosition() {
        return this.startingPosition;
    }

    public int getNumPositions() {
        return this.numPositions;
    }

    public void calculatePosition(Position startPosition, DIRECTION direction) {
        switch (direction) {
            case NORTH:
                startPosition.getCoordinates().y++;
                if (!isPositionValid(startPosition.getCoordinates())) {
                    startPosition.getCoordinates().y = 9;
                }
                break;
            case SOUTH:
                startPosition.getCoordinates().y--;
                if (!isPositionValid(startPosition.getCoordinates())) {
                    startPosition.getCoordinates().y = 0;
                }
                break;
            case EAST:
                startPosition.getCoordinates().x++;
                if (!isPositionValid(startPosition.getCoordinates())) {
                    startPosition.getCoordinates().x = 9;
                }
                break;
            case WEST:
                startPosition.getCoordinates().x--;
                if (!isPositionValid(startPosition.getCoordinates())) {
                    startPosition.getCoordinates().x = 0;
                }
                break;

            default:
                break;
        }
    }

    public Boolean isPositionValid(Point coordinates) {
        // North Edge
        if (coordinates.y > 9) {
            return false;
        }
        //south 
        else if(coordinates.y < 0){
            return false;
        }
        //east
        else if(coordinates.x > 9){
            return false;
        }
        //west
        else if(coordinates.x < 0){
            return false;
        }
        return true;
    }

}
