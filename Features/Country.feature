@FeatureGroup_Requirement
Feature: feature to test Jiva design Country screen functionality

  @Country
  Scenario: Add the country by navigating to country screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Master Module
    And click on the Country screen
    And Click on the Country Add button
    Given Enter the data in Country name field
    And Enter the data in Country code field
    Then CLick on the Currency type field
    And Select the Currency type
    Given Enter the data in Conversion Rate field
    And Select the Active Check box
    And click on save button in country add form

  @Country1
  Scenario: verify the validation of country screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Master Module
    And click on the Country screen
    And Click on the Country Add button
    Then click on save button in country add form
    And verify the validation msgs are displaying for the mandatory fields
    
    

    
	@Country2
	Scenario: verify the alert message clicked on save button without data in mandatory fields    
    And Verify the Alert msg
    And Verify the successfull msg
    And Click on the Edit Icon in country table grid
    Then Update the Country name
    And Update the Country code
    And Update the Select Country
    And Update the Conversion Rate
    And click on the Update button
    And Verify the Update msg
    And Click on the update form Cancel button
    And Click on the Delete Icon in country
    And Verify the Delete msg
    And Search the Country name
