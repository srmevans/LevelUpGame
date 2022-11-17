Feature: Start the game

I want to generate a map, and position the character on the map

Scenario: Start the game
    Given the player starts a new game
    When the player enters the game
    Then the map is generated
    And the character is position at XCoordinates <startingPositionX>
    And YCoordinates <startingPositionY>
    | startingPositionX | startingPositionY |
    | 0 | 0 |