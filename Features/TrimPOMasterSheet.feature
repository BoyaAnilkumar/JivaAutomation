@TrimPOMasterSheetscreen
Feature: Verifying the Trim PO master Sheet screen functioanlity

 Background:
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim PO Master Sheet screen
  
 @TrimPOMasterSheet
  Scenario Outline: Filter the IPO by using filter section
  When Click on filter expansion
  When Click on Merchant dropdown field and select merchant"<Merchant>"
  Then Click on the Apply button
  Then Click on the Reset button
  When Click in the Buyer field and select a Buyer "<Buyer>"
  Then Click on the Apply button
  Then Click on the Reset button
  When Click in the Supplier field and select a Supplier "<Supplier>"
  Then Click on the Apply button
  Then Click on the Reset button
  When Click in the Item Name field and select a Item Name "<Items>"
  Then Click on the Apply button
  Then Click on the Reset button
  When Click in the Month field and select a Month "<Month>"
  Then Click on the Apply button
  Then Click on the Reset button
  When Click in the IPO field and select a IPO "<IPO>"
  And Click on Filter Apply button
	
	Examples: 
  |Merchant 		|Buyer 			|Supplier   				|Items		|Month		|IPO			|
  |Lavanya	 		|8 Seconds	|Tex Corp Pvt. Ltd 	|Cut dana	|Jan			|IPO08		|
  
  
  @TrimPOMasterSheet
  Scenario Outline: Verifying the Reset button functionality in the Create PO for Trim screen
  Given Search with IPO in search keyword textbox "<IPO>"
  And Click on the Status sort icon
  When Click on Generate PO icon
  Then Verify whether navigated to the Create PO for Trims screen
  When Verify the Reset button functionality on clicking
  
  Examples:  
  | IPO    |
  | IPO08	 |
  
   @TrimPOMasterSheet
  Scenario Outline: Verifying the mandatory validation msg on saving
  Given Search with IPO in search keyword textbox "<IPO>"
  And Click on the Status sort icon
  When Click on Generate PO icon
  Then Verify whether navigated to the Create PO for Trims screen
  Then Click on Save button to Generate PO
  Then Verify and Print the validation msg
  
  Examples:  
  | IPO    |
  | IPO08	 |
  
  
   @TrimPOMasterSheet
  Scenario Outline: Verifying Adding and deleting the IPO details record
  Given Search with IPO in search keyword textbox "<IPO>"
  And Click on the Status sort icon
  When Click on Generate PO icon
  Then Verify whether navigated to the Create PO for Trims screen
  And Click on Add IPO button
  And Delete  the added IPO record

  Examples:  
  | IPO    |
  | IPO08	 |
    
  @TrimPOMasterSheet
  Scenario Outline: Create PO for the IPO process
    Given Search with IPO in search keyword textbox "<IPO>"
    When Select the Category value in the filter"<Category>"
    When Select the Process value in the filters"<Process>"
    And Click on Generate PO icon
    Then Verify whether navigated to the Create PO for Trims screen 
    And Verify the PO Details are displaying
    When Enter Deliver Details and select from the suggestions"<DeliverTo>"
    When Verify and print the Delivery Address displayed for the selected Delivery To 
    When Verify and print the GSTIN number displayed for the selected Delivery To
    Then Enter supplier name and select from the suggestions"<Supplier>"
    And Verify and print the Supplier Address displayed for the selected Supplier
    And Verify and print the GSTIN number displayed for the selected Supplier
    And Verify and print the Payment Terms value for the selected Supplier
    And Verify and print the Delivery Terms value for the selected Supplier
    And Enter Lead Time in Days"<LeadTime>"
    When Verify and Print the Category name displayed in the Category field
    When Verify and Print the Item name displayed in the Item field
    When Verify and Print the Process name displayed in the Process field
    When Verify and Print the Color name displayed in the Color field
    And Verify and Print the Qty Required field value
    And Verify and Print the Qty Available In Stock field value
    And Verify and Print the Qty Allowed field value
    And Verify and Print the Currency name displayed
    Given Enter Rate value"<Rate>"
		And Verify and Print the UOM value displayed
		Given Enter L-Short If Any"<LShort>"
		Given Enter Addl. Information 1"<AddInfo1>"
		Given Enter Addl. Information 2"<AddInfo2>"      
    Then Verify and print the IPO details under the IPO Details section
    Then Click on Save button to Generate PO
    And Verify whether the user is navigated to Print form
    And Click on Cancel button in Print Form
    Then Verify whether navigate back to Create PO For Trim screen

    Examples: 
    | IPO     | DeliverTo | Supplier 			|LeadTime	|Category					|Process	|Rate	|LShort									|AddInfo1					|AddInfo2					|
    | IPO08		 | Jiva     | Tex Corp		  |5				|Labels						|Sale			|4		|LShort remark entered	|AddInfo1 entered	|AddInfo2 entered	|
    
  @TrimPOMasterSheet
  Scenario Outline: Verifying the Rate validation msg when entered more than the MU rate for the respective combination
    Given Search with IPO in search keyword textbox "<IPO>"
    When Select the Category value in the filter"<Category>"
    When Select the Process value in the filters"<Process>"
    And Click on Generate PO icon
    Then Verify whether navigated to the Create PO for Trims screen 
    And Verify the PO Details are displaying
    When Enter Deliver Details and select from the suggestions"<DeliverTo>"
    When Verify and print the Delivery Address displayed for the selected Delivery To 
    When Verify and print the GSTIN number displayed for the selected Delivery To
    Then Enter supplier name and select from the suggestions"<Supplier>"
    And Verify and print the Supplier Address displayed for the selected Supplier
    And Verify and print the GSTIN number displayed for the selected Supplier
    And Verify and print the Payment Terms value for the selected Supplier
    And Verify and print the Delivery Terms value for the selected Supplier
    And Enter Lead Time in Days"<LeadTime>"
    When Verify and Print the Category name displayed in the Category field
    When Verify and Print the Item name displayed in the Item field
    When Verify and Print the Process name displayed in the Process field
    When Verify and Print the Color name displayed in the Color field
    And Verify and Print the Qty Required field value
    And Verify and Print the Qty Available In Stock field value
    And Verify and Print the Qty Allowed field value
    And Verify and Print the Currency name displayed
    Given Enter Rate value"<Rate>"
		And Verify and Print the UOM value displayed
		Given Enter L-Short If Any"<LShort>"
		Given Enter Addl. Information 1"<AddInfo1>"
		Given Enter Addl. Information 2"<AddInfo2>"      
    Then Verify and print the IPO details under the IPO Details section
    Then Click on Save button to Generate PO
    And Verify the Rate validation msg
    Then Verify whether navigate back to Create PO For Trim screen

    Examples: 
    | IPO     | DeliverTo | Supplier 			|LeadTime	|Category					|Process	|Rate	|LShort									|AddInfo1					|AddInfo2					|
    | IPO08		 | Jiva     | Tex Corp		  |5				|Packaging trims	|Sale			|65		|LShort remark entered	|AddInfo1 entered	|AddInfo2 entered	|


