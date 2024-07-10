@FeatureGroup
Feature: feature to test Jiva design Sweater Yarn T and A Dues Reports screen functionality

@SW_Yarn_T_and_A_Dues
Scenario Outline: Validate user click on the Yarn T and A Dues Reports screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the T and A dues under the T&A dropdown
Then the Yarn T and A Dues Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |


@SW_Yarn_T_and_A_Dues
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the T and A dues under the T&A dropdown
And User click on the filter Expansion
And Select the "<Merchant>" in the Filters page
And Select the Sourcing "<Manager>" in the filters page
And Select the yarn"<Supplier>" in the filter page
And click on the Apply button 

Examples:
| username   | password   |Merchant       |Manager       |Supplier     |
| Admin      | Abcd@123   |Raji Rajeswari | Ravi Teja    |  Anil kumar |


@SW_Yarn_T_and_A_Dues
Scenario Outline: Verify the Overdue expansion functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the T and A dues under the T&A dropdown
And Click on the Overdue expansion
Then Verify the Submissions Due from yarn Team Tab and Approvals Due from Merchant Team tabs are displayed or not
And Verify the Submissions Due from yarn Team Tab grid are displayed or not
Then Click on the Approvals Due from Merchant Team Tab
And Verify the Approvals Due from Merchant Team grid data is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@SW_Yarn_T_and_A_Dues
Scenario Outline: Verify the Today expansion functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the T and A dues under the T&A dropdown
And Click on the Today expansion
Then Verify the Today Submissions Due from yarn Team Tab and Today Approvals Due from Merchant Team tabs are displayed or not
And Verify the Today Submissions Due from yarn Team Tab grid are displayed or not
Then Click on the Today Approvals Due from Merchant Team Tab
And Verify the Today Approvals Due from Merchant Team grid data is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@SW_Yarn_T_and_A_Dues
Scenario Outline: Verify the Upcoming expansion functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the T and A dues under the T&A dropdown
And Click on the Upcoming expansion
Then Verify the Upcoming Submissions Due from yarn Team Tab and Today Approvals Due from Merchant Team tabs are displayed or not
And Verify the Upcoming Submissions Due from yarn Team Tab grid are displayed or not
Then Click on the Upcoming Approvals Due from Merchant Team Tab
And Verify the Upcoming Approvals Due from Merchant Team grid data is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |


