@FeatureGroup
Feature: Feature to test Jiva design Fabric T and A Data Entry screen functionality

  @FabricTandAdataEntry
  Scenario: To Test the user able to navigate to Fabric T and A Data entry screen
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Data Entry in fabric sourcing module
    And Click on the T and A Data Entry Screen

  @FabricTandAdataEntryforGreigeProcess
  Scenario: To Test the user able to navigate to Fabric T and A Data entry screen
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Data Entry in fabric sourcing module
    And Click on the T and A Data Entry Screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    #And Click on the Buyer Field
    #And click on vendor field
    #And Select the Season
    And Search and select the IPO
    And Click on the Apply button
    #And Click on the Reset button
    And Select the IPO and Style
    When IPO details are displaying after selecting the IPO
    And verify the search by process functionality is working or not
    And click on add button to submit the T and A
    Given Enter Submission date for quality Test
    Given Remarks for Quality Test
    Given Enter Initial Bulk Submission and Approval dates
    Given Remarks for Initial Bulk Test
    Given Enter Bulk Lot In House dates
    Given Remarks for Bulk Test
    When click on the save button

  @FabricTandAdataEntryrevised
  Scenario: To Test the griege process with existing data and enter new data
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Data Entry in fabric sourcing module
    And Click on the T and A Data Entry Screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    And Search and select the IPO
    And Click on the Apply button
    And Select the IPO and Style
		When click on add button for griege process
		And Click on Add button to insert the another test for quality
		Given Enter dates for second test and change the first test
		And Click on Add button to insert the second test for Initial Bulk
		Given Enter dates for Initial Bulk second test and change the first test
		And Click on Add button to insert the second test for bulk
		Given Enter dates and change the first tests data
		#When click on the save button
		
		