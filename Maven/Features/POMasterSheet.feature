@FeatureGroup
Feature: I want to create po for the process

  @POmastersheetsmoke
  Scenario: Verification of Filter functionality
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Data Entry in fabric sourcing module
    And click on Generate PO
    And click on PO Master Sheet
    And click on filter expansion
    And click on merchant dropdown to select the merchant
    And click on buyer dropdown to select the buyer
    And click on supplier dropdown to select the supplier
    And click on Fabric Quality dropdown to select the Fabric
    And click on Month dropdown to select the month
    And click on Search By IPO dropdown to select the IPO
    And click on Reset and Apply button

  @POmastersheetsmoke
  Scenario: apply filters with the selection of all the options
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Data Entry in fabric sourcing module
    And click on Generate PO
    And click on PO Master Sheet
    And click on filter expansion
    Then Select all the Fields in the filter and apply filter

  @POmastersheetsmoke1
  Scenario: Create PO for the IPO process
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Data Entry in fabric sourcing module
    And click on Generate PO
    And click on PO Master Sheet
    Given Search with IPO in search keyword textbox
    And click on generate po icon
    Then Verify the Create PO for IPO screen is displayed or not
    And Verify the PO details are displaying
    
    When Enter Deliver To details and select from the suggestions
    When Deliver address is displaying after selecting the deliver to details or not
    When verify the GSTIN number is displaying or not
    
    Then Enter supplier name and select from the suggestions
    And verify the supplier address after selecting the supplier
    And verify the GSTIN number is displaying after selecting the supplier
    And verify the payment terms are displaying after selecting the supplier
    And verify that Delivery terms are displaying after selecting the supplier
    And Enter Lead time in Days

    When verify the Fabric Details are prepopulating or not
    When verify the Quantity Details are displaying or not
    When verify the IPO Details are prepopulating or not
    And click on Add IPO button whether button is working or not
    And Delete the record in IPO table
    Then Click on save button to generate po
    And verify whether the user is navigated to Print form
    And Click on cancel to navigate back to po master sheet screen
    
    
    
    
    
    