@FeatureGroup
Feature: PO For Stock screen functionality

  @StockPO1
  Scenario: Checking the Filter functionality
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to PO For Stock screen
  Then Click on the Filter showhide button
  Then Select a Supplier from dropdown list
  Then Select a Buyer from dropdown list
  Then Select a Fabric Quality from dropdown list
  And Click on the Filter_Apply button
  Then Verify whether data is cleared or not on OnClick the Reset button
  
  
  
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
