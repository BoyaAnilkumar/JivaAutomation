
@FabricLiabilityInfo
Feature: Test the Fabric Liability Info
  I want to search the IPO details in Fabric Liability Info

  @FabricLiabilityInfo
  Scenario: verification of filter functionality
   Given User navigates to Login page
    Given User enters the username and password
    When User click on the signIn
    And Click on the Woven Module
    And click on Fabric Store module
    And Click on Report in Fabric Store module
    Then Click on Fabric Liability Info
    When Click on Select IPO Number dropdown field
    And Click on Select buyer dropdown field and select buyer
    Then click on Search button
 		And Verify the data is displaying in grid after filter search
 		
 
  