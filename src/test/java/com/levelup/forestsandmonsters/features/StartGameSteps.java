package com.levelup.forestsandmonsters.features;
import com.levelup.forestsandmonsters.GameController;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Point;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StartGameSteps {
    GameController newGame; 

    @When("the player starts a new game")
    public void the_player_starts_a_new_game() {
        newGame= new GameController();
        newGame.startGame();
    }

    @Then("the map is generated with number of positions {int}")
    public void the_map_is_generatedWithNumberOfPositions(int size) {
        assertEquals(size, newGame.getTotalPositions());
    }
            
    @Then("the character is position at XCoordinates <startingPositionX>")
    public void the_character_is_position_at_x_coordinates_starting_position_x(int startX) {
        Point expect = newGame.getStatus().currentPosition;
        assertEquals(startX, expect.getX());
    }
    
    @Then("YCoordinates <startingPositionY>")
    public void y_coordinates_starting_position_y(int startY) {
        Point expect = newGame.getStatus().currentPosition;
        assertEquals(startY, expect.getY());
     }
      
}
