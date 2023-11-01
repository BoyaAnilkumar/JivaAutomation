  
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
  #Then Click on the Filter button 
  #Then Click in the IPO From Date field
  #Then Click in the IPO To Date field
  #Then Click in the Buyer field
  #And Select a Buyer from the dropdown list
  #Then Click in the PD Merchant field
  #And Enter a first two letters of a PD Merchant name
  #Then Select the PD Merchant from the dropdown
  #Then Click in the Merchant field
  #And Select a Merchant from the dropdown list
  #Then Click in the Assigned Month and year field
  #And Select a Month or Year from the dropdown list
  #Then Click in the Search IPO and Enter an IPO
  #And Enter IPO Name in the Search IPO field
  #Then Click on the Reset button
  #Then Click on the Apply button
  #
  #Then Click on Generate Excel Sheet button
  When Clicked on Add IPO button
  And Verify whether the page is navigating to the Add IPO screen or not 
  #Adding an IPO 
  When Click on the save button
  And Verify the information tags data on mouse hover
  #Then Select an IPO Date
  And Verify whether current date is displayed or not bydefault
  Given Enter first two letters of a Buyer Style
  And Select a Buyer Style from the dropdown
  Given Enter the IPO name
  Given Enter first two letters of Production Merchant
  Then Select a Production Merchant fron the dropdown
  Given Enter the PO Qty
  Given Enter IPO percentage
  Then Click in the Assigned Month and Year field
  Then Select the Month from the month picker
  Then Select Exfactory Date 
  And Check the Active field status
  Then Click on the Save button
  #Then Click on Cancel button in the Add IPO
  And Verify whether the page is navigated to IPO List page or not
  
  
  
  
  
  
  
  
  
  