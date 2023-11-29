@FeatureGroup_Requirement
Feature: Creating the expected PD Orders

  @CreatePDorders
  Scenario: Create Expected New PD order
    Given Login with Senior PD merchant credentials in Login page
    Then Click on Woven
    And Click on PD Module to view the menu in PD Module
    Then Select the PD Orders from the menu of PD Module
    And Click on Add button
    And Enter Sr PD Merchant
    And Select Buyer from the dropdown list
    And Select Month and Year from calendar
    And Enter Expected Order Qty
    And Enter Appr Per Pcs cost
    #Then I should see the maxlength of the textfield is {int}
    And Enter Exchange Rate
    And verify the Total Cost in INR
    And verify the Total cost in Currency
    Then click on save button to save the expected pd order
    Given Login with Senior PD merchant credentials in Login page
    Then Click on Woven
    And Click on PD Module to view the menu in PD Module
    Then Select the PD Orders from the menu of PD Module
    Given Click on Edit icon
    And Verify whether the page is navigating to the update PD orders or not
    Then Change the Buyer by clicking on buyer dropdown field
    And Change Month and Year from calendar
    And Change expected order qty
    And Change Appr Per pcs cost
    And Change exchange rate
    And Click on Checkbox to inactive the PD order
    Then click on save button
    And Enter Keywords to search in Search filter
    And Click on Sort icon to verify that sorting is working as per the requirement 
    And Click on next page in the table grid
    And Delete the PD Order in table grid
    
