@FeatureGroup
Feature: feature to test Jiva design Bulk Checking screen functionality

@Bulk_Checking
Scenario Outline: Validate user click on the Bulk Checking screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
Then Click on Woven Module
Then Click on the Fabric Store Module
And Click on the Fabric Bulk Checking under the Data Entry dropdown
Then The Bulk Checking Screen is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Bulk_Checking
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
Then Click on Woven Module
Then Click on the Fabric Store Module
And Click on the Fabric Bulk Checking under the Data Entry dropdown
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
| Admin      | Abcd@123   |Bhagat B       |  Tex Yarn   |   6591  	     |01012024      |31072024    |

@Bulk_Checking
Scenario Outline: Verify the Sorting and Grid data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
Then Click on Woven Module
Then Click on the Fabric Store Module
And Click on the Fabric Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
And Verify the grid header section names are displayed or not
Then Verify the Sorting functionality is working or not
And Verify the IPO data is displayed in the grid or not

Examples:
| username   | password   |   IPO        |
| Admin      | Abcd@123   | 6591         |

@Bulk_Checking
Scenario Outline: Verify the Add Lot Checking data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
Then Click on Woven Module
Then Click on the Fabric Store Module
And Click on the Fabric Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add Lot Checking Icon and enter the data in all fields
#And Click on the Save Button in the Bulk Checking screen


Examples:
| username   | password   |   IPO        |
| Admin      | Abcd@123   | 6591         |

@Bulk_Checking
Scenario Outline: Verify the Add Quality Checking data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
Then Click on Woven Module
Then Click on the Fabric Store Module
And Click on the Fabric Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add Quality Checking Icon 
Then the Add Quality Checking data form is displayed or not
Then Verify the IPO, Date of initial recd, PO Number, and Qty Received data is displayed or not
And The Fabric Details are displayed or not
And Select the Thaan name
Then Enter the data in Before Wash field
And Enter the data in After Wash field
Then Enter the data in L Shrinkage field
And Enter the data in W Shrinkage field
And Enter the data in the Approve or Reject Date field
And Enter the data in the Qty field
#And Click on the Save Button in the Bulk Checking screen


Examples:
| username   | password   |   IPO        |
| Admin      | Abcd@123   | 6593         |


@Bulk_Checking
Scenario Outline: Verify the Add Bulk Checking data functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
Then Click on Woven Module
Then Click on the Fabric Store Module
And Click on the Fabric Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add bulk Checking data Icon in the Actions Column
And Verify the Add Bulk Checking Data page is displayed or not
Then Verify the Fabric description, PO details, Total Approved Qty, and Quantity Received data is displayed or not
And Select the Checker name
And Enter the Checking Related Issues
And Verify the by default current date is displayed in the date field or not
And Enter the data in the Qty Checked field
And Enter the data in the Qty Approved field
When the Can Cut Section is displayed and Enter the Can Cut data
#And Click on the Save Button in the Bulk Checking screen


Examples:
| username   | password   |   IPO        |
| Admin      | Abcd@123   | 6591         |

@Bulk_Checking1
Scenario Outline: Verify the Expansion grids and Update functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
Then Click on Woven Module
Then Click on the Fabric Store Module
And Click on the Fabric Bulk Checking under the Data Entry dropdown
And User click on the filter Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<IPO>" in the Search by IPO or PO field
And click on the Apply button 
And Select the IPO in the Styles List
When Click on the Expansion icon the Lot Checking Data, Quality Checking Data, and Bulk Checking Data grids are displayed or not
And Update the Lot Checking Data
And CLick on the Update button

Examples:
| username   | password   |Merchant       |   IPO        |
| Admin      | Abcd@123   |Raji Rajeswari |  6529R       |





