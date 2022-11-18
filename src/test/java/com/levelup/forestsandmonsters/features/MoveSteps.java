package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;

import java.awt.Point;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MoveSteps {
    GameController gc;
    int startX, startY, endX, endY;
    GameController.DIRECTION direction;
    Point currentPosition;

    @Given("the character starts at position with XCoordinates {int}")
        public void givenTheCharacterStartsAtX(int startX) {
            this.startX = startX;
        }
    @And("starts at YCoordinates {int}")
        public void givenTheCharacterStartsAtY(int startY) {
            this.startY = startY;
        }   
    @And("the player chooses to move in {word}")
        public void givenPlayerChoosesDirection(String direction) {
            this.direction = GameController.DIRECTION.valueOf(direction);
        }  
    
    @When("the character moves")
        public void theCharacterMoves() {
            gc = new GameController();
            GameController.GameStatus status = gc.getStatus(); 
            gc.setCharacterPositionAndMoveCount(new Point(this.startX,this.startY),status.moveCount);
            gc.move(this.direction);
            this.currentPosition = status.currentPosition;
        
        }
        @Then("the character is now at positon with XCoordinates {int}")
        public void checkXCoordinates(int endX) {
            assertNotNull("Expected position not null", this.currentPosition);
            assertEquals(endX, this.currentPosition.x);
        }
        @And("YCoordinates {int}")
        public void checkYCoordinates(int endY) {
            assertNotNull("Expected Position not null",this.currentPosition);
            assertEquals(endY, this.currentPosition.y);


        }
        
}
