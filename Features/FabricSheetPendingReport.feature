@FeatureGroup_Requirement
Feature: Feature to test Jiva design Fabric Sheet Pending Report screen functionality

  @FabricSheetPendingReport
  Scenario: To Test the Fabric Sheet Pending Report screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Merchandising module
    And Click on Report in merchandising module
    Then Click on Fabric Sheet Pending Report screen
    And Click on Filter expansion in FSPR
    And Click on Buyer filter and select the buyer
    And Click on Merchant filter and select the merchant
    And Click on Status filter and select the status
    Then verify the data is displaying in the grid
    And click on filter expansion and click on reset filter
    And verify the filter functionality on grid column
    Then click on export button to download the fabric sheet report
    And Verify the Sorting functionality in grid
