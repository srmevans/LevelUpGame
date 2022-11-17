Feature: Name Your Character

I want to create a new custom character, setting only their name.

Scenario Outline:: Set character name
    Given the character's name is <characterNameInput>
    When the character sets their name
    Then the Game sets the character's name to <characterNameOutput>
    Examples:
        | characterNameInput | characterNameOutput |
        | "Stephanie"        | "Stephanie"         |
        | ""                 | "Character"         |