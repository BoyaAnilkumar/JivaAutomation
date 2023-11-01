@FeatureGroup_Requirement
Feature: Create the New IPO from Pending IPO list

@NEWIPO
Scenario: Create New IPO in Pending IPO List 
Given Login with Audit Manager credentials in Login page
Then Click on WovenKnit Module
And Click on Audit Module
Then Click on Pending IPO list in menu
And Verify whether user navigated to Pending IPO list or not 
And Verify whether the data is displaying in grid or not
And Click on Generate IPO button
And Verify whether Generate IPO screen is displaying or not
And Verify whether the current date is displaying for IPO date field or not 
And verify whether the Buyer Style is prepopulated or not 
And Verify whether the IPO field is prepopulated with data or not 
And Enter IPO number in IPO field 
#And Verify Buyer is prepopulated or not 
And Insert and select Production Merchant
And Verify the PO qty is prepopulated or not
And Enter IPO qty in text field
Then Select Assigned Month Year
And verify whether the exfactory is prepopulated or not
Then Disable the Active checkbox
And Click on cancel button
And Click the Save button
