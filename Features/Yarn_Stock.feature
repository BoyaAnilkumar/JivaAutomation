@FeatureGroup
Feature: feature to test Jiva design Yarn Stock screen functionality

@Yarn_Stock
Scenario Outline: Validate user click on the Yarn Stock screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Stock under the Reports dropdown
Then The Yarn Stock Screen is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Yarn_Stock
Scenario Outline: Verify the Search keyword, Sorting and Grid data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Stock under the Reports dropdown
And Verify the Search keyword functionality
And Verify the grid header section names are displayed or not
Then Verify the Sorting functionality is working or not
And Verify the Stock data is displayed in the grid or not
And Click on the Expansion icon the expansion grid is displayed or not


Examples:
| username   | password   |Merchant       |   IPO        |
| Admin      | Abcd@123   |Raji Rajeswari |  IPO2606     |


