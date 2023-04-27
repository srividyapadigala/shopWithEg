Feature: password functionality
Scenario: verify user enter valid credentials
Given user launches shopwitheg
When user clicks on login button
When user enters valid password
And user click on signin
Then validate password
When user not enters uppercase 
Then validate uppercase error message
When user not enters special charecter
Then validate special charecter error message
When user not enters numerics
Then validate numerics error message
When user not enter lowercase
Then validate lowercase error message
