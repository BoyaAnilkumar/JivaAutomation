@FeatureGroup
Feature: Verification and Validation of Create PO for Fabric

  @CreatePOforIPOSmoke
  Scenario: To Test the user able to navigate to create po for ipo screen and submit the po for ipo
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then Click on Fabric sourcing module
    And click on Data Entry in fabric sourcing module
    And click on Generate PO
    Then click on Create PO for Fabric
    And Verify the Create PO for IPO screen is displayed or not
    And Select Type of Order
    #Then verify the PO Date is displaying or not
    #Given Verify the PO Number us displaying or not
    #When Enter Deliver To details and select from the suggestions
    #When Deliver address is displaying after selecting the deliver to details or not
    #When verify the GSTIN number is displaying or not
    #Then Enter supplier name and select from the suggestions
    #And verify the supplier address after selecting the supplier
    #And verify the GSTIN number is displaying after selecting the supplier
    #And verify the payment terms are displaying after selecting the supplier
    #And verify that Delivery terms are displaying after selecting the supplier
    And Enter Lead time in Days
    #Then verify the Fabric Details are displaying or not
    And Select Process from dropdown list
    And Select Fabric Type
    And Select Fabric Name
    #Then verify that content is prepopulating after selecting the fabric name
    #Then verify that count and construction is prepopulated or not
    #Then verify that GSM is prepopulated or not
    #Then verify that cuttable width is prepopulated or not
    #And Select color for the fabric
    #Then verify the qty required is displaying with value based on the selected process fabric and color
    #Then verify the qty available in stock is displaying if qty is available
    #Then verify that residual shrinkage is displaying based on the selected process fabric and color
    #And verify that qty allowed is displaying with default value or not
    #And verify that currency is displaying with value
    And verify that rate is displaying with value or not

    #And verify that UOM is displayed or user should select
    #Given Enter the data in L Short If Any field
    #Given Enter the data in Additional Information1 field
    #Given Enter the data in Additional Information2 field
    #And verify that Add IPO button is enable or not
    #And click on delete icon is able to click or not

    And verify that UOM is displayed or user should select
    Given Enter the data in L Short If Any field
    Given Enter the data in Additional Information1 field
    Given Enter the data in Additional Information2 field
    And verify that Add IPO button is enable or not
    And click on delete icon is able to click or not
    And select the IPO from the dropdown list
    And verify the due date is displayed as current date
    And verify the quatity is displayed as greater than zero in quantity field
    And verify the quantity is displayed as greater than zero in qty use from stock field
		And verify the quantity is displayed as greater than zero in qty to be bought field
		And verify the rate value is prepopulated in grid or not
		And verify the Amount is displayed after selecting the ipo in grid
		Then click on save button and verify that save button is enable after inserting the data in mandatory fields
		

    
    