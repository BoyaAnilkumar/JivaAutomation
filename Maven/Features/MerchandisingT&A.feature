@FeatureGroup 
Feature: Feature to test Jiva design Merchandising T and A Data Entry screen functionality
 
 @MerchandisingTAndA
 Scenario: To Test the PD Fabric Pricing screen
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the T and A Module
 And Click on the Merchandising T&A Data Entry Screen
 
 @MerchandisingTAndA
 Scenario: To Test the Filter Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the T and A Module
 And Click on the Merchandising T&A Data Entry Screen
 And Click on the Styles Expansion
 And Click on the Filter Icon
 And Click on the Buyer Field
 And Click on the Season Field
 And Select the Season
 And Select the Month
 And Search The IPO and Style
 And Click on the Apply button
 #And Click on the Reset button
 And Select the IPO and Style
 
@MerchandisingTAndA
 Scenario: To Test the Filter Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the T and A Module
 And Click on the Merchandising T&A Data Entry Screen
 And Click on the Styles Expansion 
 And Click on the Filter Icon
 And Search The IPO and Style
 And Click on the Apply button
 And Select the IPO and Style
 And Verify the IPO name is displaying or not
 And Verify the Style name is displaying or not
 And Verify the Buying house name is displaying or not
 And Verify the PO Qty Value is displaying or not
 And Verify the IPO Qty Value is displaying or not
 
 @MerchandisingTAndA1
 Scenario: To Test the Filter Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And Click on the T and A Module
 And Click on the Merchandising T&A Data Entry Screen
 And Click on the Styles Expansion 
 And Click on the Filter Icon
 And Search The IPO and Style
 And Click on the Apply button
 And Select the IPO and Style
 And Click on the Add button
 Given Enter the data in proto commends received field
Given Enter the data in Fit submittion field
 
 