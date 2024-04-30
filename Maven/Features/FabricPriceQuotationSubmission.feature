@FabricPriceQuotationSubmissionscreen

Feature: Adding and Deleting the Fabric Price Quotation records  

  @FabricPriceQuotationSubmission
  Scenario: Checking filters Apply and Reset functionality and selecting an IPO
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Price Quotation Submission screen
  And click on Styles expansion
  Then click on filter icon
  Then Select a Buyer from dropdown list
  Then Select a Season from dropdown list
  Then Enter an IPO name in the Search by IPO textbox field
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Verify whether data is cleared or not on OnClick the Reset button
  And Select an IPO from the Menu list in Submission
  Then Click_on_the_Styles_expansion 
  
  @FabricPriceQuotationSubmission
  Scenario: Verifying the mandatory validation msg
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Price Quotation Submission screen
  And click on Styles expansion
  And Select an IPO from the Menu list in Submission
  Then Click_on_the_Styles_expansion
  Then Click on the Add Pricing button in the Fabric Price Quotation Submission screen
  Then Click on the Submit button in the Fabric Price Quotation Submission
  Then Verify the Mandatory validation msg
  
  @FabricPriceQuotationSubmission1
  Scenario: Adding the Pricing records for Submision
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Price Quotation Submission screen
  And click on Styles expansion
  And Select an IPO from the Menu list in Submission
  Then Click_on_the_Styles_expansion
  Then Click on the Add Pricing button in the Fabric Price Quotation Submission screen
  Then Click in the Process field 
  #And Select a Process Name 
  Given Enter Supplier Name
  Given Enter Ex Mill Price value
  Given Enter the Lead Time
  Given Enter Payment Terms mode
  Given Enter Remarks for the added Price records
  Given Enter data in the Call Outs field
  Then Click on the Submit button in the Fabric Price Quotation Submission
  
  @FabricPriceQuotationSubmission
  Scenario: Verifying the deleting of the added records
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Price Quotation Submission screen
  And click on Styles expansion
  And Select an IPO from the Menu list in Submission
  Then Click_on_the_Styles_expansion
  Then Click on the Add Pricing button in the Fabric Price Quotation Submission screen
  When Click on the Delete button for the added pricing record
  Then Verify whether the Delete popup window is displayed 
  Then Click on the No option in the Delete msg
  #Then Verify whether the Delete button status
  When Click on the Delete button for the added pricing record
  Then Click on the Yes option in the Delete msg
  #Then Print the Succesful Delete message
  