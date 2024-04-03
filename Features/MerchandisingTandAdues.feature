@FeatureGroup_Requirement
Feature: Feature to test Jiva design Merchandising T and A Dues screen functionality

  @MerchandisingTandAdues
  Scenario: To Test the Merchandising T and A Dues screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    Then Click on Woven Module
    Then Click on Merchandising module
    And Click on Report in merchandising module
    And Click on TandA
    And Click on TandA Dues
    Then Click on Overdue tab
    And Click on Today tab
   	And Click on Upcoming tab