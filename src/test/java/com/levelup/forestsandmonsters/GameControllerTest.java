package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameControllerTest {
    @Test
    public void InitializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void CharacterMoves() {
        
    }
}
