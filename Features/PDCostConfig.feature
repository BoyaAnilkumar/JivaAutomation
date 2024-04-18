@FeatureGroup_Requirement
Feature: feature to test Jiva design Machine screen functionality

  @PDCostConfig
  Scenario: To Test the pd cost config functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the PDCostConfig screen
    When click on edit icon for each row
    And change the value in edit form
    Then click on update button to update the value