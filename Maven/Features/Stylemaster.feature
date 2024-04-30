@FeatureGroup_Requirement
Feature: feature to test Jiva design style master screen functionality

 @StyleMaster
 Scenario: To Test the Style Master screen
 When User navigates to Login page
Then User enters the username and password
 And User click on the signIn
 And Click on the Woven Module
 Then click on the PD Module
 And Click on Data Entry in PD Module
 And click on the Style Master screen

 #Then click on the Filter Icon
 #And Click on the Buyer filed
 #When User select the Buyer in buyer dropdown field
 #And Click on the season field
 #When User Select the Season in season dropdown field
 #And Click on the Status field
 #When User select the Status
 #And Enter the data in Search By Style field
 #And Click on the Filter Apply button
 #And Click on the Filter Reset button
 

Then Click on the Add New style button
And Click on the PD Merchant name field
When User select the PD merchant name
And Enter the data in BuyerStyle field
And Click on the Buyer field
When User select the Buyer
And Click on the Season field in Add form
And Click on the Garment Type field
Then Select the Garment type
And Click on the Garment process field
When The user select the Garment Process
Then User enter the the Tech Pack Name
And Enter the data in Teck pack desc field
Then User select the data in Teck received date field
And User click on the sampling type field
When The user select the sampling type in dropdown list
And User select the Expected Submission Date
And Enter the data in expected order qty field
Then User select the expected order date field
When The user select the PD Assistants
And select PD Assistants
And Click on the Save button in create style master

#Given I am on the homepage
#Then print the displayed header message


#And Click on the Cancel button
And Click on the created style
#And Click on the Back button


When User click on the add revise estimates button
And Click on the Generate new order radio button
And Select the Order Type
And Select the Order date
And Select the Exfactory date
Given User enter the Order qty
And Select the Costing Version
And click on the Save button in create style master
And Click on the cancel button in create style master
And Click on the Generate new order radio button

And Click on the Add new tech pack button
When The User enter the data in tech pack name field
And Enter the data in tech pack desc field
Then User select the Tech Pack Received Date
And Click on the tech pack details Save button
And Click on the tech pack details Cancel button
And Click on the Tech pack cancel Icon

And Click on the Add sampling details button
And Select the sampling status
Given User Click the Sampling type
And User Select the Sampling type
And Select the Submission date
And Click on the sampling Save button
And Click on the Cancel button
And Click on the Cancel Icon in create style master
And User Click on the Link to PD FDS button
And Click on the Link button


Then Click on the View Cancel Icon
And Click on the View Close button
And Click on the Manage Images Icon
And Click on the Manage images Save button
And Click on the Manage Close button
And Click on the Manage Images cancel Icon


And Click on the Edit Icon in style master grid
And CLick on the Edit Close icon
And Click on the Edit Close button
And Click on the Update button
Given the user is on the edit form page
When the user updates the Buyer style
And The User Updates the Buyer name
And the user updates the season
When The User Updates the Garment Type
And The User Updates the Garment Process
And Click on the Update button
And CLick on the Edit Close icon
And Click on the Edit Close button

And Click on the Delete Icon in style master grid
And Click on the Yes button
And Click on the No button
And Verify whether the delete is working or not

 @MultipleStyleMasters
 Scenario: Creating Mutiple Style Masters
 
 Given Create multiple style masters details in pd module
 
 
 
 
 