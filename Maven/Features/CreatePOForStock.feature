
@FeatureGroup
Feature: Title of your feature
  I want to use this template for my feature file

  @CreatePOForStock1
  Scenario: Adding a PO Stock record 
   When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to Create PO For Stock screen
  Then Click and Select Order Type
  #Then Verify whether current PO Date is displayed or not
  #Then Verify whether the PO Number field value
  #And Select a Buyer
  #Given Enter the Style
  When Select a Delivery To factory name
  #Then Verify whether the Delivery Factory Address is displayed or not
  #Then Verify whether the Delivery Factory GST number is displayed or not
  When Select a Supplier name
  #Then Verify whether the Supplier Address is displayed or not
  #Then Verify whether the Supplier GST number is displayed or not
  #Then Verify whether the Supplier Payment Terms are prepopulated or not
  #Then Verify whether the user is able to edit the Payment Terms
  #Then Verify whether the Supplier Delivery Terms are prepopulated or not
  #Then Verify whether the user is able to edit the Delivery Terms
  Given Enter Lead Time value
  Then Select a Process for the selected Order Type
  Then Select a Fabric Type
  Then Select a Fabric Name
  #Then Select a Content
  #Then Select a Count_Counstruction
  #Then Select a GSM
  #Then Select a Cuttable Width
  Then Select a Color
  #When Verify whether the Qty Required field is displaying 0 by default
  Given Enter Residual Shrinkage value
  Given Enter Process Loss value
  #And Verify whether by default 3 is displayed in the Qty Allowed field
  #Given Verify whether the user is able to change the value
  Then Select a Currency
  Given Enter Rate value
  #Then Select an UOM
  Given Enter remarks in the L - Short If Any field
  Given Enter remarks in the Addl. Information 1 field
  Given Enter remarks in the Addl. Information 2 field
  Then Verify the DueOn Date value
  Given Enter the Quantity of the Fabric 
  Then Verify whether the Qty Required field is displaying the entered qty or not
  #Then Click on the Reset button in the Create PO For Stock screen
  Then Click on Save button in the Create PO For Stock screen
     
   
   
  
  
  
  

 
   