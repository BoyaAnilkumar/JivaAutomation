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
    