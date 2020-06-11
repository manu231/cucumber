Feature: Login into facebook
Scenario: Facebook login test scenario
Given User is already on login page
When Title of login page is facebook
Then User enter username and password
And Click on login button
And User is on home page
