Feature: Move in a direction

I want to move my character. If they attempt to move past a boundary, the move results in no change in position.

Scenario Outline: Move in a direction
Given the character starts at position with XCoordinates <startingPositionX>
And starts at YCoordinates <startingPositionY>
And the player chooses to move in <direction>
When character moves 
Then the character is now at positon with XCoordinates <endingPositionX>
And YCoordinates <endingPositionY>
Examples: 
| startingPositionX | startingPositonY | direction | endingPositionX | endingPositonY | 
| 0 | 0 | U | 0 | 1 |
| 0 | 0 | D | 0 | 0 |
| 

