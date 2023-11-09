@FeatureGroup_Requirement
Feature: Submit the fabric sheet details

@RFS
Scenario: Submit the fabric sheet details in Revised fabric sheet
When user navigates to Login page
Given Login with Production Manager
When user navigates to dashboard
Then click on Wovenknit module
And click on Generate Fabric sheet
Then click on Revised Fabric sheet 
And click on Styles expansion
And verify the Ipos are displaying or not
And click on clear filter icon
Then click on filter icon
And Click on buyer dropdown 
Given Enter Buyer in search box
Then Select Buyer from dropdown list
And Click on Apply button
Then Select the IPO in styles expansion
And click on Add data button


