@FeatureGroup_Requirement
Feature: feature to test Jiva design Buyer garment size breakup screen functionality

  @BGSB
  Scenario: To Test the Add Buyer garment size breakup functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buyer garment size breakup screen
    Then Click on Add button to add the Buyer garment size breakup details
    And Enter the mandatory fields data in Buyer garment size breakup
    And Click on Save button in create Buyer garment size breakup screen
    
    @BGSB1
  Scenario: To Test the Edit Buyer garment size breakup functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buyer garment size breakup screen
    Then Click on edit icon to update the Buyer garment size breakup details
    And change the data in edit form
    And Click on Save button in create Buyer garment size breakup screen
    
    @BGSB2
  Scenario: To Test the Delete Buyer garment size breakup functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Buyer garment size breakup screen
    Then Click on delete icon to update the Buyer garment size breakup details
    
    