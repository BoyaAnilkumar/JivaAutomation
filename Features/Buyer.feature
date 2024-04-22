@FeatureGroup_Requirement
Feature: feature to test Jiva design Buyer screen functionality

  @TestBuyer1
  Scenario: To Test the Buyer screen
	 	When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the buyer screen
    
    Then Click on the Add button above the grid
    And Click on the save button
    And Check validation msg Placeholder and enter Buyer name
    And Check validation message placeholder and select the country name
    And Select the Buying house name
    And Select commission type
    And Enter the commission
    Then Click on the save
    
    Then Update the buyer record by clicking on the edit icon
    Then Search result by using search box functionality

    And check the sorting functionality of the table grid
    
    Then Buyer Name filter search
    Then Buying House Name filter search
    Then Country filter search
    Then Commission Type filter search

    And check the sorting functionality of the table grid
    
    Then Buyer Name filter search
    Then Buying House Name filter search
    Then Country filter search
    Then Commission Type filter search