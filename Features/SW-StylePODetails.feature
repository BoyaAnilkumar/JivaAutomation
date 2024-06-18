
@FeatureGroup
Feature: feature to test Jiva design Sweater Style Po Details screen functionality

@SWStylePODetails
Scenario: Validate user click on the Style PO Details screen in menu
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details

@SWStylePODetails
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Validate whether the Selected IPO "<StyleIPO>" is displayed in the IPO list or not
And Click on the Filter Icon in Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select "<Season>" in the Filter option page
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List

Examples:
|Buyer       |     Season     |  StyleOrIPO      |StyleIPO         |
|Test buyer  |     Fall       |   IPO1806        |IPO1806 / Style2 |
 
@SWStylePODetails
Scenario Outline: Verify the Add PO details functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New PO button in the Style PO Details Screen
When User enter the data in the "<PO>" field in the PO details section
And Select the PO Details 
And Enter the "<POQty>" in the PO Qty field
When Enter the data in the "<Shortage>" Allowed field



Examples:
|  StyleOrIPO|
|   IPO1806  |