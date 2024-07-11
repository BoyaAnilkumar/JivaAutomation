@sw_NewTrimSheetscreen
Feature: Verifying the New Trim Sheet screen functionality

  @sw_NewTrimSheet
  Scenario Outline: Verfifying the Filters functionality
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw New Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Select a Buyer in the filter window "<BuyerName>"
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Then Select a Season in the filter window
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  
  Examples:
  |BuyerName		|IPOname		|
  |Test buyer		|IPO2				|
  
   @sw_NewTrimSheet
  Scenario Outline: Verifying the Information bar field value
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw New Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  Then Verify and Print the IPO name
  Then Verify and Print the Buyer name
  Then Verify and Print the Buyer Style name
  Then Verify and Print the PO Qty
  Then Verify and Print the IPO Qty
  Then Verify and Print the Date Submitted
  
  Examples:
  |IPOname 			|
  |IPO2					|
  
  
  @sw_NewTrimSheet
  Scenario Outline: Adding a new trim records
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw New Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the Add New Trim Item button
  Then Verify whether navigated to the Add New Trim Sheet form
  Then Select a Team"<Owner>"from"<TrimOwner>"
  Then Select a Category"<Category>" in the Category field
  Then Select an Item"<Item>" in the Item field
  Then Select a Color"<Color>" in the Color field
  Then Select a Combination in the Combination field
  Then Select Trim Type
  Given Enter Average"<Avg>"
  Given Print the Total Required value
  Given Enter Wastage"<Wastage>"
  Given Print the Total value
  Then Click on Submit button
  Then Verify whether the page is navigated to the New Trim Sheet
  Given Enter Bulk Trim Deadline"<BulkTrimDeadline>"
  Then Select Trim Manager  
  And Click on the Partial Save button
  Then Verify the partial save msg
  Then Click on the Submit to Trim Team button
  And Verify and print the Successful submit msg
  
  Examples:
  |IPOname 			|Owner						|TrimOwner		|Category							|Item						|Color				|Avg				|Wastage			|BulkTrimDeadline		|
	|IPO1206			|Merchant Team		|Trim Owner		|Embroidery trims			|Dori						|Tofu					|5					|4						|2									|
  #|IPO4					|Trim Team				|Trim Owner		|Job Work							|Tassel Making	|Yellow				|6					|5						|4									|	
  #|230424				|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|						
  
  
  
  @sw_NewTrimSheet
  Scenario Outline: Verifying the Mandatory validation msg
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw New Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the Add New Trim Item button
  Then Click on Submit button
  And Verify and print the Mandatory validation msg  
  
  Examples:
  |IPOname 			|
  |SwissIPO			|
  #|IPO23				|
  
  
  @sw_NewTrimSheet
  Scenario Outline: Verifying Cancelling the added record functionality
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw New Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the Add New Trim Item button
  When Click on Cancel button in Trim Sheet
  Then Verify whether the page is navigated to the New Trim Sheet 
  
  
  Examples:
  |IPOname			|
  |SwissIPO			|
  #|250424				|
  
  
  @sw_NewTrimSheet
  Scenario Outline: Editing the added trim record
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw New Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  #When Click on the Add New Trim Item button
  #Then Verify whether navigated to the Add New Trim Sheet form
  #Then Select a Team"<Owner>"from"<TrimOwner>"
  #Then Select a Category"<Category>" in the Category field
  #Then Select an Item"<Item>" in the Item field
  #Then Select a Color"<Color>" in the Color field
  #Then Select a Combination in the Combination field
  #Then Select Trim Type
  #Given Enter Average"<Avg>"
  #Given Print the Total Required value
  #Given Enter Wastage"<Wastage>"
  #Given Print the Total value
  #Then Click on Submit button
  #Then Verify whether the page is navigated to the New Trim Sheet
  #Given Enter Bulk Trim Deadline"<BulkTrimDeadline>"
  #Then Select Trim Manager  
  #And Click on the Partial Save button
  Then Click on the Edit button for the added trim record
  Then Verify whether navigated to Update Trim Sheet form
  Then Edit the Color field"<EColor>"
  Then Click on Submit button 
  Then Verify whether the page is navigated to the New Trim Sheet
  
  
  
  Examples:
  |IPOname 			|Owner						|TrimOwner		|Category							|Item						|Color				|Avg				|Wastage			|BulkTrimDeadline		|EColor	|
  |IPO1206			|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|Green	 |
  #|IPO23				|Merchant Team		|Trim Owner		| Packaging trims			|Hanger					|Lilac				|6					|4						|10									|	
  #|23-04-24-1		|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|Alabaster		|		
 

  @sw_NewTrimSheet1
  Scenario Outline: Deleting the added trim record
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw New Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  #When Click on the Add New Trim Item button
  #Then Verify whether navigated to the Add New Trim Sheet form
  #Then Select a Team"<Owner>"from"<TrimOwner>"
  #Then Select a Category"<Category>" in the Category field
  #Then Select an Item"<Item>" in the Item field
  #Then Select a Color"<Color>" in the Color field
  #Then Select a Combination in the Combination field
  #Then Select Trim Type
  #Given Enter Average"<Avg>"
  #Given Print the Total Required value
  #Given Enter Wastage"<Wastage>"
  #Given Print the Total value
  #Then Click on Submit button
  #Then Verify whether the page is navigated to the New Trim Sheet
  When Click on the Delete button for an added record
  Then Verify the delete popup window and print
  Then Click on No option
  When Click on the Delete button for an added record
  Then Click on Yes option
  
  Examples: 
  |IPOname 			|Owner						|TrimOwner		|Category							|Item						|Color				|Avg				|Wastage			|BulkTrimDeadline		|
  |IPO1206			|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|
  
  
  