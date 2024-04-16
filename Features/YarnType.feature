@FeatureGroup_Requirement
Feature: feature to test Jiva design Machine screen functionality

  @Yarntype_Non_Nominated
  Scenario: To Test the Yarn type functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Yarn type screen
    Then Click on Add button to add the Yarn type
    And Enter the mandatory fields data in Yarn type
    And Click on Save button in create Yarn type screen

  @Yarntype_Non_Nominated1
  Scenario: To Test the update Yarn type functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Yarn type screen
    When user search the yarn type in search keyword
    Then Click on Edit icon to update the Yarn type details

  @Yarntype_Non_Nominated2
  Scenario: To Test the delete Yarn type functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Yarn type screen
    When user search the yarn type in search keyword
    Then Click on delete icon to update the Yarn type screen

  @Yarntype_Nominated
  Scenario: To Test the Yarn type functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Yarn type screen
    Then Click on Add button to add the Nominated Yarn type
    And Enter the mandatory fields data in Nominated Yarn type
    #And Click on Save button in create Yarn type screen

  @Yarntype_Nominated1
  Scenario: To Test the update Yarn type functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Yarn type screen
    When user search the nominated yarn type in search keyword
    Then Click on Edit icon to update the nominated Yarn type details
