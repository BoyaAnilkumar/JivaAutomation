@tag
Feature: Title of your features
  I want to use this template for my feature file

  @Smoke
  Scenario: Login the Application
    When User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on the Master Module

  Scenario: Navigate to State Screen and enter data in search field
    Then Click on the State screen
    And To verify whether Search is holding the placeholder or not
    And To verify whether Search is displaying the records or not when the user enters Invalid data
    And To verify whether it is displaying the records or not by entering with the State name Search criteria
    And To verify whether it is displaying the records or not by entering with the State Search criteria

  Scenario: Verify the Table grid is displaying with the grid headers or not
    When To verify whether the State Code Country IGST SGST CGST Active and Action columns are to be displayed or not

  Scenario: Verification of Add button functionality
    Then To verify whether the user able to view the add button or not
    And To verify whether the add button is enable state or not
    And To verify whether the add button is clickable or not
    Then To verify when the user click on the add button the create State form is displaying or not
    And To verify whether the State name State code Country code IGST SGST CGST active checkbox cancel and Save buttons

  Scenario: Verification of the State name field and State code
    Then To verify whether the user able to view the State name field or not
    And To verify whether the entered data is properly displayed or not
    And To verify whether the user able to view the State Code field or not
    And To verify whether the user able to enter the data in state code text field or not

  Scenario: Verification of Country name field
    Then To verify whether the user able to view the Country name field or not
    And To verify whether the Country names are retrieved from the Country name screen or not

  Scenario: Verification of the IGST SGST and CGST fields
    Then To verify whether the user able to view the IGST field or not
    And To verify whether the IGST field is enable state or not
    And To verify whether the IGST field is text box field or not
    And To verify whether the entered data is properly displayed in IGST or not
    Then To verify whether the user able to view the SGST field or not
    And To verify whether the SGST field is enable state or not
    And To verify whether the SGST field is text box field or not
    And To verify whether the entered data is properly displayed in SGST or not
    Then To verify whether the user able to view the CGST field or not
    And To verify whether the CGST field is enable state or not
    And To verify whether the CGST field is text box field or not
    And To verify whether the CGST field is mandatory field or not
    And To verify whether the entered data is properly displayed in CGST or not
    
   Scenario: Verification of Save button functionality
   Then To verify whether the user able to view the save button or not
   And To verify whether the save button is enable state or not
   And To verify when the user click on the save button the State saved successfully msg is displaying or not
   And Verify that user able to view the Save Record in grid
   

	 	  
   
   
   
    
