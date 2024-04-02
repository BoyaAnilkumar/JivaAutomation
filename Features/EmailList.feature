@FeatureGroup_Requirement
Feature: Test the functionality of Email List

  @EmailList
  Scenario: Test the Add Email List functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Email list screen
    And Click on Add button in Email list
    And Select the Type of PO
    And Enter the Email address
    And click on save button in email list

    @EmailList1
    Scenario: Test the edit functionality
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Click on Email list screen
    Then Click on Filter icon for Email
    And Click on Edit email list icon
    And click on Type of po and select another po
    And unselect the active checkbox
    And click on update button