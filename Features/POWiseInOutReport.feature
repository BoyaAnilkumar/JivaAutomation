@POWiseInOutReport
Feature: Checking the IPO Wise In Out Report

  @POInOutRpt
  Scenario Outline: Checking the filters functionality
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to PO Wise In Out Report
    And click on Styles expansion
    #Then click on filter icon
    #Then Click on the Merchant  
    #And Click on the Filter_Apply button
    #Then click on filter icon
    #Then Click on Reset
    #Then Click in the Supplier field
    #And Click on the Filter_Apply button
    Then click on filter icon
    #Then Click on Reset
    Given Enter the PO number in the Search by PO field "<POname>"
    And Click on the Filter_Apply button  
    And Select an IPO in the Menu list
    Then Click_on_the_Styles_expansion
    
 Examples:
    | POname     |
    | J-16       |
    
    
    @POInOutRpt
  	Scenario Outline: Checking the Information bar values
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to PO Wise In Out Report
    And click on Styles expansion
    Then click on filter icon
    Given Enter the PO number in the Search by PO field "<POname>"
    And Click on the Filter_Apply button  
    And Select an IPO in the Menu list
    Then Click_on_the_Styles_expansion    
    Then Print the PO Date date for the selected PO
    Then Print the PO name for the selected PO
    Then Print the Supplier name for the selected PO
    Then Print the PO Qty for the selected PO
    Then Print the In House Qty for the selected PO
    
 Examples:
    | POname     |
    | J-16       |   
    
    
    @POInOutRpt
  	Scenario Outline: Printing the Fabric In data records
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to PO Wise In Out Report
    And click on Styles expansion
    Then click on filter icon
    Given Enter the PO number in the Search by PO field "<POname>"
    And Click on the Filter_Apply button  
    And Select an IPO in the Menu list
    Then Click_on_the_Styles_expansion
    Then Print the Fabric In grid data in PO Wise In Out Report
    Examples:
    | POname     |
    | J-16       |   
    
    @POInOutRpt1
  	Scenario Outline: Printing the Fabric Returned to Vendor records
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to PO Wise In Out Report
    And click on Styles expansion
    Then click on filter icon
    Given Enter the PO number in the Search by PO field "<POname>"
    And Click on the Filter_Apply button  
    And Select an IPO in the Menu list
    Then Click_on_the_Styles_expansion
    Then Print the Fabric Returned to Vendor grid data in PO Wise In Out Report
    Examples:
    | POname     |
    | J-16       |   
    
    
    
    
    
    
    