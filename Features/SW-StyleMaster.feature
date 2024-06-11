#Author: anilkumar@calibrage.in
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
@SweaterStylemaster
Feature: Create Styles in sweater style master
  I want to create style for the buyer by assigning the pd merchat to the style

  @SWstylemaster
  Scenario: Navigate to Sweater Style master screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Style master screen in sweater module

  @SWStyleMasterCreate
  Scenario Outline: Create Style Master
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Style master screen in sweater module
    Then Click on Add Style button
    And Enter PD Merchant Name and Select
    Then Enter Buyer Style name "<BuyerStyle>"
    Then Select Buyer from the dropdown list "<Buyer>"
    Then Select Season from dropddown list "<Season>"
    Then Select Garment Type from dropdown list "<GarmentType>"
    Then Select Garment Process from dropdown list "<GarmentProcess>"
    Then Enter the Garment Gauge "<GarmentGauge>"
    And Click on Save button to create style

    Examples: 
      | BuyerStyle | Buyer            | Season  | GarmentType | GarmentProcess | GarmentGauge |
      | Style5     | Amazon (Core)    | Fall    | Baby set    | Basic          |           35 |
      | Style6     | Amazon (Release) | Holiday | Cami        | Computer emb   |           25 |
      | Style7     | Beach Riot       | Spring  | Henley      | Basic          |           14 |

  @SWStyledetails
  Scenario Outline: update order details for the selected style
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Style master screen in sweater module
    And Click on Filter button in style master
    Then Enter the Style name in Search By Style"<Search>"
    And Click on style name
    
    
    
    

    
    
    Examples:
    |Search|
    |Style5|
    |Style6|
    |Style7|
    
    
    