@FeatureGroup
Feature: Feature to test Jiva design Merchandising T and A Data Entry screen functionality

  @MerchandisingTAndA
  Scenario: To Test the user able to navigate to Merchandising T and A Data entry screen
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then click on the Merchandising Module
    And click on Data Entry dropdown
    And Click on the Merchandising T&A Data Entry Screen

  @MerchandisingTAndA
  Scenario: To Test the Filter Functionality
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then click on the Merchandising Module
    And click on Data Entry dropdown
    And Click on the Merchandising T&A Data Entry Screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    And Click on the Buyer Field
    And Click on the Season Field
    And Select the Season
    And Select the Month
    And Search The IPO and Style
    And Click on the Apply button
    #And Click on the Reset button
    And Select the IPO and Style

  @MerchandisingTAndA
  Scenario: To Verify the IPO Details after selecting the IPOs
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then click on the Merchandising Module
    And click on Data Entry dropdown
    And Click on the Merchandising T&A Data Entry Screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    And Search The IPO and Style
    And Click on the Apply button
    And Select the IPO and Style
    And Verify the IPO name is displaying or not
    And Verify the Style name is displaying or not
    And Verify the Buying house name is displaying or not
    And Verify the PO Qty Value is displaying or not
    And Verify the IPO Qty Value is displaying or not

  @MerchandisingTAndA1
  Scenario: To Verify that user navigated to Add form and inserting the data
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Woven Module
    Then click on the Merchandising Module
    And click on Data Entry dropdown
    And Click on the Merchandising T&A Data Entry Screen
    And Click on the Styles Expansion
    And Click on the Filter Icon
    And Search The IPO and Style
    And Click on the Apply button
    And Select the IPO and Style
    And Click on the Add button
    Given Enter the data in proto commends received field
    Given Enter the data in Fit submittion field
    Given Enter the data in Fit submittion and Approval fields
    And Enter the data in Fit Remarks Field
    And Verify whether the Fabric Initial In House date is prepopulated in the field or not
    And Click on the Fabric Initial In House Date View button
    And Click on the Fabric Initial In House Date View Close button
    And Click on the PP Add button
    And Enter the data in PP Submission and Approval
    And Click on the Testing GPT1 Add button
    Given Enter the data in Testing GPT1 submission and Approval
    And Enter the data in GPT1 Remarks Field
    And Click on the Testing GPT1 Delete Icon
    And Click on the Testing FPT1 Add button
    Given Enter the data in Testing FPT1 submission and Approval
    And Enter the data in FPT1 Remarks Field
    And Click on the Testing FPT1 Delete Icon
    And Click on the Testing Photoshoot1 Add button
    Given Enter the data in Testing Photoshoot1 submission and Approval
    And Enter the data in Photoshoot1 Remarks Field
    And Click on the Testing Photoshoot1 Delete Icon
    And Click on the TOP Sample1 Add button
    Given Enter the data in TOP Sample1 submission and Approval
    And Enter the data in TOP Sample1 Remarks Field
    And Click on Add button of TOP Sample1
    And Click on the TOP Sample1 Delete Icon
    Given Enter the data in File Handover
    Given Enter the data in Size set
    Given Enter the data in PPM
    And Verify the Bulk Fabric Flow date is displaying or not
    And Click on View icon for Bulk Fabric Flow
    And Verify the EMB PCD is clickable or not
    And Verify that data is displaying for the EMB PCD or not
		Given Enter the date in PCD Field
		And click on dropdown to change the PCD Test
		And Verify that ExFactory date is displaying or not
		Then Verify that DTP days are displaying after inserting the date in PCD Test
		When click on save button
		
		