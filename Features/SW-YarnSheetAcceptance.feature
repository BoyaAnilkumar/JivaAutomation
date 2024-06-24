@YarnSheetAcceptance
Feature: feature to test Jiva design Yarn Sheet Acceptance screen functionality

@YarnSheetAcceptance0
Scenario Outline: Validate user click on the Yarn Sheet Accepting screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on Data Entry in yarn sourcing
Then Click on the Yarn Sheet Acceptance
And Click on style expansion in yarn sheet acceptance

Examples:
| username   | password   |
| Ravi  	   | Abcd@123   | 

@Yarnsheetacceptance1
Scenario Outline: Apply filters in yarn sheet acceptance by clicking on filter icon
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on Data Entry in yarn sourcing
Then Click on the Yarn Sheet Acceptance
And Click on style expansion in yarn sheet acceptance
And Click on the Filter Icon in Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select "<Season>" in the Filter option page
And Enter the IPO "<SearchByIPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List


Examples:
| username   | password   |Buyer       |     Season     |  SearchByIPO      |
| Ravi  	   | Abcd@123  	|Test buyer  |     Fall       |   IPO1806        |
 
@Yarnsheetacceptance2
Scenario Outline: Navigate to Yarn Sheet Print view on selecting the IPO
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on Data Entry in yarn sourcing
Then Click on the Yarn Sheet Acceptance
And Click on style expansion in yarn sheet acceptance
And Click on the Filter Icon in Style Expansion
And Enter the IPO "<SearchByIPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Verify the IPO details displaying on the screen
And Verify the grid details in page
And Click on View for Print button
Then click on cancel button in print view

Examples:
| SearchByIPO| username   | password   |
|IPO1806     | Ravi  	   | Abcd@123  	|
