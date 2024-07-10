@FeatureGroup
Feature: feature to test Jiva design Yarn Quality Input screen functionality

@Yarn_Quality_Input
Scenario Outline: Validate user click on the Yarn Quality Input screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Quality Input under the Data Entry dropdown
Then The Yarn Quality Input Screen is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Yarn_Quality_Input
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Quality Input under the Data Entry dropdown
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
| username   | password   |Merchant       |Buyer         |Supplier     | Yarn_Quality  |Month     |IPO             |
| Admin      | Abcd@123   |Raji Rajeswari | Test buyer   |  Anil kumar |   cotton      | Oct/2024 |  IPO2606	     |


@Yarn_Quality_Input
Scenario Outline: Verify the Sorting and Grid data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Quality Input under the Data Entry dropdown
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
| Admin      | Abcd@123   |Raji Rajeswari |  IPO2606     |

@Yarn_Quality_Input
Scenario Outline: Verify the Add functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Quality Input under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add Icon in the Actions Column
Then Verify the IPO, Date of initial recd, PO Number, and Net Weight Assigned data is displayed or not
And The Yarn Details are displayed or not
Then without enter the data in the all fieds and click on the save button validation msg is displayed or not
And Select the Checker name
Given Enter the Checking Related Issues 
Then The Shrinkage section is displayed or not
And Select the Box name
And Enter the data in the L Shrinkage field
And Enter the data in the W Shrinkage field
And Click on the Add button in the Shrikage section
#And Click on the Save button in the Shrinkage section

Examples:
| username   | password   |Merchant       |   IPO        |
| Admin      | Abcd@123   |Raji Rajeswari |  IPO2606     |
@Yarn_Quality_Input
Scenario Outline: Verify the Expansion grid functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Quality Input under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Expansion icon the expansion grid data is displayed or not

Examples:
| username   | password   |Merchant       |   IPO        |
| Admin      | Abcd@123   |Raji Rajeswari |  	ipo-3      |




