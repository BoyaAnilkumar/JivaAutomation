@PODataReport
Feature: Printing the grid data

  @PODataRpt1
  Scenario: Printing the grid data
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO Data Report screen
  Then Print the PO Data records
  
   @PODataRpt
  Scenario: Downloading the excel sheet
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO Data Report screen
  Then Click on the Excel sheet and download
  