Feature: Move in a direction
![Gamer](images/SBE top gun.jpg)

    I want to move my character. If they attempt to move past a boundary, the move results in no change in position.

Scenario Outline: Move in a direction
    Given the character starts at position with XCoordinates <startingPositionX>
    And starts at YCoordinates <startingPositionY>
    And the player chooses to move in <direction>
    When the character moves
    Then the character is now at positon with XCoordinates <endingPositionX>
    And YCoordinates <endingPositionY>
    Examples: 
        | startingPositionX | startingPositionY | direction | endingPositionX | endingPositionY | 
        | 1 | 0 | EAST | 2 | 0 |
        | 1 | 3 | WEST | 0 | 3 |
        | 3 | 2	| NORTH | 3 | 3 |
        | 4 | 1 | SOUTH | 4 | 0 |
        | 0	| 0 | WEST | 0 | 0 |
        | 0 | 10 | NORTH | 0 | 10 |
        | 10 | 0 | EAST | 10 | 0 |
        | 10 | 10 | NORTH | 10 | 10 |

Scenario Outline: After every move the status count is increased by one       
    Given character has a status count of <currentStatus>
    When character makes a move
    Then the updated status count is <endStatus>
    Examples:
        | currentStatus | endStatus |
        | 5 | 6 |
        | 87 | 88 |
        | 23 | 24 |
        | 321 | 322 |
        | 211 | 212 |
        | 27 | 28 |
        | 15 | 16 |

Scenario Outline: When character hits a map boundary, the position remains but move count (status) increases by one
    Given character is at a boundary position <boundaryPositionX>,<boundaryPositionY> 
    And current move count is <currentMoveCount>
    And they move one step towards the boundary <newBoundaryPositionX>,<newBoundaryPositionY>
    Then the step is allowed
    And the position values do not change <newBoundaryPositionX>,<newBoundaryPositionY>
    And the status count increases by one <moveCount>
    Examples:
        | boundaryPositionX | boundaryPositionY | currentMoveCount | newBoundaryPositionX | newBoundaryPositionY | moveCount |
        | 10 | 10 | 10 | 10 | 10 | 11 |