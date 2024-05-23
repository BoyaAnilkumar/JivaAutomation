@SweaterPDYDSScreen
Feature: Test the PD YDS functionality
  

  @SWPdYds
  Scenario: Navigate to PD YDS screen
    Given User navigates to Login page
		Then User enters the username and password
		And User click on the signIn
		And User click on the user icon
		Then Click on Logout button

  @SWPdYds1
  Scenario Outline: Create Yarn Details sheet for the style
  Given User navigates to Login page
		Then User enters the username and password
		And User click on the signIn
		And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    And Click on PD YDS screen
    And Click on Style expansion in sweater
    And Select the Style in the list in yarn pd
    Then Click on Add New yarn in Yarn details sheet
    Then Click on Yarn Quality and Select the yarn quality
    Then Click on Spin Type and Select the "<Spin Type>"
    Then Click on Color and Select the color
    Then click on count and select the "<Count>"
    Then Enter the Finish data text field"<Finish>"
    Then Enter Specific Requirements"<SReq>"
    Then Enter Yarn Quantity"<YarnQuantity>"
    Then Select the Use from dropdown"<Use>"
    Then Click on Save button in sweater
    
    
  

    Examples: 
      | Spin Type  				| Count						|					Finish     	|	SReq  | YarnQuantity | Use				|
      | Filament Yarn 	  | 2/32 NM blended | 	Light gray rais 	| 32/22 | 4500				 | Main body	|
      |  Spun Yarn				| 2/32 NM blended | 	Test 							|	22/33 | 5000         | Shell 			|
      
      
@SWPdYdsnominated
  Scenario Outline: Create Yarn Details sheet for the style
  Given User navigates to Login page
		Then User enters the username and password
		And User click on the signIn
		And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    And Click on PD YDS screen
    And Click on Style expansion in sweater
    And Select the Style in the list in yarn pd
    Then Click on Add New yarn in Yarn details sheet
    And Select Is Nominated checkbox
    Then Click on Yarn Quality and Select the yarn quality
    Then Click on Spin Type and Select the "<Spin Type>" 
    Then Click on Color and Select the color
    Then Enter the Finish data text field"<Finish>"
    Then Enter Specific Requirements"<SReq>"
    Then Enter Yarn Quantity"<YarnQuantity>"
    Then Select the Use from dropdown"<Use>"
    Then Click on Save button in sweater
    
    Examples: 
      | Spin Type  				| Count						|					Finish     	|	SReq  | YarnQuantity | Use				|
      | Filament Yarn 	  | 2/32 NM blended | 	Light gray rais 	| 32/22 | 4500				 | Main body	|
    
    
    
    
    
    
    
    
     