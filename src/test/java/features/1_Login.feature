Feature: Login Feature

@lo
Scenario Outline: Verify that Provider can able to login

Given User is on Login page
When user Enters the username "<username>"
And Enters the "<password>" which we provided
Then Click on the Submit button


Examples:
| username  |password |
| admin 	|   admin    |





