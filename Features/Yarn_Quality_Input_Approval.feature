@FeatureGroup
Feature: feature to test Jiva design Yarn Quality Input Approval screen functionality

@Yarn_Quality_Input_Approval
Scenario Outline: Validate user click on the Yarn Quality Input Approval screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Quality Input Approval under the Data Entry dropdown
Then The Yarn Quality Input Approval Screen is displayed or not

Examples:
| username   | password   |
| Ravi       | Abcd@123   |

@Yarn_Quality_Input_Approval
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Quality Input Approval under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<Merchant>" in the Filters page
And Select the Buyer in the "<Buyer>" field
And Select the Supplier in the "<Supplier>" field
Then User select the "<Yarn_Quality>" in the filter page
And Select the Month in the "<Month>" field
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 
And Select the IPO in the Styles List

Examples:
| username   | password   |Merchant       |Buyer         |Supplier     | Yarn_Quality  |Month     |IPO           |
| Ravi       | Abcd@123   |Raji Rajeswari | Test buyer   |  Anil kumar |   cotton      | Jun/2024 |  ipo-3	     |

@Yarn_Quality_Input_Approval
Scenario Outline: Verify the Sorting and Grid data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Quality Input Approval under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 
And Select the IPO in the Styles List
And Verify the grid header section names are displayed or not
Then Verify the Sorting functionality is working or not
And Verify the IPO data is displayed in the grid or not


Examples:
| username   | password   |Merchant       |   IPO        |
| Ravi       | Abcd@123   |Raji Rajeswari |   ipo-3	     |


@Yarn_Quality_Input_Approval
Scenario Outline: Verify the Approve functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Quality Input Approval under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Expansion icon
Then The Yarn Quality Shrinkage grid is displayed or not
And The Expansion grid header section names are displayed or not
And the Expanison grid data is displayed or not
And Click on the Approve button in the expansion grid
And the Approve Yarn Quality Input Approval popup is displayed or not
And Enter the data in the Solution field
#And Click on the Submit button in the Approve Yarn Quality Input Approval popup

Examples:
| username   | password   | IPO        |
| Ravi       | Abcd@123   | ipo-3	     |


@Yarn_Quality_Input_Approval
Scenario Outline: Verify the Reject functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Quality Input Approval under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Expansion icon
And Click on the Reject button in the expansion grid
And the Reject Yarn Quality Input Approval popup is displayed or not
And Enter the Reject data in the Solution field
#And Click on the Submit button in the Reject Yarn Quality Input Approval popup

Examples:
| username   | password   | IPO        |
| Ravi       | Abcd@123   | ipo-3	     |







