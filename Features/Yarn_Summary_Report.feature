@FeatureGroup
Feature: feature to test Jiva design Sweater Yarn Summary Report screen functionality

@Yarn_Summary_Report
Scenario Outline: Validate user click on the Yarn Summary Report screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the Yarn Summary Report under the T&A dropdown
Then the Yarn Summary Report Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Yarn_Summary_Report
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the Yarn Summary Report under the T&A dropdown
And User click on the filter Expansion
And Select the "<Merchant>" in the Filters page
And Select the Buyer in the "<Buyer>" field
And Select the Supplier in the "<Supplier>" field
Then User select the "<Yarn_Quality>" in the filter page
And Select the Month in the "<Month>" field
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 

Examples:
| username   | password   |Merchant       |Buyer         |Supplier     | Yarn_Quality  |Month     |IPO    |
| Admin      | Abcd@123   |Raji Rajeswari | 8 seconds    |  Anil kumar |   cotton      | Jun/2024 |  IPO1 |

@Yarn_Summary_Report
Scenario Outline: Verify the Export button functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the Yarn Summary Report under the T&A dropdown
Then the Yarn Summary Report Screen is displayed or not
And Click on the Excel Export button
Examples:
| username   | password   |
| Admin      | Abcd@123   |


@Yarn_Summary_Report
Scenario Outline: Verify the With Select All Column filter functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the Yarn Summary Report under the T&A dropdown
Then the Yarn Summary Report Screen is displayed or not
And Click on the Columns Dropdown
And Select the Select All Option in the column dropdown
And Click on the Ok button in the Column dropdown 
Then Verify the filter related data is displayed in the grid or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |


@Yarn_Summary_Report
Scenario Outline: Verify the Column filter Without select All the Column Options functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the Yarn Summary Report under the T&A dropdown
And Click on the Columns Dropdown
And Select the Select All Column Option in the column dropdown
And Click on the Ok button in the Column dropdown 
Then Verify the filter related data is displayed in the grid or not


Examples:
| username   | password   |
| Admin      | Abcd@123   |