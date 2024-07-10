@FeatureGroup
Feature: feature to test Jiva design Sweater Yarn Sheet Pending screen functionality

@SWYarnSheet_Pending_Report
Scenario: Validate user click on the Sweater Yarn Sheet Pending screen in menu
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the Yarn Sheet Pending Report

@SWYarnSheet_Pending_Report
Scenario Outline: Verify the Filter functionality in the Yarn Sheet Pending Report
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the Yarn Sheet Pending Report
Then Click on the Filter Expansion
And Select the "<Buyer>" in Filter option page
And Select the Merchant "<Merchant>" in the Filter option page
And Select the "<Status>" in Filter Option Page
And click on the Apply button 
And The Search related data is displayed in the main grid

Examples:
|Buyer       |     Merchant       |        Status             |
|Test buyer  |     Raji Rajeswari |   Submitted To Yarn Team  |

@SWYarnSheet_Pending_Report
Scenario Outline: Verify the Export button in the Yarn Sheet Pending Report
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the Yarn Sheet Pending Report
Then Click on the Filter Expansion
And Select the "<Buyer>" in Filter option page
And Select the Merchant "<Merchant>" in the Filter option page
And Select the "<Status>" in Filter Option Page
And click on the Apply button 
And Click on the Export button
Examples:
|Buyer       |     Merchant       |        Status             |
|Test buyer  |     Raji Rajeswari |   Submitted To Yarn Team  |

@SWYarnSheet_Pending_Report
Scenario Outline: Verify the without displaying data in the grid the Export button displayed as Disabled state functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the Yarn Sheet Pending Report
Then Click on the Filter Expansion
And Select the "<Buyer>" in Filter option page
And click on the Apply button 
And Verify the without displaying the data in the grid the Export button is displaying disabled state or not
Examples:
|Buyer       |
|Andamen     | 
@SWYarnSheet_Pending_Report
Scenario: Verify the Sorting functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the Yarn Sheet Pending Report
And Verify the Sorting functionality in grid

@SWYarnSheet_Pending_Report
Scenario: Verify the Pagination functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the Yarn Sheet Pending Report
Then By default five records are displayed
And check whether it is navigating to the after page records when the user clicks on Next page icon
And check whether it is navigating to the before page records when the user clicks on before page icon
And check whether it is displaying the last page records when the user clicks on last page icon
   