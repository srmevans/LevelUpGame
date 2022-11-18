Feature: Start the game

I want to generate a map, and position the character on the map

Scenario Outline: Start the game
    When the player starts a new game
    Then the map is generated with number of positions <numPositions>
    And the character is position at XCoordinates <startingPositionX>
    And YCoordinates <startingPositionY>
    Examples:    
    | numPositions | startingPositionX | startingPositionY |
    | 0 | 0 | 0 |