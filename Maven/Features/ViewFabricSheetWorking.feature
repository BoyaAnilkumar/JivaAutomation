@FeatureGroup
Feature: Feature to test Jiva design View Fabric Sheet Working Functionality

  @ViewFabricSheetWorking
  Scenario: To Test the user able to navigate to Fabric T and A Data entry screen
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Reports in fabric sourcing module
    And click on View fabric sheet working
    Then Click on Style show/hide button
    Then Click on Filter button in the Menu list
    And Verifying the Buyer field for selecting a Buyer
    And Verify whether the user is able to select a Season in the season field
    And Click on the Status field
    When User select the Status
    And Enter the IPO or Buyer in the Search by Buyer Style or IPO field
    Then Click on Apply button
    
