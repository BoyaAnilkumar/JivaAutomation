@FeatureGroup
Feature: feature to test Jiva design Sweater View Yarn Sheet Working screen functionality

@SW_View_Yarn_Working
Scenario Outline: Validate user click on the Sweater View Yarn Sheet Working screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Reports dropdown
And Click on the View Yarn Sheet Working Screen Screen
Examples:
| username   | password   |
| ravi       | Abcd@123   |

@SW_View_Yarn_Working
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Reports dropdown
And Click on the View Yarn Sheet Working Screen Screen
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select "<Season>" in the Filter option page
And Select the status "<status>" in filter Option page
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Examples: 
|Buyer             |     Season     | status                    | IPO              | username   | password   |
|Test buyer        |     Fall       |    Yarn Sheet Completed   |  IPO2606         |ravi        | Abcd@123   |

@SW_View_Yarn_Working
Scenario Outline: Check whether the Information bar Selected IPO details
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Reports dropdown
And Click on the View Yarn Sheet Working Screen Screen
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then the selected style should be displayed
And the selected IPO name should be displayed
And the buyer style should be displayed correctly
And the PO quantity should be displayed
And the IPO quantity should be displayed
And the date submitted data should be displayed

Examples:
|  IPO       |username    | password   |
|  IPO2606   |ravi        | Abcd@123   |


@SW_View_Yarn_Working
Scenario Outline: Verifying the Displaying Yarn details data in Grid
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Reports dropdown
And Click on the View Yarn Sheet Working Screen Screen
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Verify the Quantity Requirements Grid and Yarn details are displayed in the grid or not
And Click on the Expansion the Yarn details are displayed or not
And Verify the Yarn Liability Details are displayed in the grid or not
And Verify the Mu working grid is displayed with yarn process details or not


Examples:
|  IPO       |username    | password   |
|  IPO2606   |ravi        | Abcd@123   |


@SW_View_Yarn_Working
Scenario Outline: Verifying the View for Print button functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Reports dropdown
And Click on the View Yarn Sheet Working Screen Screen
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the View For Print Button
And Verify the IPO details are displayed or not
And Verify the Quantity Requirements Grid and Yarn details are displayed in the grid or not
And Verify the Yarn Liability Details are displayed in the grid or not
And Verify the Mu working grid is displayed with yarn process details or not
And CLick on the Print button
Examples:
|  IPO       |username    | password   |
|  IPO2606   |ravi        | Abcd@123   |
