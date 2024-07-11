@ViewTrimSheetscreen
Feature: Verifying the View Trim Sheet screen functionality

Background:
 	When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to View Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
 

  @ViewTrimSheet
  Scenario Outline: Verfifying the Filters functionality
  Then Select a Buyer in the filter window "<BuyerName>"
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Then Select a Season in the filter window
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  
  Examples:
  |BuyerName			|IPOname		|
  |Amazon (Core)	|1306				|
  
  @ViewTrimSheet
  Scenario Outline: Verifying the Information bar field value
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  Then Verify and Print the IPO name
  Then Verify and Print the Buyer name
  Then Verify and Print the Buyer Style name
  Then Verify and Print the PO Qty
  Then Verify and Print the IPO Qty
  Then Verify and Print the Date Submitted
  Then Verify and Print the Bulk Trim Deadline
  Then Verify and Print the Trim Manager in View
  Then Verify and Print the Trim Manager Assistants in View
  
  Examples:
  |IPOname 			|
  |1306					|
  
  
  @ViewTrimSheet
  Scenario Outline: Verifying and printing the Merchant and Trim team data records
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  Then Verify and Print the Merchant and Trim Team Responsibility grid records
  
   Examples:
  |IPOname 			|
  |1306					|
  
  @ViewTrimSheet
  Scenario Outline: Verifying the History functionality
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the History button in the view screen
  Then Verify the History grid display
  Then Verify the records display in the History grid
  And Click on the Back button and verify the page navigation 
 
   Examples:
  |IPOname 			|
  |1306					|
 	|220424				| 
 	
 	
 	@ViewTrimSheet1
  Scenario Outline: Verifying the View for Print by Item button functionality
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the View for Print by Item button
  Then Verify naviagting to the print form
  Then Print the Print form details
  Then Click on Cancel button in the Print Form
  And Verify the page navigation
  
   Examples:
  |IPOname 			|
  |1306					|
 #	|220424				| 
 	
 	@ViewTrimSheet1
  Scenario Outline: Verifying the View for Print by Trim Sheet button functionality
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the View For Print by Trim Sheet button
  Then Verify naviagting to the print form
  Then Print the Print form details
  Then Click on Cancel button in the Print Form
  And Verify the page navigation
  
   Examples:
  |IPOname 			|
  |1306					|
  
  

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
    

