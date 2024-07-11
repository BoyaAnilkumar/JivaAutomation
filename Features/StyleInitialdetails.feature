
#@FeatureGroup 
#Feature: feature to test Jiva design style initial details screen functionality

 #@Style123
 #Scenario: To Test the Style initial details screen
 #When User navigates to Login page
#Then User enters the username and password
 #And User click on the signIn
 #And Click on the Woven Module
 #Then click on the Merchandising Module
 #And click on Data Entry dropdown
 #And click on the Style Initail Details screen
 #
 #And Click on the Styles Expansion
 #And Click on the Filter Icon
 #And Click on the Buyer Field
 #Then Select the Buyer
 #And Click on the Cancel Icon
 #And Click on the Season Field
 #And Select the Season
 #Then Click on the Status Field
 #And Select the status
 #When Search the IPO
 #And Click on the Apply button
 #And Click on the Reset button
 #And Select IPO
 #And Verify IPO data
 #And Verify Style
 #And Verify Buyer
 #And Verify Season
 #And Select File handover date
 #And Click on the Add combo button
 #Given Enter the data in Combo1
 #And Click on the Delete Icon1
 #And Enter the data in Combo2
 #And Click on the delete Icon2
 #And Click on the Add Garment type button
 #And Click on the Delete Garment Icon1
 #And Click on the Delete garment Icon2
 #And Click on the Garment type field
 #And Click and Select the Garment type
 #And Click on the Submit Order details button
 #And Verify the Alert msg
 #And Verify the Saved msg
 #And Verify whether the Combo field is prepopulated with data or not
 #And Verify whether the Garment Size type field data is displayed or not 
#Given User enter the data in PO Qty field 
#And Enter the data in IPO% field
#And Click on the submit button
#And Verify the validation msg is displaying or not
 
 
 

@FeatureGroup
Feature: feature to test Jiva design style initial details screen functionality

  @StyleInitialDetails
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
    And Verify IPO data
    And Verify Style
    And Verify Buyer
    And Verify Season
    And Select File handover date
    And Click on the Add combo button
    Given Enter the data in Combo1
    And Enter the data in Combo2
    And Click on the Add Garment type button
    And Click on the Garment type field
    And Click and Select the Garment type
    And Click on the Submit Order details button
       #And Verify the Alert msg
    #And Verify the Saved msg
    
    
    @StyleInitialDetailsorderdetails
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

  @StyleInitialDetails1
  Scenario: To test the filter functionality of style initial details
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then click on the Merchandising Module
    And click on Data Entry dropdown
    And click on the Style Initail Details screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    And Click on the Buyer Field
    Then Select the Buyer
    And Click on the Cancel Icon
    And Click on the Season Field
    And Select the Season
    Then Click on the Status Field
    And Select the status
    When Search the IPO
    And Click on the Apply button
    And Click on the Reset button

  @StyleInitialDetails2
  Scenario: To Test the delete functionality in style initial details
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then click on the Merchandising Module
    And click on Data Entry dropdown
    And click on the Style Initail Details screen
    And Click on the Styles Expansion
    And Click on the Delete Icon1
    And Click on the delete Icon2
    And Click on the Delete Garment Icon1
    And Click on the Delete garment Icon2

