@FeatureGroup
Feature: Assigning and Cancelling the Stock for the raised POs 

  @FabricStockRequest1
  Scenario: Verifying the Filter options
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Stock Request screen
  When Click on Filters showhide button
  When Click in the Merchant field
  Then Select a Merchant from the dropdown list
  When Click in the Buyer field
  Then Select a Buyer
  And click on Fabric Quality dropdown to select the Fabric
  And click on Month dropdown to select the month
  And click on Search By IPO dropdown to select the IPO
  Then Click on the Apply button
  Then Click on Reset button
  
  
  

  @FabricStockRequest
  Scenario: Assigning the Stock to an IPO
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Stock Request screen
  #Then Verify whether the Assign Stock To IPO and Cancel buttons are displayed under the Action column 
  Then Verify whethe the Assign Stock to IPO button is clickable 
  Then Verify whether the page is navigated to the Assign Stock to IPO form
  Then Click on the Cancel button in the Assign Stock to IPO form 
  Then Verify whether the page is navigated to the Fabric Stock Request screen
  Then Verify whethe the Assign Stock to IPO button is clickable
  Then Click on the Save button in the Assign Stock to IPO form
  Then Verify whether the mandatory validation msg is displayed or not
  Then Verify the Stock Req No field properties
  Then Verify the IPO field data and print
  Then Verify the Fabric Name field data and print
  Then Verify the Color field data and print
  Then Verify the Process field data and print
  Then Verify the Requested Qty field data and print
  Then Verify whether the user is able to select a Factory name in the Factory field
  #Then Verify whether the Total Stock Available and Qty Assign fields are displayed or not after selecting the Factory
  Then Verify the Total Stock Available field data and print 
  #Then Verify whether the user is able to Delete the added factory 
  #Then Verify whether the user is able to select multiple Factory names in the Factory field
  #Then Verify whether the user is able to delete all the added factories at a time
  Then Verify whether Thaan Wise Information grid is displayed after selecting a Factory
  Then Select the Complete Thaan checkbox field and check the Qty Assign field value
  Then Select the Partial Thaan checkbox field and check whether the Thaan Name and Partial Qty field are displayed or not
  Given Enter the Partial Thaan name 
  Given Enter the Partial Qty value more than the Actual Qty
  Then Verify the Qty Assign field data and print
  Then Click on the Save button in the Assign Stock to IPO form
  Then Verify whether Partial Qty validationmsg is displayed when the user enters more qty than the Actual Qty
  Then Verify whether the sum of all the selected thaans are displayed in the Qty Assign field or not
  Given Select the Assign Qty more than the Requested Qty
  Then Click on the Save button in the Assign Stock to IPO form
  Then Verify whether the Qty Assigned and the Requested Qty validation msg is displayed or not when the Qtys are not equal
  Given Select the Assign Qty less than the Requested Qty 
  Then Click on the Save button in the Assign Stock to IPO form
  Then Verify whether the Qty Assigned and the Requested Qty validation msg is displayed or not when the Qtys are not equal
  Given Select the Assign Qty equal to the Requested Qty and enter valid data in all the mandatory fields 
  Then Click on the Save button in the Assign Stock to IPO form
  #Then Verify the successful toaster msg
  Then Verify whether the page is navigated to the Fabric Stock Request screen
  Then Verify the expansion button display 
  Then Verify the expansion grid values
  
  
  @FabricStockRequest
  Scenario: Cancelling the raised Stock to an IPO
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Stock Request screen
  When Click on the Cancel button for a Stock record
  Then Verify whether the Cancel popup window is displayed
  Then Click on the No option in the Delete msg
  When Click on the Cancel button for a Stock record
  Then Click on the Yes option in the Delete msg
  #Then Verify the Successful Cancelled msg
  