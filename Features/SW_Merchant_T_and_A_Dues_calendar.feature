@FeatureGroup
Feature: feature to test Jiva design Sweater Merchant T and A Dues Calender Reports screen functionality

@Merchant_T_and_A_Dues_calender
Scenario Outline: Validate user click on the Merchant T and A Dues Calender Reports screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Merchandising Reports dropdown
And Click on the T and A dues Calender under the T and A dropdown
Then the Merchandising T and A Dues Calender Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Merchant_T_and_A_Dues_calender
Scenario Outline: Verify the Download dues calender functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Merchandising Reports dropdown
And Click on the T and A dues Calender under the T and A dropdown
And Select the Sr Merchant "<Merchant>"
When I enter the From date and To Date
And Click on the Download button

Examples:
| username   | password   |Merchant      |
| Admin      | Abcd@123   |Raji Rajeswari|





