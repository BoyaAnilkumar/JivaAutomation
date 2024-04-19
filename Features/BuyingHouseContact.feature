@FeatureGroup_Requirement
Feature: feature to test Jiva design Buying House contact screen functionality

  @BuyingHouseContact
  Scenario: To Test the Buying House contact functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buying House contact in menu
    Then Click on Add button to add the Buying House contact details
    And Enter the data for Buying House contact in add form
    Then Click on Save button in create Buying House contact screen

  @BuyingHouseContact1
  Scenario: To Test the update Buying House contact functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buying House contact in menu
    Then Click on Edit button to update the Buying House contact details
    And Clear and Insert the data for Buying House contact in update form
    Then Click on Save button in create Buying House contact screen

    @BuyingHouseContact2
  Scenario: To Test the Delete Buying House contact functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buying House contact in menu
    Then Click on Delete button to update the Buying House contact details
   