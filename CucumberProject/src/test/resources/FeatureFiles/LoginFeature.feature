@feature1
Feature: Test login functionality of login OrangeHRM
@smoke
@sanity
Scenario: Test valid login
Given user in login page
When user enters userName and password
And click the login button
Then user enter into user dash board

@smoke
Scenario: Test valid login1
Given user in login page
When user enters userName and password
And click the login button
Then user enter into user dash board

@sanity
Scenario: Test valid login2
Given user in login page
When user enters userName and password
And click the login button
Then user enter into user dash board

#By In line data
@sanity
Scenario: Test valid login in line data
Given user in login page
When user enters "AdminInLine" and "passwordInLine"
And click the login button
Then user enter into user dash board

#By using Scenario outline

@sanity
Scenario Outline: Test valid login2
Given user in login page
When user enters <userName> and <password>
And click the login button
Then user enter into user dash board
Examples:
|userName|password|
|"Admin"|"passwod"|
|"admin"|"password1"|
|"admin2"|"password2"|


