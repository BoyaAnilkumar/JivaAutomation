@FeatureGroup_Requirement
Feature: Feature to test Jiva design MerchandisingTandAduesCalendar screen functionality

  @MerchandisingTandAduesCalendar
  Scenario: To Test the Merchandising T and A Dues screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Merchandising module
    And Click on Report in merchandising module
    And Click on TandA
    Then Click on Merchandising T and A Dues Calendar
    And click on Sr Merchant dropdown field and verify that bydefault select all merchants are selected or not
    Then change from date and To date
    And click on Download button 
