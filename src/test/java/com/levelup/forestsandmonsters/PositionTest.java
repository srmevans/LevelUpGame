package com.levelup.forestsandmonsters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    @Test
public void initializationPositionTest()
    {
        Position testObj = new Position(1, 0);
        assertEquals(1, testObj.coordinates.x);
    }
}
