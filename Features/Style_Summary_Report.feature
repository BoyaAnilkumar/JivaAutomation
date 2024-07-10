@FeatureGroup
Feature: feature to test Jiva design Merchant Style Summary Report screen functionality

@Style_Summary_Report
Scenario Outline: Validate user click on the Merchant Style Summary Report screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then click on the Merchandising Module
And Click on Report in merchandising module
And Click on the Merchandising Style Summary Report under the T and A dropdown
Then the Style Summary Report Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Style_Summary_Report
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then click on the Merchandising Module
And Click on Report in merchandising module
And Click on the Merchandising Style Summary Report under the T and A dropdown
And User click on the filter Expansion
And Select the "<Merchant>" in the Filters page
And Select the Buyer in the "<Buyer>" field
And Select the Supplier in the "<Supplier>" field
Then User select the fabric"<Fabric_Quality>" in the filter page
And Select the Month in the "<Month>" field
And Select the "<IPO>" in the Search by IPO field
And click on the Apply button 

Examples:
| username   | password   |Merchant       |Buyer         |Supplier       | Fabric_Quality|Month     |IPO    |
| Admin      | Abcd@123   |Lavanya K      | 8 seconds    | Anjani fabric |   Double cloth| Jun/2024 |  6571 |

@Style_Summary_Report
Scenario Outline: Verify the Export button functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then click on the Merchandising Module
And Click on Report in merchandising module
And Click on the Merchandising Style Summary Report under the T and A dropdown
And Click on the Excel Export button
Examples:
| username   | password   |
| Admin      | Abcd@123   |


@Style_Summary_Report
Scenario Outline: Verify the Column filter Without select the Column Options functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then click on the Merchandising Module
And Click on Report in merchandising module
And Click on the Merchandising Style Summary Report under the T and A dropdown
And Click on the Columns Dropdown
And Select the Select All Option in the column dropdown
And Click on the Ok button in the Column dropdown 
Then Verify the filter related data is displayed in the grid or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Style_Summary_Report
Scenario Outline: Verify the Column filter With select All the Column Options functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then click on the Merchandising Module
And Click on Report in merchandising module
And Click on the Merchandising Style Summary Report under the T and A dropdown
And Click on the Columns Dropdown
And Select the Select All Column Option in the column dropdown
And Click on the Ok button in the Column dropdown 
Then Verify the filter related data is displayed in the grid or not


Examples:
| username   | password   |
| Admin      | Abcd@123   |



