@tag
Feature: I want to add process details for IPO which is having the fabric sheet

  #@tag1
  #Scenario: Click on IPO in Styles expansion
  #When User navigates to Login page
  #Then User enters the username and password
  #And User click on the signIn
  #And navigate to New Fabric Sheet working screen
  #And Click on styles expansion
  #And click on IPO in the styles expansion
  #Then Close the styles expansion
  #
  #@tag1
  #Scenario: Verification of Filter functionality
  #Given Navigates to the Login page
  #Then Enter valid Username and password
  #And Click on SignIn
  #And navigate to New Fabric Sheet working screen
  #And Click on styles expansion
  #And click on filter icon
  #And click on buyer dropdown
  #And Enter the buyer and select buyer
  #And Click on Season dropdown and select form dropdown list
  #And Click on Status dropdown and select the status from dropdown list
  #And Enter the IPO no in search By IPO entry field
  #And click on Apply button and Reset button
  @tag1
  Scenario: Verification of submitting the MU working for Dyeing and Printing process
    Given Navigates to the Login page
    Then Enter valid Username and password
    And Click on SignIn
    And navigate to New Fabric Sheet working screen
    And Click on styles expansion
    And click on IPO in the styles expansion
    And Verify that data is displaying in grids after selecting the IPO
    And Click on Edit icon in MU Working grid
    And Verify the Fabric Required is displaying the value or not
    And Enter the value in Residual shrinkage
    Then select the process1 by clicking on process1 dropdown list
    Then select the process2 by clicking on process2 dropdown list
    Then verify the qty in greige field whether value is displaying or not
    And Enter value in MU for Process1 entry field
    Then Verify the process1 value in qty field
    And Enter the text in Print Type entry field
    And Enter value in MU for process2 entry field
    Then verify the process2 value in qty field
    And Verify the Fabric Budget section is displaying the budget details of Greige Dyeing and Printing processes or not
    And Verify the quantity is displaying for Greige Base Knitting qty field
    And Enter the Rate for griege process
    And verify the conversion rate is autopopulate and allows to change the value or not for griege process
    And Verify the cost is displaying or not for griege process
    And Select the Fabric Manager from the dropdown list of Fabric Manager field for griege process
    And Fabric manager assistants should display based on the selection of Fabric Manager for griege process
    And Select Fabric Executive from the dropdown list for griege process
    Then Verify the quantity is displaying for Dyeing qty
    And Enter the Rate for Dyeing process
    And verify the conversion rate is autopopulate and allows to change the value or not for Dyeing process
    And Verify the cost is displaying or not for Dyeing process
    And Select the Fabric Manager from the dropdown list of Fabric Manager field for Dyeing process
    And Fabric manager assistants should display based on the selection of Fabric Manager for Dyeing process
    And Select Fabric Executive from the dropdown list for Dyeing process
    Then Verify the quantity is displaying for printing qty
    And Enter the Rate for printing process
    And verify the conversion rate is autopopulate and allows to change the value or not for printing process
    And Verify the cost is displaying or not for printing process
    And Select the Fabric Manager from the dropdown list of Fabric Manager field for printing process
    And Fabric manager assistants should display based on the selection of Fabric Manager for printing process
    And Select Fabric Executive from the dropdown list for printing process
    #When Verify the Freight budget details section is displaying or not
    #And Verify the quantity is displaying for greige dyeing and printing process or not
    #And verify the rate is displaying as zero for greige dyeing and printing process or not
    #And verify the conversion rate is displaying as zero for greige dyeing and printing process or not
    #And verify the cost is displaying as zero for greige dyeing and printing process or not
    And Click on submit button to save the mu working

  @tag1
  Scenario: Verification of submitting the MU working for Shiffly process
Given Navigates to the Login page
    Then Enter valid Username and password
    And Click on SignIn
    And navigate to New Fabric Sheet working screen
    And Click on styles expansion
    And click on IPO in the styles expansion
    And Verify that data is displaying in grids after selecting the IPO
    And Click on Edit icon in MU Working grid
    And Verify the Fabric Required is displaying the value or not
    And Enter the value in Residual shrinkage
    And select the process1 as Shiffly process
    Then select the process2 as NA
    Then verify the qty in greige field whether value is displaying or not
    And Enter the data in Shiffly process section fields
    Then Enter Fabric Budget details for greige process
    And Enter Fabric Budget details for Shiffly process
    And Click on submit button to save the mu working
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    