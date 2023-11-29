@FeatureGroup_Requirement
Feature: Submit the fabric sheet details

@RevisedFabricSheeet
Scenario: Submit the fabric sheet details in Revised fabric sheet
When user navigates to Login page
Given Login with Production Manager
And Click on the SignIn button
When user navigates to Revised Fabric Sheet
And click on Styles expansion
And click on clear filter icon
#Then click on filter icon
#And Click on buyer1 dropdown 
#Given Enter Buyer in search box
#Then Select Buyer from dropdown list
#Then Click on the Seasons dropdown field
#And Select a Season
#Then Click in the Status dropdown field
#And Select a Status
#Then Enter an IPO name in the Search by Buyer Style or IPO textbox field
#And Click on the Filt_Apply button
#Then Click on Filter button 
#Then Verify whether data is getting cleared or not on OnClick the Reset button
And Verify whether the user is able to Select an IPO from the Menu list
Then Click on the Style ShowHide button for closing the menu list
Then Verify the count of the Fabric records under the Fabric Details grid
#Adding a Fabric Quality record
And click on Add data button
Then Click on Cancel button
#Then Click on the Is Nominated textbox field
#And Verify whether the Supplier Name field is changed to enbaled state or not
#Then Click in the Supplier Name dropdown field
#Then Select a Supplier from the dropdown field
Then Verify whether the user is able to select the Fabric Quality from the dropdown list in the Fabric Quality field
#And Verify whether the Contetnt value is selected or not for the selected fabric
#And Verify whether the Count Construction value is selected or not for the selected fabric
#And Verify whether the GSM value is selected or not for the selected fabric
#And Verify whether the Cuttable Width value is selected or not for the selected fabric
And Verify whether the Use value is selected or not for the selected fabric
#And Verify whether the Supplier Internal Code value is selected or not for the selected fabric
Given Enter the data in the Finish Special Requirements textbox field
And Verify whether the Color is selected or not for the selected fabric
And Verify whether the Applicable Combo is selected or not for the selected fabric 
Given Enter the data in the Additional Information textbox field
Given Enter the data in the Additional percentage textbox field
Given Enter the data in the Missy Garment Avg textbox field
#Given Enter the data in the Petite Garment Avg textbox field
And Verifying the Garment Average UOM dropdown field default value
And Verifying the Required UOM dropdown field default value
And Verifying the Cutting Wastage textbox field default value
And Verifying the Fabric Required For Cutting value
Given Enter the value in the Fabric Required For Sampling textbox field 
And Verifying the Fabric Total Fabric Required value
Then Click on Submit button
Then Verify whether the page is navigated to the Revised Fabric Sheet
Then Click on the Submit to Fabric Team
And Verify whether the Upcharge Amount popup window is opened or not
Then Verify whether the validation msg is displayed when click on Submit with Null values
Given Enter the value in the Amount field
Given Enter the Remarks 
And Click on the Submit button in the Upcharge window

#Delete scenario
Then Click on the Delete button for a Quality 
Then Verify whether the Delete prompt msg is displayed or not
Then Click on the No option in the delete prompt
Then Verify whether the respective added Fabric record is deleted or not on clicking the Yes option 

#Edit the added Fabric
When Verify whether the page is navigating to the Updated page or not on clicking the Edit button
And Verify and Update the Field values displayed in the fields
And Verify and Update the field value displayed in the Content field
And Verify and Update the field value displayed in the Count field
And Verify and Update the field value displayed in the GSM field
And Verify and Update the field value displayed in the Cuttable Width field
And Verify and Update the field value displayed in the Use field
And Verify and Update the field value displayed in the Color field
And Verify and Update the field value displayed in the Combo field
And Verify and Update the field value displayed in the Additional field
And Verify and Update the field value displayed in the Garment Avg field
And Verify and Update the field value displayed in the Fabric Required For Sampling field
Then Click on the Update button in the Update Fabric Sheet form


