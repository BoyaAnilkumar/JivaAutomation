@FeatureGroup
Feature: feature to test Jiva design Sweater Yarn T and A Dues Calender Reports screen functionality

@SW_Yarn_T_and_A_Dues_calender1
Scenario Outline: Validate user click on the Yarn T and A Dues Calender Reports screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the T and A dues Calender under the T&A dropdown
Then the Yarn T and A Dues Calender Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@SW_Yarn_T_and_A_Dues_calender
Scenario Outline: Verify the Download dues calender functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Reports dropdown
And Click on the T and A dues Calender under the T&A dropdown
And Select the Sr Merchant "<Merchant>"
And User Select the Supplier name in the "<Supplier>" field
When I enter the From date and To Date
And Click on the Download button

Examples:
| username   | password   |Merchant      |Supplier    |
| Admin      | Abcd@123   |Raji Rajeswari|Anil kumar  |





