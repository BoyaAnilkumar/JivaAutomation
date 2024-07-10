@FeatureGroup
Feature: feature to test Jiva design Trim Sheet Audit screen functionality

@Trim_Sheet_Audit
Scenario Outline: Validate user click on the Trim Sheet Audit screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then Click on the Trim Sheet Audit under the Audit module
Examples:
| username   | password   |
| Admin      | Abcd@123   |

@Trim_Sheet_Audit
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then Click on the Trim Sheet Audit under the Audit module
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select "<Season>" in the Filter option page
And Select the "<Status>" in the Filter option page
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Examples: 
|Buyer             |     Season     | Status                | IPO             | username    | password   |
|Amazon (Core)     |     Summer     |    Pending Approval   |  IPO22          |Admin        | Abcd@123   |

@Trim_Sheet_Audit
Scenario Outline: Check whether the Information bar Selected IPO details
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then Click on the Trim Sheet Audit under the Audit module
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Verify the Selected IPO details are displayed in the Information bar or not

Examples:
|  IPO       |username    | password   |
|  IPO22     |Admin       | Abcd@123   |

@Trim_Sheet_Audit
Scenario Outline: Verifying the Display data in the Grid
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then Click on the Trim Sheet Audit under the Audit module
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Verify the Costing budget expansion grid header section names are displayed or not
And Costing budget details are displayed in the Costing budget Expansion or not
Then The Upcharge to buyer data is displayed in the grid
And The Final Costing Budget data is displayed in the grid
And The 3 percent saving data is displayed in the grid
Then Verify the Production budget expansion grid header section names are displayed or not
And Verify the Trim Production budget expansion grid data is displayed or not
Examples:
|  IPO       |username     | password   |
|  IPO22     |Admin        | Abcd@123   |

@Trim_Sheet_Audit
Scenario Outline: Verify the Approve button functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on the Woven Module
Then Click on the Trim Sheet Audit under the Audit module
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
#And Click on the Approve button

Examples:
|  IPO       |username     | password   |
|  IPO22     |Admin        | Abcd@123   |

@Trim_Sheet_Audit
Scenario Outline: Verify the Reject button functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
 And Click on the Woven Module
Then Click on the Trim Sheet Audit under the Audit module
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<IPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
#And Click on the Reject button

Examples:
|  IPO       |username     | password   |
|  IPO22     |Admin        | Abcd@123   |

