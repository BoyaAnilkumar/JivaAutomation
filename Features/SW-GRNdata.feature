@tag
Feature: Verification of GRN Data after submitting the Daily In Input

  @SWGRN
  Scenario: Navigate to GRN Data and Verify the data is displaying for IPO or not
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on the Audit module
    Then Click on GRN data screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    Then Select the Merchant and Supplier
    And click on Apply button and Reset button
    And Select the IPO in Style expansion
    When user selects the Ipo verify the Ipo details which are displayed on the screen or not
    Then verify the grid is displaying or not
    And Verify the expansion icon is displaying or not
    And Click on expansion icon
    Then verify the data is displaying in the expansion grid or not
    And validate the expansion grid data
    
