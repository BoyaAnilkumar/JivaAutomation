@FeatureGroup
Feature: I want to create po for the IPO process

  Background: Login with valid user and navigate to PO Master sheet
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on the Yarn Sourcing Module
    And Click on Data Entry in yarn sourcing
    And click on Generate PO
    And click on PO Master Sheet

  @SW_POMasterSheet
  Scenario Outline: Create PO for the IPO process
    Given Search with IPO in search keyword textbox "<IPO>"
    And click on generate po icon
    Then Verify the Create PO for IPO screen is displayed or not
    And Verify the PO details are displaying
    When Enter Deliver To details and select from the suggestions"<DeliverTo>"
    When Deliver address is displaying after selecting the deliver to details or not
    When verify the GSTIN number is displaying or not
    Then Enter supplier name and select from the suggestions"<Supplier>"
    And verify the supplier address after selecting the supplier
    And verify the GSTIN number is displaying after selecting the supplier
    And verify the payment terms by selecting the supplier
    And verify that Delivery terms are displaying after selecting the supplier
    And Enter Lead time in Days
    When verify the Yarn Details are prepopulating or not
    When verify the Quantity Details are displaying or not
    When verify the IPO Details are prepopulating or not
    And click on Add IPO button whether button is working or not
    And Delete the record in IPO table
    Then Click on save button to generate po
    And verify whether the user is navigated to Print form
    And Click on cancel to navigate back to po master sheet screen

    Examples: 
      | IPO     | DeliverTo | Supplier |
      | IPO2606 | Jiva      | Anil     |

  @SW_RevisedPOMasterSheet
  Scenario Outline: Revised PO for IPO process
    Given Search with PO in search keyword textbox "<PO>"
    And click on Revised Po icon
    Then Verify the Create PO for IPO screen is displayed or not
    And user update the revised po for ipo"<QtyAllowed>"and "<Rate>"
    And Print view Revised PO for IPO details

    Examples: 
      | PO  | QtyAllowed | Rate |
      | Y-3 |          3 |  2.5 |

  @SW_PrintViewPOMasterSheet
  Scenario Outline: View print form of PO for IPO
    Given Search with PO in search keyword textbox "<PO>"
    And Click on Print icon for the po

    Examples: 
      | PO  |
      | Y-3 |

  @SW_CancelPOforIPO
  Scenario Outline: click on cancel icon and cancel the po for ipo
    Given Search with IPO in search keyword textbox "<IPO>"
    #Given Search with PO in search keyword textbox "<PO>"
    And Click on Cancel icon in grid

    Examples: 
      | IPO   | PO  |
      | IPO-3 | Y-3 |

  @SW_POMaster_Filter
  Scenario Outline: Filter the IPO by using filter section
    When user clicks on filter expansion
    And Click on Merchant dropdown field and select merchant"<Merchant>","<Buyer>"
    And Select the Supplier in the "<Supplier>" field
    Then User select the "<Yarn_Quality>" in the filter page
    And Select the Month in the "<Month>" field
    And Select the "<IPO>" in the Search by IPO field
    And click on the Apply button

    Examples: 
      | Merchant | Buyer | Supplier   | Yarn_Quality | Month    | IPO  |
      | Raji     | Test  | Anil kumar | cotton       | Jun/2024 | IPO1 |

  @SW_PO_Master_Sorting
  Scenario: Sorting the grid data
    When user clicks on sorting icon in grid headers
