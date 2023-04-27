Feature: login feature

@InvlidCredentials
Scenario:
Given user launches shopwitheg site
When user clicks login button
And user enters invalid credentials
And user clicks on signin button in login page
Then user will be displayed with error message for invalid credentials

@InvlidCredentials
Scenario:
Given user launches shopwitheg site
When user clicks login button
And user enters blank username and password
And user clicks on signin button in login page
Then user will be displayed with error message for blank username and password

