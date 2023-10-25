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