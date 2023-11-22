@FeatureGroup_Requirement
Feature: Creating the expected PD Orders 

@CreatePDorders
Scenario: Create Expected New PD order 
Given Login with Senior PD merchant credentials in Login page
Then Click on Woven
And Click on PD Module to view the menu in PD Module
Then Select the PD Orders from the menu of PD Module
And Click on Add button
And Enter Sr PD Merchant
And Select Buyer from the dropdown list
And Select Month and Year from calendar
And Enter Expected Order Qty
And Enter Appr Per Pcs cost
And Enter Exchange Rate
And verify the Total Cost in INR
And verify the Total cost in Currency

