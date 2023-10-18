@FeatureGroup_Requirement
Feature: feature to test Jiva design Style Initial Details screen functionality

 @StyleTest1
 Scenario: To Test the Style Initial details screen
 When User navigates to Login page
Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the Merchandising Module
 And click on the Style Initail Details screen
 
 When Click on the Styles Expansion
 And Select IPO/Style
 And Click on the Filter Icon
 And Click on the Buyer Field
 And Select the Buyer
 Then Click on the Season Field
 And Select the Season
 And Click on the Status Field
 And Select the status
 And Search the IPO
 And Click on the Apply button
 And Click on the Reset button
 
 
#And Verify IPO data
#And Verify Style
#And Verify Buyer
#And Verify Season
#Then Select File handover date
And Click on the Add combo button
Given Enter the data in Combo1
And Click on the Delete Icon1
#And Enter the data in Combo2
#And Click on the delete Icon2
And Click on the Add Garment type button
#And Click on the Delete Garment Icon1
#And Click on the Delete garment Icon2
And Click on the Garment type field
And Select the Garment type
And Click on the Submit Order details button
And Verify the Alert msg
