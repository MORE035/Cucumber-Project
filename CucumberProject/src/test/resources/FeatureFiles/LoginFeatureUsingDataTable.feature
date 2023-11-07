@feature2
Feature: Test login functionality of login OrangeHRM
#Data Table
#@sanity
@ignore
Scenario: Test valid login using Data Table
Given user in login page
When user enters userName and password1
|userName|password|
And click the login button
Then user enter into user dash board
