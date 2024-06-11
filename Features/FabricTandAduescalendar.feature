@FeatureGroup_Requirement
Feature: Feature to test Jiva design MerchandisingTandAduesCalendar screen functionality

  @FabricTandAduesCalendar
  Scenario: To Test the Merchandising T and A Dues screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Fabric sourcing module
    And click on Reports in fabric sourcing module
    Then Click on Fabric T and A Dues Calendar
    And Click on Senior merchant dropdown list and verify that checkbox is selected or not
    Then change from date and To date in Fabric T&A Dues calendar
    And click on Download button 
 