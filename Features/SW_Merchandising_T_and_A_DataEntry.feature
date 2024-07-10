@FeatureGroup
Feature: feature to test Jiva design Sweater Merchandising T&A data entry screen functionality

@Merchandising_T_and_A_Data
Scenario Outline: Validate user click on the Merchandising T&A Data Entry screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the T and A Data entry under the Data Entry dropdown
Then The Merchandising T and A Data Entry Screen is displayed or not

Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Merchandising_T_and_A_Data
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the T and A Data entry under the Data Entry dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select "<Season>" in the Filter option page
And Select the "<Month>" in the month field
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List

Examples:
|Buyer       |     Season     |  StyleOrIPO      |Month      |
|Test buyer  |     Fall       |   IPO1206        | Jul/2024  |


@Merchandising_T_and_A_Data
Scenario Outline: Check whether the Information bar Selected IPO details
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the T and A Data entry under the Data Entry dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And the selected IPO name should be displayed
And the Buyer Style should be displayed correctly
And the Buying house data should be displayed
And the PO quantity should be displayed
And the IPO quantity should be displayed

Examples:
|  StyleOrIPO|
|   IPO1206  |


@Merchandising_T_and_A_Data1
Scenario Outline: Verify the adding data entry functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the T and A Data entry under the Data Entry dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Missy Add button in the T and A data Entry
And Click on the Petite Add button in the T and A data Entry
And Click on the Tall Add button in the T and A data Entry
And Click on the Women Add button in the T and A data Entry
#And Enter the data in the Submission date fields and Approval Date fields
#And Click on the Save button



Examples:
|  StyleOrIPO   |
|   IPO1806        |
