  
  @IPOadding
  Feature: Creating an IPO for a confirmed style
  
  
 @IPOList
  Scenario: Creating an IPO 
  Given Navigates to the Login page
  Then Enter valid Username and password
  And Click on SignIn 
  Then Click on the Woven Modules
  Then Click on Audit module
  Then Click on IPO List module
  #Filter scenarios
  Then Click on the Filter button 
  Then Click in the IPO From Date field
  Then Click in the IPO To Date field
  Then Click in the Buyer field
  And Select a Buyer from the dropdown list
  Then Click in the PD Merchant field
  And Enter a first two letters of a PD Merchant name
  Then Select the PD Merchant from the dropdown
  Then Click in the Merchant field
  And Select a Merchant from the dropdown list
  Then Click in the Assigned Month and year field
  And Select a Month or Year from the dropdown list
  #Then Click in the Search IPO and Enter an IPO
  And Enter IPO Name in the Search IPO field
  Then Click on the Reset button
  Then Click on the Apply button
  
  Then Click on Generate Excel Sheet button
  When Clicked on Add IPO button
  
  
  
  
  
  