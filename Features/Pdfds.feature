@FeatureGroup_Requirement
Feature: Login the application and Add New Fabric Sheet

  @SmokeTestPDFDS
  Scenario: Add New Fabric to the Style
    Given Navigate to the Login Page
    When User Enter Valid username and password
    Then Click on SignIn button
    And Navigated to Dashboard screen or not
    And Click on Wovenknit module
    Then Click on PD module
    And Click on Data Entry in PD Module
    And click on pd fds
    And Click on Style expansion
    And Select the IPO
    When I mouse hover on tool tip
    And Verify the Toaster text is displaying or not
    Then Click on Add New Fabric button
    And Click on Fabric Quality
    And Select Fabric Quality
    Then Click on Content
    And Click on Color
    And Select CountConstruction
    Then Enter Finish value
    And Enter specific requirements
    And Enter Fabric Quantity
    And Enter Full width
    And Select use
    #Then Click on Reset button
    Then Click on Save button

    And Click on Fabric Manager
    And click on User Account
    Then Click on Logout button
    And Navigate to PD Fabric Pricing screen
    

