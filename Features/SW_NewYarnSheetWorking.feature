@NewYarnSheetWorking
Feature: feature to test Jiva design New Yarn Sheet screen functionality

@NewYarnSheetWorking0
Scenario Outline: Navigate to New Yarn sheet working and submit mu working details
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on Data Entry in yarn sourcing
Then Click on the New yarn sheet working
And Click on style expansion in New yarn sheet working
And Click on the Filter Icon in Style Expansion
And Enter the IPO "<SearchByIPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Verify the IPO details
And Click on Edit button in MU Working grid
And Add data for the IPO MU Working details
Then click on submit button in working form
Examples:
| SearchByIPO| username   | password   |
|IPO1806     | Ravi  	   | Abcd@123  	|


@NewYarnSheetWorking1
Scenario Outline: Navigate to New Yarn sheet working and verify the mu working details
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on Data Entry in yarn sourcing
Then Click on the New yarn sheet working
And Click on style expansion in New yarn sheet working
And Click on the Filter Icon in Style Expansion
And Enter the IPO "<SearchByIPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Verify the IPO details
And Verify the Data is displaying in MU Working grid

Examples:
| SearchByIPO| username   | password   |
|IPO1806     | Ravi  	   | Abcd@123  	|


@NewYarnSheetWorking2
Scenario Outline: Navigate to New Yarn sheet working and submit mu working details for sales process
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on Data Entry in yarn sourcing
Then Click on the New yarn sheet working
And Click on style expansion in New yarn sheet working
And Click on the Filter Icon in Style Expansion
And Enter the IPO "<SearchByIPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Verify the IPO details
And Click on Edit icon and submit the sale process

Examples:
| SearchByIPO| username   | password   |
|IPO1806     | Ravi  	   | Abcd@123  	|

@NewYarnSheetWorking3
Scenario Outline: Navigate to New Yarn Sheet Working and Submit to Audit Team
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on Data Entry in yarn sourcing
Then Click on the New yarn sheet working
And Click on style expansion in New yarn sheet working
And Click on the Filter Icon in Style Expansion
And Enter the IPO "<SearchByIPO>" in Search By IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Verify the IPO details
And Click on Submit to Audit Team button

Examples: 
| SearchByIPO| username   | password   |
|IPO1806     | Ravi  	   | Abcd@123  	|