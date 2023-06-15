package com.levelup.forestsandmonsters;

public class GameMap {
    Position [][] positions =  new Position [0][0]; 
    Position startingPosition = new Position(0, 0); 
    int numPositions=0; 


public GameMap() {
    Position startPos = new Position(0,0);

    this.positions=null;
    this.startingPosition= startPos;
    this.numPositions=0;
}

public Position [][] getPositions(){
    return this.positions;
}

public  Position getStartingPosition(){ 
    return this.startingPosition;
}

public int getNumPositions(){ 
    return this.numPositions;
}


}

