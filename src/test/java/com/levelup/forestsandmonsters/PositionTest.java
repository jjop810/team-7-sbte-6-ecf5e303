package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.notNull;

import com.levelup.forestsandmonsters.Position;

public class PositionTest{

Position position= new Position(0, 0);

public void hasCoordinates(){ 
    assertNotNull(position.getCoordinates());
}



}