@TrimPOMasterSheet
  Scenario Outline: Verifying validation msg on selecting the same IPO under IPO Datais section
    Given Search with IPO in search keyword textbox "<IPO>"
    When Select the Category value in the filter"<Category>"
    When Select the Process value in the filters"<Process>"
    And Click on Generate PO icon
    Then Verify whether navigated to the Create PO for Trims screen 
    And Verify the PO Details are displaying
    When Enter Deliver Details and select from the suggestions"<DeliverTo>"
    When Verify and print the Delivery Address displayed for the selected Delivery To 
    When Verify and print the GSTIN number displayed for the selected Delivery To
    Then Enter supplier name and select from the suggestions"<Supplier>"
    And Verify and print the Supplier Address displayed for the selected Supplier
    And Verify and print the GSTIN number displayed for the selected Supplier
    And Verify and print the Payment Terms value for the selected Supplier
    And Verify and print the Delivery Terms value for the selected Supplier
    And Enter Lead Time in Days"<LeadTime>"
    When Verify and Print the Category name displayed in the Category field
    When Verify and Print the Item name displayed in the Item field
    When Verify and Print the Process name displayed in the Process field
    When Verify and Print the Color name displayed in the Color field
    And Verify and Print the Qty Required field value
    And Verify and Print the Qty Available In Stock field value
    And Verify and Print the Qty Allowed field value
    And Verify and Print the Currency name displayed
    Given Enter Rate value"<Rate>"
		And Verify and Print the UOM value displayed
		Given Enter L-Short If Any"<LShort>"
		Given Enter Addl. Information 1"<AddInfo1>"
		Given Enter Addl. Information 2"<AddInfo2>" 
		And Click on Add IPO button     
    Then Verify and print the IPO details under the IPO Details section
    Then Verify the validation msg on selecting the same IPO 
    Then Click on Save button to Generate PO
    And Verify the Rate validation msg
    Then Verify whether navigate back to Create PO For Trim screen

    Examples: 
    | IPO     | DeliverTo | Supplier 			|LeadTime	|Category					|Process	|Rate	|LShort									|AddInfo1					|AddInfo2					|IPOname		|
    | IPO08		 | Jiva     | Tex Corp		  |5				|Packaging trims	|Sale			|65		|LShort remark entered	|AddInfo1 entered	|AddInfo2 entered	|IPO08	|
    

  @TrimPOMasterSheet
  Scenario Outline: Revised PO for IPO process
    Given Search with PO in search keyword textbox "<PO>"
    And Click on Revised PO icon
    Then Verify whether navigated to the Revise PO for Trims screen
    And user update the revised po for ipo and "<QtyAllowed>""<Rate>"
    And Print view Revised PO for IPO details
    Then Click on Save button to Generate PO

    Examples: 
      | PO  | QtyAllowed | Rate |
      | F-5 |          2 | 25		|

  @TrimPOMasterSheet
  Scenario Outline: View print form of a PO for a combination
    Given Search with PO in search keyword textbox "<PO>"
    And Click on Print icon for a PO
    And Verify whether the user is navigated to Print form

    Examples: 
      | PO  |
      | F-5 |

  @TrimPOMasterSheet
  Scenario Outline: Verify the cancel functionality for a PO generated record
		Given Search with PO in search keyword textbox "<PO>"
    And Click on Cancel icon in grid
    Then Verify the Cancel popup 
    Then Click on the No option in the Cancel popup
    And Click on Cancel icon in grid
    Then Click on the Yes option in the Cancel popup
    And Verify the Cancel validation msg

    Examples: 
      | IPO   | PO  |
      | IPO08 | F-5 |

  @TrimPOMasterSheet1
  Scenario: Sorting the grid data
    When Verifying the Sorting functionality of grid headers
    
    
    
