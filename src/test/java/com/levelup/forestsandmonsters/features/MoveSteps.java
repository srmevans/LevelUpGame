package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;

import java.awt.Point;
import static org.junit.Assert.assertEquals;

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
    @Given("starts at YCoordinates {int}")
        public void givenTheCharacterStartsAtY(int startY) {
            this.startY = startY;
        }   
    @Given("the player chooses to move in {word}")
        public void givenPlayerChoosesDirection(String direction) {
            this.direction = GameController.DIRECTION.valueOf(direction);
        }  
    
    @When("the character moves")
        public void theCharacterMoves() {
            gc = new GameController();
            gc.setCharacterPosition(new Point(this.startX,this.startY));
            gc.move(this.direction);
            GameController.GameStatus status = gc.getStatus(); 
            this.currentPosition = status.currentPosition;
        
        }
}
