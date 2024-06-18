@FeatureGroup
Feature: feature to test Jiva design style initial details screen functionality

  @SWStyleInitialDetails
  Scenario: To Test that user navigates to Style Initial details screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then click on the SW Merchandising Module
    And click on SW Data Entry dropdown
    And click on SW Style Initial Details screen
    And Click on the Styles Expansion
    
  
  @SWStyleInitialDetailsorderdetails
  Scenario: To Test submit order details in Style Initial details screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then click on the Merchandising Module
    And click on Data Entry dropdown
    And click on the Style Initail Details screen
    And Click on the Styles Expansion
    And Select IPO
    And Verify whether the Combo field is prepopulated with data or not
    And Verify whether the Garment Size type field data is displayed or not
    Given User enter the data in PO Qty field
    And Enter the data in IPO% field
    And Click on the submit button
    And Verify the validation msg is displaying or not

  @SWStyleInitialDetails_Filters
  Scenario Outline: To test the filter functionality of style initial details
   Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then click on the SW Merchandising Module
    And click on SW Data Entry dropdown
    And click on SW Style Initial Details screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    And Click on the Buyer Field
    Then Select the IPO from the list "<IPO>"
    
    
    Examples:
 |IPO       |
 |IPO1706.2 |

  @SWStyleInitialDetails2
  Scenario Outline: To test the submit order details
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then click on the SW Merchandising Module
    And click on SW Data Entry dropdown
    And click on SW Style Initial Details screen
    And Click on the Styles Expansion
    Then Select the IPO from the list "<IPO>"
    And Select file handover date"<File Handover>"
    Then click on Add combination button and enter combination names"<Combination Name1>" and "<Combination Name2>"
    And click on Submit order details button
    And Verify whether the Garment Size type field data is displayed or not
    Given User enter the data in PO Qty field for combos
    And Enter the data in IPO% field in order details
    And Click on the submit button
  
  
  
  
  
  Examples:

 |IPO       |File Handover |Combination Name1|Combination Name2|
 |IPO1706.2 |17062024      |Combo1					 |Combo2					 |
 
 
 
 
 
 
 
 
 