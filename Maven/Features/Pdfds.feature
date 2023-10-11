@FeatureGroup_Requirement
Feature: Login the application and Add New Fabric Sheet

  @SmokeTest
  Scenario: Add New Fabric to the Style
    Given Navigate to the Login Page
    When User Enter Valid username and password
    Then Click on SignIn button
    And Navigated to Dashboard screen or not
    And Click on Wovenknit module
    Then Click on PD module
    And click on pd fds
    And Click on Style expansion
    And Select the IPO
    #When I mouse hover on tool tip
    #And Click on Fabric Quality
    #And Select Fabric Quality
    #Then Click on Content
    #And Click on Color
    #And Select CountConstruction
    #Then Enter Finish value
    #And Enter specific requirements
    #And Enter Fabric Quantity
    #And Enter Full width
    #And Select use
    #Then Click on Reset button
    #Then Click on Save button
    #And Verify the Toaster text is displaying or not
    Then Click on Add New Fabric button
    And Click on Nomination checkbox
    And Click on Fabric Quality
    And Select Fabric Quality
    Then Click on Content
    And Click on Color
    Then Enter Finish value
    And Enter specific requirements
    And Enter Fabric Quantity
    And Enter Full width
    And Select use
    #Then Click on Save button
    And Navigate to PD Fabric Pricing screen
    

