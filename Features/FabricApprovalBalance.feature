@FabricApprovalBalance
Feature: Checking Fabric Approval Balance screen functionality

@FabAppBalance
  Scenario Outline: Checking the filters functionality
    When user navigates to Login page
    Given Login with the Fabric Manager
    And Click on the SignIn button
    Then Navigate to Fabric Approval Balance screen
    And click on Styles expansion
    #Then Click on the Merchant  
    #And Click on the Filter_Apply button
    #Then Click on Reset
    #Then Click and select the Buyer in Buyer field "<BuyerName>"
    #And Click on the Filter_Apply button
    #Then Click on Reset
    #Then Click in the Supplier field "<supplier>"
    #And Click on the Filter_Apply button
    #Then Click on Reset
    #Then Click in the Fabric Quality field "<FabricQuality>"
    #And Click on the Filter_Apply button
    #Then Click on Reset
    #Then Click in the Month field "<month>"
    #And Click on the Filter_Apply button
    #Then Click on Reset
    #Then Click in the IPO field "<IPO>"
    #And Click on the Filter_Apply button
    #Then Click on Reset
    Then Verify the Display Only Final Fabric checkbox field status bydefault
   
    
  Examples:
    | BuyerName 			|supplier			|FabricQuality		|month			|IPO			|
    | Amazon				  |Tej					|60s mod					|Feb				|6602			|