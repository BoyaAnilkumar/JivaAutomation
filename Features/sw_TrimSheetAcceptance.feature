@sw_TrimSheetAcceptancescreen
Feature: Verifying the New Trim Sheet screen functionality

  @sw_TrimSheetAcceptance
  Scenario Outline: Verfifying the Filters functionality
  When user navigates to Login page
  Given Login with the Trim Manager
  And Click on the SignIn button
  Then Navigate to sw Trim Sheet Acceptance screen
  And click on Styles expansion
  Then click on filter icon
  Then Select a Buyer in the filter window "<BuyerName>"
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Then Select a Season in the filter window
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Then Select a Status in the filter window
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  
  Examples:
  |BuyerName		|IPOname		|
  |Test buyer		|IPO1				|
  
  @sw_TrimSheetAcceptance
  Scenario Outline: Verifying the Information bar field value
  When user navigates to Login page
  Given Login with the Trim Manager
  And Click on the SignIn button
  Then Navigate to sw Trim Sheet Acceptance screen
  And click on Styles expansion
  Then click on filter icon
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
  Then Verify and Print the Accepted Rejected Date
  
  Examples:
  |IPOname 		|
  |IPO1				|
  
  
  @sw_TrimSheetAcceptance
  Scenario Outline: Rejecting the Trim Sheet
  When user navigates to Login page
  Given Login with the Trim Manager
  And Click on the SignIn button
  Then Navigate to sw Trim Sheet Acceptance screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  Then Click on the Reject Trim Sheet button
  #Then Verify whether the Reject Trim Sheet popup is displayed 
  #Then Click on the Submit button in popup window
  #Then Click on Cancel button in the Reject Trim Sheet popup
  #Then Click on the Reject Trim Sheet button
  #And Click on the Submit button in the popup window
  #Then Verify the Mandatory validation msg
  #Given Enter the Reason for Rejecting the Trim "<Reason>"
  #And Click on the Submit button in the popup window 
  #Then Print the Rejected successful msg
  
   Examples:
  |IPOname 		|Reason										|
  |IPO1				|Rejected Test reason			|
  
  
  
  @sw_TrimSheetAcceptance
  Scenario Outline: Accepting the Trim Sheet
  When user navigates to Login page
  Given Login with the Trim Manager
  And Click on the SignIn button
  Then Navigate to sw Trim Sheet Acceptance screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  Then Click on the Accept Trim Sheet button
  #Then Verify whether the Accept Trim Sheet popup is displayed 
  #Then Click on Cancel button in the Accept Trim Sheet popup
  #Then Click on the Accept Trim Sheet button
  #Given Enter the Reason for Accepting the Trim "<Reason>"
  #And Click on the Submit button in the popup window 
  #Then Print the Accepted successful msg
  
  Examples:
  |IPOname 		|Reason											|
  |IPO4				|Accepting Test reason			|
  
  
  
  @sw_TrimSheetAcceptance1
  Scenario Outline: View for printing the Trim Sheet
  When user navigates to Login page
  Given Login with the Trim Manager
  And Click on the SignIn button
  Then Navigate to sw Trim Sheet Acceptance screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  Then Click on the View for Print button
  And Verify the Trim Print form 
  When Clicked on the Cancel button in the Trim Print form
  Then Verify page navigated to Trim Sheet Acceptance
  
  
  Examples:
  |IPOname 		|
  |IPO1				|
  |IPO2				|
  