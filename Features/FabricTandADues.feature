@FeatureGroup_Requirement
Feature: feature to test Jiva design Fabric T & A dues screen functionality

  @FabricTandAdues
  Scenario: To test the Fabric T and A dues functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Reports in fabric sourcing module
    Then Click on Fabric T and A dues screen
    And Verify that overdue today upcoming sections are displaying or not
    Then Verify that overdue is opened bydefault
    And verify the submission and Approval tabs are clickable or not
    Then verify the sorting functionality for all sections
    
