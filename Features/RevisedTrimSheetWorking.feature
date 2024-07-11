 @RevisedTrimSheetWorkingscreen
 Feature: Verifying the Revised Trim Sheet Working screen functionality
 
 Background:
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Revised Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon

 @RevisedTrimSheetWorking
 Scenario Outline: Verifying the Filter functionality
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
 |BuyerName			|IPOname		|
 |Amazon (Core)	|IPO22			|
 
 
 @RevisedTrimSheetWorking
 Scenario Outline: Printing the Information bar fields data
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
 
 |IPOname				|
 |IPO22					|
  
  
 @RevisedTrimSheetWorking
 Scenario Outline: Verifying the added trims under the Trim Details grid
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print the Trim Details grid records
 
 Examples:
 
 |IPOname				|
 |IPO08					|
 
 
 @RevisedTrimSheetWorking
 Scenario Outline: Verifying the added trims under the Trim MU Working grid
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print the Trim MU Working grid records
 
 Examples:
 
 |IPOname				|
 |IPO08					|
 
 @RevisedTrimSheetWorking
 Scenario Outline: Verifying the added trims under the Job Work grid
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print Job Work grid records
 
 Examples:
 
 |IPOname				|
 |IPO08					|
 
 
 @RevisedTrimSheetWorking
 Scenario Outline: Printing the Information bar details in the add form
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 Then Verify whether the page is navigated to the Add Revised Trim Sheet Working
 Then Verify and Print the Category name
 Then Verify and Print the Item name
 Then Verify and Print the Color name
 Then Verify and Print the Total Req Qty
 
 Examples:
 |IPOname				|
 |IPO22					|
 
 
 @RevisedTrimSheetWorking
 Scenario Outline: Updating the sale process data
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 Then Verify whether the page is navigated to the Add Revised Trim Sheet Working
 #Then Select an UOM "<UOM>"
 #Then Select Qty Details "<QtyDetails>"
 Given Enter Qty per Unit value "<QtyUnit>" 
 Given Enter Rate per Unit value "<Rate>"
 #Given Enter Conversion Rate value "<ConvRate>"
 When Clicked on the Submit button
 Then Verify the toaster msg 
 Then Verify whether navigate to Revised Trim Sheet Working screen
 When Click on Submit to Audit Team button in the Trim Sheet Working screen
 Then Verify the toaster msg
 
 Examples:
 |IPOname				|UOM		|QtyDetails 	|QtyUnit		|Rate		|ConvRate		|
 |IPO26					|Box		|sticker 1		|3					|34			|2					|
 
 
 @RevisedTrimSheetWorking
 Scenario Outline: Updating the Greige and Dyeding process
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for another Trim "<QtyUnit>""<MU>""<GRate>""<DRate>"
 #Then Verify whether the page is navigated to the Add Revised Trim Sheet Working
 #Then Verify the toaster msg 
 Then Verify whether navigate to Revised Trim Sheet Working screen
 When Click on Submit to Audit Team button in the Trim Sheet Working screen
 Then Verify the toaster msg
 
 Examples:
 |IPOname				|QtyUnit		|MU		|GRate		|DRate		|
 |230424				|3					|4		|42				|44				|

@RevisedTrimSheetWorking12
 Scenario Outline: Updating the Job Work process
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a job work Trim in revised sheet "<JobName>""<RateperUnit>"
 Then Verify whether navigate to Revised Trim Sheet Working screen
 When Click on Submit to Audit Team button in the Trim Sheet Working screen
 Then Verify the toaster msg
 
 Examples:
 |IPOname		|JobName		|RateperUnit	|
 |6647			|JobWork1		|34						|
  
  
 @RevisedTrimSheetWorking
 Scenario Outline: Checking the validation toaster msg in the Revised Trim Sheet Working screen
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on Submit to Audit Team button in the Revised Trim Sheet Working screen
 Then Verify the toaster msg 
 
 Examples: 
 |IPOname				|
 #|230424				|
 |6591					|
 
 
 @RevisedTrimSheetWorking
 Scenario Outline: Checking the Cancel functionality in the Add form
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 Then Verify whether the page is navigated to the Add Revised Trim Sheet Working
 When Clicked on the Cancel button 
 Then Verify whether navigate to Revised Trim Sheet Working screen 
 
 Examples: 
 |IPOname				|
 |6591				|
 
 
 @RevisedTrimSheetWorking1
 Scenario Outline: Checking the validation toaster msg in the Add form(f)
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 Then Clear the data in the Qty per unit field
 When Clicked on the Submit button
 Then Verify the toaster msg
 
 
 Examples: 
 |IPOname				|
 |6591					|
 