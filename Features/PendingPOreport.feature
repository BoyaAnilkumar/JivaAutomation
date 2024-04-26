@FeatureGroup
Feature: Feature to test the Pending Po Report screen in Jiva Designs Application

  @Pendingporeport
  Scenario: Navigate to Pending PO report screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Reports in fabric sourcing module
    Then click on pending po reports
    And click on Filter expansion and apply filters to get the data
    Then click on export button to download the data into excel sheet

  @Pendingporeportsorting
  Scenario: Verify the Sorting functionality for grid columns and verify the pagination
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Reports in fabric sourcing module
    Then click on pending po reports
    And click on page numbers and page size
    And Click on sorting icon to test the functionality
    
