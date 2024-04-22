@FeatureGroup_Requirement
Feature: feature to test Jiva design Trims and Accessories screen functionality

  @TrimsAndAccessories
  Scenario: To Test the Trims and Accessories screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Trims and Accessories screen
    And Click on Add button in Trims and Accessories Screen

  @TrimsAndAccessories1
  Scenario: To validate the created Trims and Accessories in the table grid
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Trims and Accessories screen
    And Click on Add button in Trims and Accessories Screen
    And Click on Category dropdown and select the option
    Then Enter the Name
    And Select the UOM from dropdown list
    And Click on save button
    


  @TrimsAndAccessories2
  Scenario: To validate the created Trims and Accessories in the table grid
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Trims and Accessories screen
    And Click on Add button in Trims and Accessories Screen
    And Click on Category dropdown and select the option
    Then Enter the Name
    And Select the UOM from dropdown list
    And Click on save button
    Then Search with keyword in search field to validate the created Trims and Accessories
    
    
  @TrimsAndAccessories3
  Scenario: To verify that validations are displaying for the mandatory fields are not
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Trims and Accessories screen
    And Click on Add button in Trims and Accessories Screen
    And Click on save button
    Then verify the validation text for the mandatory fields in Trims and Accessories
    And click on delete and check the delete functionality

  @TrimsAndAccessories4
  Scenario: To verify that sorting functionality in grid table
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Trims and Accessories screen
    Then click on sorting icon for each column
    And click on pagination to view remaining pages
    And Click on edit icon to update the Trim and Accessories
