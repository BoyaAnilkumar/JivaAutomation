@FeatureGroup_Requirement
Feature: feature to test Jiva design Machine screen functionality

  @YarnPDCostConfig
  Scenario: To Test the PD cost configuration functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the YarnPDCostConfig screen
    When click on edit icon for each row in YarnPDCostConfig
    And change the value in edit form in YarnPDCostConfig
    Then click on update button to update the value in YarnPDCostConfig