@FeatureGroup
Feature: feature to test Jiva design Sweater Merchandising T and A Dues Reports screen functionality

@SW_T_and_A_Dues
Scenario Outline: Validate user click on the Merchandising T and A Dues Reports screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Merchandising Reports dropdown
And Click on the T and A dues under the T and A dropdown
Then the Merchandising T and A Dues Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |


@SW_T_and_A_Dues
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Merchandising Reports dropdown
And Click on the T and A dues under the T and A dropdown
And User click on the Style Expansion
And Select the "<Merchant>" in the Filters page
Then Select the Buyer "<Buyer>" in the Filters page
And Select the "<Season>" in the filters page
And Select the "<Month>" in the filter page
And click on the Apply button 

Examples:
| username   | password   |Merchant       |Season  |Month     |Buyer  |
| Admin      | Abcd@123   |Raji Rajeswari | Fall   | Aug/2024 |8 seconds|


@SW_T_and_A_Dues
Scenario Outline: Verify the Overdue expansion functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Merchandising Reports dropdown
And Click on the T and A dues under the T and A dropdown
And Click on the Overdue expansion
Then Verify the Merchandising Dues Tab and Yarn Dues Tabs are displayed or not
And Verify the Merchandising Submissions Due and Merchandising Approvals Due grids are displayed or not
And Verify the Merchandising Submissions Due grid data is displayed or not
And Verify the Merchandising Approvals Due grid data is displayed or not
Then Click on the Yarn Dues Tab
And Verify the Submissions Due From Yarn Team grid data is displayed or not
And Verify the Approvals Due From Yarn Team grid data is displayed or not
And Verify the Overdue section sorting functionality
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@SW_T_and_A_Dues
Scenario Outline: Verify the Today expansion functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Merchandising Reports dropdown
And Click on the T and A dues under the T and A dropdown
And Click on the Today expansion
And Verify the Today Merchandising Submissions Due and Merchandising Approvals Due grids are displayed or not
And Verify the Today Merchandising Submissions Due grid data is displayed or not
And Verify the Today Merchandising Approvals Due grid data is displayed or not
Then Click on the Today Yarn Dues Tab
And Verify the Today Submissions Due From Yarn Team grid data is displayed or not
And Verify the Today Approvals Due From Yarn Team grid data is displayed or not


Examples:
| username   | password   |
| Admin      | Abcd@123   |


@SW_T_and_A_Dues
Scenario Outline: Verify the Upcoming expansion functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Merchandising Reports dropdown
And Click on the T and A dues under the T and A dropdown
And Click on the Upcoming expansion
And Verify the Upcoming Merchandising Submissions Due and Merchandising Approvals Due grids are displayed or not
And Verify the Upcoming Merchandising Submissions Due grid data is displayed or not
And Verify the Upcoming Merchandising Approvals Due grid data is displayed or not
Then Click on the Upcoming Yarn Dues Tab
And Verify the Upcoming Submissions Due From Yarn Team grid data is displayed or not
And Verify the Upcoming Approvals Due From Yarn Team grid data is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |


