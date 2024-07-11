@DailyInOutReport
Feature: Checking the IPO Wise In Out Report

  @DailyInOutRpt
  Scenario Outline: Checking the records in the Daily In House grid for the selected date search criteria
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to Daily In Out Report screen
    Given Enter the date for searching the records "<Date>"
    Then Click on the Search button
    Then Verify and print the respective Date Daily In records under the Daily In House grid
    
 Examples:
    | Date 				|
    | 16-05-2024  |
    
    
  @DailyInOutRpt
  Scenario Outline: Checking the records in the Issued to Cutting grid for the selected date search criteria
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to Daily In Out Report screen
    Given Enter the date for searching the records "<Date>"
    Then Click on the Search button
    Then Verify and print the respective Date Daily In records under the Issued to Cutting grid
    
 Examples:
    | Date 				|
    | 17-05-2024  |
    
    @DailyInOutRpt
  Scenario Outline: Checking the records in the Sent/Return to Supplier grid for the selected date search criteria
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to Daily In Out Report screen
    Given Enter the date for searching the records "<Date>"
    Then Click on the Search button
    Then Verify and print the respective Date Daily In records under the Sent or Return to Supplier grid
    
 Examples:
    | Date 				|
    | 18-05-2024  |
      
