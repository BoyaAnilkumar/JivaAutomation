@GarmentProcess
Feature: Test the Fabric Liability Info
  I want to search the IPO details in Fabric Liability Info

  @GarmentProcess
  Scenario: Verification of Navigating to the Garment Process screen
    Given User navigates to Login page
    Given User enters the username and password
    When User click on the signIn
    And Click on the Woven Module
    And Click on Production module
    Then click on Data Entry in production
    And Click on Garment Process

  @GarmentProcess1
  Scenario: Verification of filter functionality
    Given User navigates to Login page
    Given User enters the username and password
    When User click on the signIn
    And Click on the Woven Module
    And Click on Production module
    Then click on Data Entry in production
    And Click on Garment Process
    Then Verify the Select IPO text is displaying in garment process screen
    And Click on Style Expansion
		When Clicked on Filter icon and apply filters
		
		
		@GarmentProcess2
		Scenario: Verification of Selecting the IPO and Submit the garment process
    Given User navigates to Login page
    Given User enters the username and password
    When User click on the signIn
    And Click on the Woven Module
    And Click on Production module
    Then click on Data Entry in production
    And Click on Garment Process
    Then Verify the Select IPO text is displaying in garment process screen
    And Click on Style Expansion
		When Clicked on Filter icon and apply filters
		And Click on the IPO in expansion
		
		
		