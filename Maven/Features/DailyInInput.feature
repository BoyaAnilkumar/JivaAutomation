@FeatureGroup
Feature: Feature to test Jiva design Daily In Input Data Entry

  @DailyInInput
  Scenario: To Test the user able to navigate to Daily In Input Data entry screen
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    And click on Fabric Store module
    And Click on Data Entry in Fabric Store
    When click on Daily In and Out menu
    And Click on Daily In Data Entry
    When Verify that Daily In Data Entry screen is displaying or not
    And Click on Add Data Entry button
    Then Verify that user navigated to daily in data entry screen or not
    And Select the Date if you need to change the date
    Then verify that current date is displaying or not
    And Enter the Challan No
    And Enter the Bill No
    And Enter the Gate Entry No
    And Select Party Name
    And Enter PO Number
    #Then Verify that Supplier FromLocation ProcessName FabricName Color ApplicableIPO Content Count GSM CuttableWidth UOM has prepopulated data after selecting the PO number
    And Enter No of Thaans
    And Enter No of Qty
    And Enter the Rate for the Qty
    And Select To Location from dropdown
    And Enter Remarks for the Daily In Input
    Then click on save button to create the Daily In Input