@FeatureGroup
Feature: Creating Potential Debit and Credit notes for the Qty and Rate mismatch records for IPOs 

  @PotentialDebitNotes
  Scenario: Checking Request Approval Closed button properties

  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Potential Debit Note screen
  Then Verify the Action column
  When Clicked on the Request Approval Closed
  Then Check whether the Request Approval To Closed pop-up window is displayed or not
  Then Click on the Submit button in the Reuest Approval Close window
  Then Check the validation msg when Remarks field has null values
  Given Enter Remarks in the Reuest Approval Close window
  Then Click on the Submit button in the Reuest Approval Close window
  Then Verify the Successfiull msgn user navigates to Login page
  
  @PotentialDebitNotes
  Scenario: Creating a Debit Note
  When user navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Potential Debit Note screen
  When Click on the Debit Note button under the Actions column
  Then Verify whether the page is navigated to the Debite Note form
  When Click on Submit button in the Dedit note form
  Then Verify whether the mandatory validation msg is displayed
  Given Enter Reason in the Debit Note form
  When Click on Submit button in the Dedit note form
  #Then Verify the success msg on submitting the Notes
  Then Verify the Successfull msg
  Then Verify whether the page is navigated to the Debit Note print form
  When Click on the Cancel button in the Debit Note print form
  When Verify whether the page is navigated to the Potential Debit Note screen
  
  @PotentialDebitNotes1
  Scenario: Creating a Credit Note
  When user navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Potential Debit Note screen
  When Click on the Credit Note button under the Actions column
  Then Verify whether the page is navigated to the Credite Note form
  When Click on Submit button in the Credit note form
  Then Verify whether the mandatory validation msg is displayed
  Given Enter Reason in the Credit Note form
  When Click on Submit button in the Credit note form
  Then Verify the Successfull msg
  Then Verify whether the page is navigated to the Credit Note print form
  When Click on the Cancel button in the Credit Note print form
  When Verify whether the page is navigated to the Potential Debit Note screen
  
  
  
  
  
  
  

  
  
  
  @PotentialDebitNotes
  Scenario: Creating a Debit Note
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Potential Debit Note screen
  Then Verify the Action column
  When Clicked on the Request Approval Closed
  Then Check whether the Request Approval To Closed pop-up window is displayed or not
  Then Click on the Submit button in the Reuest Approval Close window
  Then Check the validation msg when Remarks field has null values
  Given Enter Remarks in the Reuest Approval Close window
  Then Click on the Submit button in the Reuest Approval Close window
  Then Verify the Successfiull msgn user navigates to Login page
  
@PotentialDebitNotes
  Scenario: Creating a Debit Note
  When user navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Potential Debit Note screen
  When Click on the Debit Note button under the Actions column
  Then Verify whether the page is navigated to the Debite Note form
  When Click on Submit button in the Dedit note form
  Then Verify whether the mandatory validation msg is displayed
  Given Enter Reason in the Debit Note form
  When Click on Submit button in the Dedit note form
  #Then Verify the success msg on submitting the Notes
  Then Verify the Successfull msg
  #Then Verify whether the page is navigated to the Potential Debit Note screen
  
  @PotentialDebitNotes1
  Scenario: Creating a Credit Note
  When user navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Potential Debit Note screen
  When Click on the Credit Note button under the Actions column
  Then Verify whether the page is navigated to the Credite Note form
  When Click on Submit button in the Credit note form
  Then Verify whether the mandatory validation msg is displayed
  Given Enter Reason in the Credit Note form
  When Click on Submit button in the Credit note form
  Then Verify the Successfull msg
  #Then Verify whether the page is navigated to the Potential Credit Note screen

