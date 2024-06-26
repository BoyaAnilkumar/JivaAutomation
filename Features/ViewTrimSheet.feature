@ViewTrimSheet
Feature: Verifying the IPO after submitting the New Trim Sheet and Revised Trim sheet

#Login with Lavanya
  @ViewTrimSheet0
  Scenario: verification of filter functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Merchandising module
    And Click on Report in merchandising module
    Then Click on View Trim Sheet
    And Click on Style show/hide button
    Then Click on Filter button in the Menu list
    And Select the Buyer from dropdown list
    And Enter IPO number in Search By IPO field
    Then Click on Apply button
    And Reset the applied filter and click on Apply button
    
    
    @ViewTrimSheet1
    Scenario: Verification of IPO details after selecting the IPO
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Merchandising module
    And Click on Report in merchandising module
    Then Click on View Trim Sheet
    And Click on Style show/hide button
    Then Click on Filter button in the Menu list
    And Select the Buyer from dropdown list
    And Enter IPO number in Search By IPO field
    Then Click on Apply button
    And Click on the IPO in view trim sheet
    And IPO details are displaying for Trim Sheet
    Then verify the Merchant data and Trim data
    
    @ViewTrimSheet2
    Scenario: Verification of Print by Item view
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Merchandising module
    And Click on Report in merchandising module
    Then Click on View Trim Sheet
    And Click on Style show/hide button
    Then Click on Filter button in the Menu list
    And Enter IPO number in Search By IPO field
    Then Click on Apply button
    And Click on the IPO in view trim sheet
    And click on View for Print by Item button
    
    @ViewTrimSheet3
    Scenario: Verification of History data
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Merchandising module
    And Click on Report in merchandising module
    Then Click on View Trim Sheet
    And Click on Style show/hide button
    Then Click on Filter button in the Menu list
    And Enter IPO number in Search By IPO field
    Then Click on Apply button
    And Click on the IPO in view trim sheet
    And Click on History button to view history of the IPO
    