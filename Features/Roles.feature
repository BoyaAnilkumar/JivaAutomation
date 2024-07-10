@FeatureGroup_Requirement
Feature: feature to test Jiva design Roles screen functionality

Background:
Given User navigates to Login page
Then User enters the username and password
And User click on the signIn
When I click on security module
Then Display Users and Roles in menu
When User clicks on Roles in menu
Then Navigates to Roles screen

@Roles
Scenario Outline: Verify the Add button functionality
When I click on Add button
Then Verify the Add Role form is displayed or not
And Verify without enter the data in mandatory field and click on the save button toaster message is displayed or not
And Enter the data in the Role "<Name>" field
And Select the Reporting "<Role>"
Then Enter the data in the Description field
And Verify the Permissions section is displayed or not
When without select any permission click on save button toaster message is displayed or not
And I select All Permissions for the Admin
And Click on the Save button in the Add Role form



Examples: 
|Name    |Role     |
|Admin   |Admin    |