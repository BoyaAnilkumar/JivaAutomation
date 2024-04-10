@FeatureGroup_Requirement
Feature: feature to test Jiva design Supplier screen functionality

  @Supplier
  Scenario: To Test the Add Supplier functionality
	 	Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Supplier screen
    Then Click on Add button to add the supplier details
    And Enter the mandatory fields data
    And Click on Save button in create supplier screen
    And Verify the success toaster is displaying or not
    
    @Supplier1
    Scenario: To Test the validation messages
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on the Supplier screen
    Then Click on Add button to add the supplier details
    And Click on Save button in create supplier screen
    Then Verify the Validation messsages for mandatory fields