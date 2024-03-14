@FeatureGroup 
Feature: feature to test Jiva design PD Fabric Pricing screen functionality
 
 @Fabric_Pricing
 Scenario: To Test the PD Fabric Pricing screen
 When User navigates to Login page
 Given User Enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 And Click on Fabric Sourcing module
 And click on Data Entry in fabric sourcing module
 And click on PD Fabric Pricing
 And Click on the Styles Expansion
 
 
@Fabric_Pricing
 Scenario: To Test the Filter Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 And Click on Fabric Sourcing module
 And click on Data Entry in fabric sourcing module
 And click on PD Fabric Pricing
 And Click on the Styles Expansion
 And Click on the Filter icon
 #And Click on the Buyer Field
 #And Click on the Season field
 #And Select the Season
 #And Select the Status in the Status dropdown list
 And Search The Style
 And Click on the Apply button
 #And Click on the Reset button
 And Select the Style
 
 
 @Fabric_Pricing
 Scenario: To Test the Filter Functionality
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 And Click on Fabric Sourcing module
 And click on Data Entry in fabric sourcing module
 And click on PD Fabric Pricing
 And Click on the Styles Expansion
 And Click on the Filter icon
 And Search The Style
 And Click on the Apply button
 And Select the Style
 And Verify the Style name is displayed or not
 And Verify the Buyer name is displayed or not
 And Verify the Season name is displayed or not
 And Verify the Qty value is displayed or not
 And Verify the Order date is displayed or not
 #And click on the Fabric cancel icon
 @Fabric_Pricing
 Scenario: To Test the Add Pricing Details 
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
  And Click on Fabric Sourcing module
 And click on Data Entry in fabric sourcing module
 And click on PD Fabric Pricing
 And Click on the Styles Expansion
 And Click on the Filter icon
 And Search The Style
 And Click on the Apply button
 And Select the Style
 And Verify whether the Fabric Quality field data is prepopulated or not
 And Verify whether the Content field data is prepopulated or not
 And Verify whether the color field data is prepopulated or not
 And Verify wether the Count Construction field data is prepopulated or not
 And Verify whether the GSM field data is prepopulated or not
  And Verify whether the Finish field data is prepopulated or not
 And Verify whether the Specific Requirements field data is prepopulated or not
 And Verify whether the Fabric Quantity field data is prepopulated or not
 And Verify whether the Full Width field data is prepopulated or not
 And Verify wether the Cuttable Width field data is prepopulated or not
 And Verify whether the Use field data is prepopulated or not
 
 @Fabric_Pricing
 Scenario: To Test the Add Pricing Details 
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
  And Click on Fabric Sourcing module
 And click on Data Entry in fabric sourcing module
 And click on PD Fabric Pricing
 And Click on the Styles Expansion
 And Click on the Filter icon
 And Search The Style
 And Click on the Apply button
 And Select the Style
 And Click on the Add Pricing button
 And Select the Process
 Given Enter the Price 
 And Select the Fabric Supplier
 And Enter the Remarks Field 
 #And Click on the delete icon
 And Enter the data in Total Price Field
 Given Enter the data in Total Fabric Lead Time
 And Enter the data in Price Valid For Days
 Given Enter the data in Residual Shrinkage field
 And Enter the data in boing field
 And Enter the data in CS field
 And Enter the data in Color Fastness field
 And Enter the data in GSM Variation
 And Enter the data in Crinkle Variation field
 And Enter the data in Any Other Remarks field
 #And Click on the Reset Button 
 And CLick on the Save Button
 And Click on the Submit to Po Merchant Team button
 @Fabric_Pricing
 Scenario: To Test the Add Pricing Details 
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
  And Click on Fabric Sourcing module
 And click on Data Entry in fabric sourcing module
 And click on PD Fabric Pricing
 And Click on the Styles Expansion
 And Click on the Filter icon
 And Search The Style
 And Click on the Apply button
 And Select the Style
 And CLick on the View For Print button
 And Verify whether the View for print page is displaying or not
 And Click on the cancel Button
 #And click on the Print button
 @Fabric_Pricing1
 Scenario: To Test the Nominated Fabric page
 When User navigates to Login page
 Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
  And Click on Fabric Sourcing module
 And click on Data Entry in fabric sourcing module
 And click on PD Fabric Pricing
 And Click on the Styles Expansion
 And Click on the Filter icon
 And Search The Style
 And Click on the Apply button
 And Select the Style
 And Click on the Fabric name tab
 And Verify the Style name is displayed or not
 And Verify the Buyer name is displayed or not
 And Verify the Season name is displayed or not
 And Verify the Qty value is displayed or not
 And Verify the Order date is displayed or not
 And Click on the download icon
 And Verify whether the Fabric Quality field data is prepopulated or not
 And Verify whether the Content field data is prepopulated or not
 And Verify whether the color field data is prepopulated or not
 And Verify wether the Count Construction field data is prepopulated or not
 And Verify whether the GSM field data is prepopulated or not
 And Verify whether the Specific Requirements field data is prepopulated or not
 And Verify whether the Fabric Quantity field data is prepopulated or not
 And Verify whether the Full Width field data is prepopulated or not
 And Verify wether the Cuttable Width field data is prepopulated or not
 And Verify whether the Use field data is prepopulated or not