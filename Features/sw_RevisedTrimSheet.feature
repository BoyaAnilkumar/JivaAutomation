@sw_RevisedTrimSheetscreen
Feature: Verifying the Revise Trim Sheet screen functionality

  @sw_ReviseTrimSheet
  Scenario Outline: Verfifying the Filters functionality
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
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
  Then Select a Status in the filter window
  And Click on the Filter_Apply button
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  
  Examples:
  |BuyerName		|IPOname		|
  |Test buyer		|IPO1				|
  
  @sw_ReviseTrimSheet
  Scenario Outline: Verifying the Information bar field value
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
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
  Then Verify and Print the BulkTime DeadLine
  Then Verify and Print the Reason For Revision
  Then Verify and Print the Trim Manager
  Then Verify and Print the Trim Manager Assistants
  
  Examples:
  |IPOname 			|
  |IPO1					|
  #|IPO08				|
  
  @sw_ReviseTrimSheet1
  Scenario Outline: Verifying the added records depending on the Trim owner wise
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  Then Verify and print records data in the Merchant and Trim team grids
  
  
   Examples:
  |IPOname 			|
  #|IPO1					|
 | IPO4		|
  
  
  
  @sw_RevisedTrimSheet
  Scenario Outline: Adding another trim records for the existing records
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the Add New Trim Item button
  Then Verify whether navigated to the Add Revised Trim Sheet form
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
  Then Verify whether the page is navigated to the Revised Trim Sheet
  Given Enter Bulk Trim Deadline"<BulkTrimDeadline>"
  Then Select Trim Manager
  Given Enter the Reason For Revision field"<Reason>"  
  Then Click on the Submit to Trim Team button
  And Verify whether the Upcharge Amount popup window is opened or not
	Then Verify whether the validation msg is displayed when click on Submit with Null values
	Given Enter the value in the Amount field
	Given Enter the Remarks 
	And Click on the Submit button in the Upcharge window
  And Verify and print the Revised Successful submit msg
  
  Examples:
  |IPOname 			|Owner						|TrimOwner		|Category							|Item						|Color				|Avg				|Wastage			|BulkTrimDeadline		|Reason 		|
  |IPO1					|Trim Team				|Trim Owner		|Labels								|Main label			|Green				|4					|3						|2									|Reason1		|
  #|IPO08				|Merchant Team		|Trim Owner		| Packaging trims			|Hanger					|Lilac				|6					|4						|10									|	
  #|230424				|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|						
  
  
  
  @sw_RevisedTrimSheet
  Scenario Outline: Verifying the Mandatory validation msg in the Revised Trim Sheet
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  Then Verify whether the page is navigated to the Revised Trim Sheet
  Then Click on the Submit to Trim Team button
  And Verify and print the Mandatory validation msg  
  
  Examples:
  |IPOname 			|
  |IPO1					|
  #|IPO23				|
  
  @sw_RevisedTrimSheet
  Scenario Outline: Verifying the Mandatory validation msg in the Add Revised Trim Sheet
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  Then Verify whether the page is navigated to the Revised Trim Sheet
  When Click on the Add New Trim Item button
  Then Click on Submit button
  And Verify and print the Mandatory validation msg  
  
  Examples:
  |IPO1 			|
  
   
  @sw_RevisedTrimSheet
  Scenario Outline: Verifying Cancelling the added record functionality
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the Add New Trim Item button
  Then Verify whether navigated to the Add Revised Trim Sheet form
  When Click the Cancel button
  Then Verify whether the page is navigated to the Revised Trim Sheet 
  
  
  Examples:
  |IPOname 			|
  |IPO1					|
  
  
  @sw_RevisedTrimSheet
  Scenario Outline: Editing the added trim record
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  #When Click on the Add New Trim Item button
  #Then Verify whether navigated to the Add Revised Trim Sheet form
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
  #Then Verify whether the page is navigated to the Revised Trim Sheet
  Then Click on the Edit button for the added trim record
  Then Verify whether navigated to Update Trim Sheet form
  Then Edit the Color field"<EColor>"
  Then Click on Submit button 
  Then Verify whether the page is navigated to the Revised Trim Sheet
  
  
  
  Examples:
  |IPOname 			|Owner						|TrimOwner		|Category							|Item						|Color				|Avg				|Wastage			|BulkTrimDeadline		|EColor	|
  #|IPO8				|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|
  |IPO1					|Merchant Team		|Trim Owner		| Packaging trims			|Hanger					|Lilac				|6					|4						|10									|Tofu		|
  #|230424				|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|Basil	|		
 

  @sw_RevisedTrimSheet
  Scenario Outline: Deleting the added trim record
  When user navigates to Login page
  Given Login with the SW Production Manager
  And Click on the SignIn button
  Then Navigate to sw Revise Trim Sheet screen
  And click on Styles expansion
  Then click on filter icon
  Then Click on Reset
  Given Enter an IPO name in the Search by IPO field "<IPOname>"
  And Click on the Filter_Apply button
  Then Select an IPO
  And click on Styles expansion
  When Click on the Add New Trim Item button
  Then Verify whether navigated to the Add Revised Trim Sheet form
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
  Then Verify whether the page is navigated to the Revised Trim Sheet
  When Click on the Delete button for an added record
  Then Verify the delete popup window and print
  Then Click on No option
  When Click on the Delete button for an added record
  Then Click on Yes option
  
  Examples: 
  |IPOname 			|Owner						|TrimOwner		|Category							|Item						|Color				|Avg				|Wastage			|BulkTrimDeadline		|
  |IPO1				|Trim Team				|Trim Owner		| Embroidery trims		|Dori						|Banana				|8					|9						|6									|
  |IPO2				|Merchant Team		|Trim Owner		| Packaging trims			|Hanger					|Lilac				|6					|4						|10									|
  
  
  
