@FeatureGroup
Feature: feature to test Jiva design Sweater Create Po for IPO screen functionality

@SW_Create_Po_For_IPO
Scenario Outline: Validate user click on the Sweater Create PO For IPO screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the Create PO For IPO Screen 
And The Create PO For IPO Screen is displayed or not
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@SW_Create_Po_For_IPO
Scenario Outline: Verify the Add PO For Yarn functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the Create PO For IPO Screen 
And Select the "<Type>" of Order
And Check the Current date is displayed in the PO Date field or not
And The PO number is prepopulated or not
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
And Select the "<YarnQuality>" 
And Select the content"<Content>"
Then Select the Count
And Select the "<Color>" in the Yarn details section
And Enter the data in Qty Allowed field 
And User Select the Currency type
Given Enter the data in the Rate field
And Select the UOM in the yarn PO
When Enter the data in the L Short If Any
And Enter the data in the Addl Information 1
And Enter the data in the Addl Information 2
And Select the IPO in the IPO column
And Click on the Add IPO button
Then Select the IPO in the IPO Column
And Select the Due on Date
And The Quantity field data is prepopulated or not
And The Qty Use From Stock field data is prepopulated or not
And The Qty To Be Bought field data is prepopulated or not
And the Rate Column data is displayed or not
And The Amount is displayed or not
When Select the Qty Required is prepopulated or not
And the Qty Available In Stock field data is displayed or not
And The Residual Shrinkage is prepopulated or not
And The Process Loss is prepopulated or not
And Click on the Save Button


Examples:
| username   | password   |YarnQuality   |Content      |Type           |Deliver      |Supplier    |  Days  |Process   | Color   |
| Admin      | Abcd@123   |Cotton        |100% cotton  | Job Work Order|jiva         |Anil        |  3     |Dyeing    |Almond   |
| Admin      | Abcd@123   |Cotton        |100% cotton  |Purchase Order |jiva         |Anil        |  3     | Sale     |Almond   |

@SW_Create_Po_For_IPO
Scenario Outline: Verify the Reset functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Yarn Sourcing Data Entry dropdown
And Click on the Generate PO dropdown
And Click on the Create PO For IPO Screen 
And Select the "<Type>" of Order
And Check the Current date is displayed in the PO Date field or not
And The PO number is prepopulated or not
And Search the "<Deliver>" and Select the Deliver in dropdown list
And The Deliver Address is prepopulated or not
Then The Deliver GSTIN number is prepopulated or not
And Search the "<Supplier>" and Select the Supplier in dropdown list
And Click on the Reset button the entered data is cleared

Examples:
| username   | password   |YarnQuality   |Content      |Type           |Deliver      |Supplier    |  Days  |Process   | Color   |
| Admin      | Abcd@123   |Cotton        |100% cotton  | Job Work Order|jiva         |Anil        |  3     |Dyeing    |Almond   |
