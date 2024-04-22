@FeatureGroup 
Feature: feature to test Jiva design New Fabric Sheet screen functionality
  
  
 @FabricSheetAudit
 Scenario: To Test the Fabric Sheet Audit screen
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then Click on the Fabric Sheet Audit under the Audit module
 And Click on the Styles Expansion
 
 @FabricSheetAudit
 Scenario: To Test the select IPO in the Styles expansion list
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then Click on the Fabric Sheet Audit under the Audit module
 And Click on the Styles Expansion
 And Select the IPO in IPO list
 
 @FabricSheetAudit
 Scenario: To Test the Filter Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then Click on the Fabric Sheet Audit under the Audit module
 And Click on the Styles Expansion
 And Click on the Filter Icon
 #And Click on the Buyer Field
 And Click on the Season Field
 And Select the Season
 #And Select the Status in the Status dropdown list
 And Search The IPO
 And Click on the Apply button
 #And Click on the Reset button
 And Select the IPO and Style
 
 @FabricSheetAudit
 Scenario: To Check the display data
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then Click on the Fabric Sheet Audit under the Audit module
 And Click on the Styles Expansion
 And Select the IPO in IPO list
 And Select the IPO and Style
 And Verify the IPO name is displaying or not
 And Verify the Style name is displaying or not
 And Verify the Buyer name is displaying or not
 And Verify the Season name is displaying or not
 And Verify the Last Edited Date is displaying or not
 And Verify the Approved Date is displaying or not
 
 @FabricSheetAudit
 Scenario: To Test the Approve an Reject buttons functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then Click on the Fabric Sheet Audit under the Audit module
 And Click on the Styles Expansion
 And Select the IPO in IPO list
 And Select the IPO and Style
 And Click on the Costing budget Expansion
 And Verify the Costing budget expansion grid header section is diplsyiang or not
 And Click on the Production budget Expansion
 And Verify the Production budget expansion grid header section is diplsyiang or not
 #And Click on the Reject button
 And Click on the Approve button
 #Given Enter the data in Reason field
 
 