@FeatureGroup
Feature: feature to test Jiva design Sweater Po for Stock screen functionality

@SW_Po_For_Stock
Scenario Outline: Validate user click on the Sweater PO For Stock screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the PO For Stock Screen 
And The PO For Stock Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@SW_Po_For_Stock
Scenario Outline: Verify the Filter functionality in the filter expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the PO For Stock Screen 
And User click on the Style Expansion
And Select the "<Supplier>" in Filters page
Then Select the Buyer "<Buyer>" in the Filters page
And Select the "<yarn_Quality>" in filters page
And Enter the "<Style_name>" in Search By Style
And click on the Apply button 
And the Selected Style records are displayed in the grid or not

Examples: 
|Buyer             |     Supplier     | Buyer         | Style           | username    | password   |yarn_Quality  |Style_name  |
|8 Seconds         |     Anil         |   8 seconds   |  Style2270      |Admin        | Abcd@123   |cotton        |Style1209   |

@SW_Po_For_Stock
Scenario Outline: Verify the Add Stock PO functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the PO For Stock Screen
And Click on the Add Data Entry button
And The Create PO For Stock Screen is displayed or not
And Select the "<Type>" of Order in the Create PO For Stock Screen
And Check the Current date is displayed in the PO Date field or not
And The PO number is prepopulated or not
And Select the Buyer in the Create PO For Stock screen
And Enter the data in the Style field
And Search the "<Deliver>" and Select the Deliver in dropdown list
And The Deliver Address is prepopulated or not
Then The Deliver GSTIN number is prepopulated or not
And Search the "<Supplier>" and Select the Supplier in dropdown list
And The Supplier Address is prepopulated or not
Then The Supplier GSTIN number is prepopulated or not
And Payment Terms are prepopulated or not
And The Delivery Terms are prepopulated or not
Given Enter the data in the Lead Time"<Days>" field
And Select the Yarn"<Process>"
And Select the "<YarnQuality>" in the yarn section
And Select the content"<Content>"
Then Select the Count
And Select the "<Color>" color in the Yarn details section
And Enter the data in Qty Allowed field 
And User Select the Currency type
And Enter the data in "<Rate>" field in the Create PO for Stock 
And Select the UOM in the yarn PO
When Enter the data in the L Short If Any
And Enter the data in the Addl Information 1
And Enter the data in the Addl Information 2
And Select the Due on Date
And Enter the data in the Quantity field
And Select the Sample Check box
And the Rate Column data is displayed or not
And The Amount is displayed or not
And The Quantity field data is prepopulated or not
And Enter the data in the "<Residual>" Shrinkage field
And Enter the data in the Process Loss field
And Click on the Save Button
And The Save validation message is displayed or not

Examples:
| username   | password   |YarnQuality   |Content      |Type           |Deliver      |Supplier    |  Days  |Process   | Color   |Rate|Residual  |
| Admin      | Abcd@123   |Cotton        |100% cotton  | Job Work Order|jiva         |Anil        |  3     |Dyeing    |Almond   |2   | 4        |
#| Admin      | Abcd@123   |Cotton        |100% cotton  | Purchase Order|jiva         |Anil        |  3     | Greige   |Almond   |2   | 4        |

@SW_Po_For_Stock
Scenario Outline: Verify the Revised PO for Stock functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the PO For Stock Screen
And The Revised PO For Stock Screen is displayed or not
And The PO Details are prepopulated or not
And Deliver Details are prepopulated or not
And Supplier details are prepopulated or not
And The Yarn details are prepopulated or not
And The Quantity details are prepopulated or not
And Stock details are prepopulated or not
And Edit the Deliver details 
And Enter the data in the Revised Quantity field
And Click on the Save Button
And The Save Revised PO validation message is displayed or not



Examples:
| username   | password   |Deliver      |Supplier    |
| Admin      | Abcd@123   |jiva         |Anil        |

@SW_Po_For_Stock
Scenario Outline: Verify the Concel PO functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the PO For Stock Screen
And Click on the Cancel Po Icon
And The Save Cancel PO validation message is displayed or not

Examples:
| username   | password   |Deliver      |Supplier    |
| Admin      | Abcd@123   |jiva         |Anil        |


