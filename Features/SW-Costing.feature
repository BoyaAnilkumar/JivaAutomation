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
@Sweater_Costing
Feature: Add Costing details for Style
  I want to use style to add the costing details and submit

  @Sweater_Costing_View
  Scenario: Verify the Costing screen displaying the entry fields to enter the data
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Costing screen in sweater module
    And Click on Style expansion in sweater

  @Create_Sweater_Costing
  Scenario Outline: Verification of Creating the costing
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Costing screen in sweater module
    And Click on the style in costing expansion
    And Click on Add a Combo button
    Then User has entered "<Combo name>" and "<Combo quantity>"
    And Enter Garment average"<Garment Average>"
    Then User has entered wastage"<Wastage>"
    And User has entered rate"<rate>"
    And User has entered additional sampling cost"<Addlitional Sampling cost>" and "<Per pc Freight cost>"
    Then click on Trims and Accessories"<Trim&Accessories Avg garment>" and "<Trims wastage>" and "<Trims Rate>"

    Examples: 
      | Combo name | Combo quantity | Garment Average | Wastage | Rate | Addlitional Sampling cost | Per pc Freight cost | Trim&Accessories Avg garment | Trims Wastage | Trims Rate |
      | name1      |              5 |               5 |       2 |   10 |                         2 |                   0 |                           10 |             5 |         12 |
      | name2      |              7 |               6 |     3.5 |   15 |                       4.2 |                   0 |                           12 |             7 |         10 |
