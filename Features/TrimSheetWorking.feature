 @TrimSheetWorkingscreen
 Feature: Verifying the Trim Sheet Working screen functionality

 @TrimSheetWorking
 Scenario Outline: Verifying the Filter functionality
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
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
 |BuyerName			|IPOname		|
 |Amazon (Core)	|IPO22			|
 
 
 @TrimSheetWorking
 Scenario Outline: Printing the Information bar fields data
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
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
 
 |IPOname				|
 |IPO22					|
  
  
 @TrimSheetWorking
 Scenario Outline: Verifying the added trims under the Trim Details grid
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print the Trim Details grid records
 
 Examples:
 
 |IPOname				|
 |IPO22					|
 |230424				|
 
 @TrimSheetWorking
 Scenario Outline: Verifying the added trims under the Trim Sheet Working grid
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print the Trim Sheet Working grid records
 
 Examples:
 
 |IPOname				|
 |IPO22					|
 
 @TrimSheetWorking
 Scenario Outline: Verifying the added trims under the Job Work grid
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 Then Verify and print the Job Work grid records
 
 Examples:
 
 |IPOname				|
 |IPO22					|
 
 
 @TrimSheetWorking
 Scenario Outline: Printing the Information bar details in the add form
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 Then Verify whether the page is navigated to the Add Trim Sheet Working
 Then Verify and Print the Category name
 Then Verify and Print the Item name
 Then Verify and Print the Color name
 Then Verify and Print the Total Req Qty
 
 Examples:
 |IPOname				|
 |IPO22					|
 
 
 @TrimSheetWorking
 Scenario Outline: Adding the sale process
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 Then Verify whether the page is navigated to the Add Trim Sheet Working
 Then Select an UOM "<UOM>"
 Then Select Qty Details "<QtyDetails>"
 Given Enter Qty per Unit value "<QtyUnit>" 
 Given Enter Rate per Unit value "<Rate>"
 Given Enter Conversion Rate value "<ConvRate>"
 When Clicked on the Submit button
 Then Verify the toaster msg 
 Then Verify whether navigate to Trim Sheet Working screen
 
 Examples:
 |IPOname				|UOM		|QtyDetails 	|QtyUnit		|Rate		|ConvRate		|
 |IPO22					|Box		|sticker 1		|3					|34			|2					|
 
 
 @TrimSheetWorking
 Scenario Outline: Adding the Greige and Dyeing process
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for another Trim "<UOM>""<QtyDetails>""<QtyUnit>""<MU>""<GRate>""<DRate>"
 #Then Verify whether the page is navigated to the Add Trim Sheet Working
 Then Verify the toaster msg 
 Then Verify whether navigate to Trim Sheet Working screen
 
 Examples:
 |IPOname				|UOM		|QtyUnit		|MU		|GRate		|GConvRate		|DRate		|DConvRate	|
 |6593					|Yard		|3					|4		|42				|2						|44				|2					|
 #|							|Box		|4					|3		|34				|3						|35				|3					|
 #|							|Cone		|2					|5		|44				|1						|45				|1					|
 
 
 @TrimSheetWorking1
 Scenario Outline: Adding the Job Work process
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a job work Trim "<JobName>""<RateperUnit>"
 Then Verify whether navigate to Trim Sheet Working screen
 
 Examples:
 |IPOname		|JobName		|RateperUnit	|
 |6593			|JobWork1		|35						|
 #|					|JobWork2		|25						|
 
 
  
 @TrimSheetWorking
 Scenario Outline: Checking the validation toaster msg in the Trim Sheet Working screen
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on Submit to Audit Team button in the Trim Sheet Working screen
 Then Verify the toaster msg 
 
 Examples: 
 |IPOname				|
 |230424				|
 |6591					|
 
 
 @TrimSheetWorking
 Scenario Outline: Checking the Cancel functionality in the Add form
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 Then Verify whether the page is navigated to the Add Trim Sheet Working
 When Clicked on the Cancel button 
 Then Verify whether navigate to Trim Sheet Working screen 
 
 Examples: 
 |IPOname				|
 |230424				|
 
 
 @TrimSheetWorking
 Scenario Outline: Checking the validation toaster msg in the Trim Sheet Working screen
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim
 When Clicked on the Submit button
 Then Verify the toaster msg
 
 Examples: 
 |IPOname				|
 |6591					|
 
 @TrimSheetWorking
 Scenario Outline: Adding and editing the Greige and Dyeding process
 When user navigates to Login page
 Given Login with the Trim Manager
 And Click on the SignIn button
 Then Navigate to Trim Sheet Working screen
 And click on Styles expansion
 Then click on filter icon
 Then Click on Reset
 Given Enter an IPO name in the Search by IPO field "<IPOname>"
 And Click on the Filter_Apply button 
 Then Select an IPO
 And click on Styles expansion
 When Click on the Edit button for a Trim 
 #Then Verify whether the page is navigated to the Add Trim Sheet Working
 #Then Select an UOM "<UOM>"
 #Then Select Qty Details "<QtyDetails>"
 #Given Enter Qty per Unit value "<QtyUnit>"
 #Then Click on the Dyeing toggle button
 #Given Enter MU Working value "<MU>" 
 #Given Enter Greige Rate per Unit value "<GRate>"
 #Given Enter Greige Conversion Rate value "<GConvRate>"
 #Given Enter Dyeing Rate per Unit value "<DRate>"
 #Given Enter Dyeing Conversion Rate value "<DConvRate>"
 #When Clicked on the Submit button
 #Then Verify the toaster msg
 #Then Verify whether navigate to Trim Sheet Working screen
 #When Click on the Edit button for a Trim
 Given Enter Qty per Unit value "<QtyUnit1>"
 When Clicked on the Submit button
 Then Verify the toaster msg
  
 Examples:
 |IPOname				|UOM		|QtyDetails 							|QtyUnit		|MU		|GRate		|GConvRate		|DRate		|DConvRate	|QtyUnit1	|
 |230424				|Yard		| Dori type and color			|3					|4		|42				|2						|44				|2					|2				|
 
 
 
 
 
 