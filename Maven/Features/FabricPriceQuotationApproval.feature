@FabricPriceQuotationApprovalscreen

Feature: Adding and Deleting the Fabric Price Quotation records  

  @FabricPriceQuotationApproval1
  Scenario: Checking filters Apply and Reset functionality and selecting an IPO
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Price Quotation Approval screen
  And click on Styles expansion
  Then click on filter icon
  Then Select a Buyer from dropdown list
  Then Select a Season from dropdown list
  Then Enter an IPO name in the Search by IPO textbox field
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Verify whether data is cleared or not on OnClick the Reset button
  And Select an IPO from the Menu list in Approval screen
  Then Click_on_the_Styles_expansion 
  
  
  @FabricPriceQuotationApproval1
  Scenario: Approving the Submitted record
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Price Quotation Approval screen
  And click on Styles expansion
  And Select an IPO from the Menu list in Approval screen
  Then Click_on_the_Styles_expansion
  Then Click on the Approval button
  Then Print the Approved msg
  
  @FabricPriceQuotationApproval
  Scenario: Edit and Approve the Submitted record
  When User navigates to Login page
  Given Login with the Fabric Manager
  And Click on the SignIn button
  Then Navigate to the Fabric Price Quotation Approval screen
  And click on Styles expansion
  And Select an IPO from the Menu list in Approval screen
  Then Click_on_the_Styles_expansion
  Then Update any of the value of the Submitted Record
  Then Click on the Approval button
  Then Print the Approved msg
  Then Verify and Print the updated value 
  