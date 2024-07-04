
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
    And Click on style in costing expansion"<Style Name>"
    And Click on Add a Combo button
    Then User has entered "<Combo name>" and "<Combo quantity>"
    And Enter Garment average"<Garment Average>"
    Then User has entered wastage"<Wastage>"
    And User has entered rate"<Rate>"
    And User has entered additional sampling cost"<Addlitional Sampling cost>" and "<Per pc Freight cost>"
    Then click on Trims and Accessories"<Trim Category>" and "<Trim Item>" and "<Trim&Accessories Avg garment>" and "<Trims Wastage>" and "<Trims Rate>"
		And Click on Add Knitting button and enter data for"<Knitting Structure>" and "<GG>" and "<NumberofEnds>" and "<Knitting Time>" and "<Knitting Buffer>"
		And Enter Garment Linking rate"<Garment Linking>"
		And Enter Additional Process cost in INR
	#ComputerEmbroidery
		Given Enter No of Stiches
    Given Enter Rate in Sweater costing"<ComputerEMB Rate>"
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
    
    #Finishing and PAcking
    Then Click on the Add Process button under Finising and Packing grid
    Then Click on Finishing process and select value from dropdown
    Given Enter cost for the selected value
    
 		#Washing / GArment process
    Then Check the Yes or No toggle button status
    Then Select a Washing Process1 in sw costing
    Given Enter the Washing Cost1 in sw costing

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
    
      #Submit Buttons
    Then Click on the PSave button
    Then Click on the Submit button
    Then Click on the View For Print button
    Then Click on the Cancel in the Print form
    Then Click on the Download As Excel button
    
		
    Examples: 
     | Style Name| Combo name | Combo quantity | Garment Average | Wastage | Rate | Addlitional Sampling cost | Per pc Freight cost | Trim&Accessories Avg garment | Trims Wastage | Trims Rate |Trim Category| Trim Item				| Knitting Structure | GG | NumberofEnds | Knitting Time | Knitting Buffer | Garment Linking | ComputerEMB Rate | 
     | Style5 	 | name1      |          2000  |               5 |       2 |   10 |                         2 |                   2 |                           10 |             5 |         12 |Job Work 		| Tassel Making		| Intarsia 					 | 2.5| 15					 | 10						 | 6							 | 6.5						 | 5								|
     | Style6    | name2      |          2500  |               6 |     3.5 |   15 |                       4.2 |                   3 |                           12 |             7 |         10 |Labels 			| Barcode sticker	| Pointelle 				 | 3.8| 12					 | 15 					 | 7							 | 4.8						 | 12								|
