@FeatureGroup
Feature: PO For Stock screen functionality

  @StockPO
  Scenario: Checking the Filter functionality
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO For Stock screen
  Then Click on the Filter showhide button
  And click on supplier dropdown to select the supplier
  And click on buyer dropdown to select the buyer
  And click on Fabric Quality dropdown to select the Fabric
  Given Enter the Style name in Search By Style field 
  And click on Reset and Apply button
 
 @StockPO
  Scenario: Adding a PO Stock record  
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO For Stock screen
  Then Verify the count of the PO Records in the PO grid before adding the PO record
  When Click on the Add Data Entry button
  Then Verify whether the page is navigated to the Create PO For Stock or not
  Then Click and Select Order Type
  Then Verify whether current PO Date is displayed or not
  Then Verify whether the PO Number field value
  And Select a Buyer
  Given Enter the Style
  When Select a Delivery To factory name
  Then Verify whether the Delivery Factory Address is displayed or not
  Then Verify whether the Delivery Factory GST number is displayed or not
  When Select a Supplier name
  Then Verify whether the Supplier Address is displayed or not
  Then Verify whether the Supplier GST number is displayed or not
  Then Verify whether the Supplier Payment Terms are prepopulated or not
  Then Verify whether the user is able to edit the Payment Terms
  Then Verify whether the Supplier Delivery Terms are prepopulated or not
  Then Verify whether the user is able to edit the Delivery Terms
  Given Enter Lead Time value
  Then Select a Process for the selected Order Type
  Then Select a Fabric Type
  Then Select a Fabric Name
  Then Select a Content
  Then Select a Count_Counstruction
  Then Select a GSM
  Then Select a Cuttable Width
  Then Select a Color
  When Verify whether the Qty Required field is displaying 0 by default
  Given Enter Residual Shrinkage value
  Given Enter Process Loss value
  And Verify whether by default 3 is displayed in the Qty Allowed field
  Given Verify whether the user is able to change the value
  Then Select a Currency
  Given Enter Rate value
  Then Select an UOM
  #Given Enter remarks in the L - Short If Any field
  #Given Enter remarks in the Addl. Information 1 field
  #Given Enter remarks in the Addl. Information 2 field
  #Then Verify the DueOn Date value
  Given Enter the Quantity of the Fabric 
  Then Click on Save button in the Create PO For Stock screen
  #Then Click on the Cancel button in the Print Preview form
  Then Verify whether the page is navigated to the PO For Stock or not
  Then Verify the count of the PO Records in the PO grid after adding the PO record
  Then Verify whether the added PO record is added to the grid
  
  @StockPO
  Scenario: Verifying the added PO record is added to the grid   
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO For Stock screen
  Then Verify the count of the PO Records in the PO grid before adding the PO record
  When Click on the Add Data Entry button
  Then Verify whether the page is navigated to the Create PO For Stock or not
  Then Click and Select Order Type
  When Select a Delivery To factory name
  When Select a Supplier name
  Given Enter Lead Time value
  Then Select a Process for the selected Order Type
  Then Select a Fabric Type
  Then Select a Fabric Name
  Then Select a Color
  Given Enter Residual Shrinkage value
  Given Enter Process Loss value
  Given Enter Rate value
  Then Select an UOM
  Given Enter the Quantity of the Fabric 
  Then Click on Save button in the Create PO For Stock screen
  Then Verify whether the page is navigated to the PO For Stock or not
  Then Verify the count of the PO Records in the PO grid after adding the PO record
  Then Verify whether the added PO record is added to the grid
 
  @StockPO
  Scenario: Verifying deletion of the records in the grid   
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO For Stock screen
  When Click on the Cancel button for a combination stock record
  Then Verify whether the Cancel toaster msg is displayed 
  Then Verify whether the respective record is not Cancelled on clicking the NO option
  When Click on the Cancel button for a combination stock record
  Then Verify whether the Cancel toaster msg is displayed 
  When Click on Yes option in the cancel toaster msg
  Then Verify whether the Successfull msg is displayed or not
  #And Verify whether the Status is changed to Cancelled state under Status column
  #validating the cancel record is pending
  
  
  @StockPO
  Scenario: Verifying revision of the PO record in the Revised PO For Stock screen   
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO For Stock screen
  When Click on the Revise PO button 
  And Verify whether the page is navigated to Revised PO For Stock form
  Then Print the PO Details section values
  When Update the Delevery To field value
  Then Print the Address and GSTIn field values
  Then Print Supplier Details section values
  Then Print the Process name
  Then Print the Fabric Type and Name
  Then Print Content, Count, GSM, Cuttable Width and Color field values
  Then Print Original and Revised Qtys under the Quantity Details section
  Given Update the Residual Shrinkage value
  Then Verify the Process Loss, Qty Allowed, Currency, Rate and UOM field values
  Given Verify the DueOn Date value  
  Given Update the Quantity value
  Then Click on the Sample field under the Stock Details grid
  Then Print Original and Revised Qtys under the Quantity Details section 
  Then Click on the Save button in the Revised PO For Stock form
  Then Click on the Cancel button in the Print Preview form
  And Verify whether page is navigated to PO For Stock screen
  # Supplier name and Fabric Names are not printing
  
  
  
  