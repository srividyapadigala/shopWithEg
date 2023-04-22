Feature: login functionality
Scenario: verify user with valid credentials
Given user launches shopwithEg
When user clicks on login button
And user enters valid credentials
Then user is successfully logged in