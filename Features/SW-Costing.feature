#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Sweater_Costing
Feature: Add Costing details for Style
  I want to use style to add the costing details and submit

  @Sweater_Costing_View
  Scenario: Verify the Costing screen displaying the entry fields to enter the data
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Costing screen in sweater module
    And Click on Style expansion in sweater

  @Create_Sweater_Costing
  Scenario Outline: Verification of Creating the costing
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Costing screen in sweater module
    And Click on the style in costing expansion
    And Click on Add a Combo button
    Then User has entered "<Combo name>" and "<Combo quantity>"
    And Enter Garment average"<Garment Average>"
    Then User has entered wastage"<Wastage>"
    And User has entered rate"<Rate>"
    And User has entered additional sampling cost"<Addlitional Sampling cost>" and "<Per pc Freight cost>"
    Then click on Trims and Accessories"<Trim Category>" and "<Trim Item>" and "<Trim&Accessories Avg garment>" and "<Trims Wastage>" and "<Trims Rate>"
		And Click on Add Knitting button and enter data for"<Knitting Structure>" and "<GG>" and "<NumberofEnds>" and "<Knitting Time>" and "<Knitting Buffer>"
		And Enter Garment Linking rate"<Garment Linking>"
	#ComputerEmbroidery
		Given Enter No of Stiches
    Given Enter Rate
    Given Enter Overhead
    Given Enter Addl Charges
    #Adda Embriodiery
    Given Enter Adda Hours
    Given Enter Adda Rate
    Given Enter Adda Overhead
     #Manual Embriodiery
    Given Enter Manual Hours
    Given Enter Manual Rate
    Given Enter Manual Overhead
    #Stitching
    When To verify on clicking the Add Process button under Stitching
    Given Enter a value in OB1
    Given Enter a value in OB2
    Given Enter a value in OB3
    Given Enter a value in Cost1
    Given Enter a value in Cost2
    Given Enter a value in Cost3
    Then Select an option in Booked field
    Given Enter a value in Smocking
    Given Enter a value in Rate
    When To verify whether the user is able to click the Description dropdown field or not
    Then Select a value from the dropdown field
    Given Enter the Stitching Cost value 
    
    #Finishing and PAcking
    Then Click on the Add Process button under Finising and Packing grid
    Then Select a Finishing and Packing process1
    Given Enter the Finishing and Packing cost1
    
 		#Washing / GArment process
    Then Check the Yes or No toggle button status
    Then Click on the Add Process button when the toggle button is in enabled state
    Then Select a Washing Process1
    Given Enter the Washing Cost1

    #testing and inspection
    Given Enter the value in the FPT GPT Total Cost field
    Given Enter the value in the FPT GPT Cost field
    Given Enter the value in the Addl Tests Total Cost field
    Given Enter the value in the Addl Tests Cost field
    Given Enter the value in the Inspection Charges Total Cost field
    Given Enter the value in the Inspection Charges Cost field

    #Freight And Clearance
    Given Enter the value in the NO of PO by Sea field
    Given Enter the value in the NO of PO by Air field
    Given Enter the value in the Custom Clearance Total Cost field
    Given Enter the value in the Custom Clearance Cost field
    Given Enter the value in the Cartage Total Cost field
    Given Enter the value in the Cartage Cost field
    Given Enter the value in the Additional Buffer field

    #TOTAL DIRECT EXPENSE
    Given Enter the value in the Rejection field
    Given Enter the value in the OverHead field
    Given Enter the value in the Profit MarkUp field
    Given Enter the value in the Commission field
    Given Enter the value in the Currency field
    Given Enter the value in the Price Quoted To Buyer field
    
    
		
    Examples: 
      | Combo name | Combo quantity | Garment Average | Wastage | Rate | Addlitional Sampling cost | Per pc Freight cost | Trim&Accessories Avg garment | Trims Wastage | Trims Rate |Trim Category| Trim Item				| Knitting Structure | GG | NumberofEnds | Knitting Time | Knitting Buffer | Garment Linking | 
      | name1      |              5 |               5 |       2 |   10 |                         2 |                   2 |                           10 |             5 |         12 |Job Work 		 | Tassel Making		| Intarsia 					 | 2.5| 15					 | 10						 | 6							 | 6.5						 |
      | name2      |              7 |               6 |     3.5 |   15 |                       4.2 |                   3 |                           12 |             7 |         10 |Labels 			 | Barcode sticke		| Pointelle 				 | 3.8| 12					 | 15 					 | 7							 | 4.8						 |
