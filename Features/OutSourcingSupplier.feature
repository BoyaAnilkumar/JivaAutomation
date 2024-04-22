@FeatureGroup_Requirement
Feature: feature to test Jiva design Out Sourcing Supplier screen functionality

  @OutSourcingSupplier
  Scenario: To Test the Add Out Sourcing Supplier functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Out Sourcing Supplier screen
    Then Click on Add button to add the Out Sourcing Supplier details
    And Enter the mandatory fields data in Out Sourcing Supplier
    And Click on Save button in create Out Sourcing Supplier screen

  @OutSourcingSupplier1
  Scenario: To Test the update Out Sourcing Supplier functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Out Sourcing Supplier screen
    Then Click on Edit icon to update the Out Sourcing Supplier details
    And Click on Save button in create Out Sourcing Supplier screen
    
    @OutSourcingSupplier2
  Scenario: To Test the delete Out Sourcing Supplier functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Out Sourcing Supplier screen
    Then Click on delete icon to update the Out Sourcing Supplier details
    
