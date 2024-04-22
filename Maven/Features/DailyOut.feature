@DailyOutDataEntry 

Feature: Daily Out Adding, Editing, Approoving and Deleting functionalites   

  @DailyOut
  Scenario: Checking the mandatory validation msg and canceling functionality
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Daily Out Data Entry screen
  When Click on Add Data Entry button
  And Verify whether the page is navigated to the Add Daily Out Data Entry form
  Then Click on the Cancel button
  And Verify whether the page is navigated to the Daily Out Data Entry screen
  When Click on Add Data Entry button
  And Verify whether the page is navigated to the Add Daily Out Data Entry form
  And Click on the Save button
  Then Verify and print the mandatory validation msg
  
  @DailyOut
  Scenario: Adding a Daily Out record for Supplier party
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Daily Out Data Entry screen
  When Click on Add Data Entry button
  And Verify whether the page is navigated to the Add Daily Out Data Entry form
  Given Enter the data in all the field in the Add Daily Out form
  Then Click on the Save button in the Add Daily Out form
  Then Verify the successful save msg
  And Verify whether the page is navigated to the Daily Out Data Entry screen
  
  @DailyOut
  Scenario: Editing the added Daily out supplier record
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Daily Out Data Entry screen
  When Click on Edit Data Entry button
  Then Verify whether the page is navigated to the Updated Daily Out form
  Then Verify whether the data is displaying correctly in all the fields
  Given Click on the Add button in the Thaan Wise Information grid
  Given Enter the Custom Qty value
  Then Click on the Save button in the Add Daily Out form
  Then Verify the successful Update msg
  And Verify whether the page is navigated to the Daily Out Data Entry screen
  
   
  @DailyOut
  Scenario: Verifying the Delete functionaly under the Thaan Wise Information grid
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Daily Out Data Entry screen
  When Click on Edit Data Entry button
  Then Verify whether the page is navigated to the Updated Daily Out form
  Then Verify whether the data is displaying correctly in all the fields
  Given Click on the Add button in the Thaan Wise Information grid
  Given Enter the Custom Qty value
  Then Click on the Delete button in the Thaan Wise Info grid
  Then Verify whether the Delete popup window is displayed 
  Then Click on the No option in the Delete msg
  Then Click on the Delete button in the Thaan Wise Info grid
  Then Click on the Yes option in the Delete msg
  Then Print the Succesful Delete message
  
  @DailyOut
  Scenario: Verfying the Delete button functionality in the Daily Out screen
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Daily Out Data Entry screen
  Then Click on the Delete button in the Daily Out screen
  Then Verify whether the Delete popup window is displayed 
  Then Click on the No option in the Delete msg
  Then Click on the Delete button in the Thaan Wise Info grid
  Then Click on the Yes option in the Delete msg
  Then Print the Succesful Delete message
  
  @DailyOut
  Scenario: Verifying the Daily Out Approve button functionality
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Daily Out Data Entry screen
  Then Click on the Approve button for a record
  Then Verify whether the Approved popup window is displayed 
  Then Click on the No option in the Approved msg
  Then Click on the Approve button for a record
  Then Click on the Yes option in the Approved msg
  Then Verify the Gate Entry Number popup msg
  When Click on the Save button in the Gate Entry Number popup msg
  Then Verify the mandatory validation msg
  Then Click on the Close button
  Then Click on the Approve button for a record
  Then Click on the Yes option in the Approved msg
  Then Verify the Gate Entry Number popup msg
  Given Enter the Gate Entry Number 
  Then Click on the Save button in the Gate Entry popup window
  Then Print the Succesful Approve msg
    
  
  @DailyOut
  Scenario: Verifying the Print button fuctionality
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Daily Out Data Entry screen
  Then Click on Print button
  Then Verify whether the page is navigated to the Print form
  Then Verify and print data in the Print form
  Then Click on the Close button in the Print form
  And Verify whether the page is navigated to the Daily Out Data Entry screen
  
  
  
  
  
  
    
  
   
  