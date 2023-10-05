@tag
Feature: Title of your features
  I want to use this template for my feature file
  
 @Costing1
  Scenario: Creating the Costing Version
    Given Navigates to the Login page
    Then Enter valid Username and password
    And Click on SignIn 
    Then Click on the Woven Modules
    Then Click on the PD Module
    Then Click on the Costing Module
    Then Click on the Style button
    Then Select an IPO in the Menu List
    Then Click on Style Button
    Then Click on the Submit1 button
    Given Enter Version Name
    Given Enter Remarks
    Then Click on Add Combo button
    Given Enter Combo Name
    Given Enter Combo Qty
    When Click in the App_Combo1
    When Select an App_combo1
    When Enter Garment Average1
    When Enter Wastage1
    When Enter Rate1
    When Enter Conversion Rate1
    When Click in the App_Combo2
    When Select an App_combo2
    When Enter Garment Average2
    When Enter Wastage2
    When Enter Rate2
    When Enter Conversion Rate2
    Given Enter Additional Sampling Cost
    Given Enter Per pc Freight Cost
    
    And Click on Add Trims button
    Then Click on the Category1 dropdown field
    Then Select a Category1 from the dropdown
    Then Click on the Item1 dropdown field
    Then Select an Item1 from the dropdown
    And Enter Avg of an Item1 value
    And Enter Wastage of the selected Trim Accessories1
    And Enter Rate of the selected Trim Accessories1
    
    And Click on the Add Accessories button
    Then Click on the Category dropdown field under the TrimAccessoriesII grid
    Then Select a Category from the dropdown under the TrimAccessoriesII grid
    Then Click on the Item dropdown field under the TrimAccessoriesII grid
    Then Select a Item from the dropdown under the TrimAccessoriesII grid
    Then Enter the Cost 
    #Cutting grid
    Given To check whether the Overhead Cost is displaying a value or not
    Given Enter Overhead Cost value
    Given To check whether the Garment Cutting Cost is displaying a value or not
    Given Enter Garment Cutting Cost value
    #Computer Embriodiery
    Given Enter No of Stiches
    Given Enter Rate
    Given Enter Overhead
    Given Enter Addl Charges
    #Adda Embriodiery
    Given Enter Adda Hours
    Given Enter Adda Rate
    Given Enter Adda Overhead
    #Manual Embriodiery
    Given Enter Manual Hours
    Given Enter Manual Rate
    Given Enter Manual Overhead
    #Stitching
    When To verify on clicking the Add Process button under Stitching 
    Given Enter a value in OB1
    Given Enter a value in OB2
    Given Enter a value in OB3
    Given Enter a value in Cost1
    Given Enter a value in Cost2
    Given Enter a value in Cost3
    Then Select an option in Booked field
    Given Enter a value in Smocking
    Given Enter a value in Rate
    When To verify whether the user is able to click the Description dropdown field or not
    Then Select a value from the dropdown field
    Given Enter the Stitching Cost value 
    #Finishing and PAcking
    #Then Click on the Add Process button under Finising and Packing grid
    Then Select a Finishing and Packing process1 
    Given Enter the Finishing and Packing cost1
    #Washing / GArment process
    Then Check the Yes or No toggle button status
    #Then Click on the Add Process button when the toggle button is in enabled state
    Then Select a Washing Process1
    Given Enter the Washing Cost1
    #testing and inspection
    Given Enter the value in the FPT GPT Total Cost field
    Given Enter the value in the FPT GPT Cost field
    Given Enter the value in the Addl Tests Total Cost field
    Given Enter the value in the Addl Tests Cost field
    Given Enter the value in the Inspection Charges Total Cost field
    Given Enter the value in the Inspection Charges Cost field
    #Freight And Clearance
    Given Enter the value in the NO of PO by Sea field
    Given Enter the value in the NO of PO by Air field
    Given Enter the value in the Custom Clearance Total Cost field
    Given Enter the value in the Custom Clearance Cost field
    Given Enter the value in the Cartage Total Cost field
    Given Enter the value in the Cartage Cost field
    Given Enter the value in the Additional Buffer field
    #TOTAL DIRECT EXPENSE
    Given Enter the value in the Rejection field
    Given Enter the value in the OverHead field
    Given Enter the value in the Profit MarkUp field
    Given Enter the value in the Commission field
    Given Enter the value in the Currency field
    Given Enter the value in the Price Quoted To Buyer field
    #Submit Buttons
    Then Click on the PSave button
    Then Click on the Submit button
    Then Click on the View For Print button
    Then Click on the Cancel in the Print form
    Then Click on the Download As Excel button
    #Information tags
    #And Click on the 
    
    
    
    