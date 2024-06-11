@FeatureGroup_Requirement
Feature: feature to test Jiva design login functionality

@LoginsmokeTest1
Scenario: To Test the Jiva design Login page is opened
Given User navigates to Login page
Then User enters the username and password
And User click on the signIn
And User click on the user icon
Then Click on Logout

 @LoginPage
 Scenario: Validate login is unsuccessful with invalid username credentials
 Given User navigates to Login page
 When User enters invalid username and valid password
 And User click on the signIn 
 Then Incorrect User Name validation message should be displayed
 
@smokeTest2
Scenario: Failed login with incorrect password
Given User navigates to Login page
When User enter a valid username
And User enter an invalid password
And User click on the forgot password
Then User click on the submit
Then click on the toggle icon
When User enter the username
    
   
@smokeTest3
Scenario: Failed login with empty fields
Given User navigates to Login page
When User leave the username field empty
And User leave the password field empty
And User click on the signIn


@LoginPage
 Scenario: Validate Forgot password in login page
 Given User navigates to Login page
 When User clicks on Forgot password link
 Then User navigated to the Forgot Password page
 When User without enters Email Address or Username
 Then validation message should be displayed or not
 When user enter the valid Email Address
 Then click on submit button in forgot password
 
 