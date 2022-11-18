package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    Character character;
    GameMap map;

    public class GameStatus {
        public String characterName;
        public Point currentPosition;
        public int moveCount;
        // TODO: Add other status data
       
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST;
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        this.character = new Character(name);
        this.status.characterName = character.getName();
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
    }

    public void promptStart(){
        //TODO: Print welcome, ascii art, ask user if they want to start game
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
    }

    public void setCharacterPositionAndMoveCount(Point coordinates, int moveCount) {
        if(character == null)
            this.character = new Character();
        this.character.currentPosition = new Position(coordinates.x, coordinates.y);
        this.character.moveCount = moveCount;
        this.status.characterName = this.character.name;
        this.status.currentPosition = this.character.currentPosition.coordinates;
        this.status.moveCount = this.character.moveCount;
    }

    public int getTotalPositions() {
        return 0;
    }

}
