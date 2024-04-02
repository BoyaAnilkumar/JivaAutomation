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
    And Click on the TOP Sample1 Delete Icon
    And Select the value in File Handover field
    Given Enter the data in File handover date field
    When Enter the data in File handover Remarks field
    And Select the value in Size set field
    Given Enter the data in Size set date field
    When Enter the data in Size set Remarks field
    And Select the value in PPM field
    Given Enter the data in PPM date field
    When Enter the data in PPM Remarks field
    And Verify whether the Bulk Fabric Flow date is prepopulated in the field or not
    And Click on the Bulk Fabric Flow View button
    And Click on the Bulk Fabric Flow View Close button
    And Select the value in PCD Field
    Then Enter the date in PCD Field
    And Verify the Ex factory field date is prepopulated or not
    And Verify the DTP field data is prepopulated or not
    #And Click on the Save button in T and A Input
    And Click on the Cancel button in T and A Input
