Feature: login functionality

  Scenario: verify validate error message
    Given user launches shopwithEg
    When user clicks on login button
    And user clicks on create account button
    When user enters firstname and lastname with less than 2 charecters
    And user clicks another create account button
    Then validate the error message
