@ViewTrimSheetWorkingscreen
Feature: Verifying the View Trim Sheet screen functionality

Background:
 	When user navigates to Login page
  Given Login with the Trim Manager
  And Click on the SignIn button
  Then Navigate to View Trim Sheet Working screen
  And click on Styles expansion
  Then click on filter icon
 

  @ViewTrimSheetWorking
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
  |8 Seconds			|6647				|
  
  @ViewTrimSheetWorking
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
  
  Examples:
  |IPOname 			|
  |6647					|
  
  
 @ViewTrimSheetWorking
 Scenario Outline: Verifying the added trims under the Trim Details grid
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print the Trim Details grid records
  
   Examples:
  |IPOname 			|
  |6647					|
  
 @ViewTrimSheetWorking
 Scenario Outline: Verifying the added trims under the Trim MU Working grid
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print the View Trim MU Working grid records
 
 Examples:
 
 |IPOname				|
 |6647					|
 
 @ViewTrimSheetWorking
 Scenario Outline: Verifying the added trims under the Job Work grid
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print View Job Work grid records
 
 Examples:
 |IPOname				|
 |6647					|
 
 
 @ViewTrimSheetWorking1
 Scenario Outline: Verifying the Print form details
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the View for Print button
 Then Verify whether page is navigated to the Print form
 #Then Print the Print form details
 Then Click on Cancel button in the Print Form
 And Verify the page navigation 

 Examples:
 |IPOname				|
 |6647					|
 
 
 