#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@FeatureGroup
Feature: To Test Style Po Details screen functionality

  @SWStylePODetails
  Scenario: To Test the Style PO Details screen
    Given User navigates to Login page
    Given User enters the username and password
    When User click on the signIn
    And Click on Sweater module
    And Click on Merchandising Module
    And Click on Merchandising Data Entry
    And Click on Style PO Details

  @AddStylePO
  Scenario Outline: Add Style PO Details by clicking on Add button
    Given User navigates to Login page
    Given User enters the username and password
    When User click on the signIn
    And Click on Sweater module
    And Click on Merchandising Module
    And Click on Merchandising Data Entry
    And Click on Style PO Details

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
