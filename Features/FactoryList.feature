@FeatureGroup_Requirement
Feature: feature to test Jiva design Factory List screen functionality

  @FactoryList
  Scenario: To Test the Factory List functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Factory List screen
    Then Click on Add button to add the Factory List details
    And Enter the mandatory fields data in Factory List
    And Click on Save button in create Factory List screen

  @FactoryList1
  Scenario: To Test the update Factory List functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Factory List screen
    Then Click on Edit icon to update the Factory List details
   
    
    @FactoryList2
  Scenario: To Test the delete Factory List functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Factory List screen
    Then Click on delete icon to update the Factory List details