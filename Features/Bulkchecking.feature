@BulkChecking
Feature: Feature to test Jiva design Bulk Checking

  @BulkChecking
  Scenario: To Test the user able to navigate to Bulk Checking screen
    Given User navigates to Login page
    Given User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    And click on Fabric Store module
    And Click on Data Entry in Fabric Store
    Then click on Bulk checking screen name
    And Select the po number in filter expansion
    
    @BulkChecking1
    Scenario: To Test the user clicked on po and submit the lot checking data
    Given User navigates to Login page
    Given User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    And click on Fabric Store module
    And Click on Data Entry in Fabric Store
    Then click on Bulk checking screen name
    And Select the po number in filter expansion
    When clicked on Lot Checking data icon
    And Add data for add lot checking data
    And clicked on save button
