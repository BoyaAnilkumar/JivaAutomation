@FeatureGroup_Requirement
Feature: feature to test Jiva design Fabric Type screen functionality


  @TestAddFabricType
  Scenario: To Test the Fabric Type screen
    When User navigates to the Login page and enter credentials and signin
    And Select the Fabric type screen
    
    Then click on the fabric type add button
    And click on save button to submit the Fabric Type
    
    When Select category dropdown
    When user enter the Fabric Name
    When User enter the content
    When User enter the supplier or internal code
    
    When User enter the GSM1
    When User enter the Count and construction1 
    When User enter the width in inches
    
    When User enter the GSM2
    When User enter the count and construction2
    When User enter the cuttable width in inches
    When User enter the approx lead time
    
    Then User able to select the is nominated
    When User enter the Fabric price
    When User selects the Currency
    When User selects the UOM
    When User verify the Price 
    Then User upload the file
   
  #	And User try to submit by clicks on the save button
  	And User clicks on the cancel button
    
    
  @TestFabricTypehomescreen
  Scenario: To Test the Fabric Type home screen
  
   When User navigates to the Login page and enter credentials and signin
   And Select the Fabric type screen
  
 	 Then User able to search the data by using search box funtionality
 	 When User able to update the details by selecting edit icon
 	 Then Check the sorting functionality
    
  @FabricType
  Scenario: Add the Non-Nominated Fabric Type
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Select the Fabric type screen
    Then click on the fabric type add button
    And select the category
    And Enter the Fabric name
    And Enter the content
    And Enter the GSM
    And Enter the Count or Construction
    And Enter the Cuttable Width
    And click on save button in create fabric

  @FabricType1
  Scenario: Add the Nominated Fabric Type
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Select the Fabric type screen
    Then click on the fabric type add button
    #And select the category
    #And Enter the Fabric name
    #And Enter the content
    #And Enter the GSM
    #And Enter the Count or Construction
    #And Enter the Cuttable Width
    And Click on nominated checkbox
    And Enter the Fabric Price
    And Select the currency
    And Select the UOM
    And Verify that price in meters are displaying or not
    And click on upload file
    And click on save button in create fabric

  @TestAddFabricType
  Scenario: To verify that validation msgs are displaying for mandatory fields and submit the fabric type data
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Select the Fabric type screen
    Then click on the fabric type add button
    And click on save button to submit the Fabric Type
    When Select category dropdown
    When user enter the Fabric Name
    When User enter the content
    When User enter the supplier or internal code
    When User enter the GSM1
    When User enter the Count and construction1
    When User enter the width in inches
    When User enter the GSM2
    When User enter the count and construction2
    When User enter the cuttable width in inches
    When User enter the approx lead time
    Then User able to select the is nominated
    When User enter the Fabric price
    When User selects the Currency
    When User selects the UOM
    When User verify the Price
    Then User upload the file
    And User try to submit by clicks on the save button
    And User clicks on the cancel button

  @TestFabricTypehomescreen
  Scenario: To Test the Fabric Type home screen
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the master module
    And Select the Fabric type screen
    Then User able to search the data by using search box funtionality
    When User able to update the details by selecting edit icon
    Then Check the sorting functionality

