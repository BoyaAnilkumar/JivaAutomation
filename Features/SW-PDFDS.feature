@FeatureGroup_Requirement
Feature: Login the application and Add Fabric quality in PDFDS

  @SWPDFDS
  Scenario: Add New Fabric to the Style
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Navigated to Dashboard screen
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    And click on PDFDS in sweater
    And Click on Style expansion in sweater
    And Select the IPO in the list
    When I mouse hover on tool tip in sweater
    And Verify the Toaster text is displaying in sweater
    Then Click on Add New Fabric button in sweater
    And Click on Fabric Quality in sweater
    And Select Fabric Quality in sweater
    Then Click on Content in sweater
    And Click on Color in sweater
    And Select CountConstruction in sweater
    Then Enter Finish value in sweater
    And Enter specific requirements in sweater
    And Enter Fabric Quantity in sweater
    And Enter Full width in PDFDS
    And Select use in sweater
    #Then Click on Reset button in sweater
    Then Click on Save button in sweater
    And Click on Fabric Manager in sweater
    And click on User Account in sweater
    Then Click on Logout button
    And Navigate to PD Fabric Pricing screen in sweater
