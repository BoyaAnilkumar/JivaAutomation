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
@OutChallans
Feature: Create out challans for the Buying house
  I want to use this template to create out challans feature.

  @OutChallan
  Scenario: Navigate to Out Challan screen with valid credentials
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Challans sub module
    And Click on Out Challans in menu
    Then User has navigated to Out Challans screen

  @CreateOutChallan
  Scenario Outline: Navigate to Add Out Challan form submit Out challan for Buying House
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Challans sub module
    And Click on Out Challans in menu
    Then user clicked on Add button
    And verify that source is selected
    And Select the Buying House Name"<BuyingHouseName>"
    And Select the date from datepicker
    Then Select the Challan type"<type>"
    And Enter the data in item textfield"<item>"
    And Enter quantity"<qty>"
    And Enter data in Description textfield"<description>"
    Then user clicked on save button

    Examples: 
      | BuyingHouseName | type          | qty  | description | item    |
      | Triburg         | PreProduction | 5201 | Test1       | buttons |
      | Continuum       | Other         | 2201 | Test3       | pins    |

  @CreateOutChallanforItemProduction
  Scenario Outline: Navigate to Add Out Challan form submit Out challan for Buying House with item production
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Challans sub module
    And Click on Out Challans in menu
    Then user clicked on Add button
    And verify that source is selected
    And Select the Buying House Name"<BuyingHouseName>"
    And Select the date from datepicker
    Then Select the Challan type"<type>"
    And Select the IPO"<IPO>"
    And Enter quantity"<qty>"
    And Enter data in Description textfield"<description>"
    Then user clicked on save button

    Examples: 
      | BuyingHouseName | type       | qty  | description | IPO   |
      | New Times Group | Production | 4512 | Test2       | IPO18 |

  @PrintOutChallan
  Scenario: Navigate to Add Out Challan form submit Out challan for Buying House with item production
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Challans sub module
    And Click on Out Challans in menu
    Then Click on Print icon in grid
    And verify that user navigated to print screen
    And Click on print button to view system print
    And Click on Approve icon and approve the out challan
    
   @CreateOutChallanforSupplier
   Scenario Outline: Navigate to Add Out Challan form submit Out challan for supplier with item production
   Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Challans sub module
    And Click on Out Challans in menu
    Then user clicked on Add button
    And Select the source as supplier
    And Select the Supplier Name"<Supplier Name>"
     And Select the date from datepicker
    Then Select the Challan type"<type>"
    And Enter the data in item textfield"<item>"
    And Enter quantity"<qty>"
    And Enter data in Description textfield"<description>"
    Then user clicked on save button
    
     Examples: 
      | Supplier Name | type          | qty  | description 								| item    |
      | Anjani fabric | PreProduction | 5000 | Test1        							| buttons |
      | Blue Apparels | Other         | 2000 | creating challan for needle| Needle	|
    
   