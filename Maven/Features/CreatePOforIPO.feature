@FeatureGroup
Feature: Verification and Validation of Create PO for Fabric

  @MerchandisingTAndA
  Scenario: To Test the user able to navigate to Merchandising T and A Data entry screen
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
    Then verify the PO Date is displaying or not
    Given Verify the PO Number us displaying or not
    When Enter Deliver To details and select from the suggestions
    When Deliver address is displaying after selecting the deliver to details or not
    When verify the GSTIN number is displaying or not
    Then Enter supplier name and select from the suggestions
    And verify the supplier address after selecting the supplier
    And verify the GSTIN number is displaying after selecting the supplier
    And verify the payment terms are displaying after selecting the supplier
		And verify that Delivery terms are displaying after selecting the supplier
		And Enter Lead time in Days
		Then verify the Fabric Details are displaying or not
		And Select Process from dropdown list
		