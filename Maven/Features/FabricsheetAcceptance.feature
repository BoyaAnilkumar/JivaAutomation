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
    And verify the IPOs are displaying based on the selection of items in filter
    Then Click on the IPO to approve or reject
    And Verify that Bulk fabric dealine text data is displaying or not
    And Accepting the fabric sheet by clicking Accept Fabric Sheet button
    When Enter Reason for accepting the IPO by clicking on submit button 
    And Click on View for Print button to view the fabric sheet in print view
    When clicked on reject fabric sheet button IPO is getting rejected or not
    When clicked on History button should display the transactions in history table
    When User navigated to history screen should click on Open button to view the History of that record
    