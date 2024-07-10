@FeatureGroup
Feature: feature to test Jiva design Yarn Bulk Checking screen functionality

@Yarn_Bulk_Checking
Scenario Outline: Validate user click on the Yarn Bulk Checking screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Bulk Checking under the Data Entry dropdown
Then The Yarn Bulk Checking Screen is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Yarn_Bulk_Checking
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<Merchant>" in the Filters page
And Select the supplier name in the "<Supplier>" field
And Enter the From Date in the "<From_Date>" field
And Enter the To Date in the "<To_Date>" field
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List

Examples:
| username   | password   |Merchant       |Supplier     |   IPO          |From_Date     | To_Date    |
| Admin      | Abcd@123   |Raji Rajeswari |  Anil kumar |   ipo-3 	     |01012024      |31072024    |

@Yarn_Bulk_Checking
Scenario Outline: Verify the Sorting and Grid data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
And Verify the grid header section names are displayed or not
Then Verify the Sorting functionality is working or not
And Verify the IPO data is displayed in the grid or not

Examples:
| username   | password   |Merchant       |   IPO        |
| Admin      | Abcd@123   |Raji Rajeswari |  ipo-3       |

@Yarn_Bulk_Checking
Scenario Outline: Verify the Add Bulk Checking data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add bulk Checking data Icon in the Actions Column
And Verify the Add Bulk Checking Data page is displayed or not
Then the Yarn Description data is displayed or not
And The PO Details are displayed or not
And the Total Approved Qty value is displayed or not
And the Quantity Received value is displayed or not
Then the Bulk Checking section is displayed or not
And Verify the by default current date is displayed in the date field or not
And Enter the data in the Qty Approved field
Given enter the data in the Remarks field
When the Can Net Section is displayed and Enter the Can Net data
#And Click on the Save Button in the Add Bulk Checking Data page

Examples:
| username   | password   |Merchant       |   IPO        |
| Admin      | Abcd@123   |Raji Rajeswari |  ipo-3       |


@Yarn_Bulk_Checking
Scenario Outline: Verify the Expansion grid functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Store Module
And Click on the Yarn Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Expansion icon the bulk checking expansion grid data is displayed or not

Examples:
| username   | password   |Merchant       |   IPO        |
| Admin      | Abcd@123   |Raji Rajeswari |  	ipo-3      |
