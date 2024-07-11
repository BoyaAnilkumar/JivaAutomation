@OrderProjectionscreen

Feature: Adding, Editing and Deleting the Order Projection records  

  @OrderProjection
  Scenario: Checking the mandatory validation msg and canceling functionality
  When User navigates to Login page
  Given Login with the Senior PD Merchant
  And Click on the SignIn button
  Then Navigate to the Order Projection screen
  When Click on the Add button in the Order Projection screen
  Then Verify whether page is navigated to the Create Order Projection form
  When Click on the Cancel button in the Create Order Projection form
  Then Verify whether the page is navigated to the Order Projection screen
  When Click on the Add button in the Order Projection screen
  Then Click on Save button in the Create Order Projection form
  Then Verify the Mandatory validation msg
 

  @OrderProjection
  Scenario: Adding an Order Projection record to the grid
  When User navigates to Login page
  Given Login with the Senior PD Merchant
  And Click on the SignIn button
  Then Navigate to the Order Projection screen
  When Click on the Add button in the Order Projection screen
  Then Verify whether page is navigated to the Create Order Projection form
  Given Enter the first 2 letters of the Senior PD Merchant name
  #Then Select the PD merchant from the dropdown list
  When Click in the Buyer field in Order Project form
  Then Select a value from the dropdown list
  When Click in the Month & Year field
  Then Select a value from the calendar
  Given Enter Expected Order Qty value
  Given Enter Appr. Per Pcs Cost value
  Given Enter Exchange Rate value
  Then Print Total Cost In INR field value
  Then Print Total Cost In Currency value
  Then Click on the Save button in the Create Order Projection form
  Then Verify the Successful toaster msg and print
  Then Verify whether the page is navigated to the Order Projection screen
  
  @OrderProjection
  Scenario: Editing an Order Projection record to the grid
  When User navigates to Login page
  Given Login with the Senior PD Merchant
  And Click on the SignIn button
  Then Navigate to the Order Projection screen
  When Click on the Edit button for a record in the Order Projection screen
  Then Verify whether page is navigated to the Update Order Projection form
  Then Verify whether all the values are displayed in the respective fields
  When Update the Expected Order Qty value
  Then Click on the Save button in the Update Order Projection form
  Then Verify the Update Successful toaster msg
  Then Verify whether the page is navigated to the Order Projection screen
  Then Verify whether the Exp Order Qty value is updated in the grid for the respective record
  
  @OrderProjection1
  Scenario: Deleting an Order Projection record 
  When User navigates to Login page
  Given Login with the Senior PD Merchant
  And Click on the SignIn button
  Then Navigate to the Order Projection screen
  When Click on the Delete button for a record in the Order Projection screen
  Then Verify whether the Delete popup window is displayed 
  Then Click on the No option in the Delete msg
  Then Verify whether the Delete button status
  When Click on the Delete button for a record in the Order Projection screen
  Then Click on the Yes option in the Delete msg
  Then Print the Succesful Delete message
  Then Verify whether the Delete button status
  
  
  