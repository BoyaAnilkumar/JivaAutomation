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

@FeatureGroup_Requirement
Feature: Acceptance of Fabric Sheet when user submitted to the Fabric Team

  @AcceptFabricsheet
  Scenario: Accepting the fabric sheet by the fabric team
    Given Fabric Manager should login to accept the fabric sheet
    And navigate to dashboard after login the application or not 
    When user should navigate to Fabric sheet acceptance screen by clicking on menu
    And user should click on styles expansion to view the IPOs
    And Verify that IPOs are displaying in styles expansion view
    Then Click on filters icon to apply the filter to get the IPOs
     

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
