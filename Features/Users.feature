@FeatureGroup_Requirement
Feature: feature to test Jiva design Users screen functionality

  @Users
  Scenario: To Test the Style Master screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    When I click on security module
    Then Display Users and Roles in menu
    When I click on Users in menu
    Then Navigates to Users screen
    When I click on Add button
    Then Navigates to Create User screen
    Given I Want to enter UserName
    Given I Want to enter FirstName
    Given I Want to enter LastName
    Given I Want to enter Email
    Given I Want to enter MobileNumber
    Given I Want to enter AlternateMobileNumber
    Given I Want to enter NewPassword
    Given I Want to enter ConfirmPassword
    Given I Want to enter Roles
    Given I want to select Reporting Manager
    Given I want to select the department
    And I want to select the Factory
    And Click on save button

  @Users1
  Scenario: Create the User with required data in mandatory fields
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    When I click on security module
    Then Display Users and Roles in menu
    When I click on Users in menu
    Then Navigates to Users screen
    When I click on Add button
    Then Navigates to Create User screen
    And Enter the data in mandatory fields
    Then verify that created user is displaying in grid with valid data

  @Users2
  Scenario: Delete the User by clicking on delete icon
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    When I click on security module
    Then Display Users and Roles in menu
    When I click on Users in menu
    Then Navigates to Users screen
    When click on Filter icon and filter with the username
    And Click on Delete icon and delete the user

  @Users3
  Scenario: Update the user by clicking on edit icon
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    When I click on security module
    Then Display Users and Roles in menu
    When I click on Users in menu
    Then Navigates to Users screen
    When click on Filter icon and filter with the username
    And Click on edit icon to update the data

  @Users4
  Scenario: Sort the grid columns
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    When I click on security module
    Then Display Users and Roles in menu
    When I click on Users in menu
    Then Navigates to Users screen
		And check the sorting functionality of grid