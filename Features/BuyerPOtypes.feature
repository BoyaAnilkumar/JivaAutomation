@FeatureGroup_Requirement
Feature: feature to test Jiva design Buyer PO Types screen functionality

  @BuyerPOtypes
  Scenario: To Test the Buyer PO Types functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buyer PO Types screen
    Then Click on Add button to add the Buyer PO Types details
    And Enter the mandatory fields data in Buyer PO Types
    And Click on Save button in create Buyer PO Types screen

  @BuyerPOtypes1
  Scenario: To Test the update Buyer PO Types functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buyer PO Types screen
    Then Click on Edit icon to update the Buyer PO Types details
   
    
    @BuyerPOtypes2
  Scenario: To Test the delete Buyer PO Types functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buyer PO Types screen
    Then Click on delete icon to update the Buyer PO Types details