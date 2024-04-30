@FeatureGroup
Feature: Feature to test the Fabric Liability Details screen in Jiva Designs Application

  @FabricLiabilityDetails
  Scenario: User able to Navigate to the Fabric Liability Details screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Fabric liability details in menu
    Then Verify that user navigated to fabric liability details screen

  @FabricLiabilityDetails1
  Scenario: User able to view the IPO and able to click on add liability action
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Fabric liability details in menu
    And click on Styles expansion
    Then Select the IPO in styles expansion in liability details
    When IPO is selected verify the IPO details
    And Verify the data is displaying in the grid or not
    And click on add liability information button to navigate to the add fabric liability details
    Then verify the Process details are displaying or not
    
    @FabricLiabilitydetails2
    Scenario: Test the submit liability Information
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Fabric liability details in menu
    And click on Styles expansion
    Then Select the IPO in styles expansion in liability details
    And click on add liability information button to navigate to the add fabric liability details
    When Enter the data in mandatory fields for liability
    And click on Add liability details button
    Then click on submit button
    
    @FabricLiabilitydetails3
    Scenario: Test that data is displaying in expansion grid after successfull submit
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Fabric liability details in menu
    And click on Styles expansion
    When Select the IPO in styles expansion in liability details
    Then click on expansion icon to view the data
    And verify that data is displaying in expansion grid or not
    
    
    
    
    
    
		