@BuyerMasterscreen
Feature: feature to test Jiva design Buyer screen functionality

  Background: 
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the buyer screen

  @AddBuyer
  Scenario: Add the Buyer
    Then Click on the Add button above the grid
    Given user enters buyer name
    And User selects the country name
    And Select the Buying house name
    And Select commission type
    And Enter the commission
    Then Click on the save

  @UpdateBuyer
  Scenario: Update the existing buyer
    Then Update the buyer record by clicking on the edit icon
    Then Search result by using search box functionality

  @GridFilter
  Scenario: Apply filters in grid header for each column and Sorting functionality
    And check the sorting functionality of the table grid
    Then Buyer Name filter search
    Then Buying House Name filter search
    Then Country filter search
    Then Commission Type filter search

  @Checkvalidations
  Scenario: Check the validation when clicked on save button without data
    Then Click on the Add button above the grid
    And Click on the save button
    And Check validation msg Placeholder and enter Buyer name
    And Check validation message placeholder and select the country name
