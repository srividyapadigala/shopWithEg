Feature: password functionality
Scenario: verify password is valid or invalid
Given user launches the url shopwithEg
When user click on login button
When user not enters valid password
And user click on sign in button
Then  shows error message
When user not enter special charecters,numeric values,uppercase and lower case letters 
And user click on sign in button
Then validate error message

