@FeatureGroup_Requirement
Feature: feature to test Jiva design Machine screen functionality

  @Machine
  Scenario: To Test the Machine functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Machine screen
    Then Click on Add button to add the Machine details
    And Enter the mandatory fields data in Machine
    And Click on Save button in create Machine screen

  @Machine1
  Scenario: To Test the update Machine functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Machine screen
    Then Click on Edit icon to update the Machine details

  @Machine2
  Scenario: To Test the delete Machine functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Machine screen
    Then Click on delete icon to update the Machine details

    @smokeTest2
Scenario: To Test the machine screen
Given User navigates to Login page
Then User enters the username and password
And User click on the signIn 
And User click on the Master
Then Click on the Machine
And Click on the add button
And click on the Submit button
Then click on the machine model toggle icon
And  click on the min gauge icon
Then click on the max gauge toggle icon
When User enter the machine model name
And user enter the Min gauge
When user enter the max gauge
 