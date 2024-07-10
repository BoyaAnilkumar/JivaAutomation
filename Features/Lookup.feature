@FeatureGroup_Requirement
Feature: feature to test Jiva design LookUp screen functionality

  @Lookup
  Scenario: To Test the LookUp screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Lookup screen
    And Click on Add button in Lookup Screen
    
    @Lookup1
    Scenario: To validate the created lookup in the table grid
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Lookup screen
    And Click on Add button to create the Lookup
    And Select the category from dropdown list
    Then Enter the Name and Remarks
    And verify the active checkbox is displaying as true bydefault
    And Click on save button
    Then Search with keyword in search field to validate the created lookup
    
    @Lookup2
    Scenario: To verify that validations are displaying for the mandatory fields are not
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Lookup screen
     And Click on Add button to create the Lookup
     And Click on save button
     Then verify the validation text for the mandatory fields
    
    @Lookup3
    Scenario: To verify that sorting functionality in grid table
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Lookup screen
    Then click on sorting icon for each column
    And click on pagination to view remaining pages