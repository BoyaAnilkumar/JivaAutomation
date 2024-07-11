@IPOWiseInOutReport
Feature: Checking the IPO Wise In Out Report

  @IPOInOutRpt
  Scenario Outline: Checking the filters functionality
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to IPO Wise In Out Report
    And click on Styles expansion
    Then click on filter icon
    Then Click on the Merchant  
    #And Select the Merchant 
    And Click on the Filter_Apply button
    Then click on filter icon
    Then Click on Reset
    Then Click in the Supplier field "<supplier>"
    #And Select the Supplier
    And Click on the Filter_Apply button
    Then click on filter icon
    Then Click on Reset
    Given Enter the IPO name in the Search by IPO field
    And Click on the Filter_Apply button  
    And Select an IPO in the Menu list
    Then Click_on_the_Styles_expansion
    Then Verify the Fabrics displayed in the tabs and print
    
    Examples:
    | supplier 			|
    | Tej						|
    
    
  @IPOInOutRpt
  Scenario: Checking the Information bar values
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to IPO Wise In Out Report
    And click on Styles expansion
    And Select an IPO in the Menu list
    Then Click_on_the_Styles_expansion    
    Then Print the IPO value
    Then Print the Merchant name for the IPO
    Then Print the Buyer name for the IPO
    
  @IPOInOutRpt
  Scenario: Checking the Processes for the Fabric 
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to IPO Wise In Out Report
    And click on Styles expansion
    And Select an IPO in the Menu list
    Then Print the Processes name
    Then Print the count of the proceses displayed for the Fabric
    
        
	@IPOInOutRpt
  Scenario: Verifying the Processes data 
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to IPO Wise In Out Report
    And click on Styles expansion
    And Select an IPO in the Menu list
		Then Click on a process and print the data
		
	@IPOInOutRpt
  Scenario: Verifying the Fabric Issued to Merchant grid data
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to IPO Wise In Out Report
    And click on Styles expansion
    And Select an IPO in the Menu list
    Then Print the Fabric Issued to Merchant grid data
    
    
  @IPOInOutRpt1
  Scenario: Verifying the Fabric Issued to Cutting grid data
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to IPO Wise In Out Report
    And click on Styles expansion
    And Select an IPO in the Menu list
    Then Print the Fabric Issued to Cutting grid data
    
	
		
		   


    
    
    
    
    
    