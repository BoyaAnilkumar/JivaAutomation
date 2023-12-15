
@FeatureGroup 
Feature: feature to test Style Po Details screen functionality

@StylePODetails 
 Scenario: To Test the Style PO Details screen 
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the Style Po Details Screen
 And Verify whether the Style Po details screen is displaying or not
 And Click on the Styles Expansion
 
@StylePODetails 
 Scenario: To Test the Filter Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the Style Po Details Screen
 And Verify whether the Style Po details screen is displaying or not
 And Click on the Styles Expansion
 And Click on the Filter Icon
 And Click on the Buyer Field
 And Click on the Season Field
 And Select the Season
 When Search the IPO
 And Click on the Apply button
 #And Click on the Reset button
 And Select the IPO and Style
 
 @StylePODetails 
 Scenario: To check the displaying IPO data 
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the Style Po Details Screen
 And Click on the Styles Expansion
 And Click on the Filter Icon
 When Search the IPO
 And Click on the Apply button
 And Select the IPO and Style
 And Verify the IPO name is displaying or not
 And Verify the Style name is displaying or not
 And Verify the Buyer name is displaying or not
 And Verify the Season name is displaying or not
 And Verify the PO Qty Value is displaying or not
 And Verify the Combination names are displaying or not
 And Verify the Garment Size Type names are displaying or not
 
 @StylePODetails 
 Scenario: To Test the Add New PO Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the Style Po Details Screen
 And Click on the Styles Expansion
 And Click on the Filter Icon
 When Search the IPO
 And Click on the Apply button
 And Select the IPO and Style
 And Click on the Add New PO button
 Given Enter the data in PO field
 Then Select the PO details
 And Enter the data in PO Qty field
 And Enter the data in Shortage Allowed
 And Enter the data in Addl Shipment Allowed field
 When The User enter the data in Shipment Priority field
 And Select the Combination
 And Select the Garment size type
 And Select the Ex factory date
 And Verify the data is displaying in the Days Kept In Hand field or not
 And Verify the data is prepopulated in the Ex Factory For Production field or not
 And Select the Requested Ex Factory field
 And Select the Handover Date
 And Select the Mode Data
 When User Enter the data in data in Comments field
 And Enter Size breakups Qty
 #And Click on the Cancel Button
 And Click on the Submit Button
 And Verify whether the Validation msg is displaying or not
 
 @StylePODetails 
 Scenario: To Test the Update PO details
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the Style Po Details Screen
 And Verify whether the Style Po details screen is displaying or not
 And Click on the Styles Expansion
 And Click on the Filter Icon
 When Search the IPO
 And Click on the Apply button
 And Select the IPO and Style
 And Click on the Edit icon
 And Verify the Update PO Form is displaying or not
 And Update the PO details
 And Update the Combo and Garment Size details
 And Update the Exfactory details
 And Update the Handover details
 And Update the PO Size wise details
 #And Click on the Update form Cancel Button
 And Click on the Update form Submit button
 And Verify whether the update Validation msg is displaying or not
 And Click on the Delete icon
 And Click on the View Comments Icon
 And Verify the Entered Comments are displaying or not
 And Click on the Comments Close button
 
 @StylePODetails
 Scenario: To Test the Grid names are displaying correct or not
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the Style Po Details Screen
 And Verify whether the Style Po details screen is displaying or not
 And Click on the Styles Expansion
 And Click on the Filter Icon
 When Search the IPO
 And Click on the Apply button
 And Select the IPO and Style
 And Check the PO Summary grid is displaying or not
 And Verify the PO Summary grid header section columnn names are displaying or not
 And Check the PO Size wise details Grid is displaying or not
 
 
 