@FeatureGroup
Feature: feature to test Jiva design New Yarn Sheet screen functionality

@New_Yarn_Sheet2
Scenario Outline: Validate user click on the New Yarn Sheet screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
Then Click on the Generate Yarn Sheet dropdown 
And Click on the New Yarn Sheet Screen
Examples:
| username   | password   |
| Admin      | Abcd@123   |
#|Lavanya     | Abcd@123  |

@New_Yarn_Sheet_filter
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
Then Click on the Generate Yarn Sheet dropdown 
And Click on the New Yarn Sheet Screen
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select "<Season>" in the Filter option page
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List

Examples:
|Buyer       |     Season     |  StyleOrIPO      |
|Test buyer  |     Fall       |   IPO1206        |

@New_Yarn_Sheet_Add
Scenario Outline: Verify the Adding New Yarn functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
Then Click on the Generate Yarn Sheet dropdown 
And Click on the New Yarn Sheet Screen
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New Yarn Sheet button
When I click "<action>" the Isnominated checkbox labeled "<label>"
And Select the Supplier name "<Supplier>"
And Select the "<YarnQuality>"
And Select the content"<Content>"
Then Select the Count"<count>"
And Select the yarn use "<Use>"
And Select the Supplier internal Code
Given enter the data in Finish Special Requirements
Then Select the Colour"<Color>"
And Select the Combos in the Applicable Combos field
When User enter the data in Additional information field
And Enter the Additional percentage
And Select the PO Type
Given User enter the "<BaseSize>" Average
And Enter the data in "<percentage>" field
And Check the Size Breakups are prepopulated or not
And Enter the Missy Garment size PO Qty
And Enter the Pettite garment size PO Qty
And Enter the Tall Garment size PO Qty
And Enter the Women Garment size PO Qty
And Check the IPO Qty is prepopulated or not
Then Check the Avg Values are prepopulated or not
And Verify the Based on the Garment Size type PO Qty is prepopulated in the PO Qty field or not
And Verify the Based on the Garment Size type IPO Qty is prepopulated in the PO Qty field or not
And The Knitting Avg field data is prepopulated or not
When User enter the Linking Avg data"<LinkingAvg>" 
#sampling details
And Enter the data in the Size set field"<Sizeset>"
When User enter the data in the Testing field"<Testing>"
And User enter the data in the Sealer field"<Sealer>"
And User enter the data in the TOP field"<TOP>"
Given User enter the data in the ShipmentPlatform Sample"<Shipment>"
Given User enter the data in the Photoshoot Meeting Sample"<Photoshoot>"
And The User Select the Garment Average UOM 
And User Select the Required UOM
And Check the data is prepopulated in the Yarn Required For Production field or not
And Check the data is prepopulated in the Yarn Required For Sampling field or not
And Check the data is prepopulated in the Total Yarn Required field or not
And The User Click on the Submit button
Given Enter the data in the "<BulkYarnDeadline>"
And User Select the Sourcing Manager "<Sourcingmanager>"
And Click on the Save button in the New Yarn Sheet
Examples:
|  StyleOrIPO| action |  label       | Supplier   |YarnQuality   | Content               |Use      |  Color   |BaseSize |percentage  |LinkingAvg|Sizeset|Testing|Sealer|TOP|Shipment|Photoshoot|BulkYarnDeadline|Sourcingmanager|
|   IPO1206  |  check | Is Nominated?| Anil kumar |Acrylic Nylon |  80% acrylic 20% nylon|Shell    | Almond   | 5       |4           |2         |4      |6      |     2|3  |4       |4         |      4          | Ravi Teja     |
#|   IPO1206  |uncheck | Is Nominated?| Anil Kumar | Cotton       |   100% cotton         |Main body|Black     |  6      |7           |  3       |2      |8      |  6   | 1 |  6     |5         |       4         | Ravi Teja     |

@New_Yarn_Sheet2
Scenario Outline: Validate Add New Yarn without enter the data
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
Then Click on the Generate Yarn Sheet dropdown 
And Click on the New Yarn Sheet Screen
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New Yarn Sheet button
And The User Click on the Submit button
Then Validation message should be displayed 
Examples:
|  StyleOrIPO|
|   IPO1206  |

@New_Yarn_Sheet_Submit
Scenario Outline: To Test the Submit To Yarn Team button functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion   
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Submit to yarn team button

Examples:
|  StyleOrIPO|
|   IPO1206  |

@New_Yarn_Sheet2
Scenario Outline: Verify the Update Yarn details functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And User Click on the Edit Icon
Given User enter the "<BaseSize>" Average
And Enter the data in "<percentage>" field
And The User Click on the Submit button
And Click on the Save button in the New Yarn Sheet
When The User click on the Save button the validation message is displayed or not

Examples:
|  StyleOrIPO|BaseSize |percentage  |
|   IPO1206  |8        |3           |
|   IPO1206  |4        |5           |

@New_Yarn_Sheet1
Scenario Outline: To Test the PO Qty validation functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New Yarn Sheet button
When I click "<action>" the Isnominated checkbox labeled "<label>"
And Select the Supplier name "<Supplier>"
And Select the "<YarnQuality>"
And Select the content"<Content>"
Then Select the Count"<count>"
And Select the yarn use "<Use>"
Then Select the Colour"<Color>"
And Select the Combos in the Applicable Combos field
And Select the PO Type
Given User enter the "<BaseSize>" Average
And Enter the data in "<percentage>" field
And Enter the "<POQty>" PO qty
When User enter the Linking Avg data"<LinkingAvg>"
And Enter the data in the Size set field"<Sizeset>"
When User enter the data in the Testing field"<Testing>"
And User enter the data in the Sealer field"<Sealer>"
And User enter the data in the TOP field"<TOP>"
Given User enter the data in the ShipmentPlatform Sample"<Shipment>"
Given User enter the data in the Photoshoot Meeting Sample"<Photoshoot>"
And The User Click on the Submit button
And Check the PO Qty validation is displayed or not
Examples:
|  StyleOrIPO| action |  label       | Supplier   |YarnQuality   | Content               |Use      |  Color   |BaseSize |percentage  |LinkingAvg|Sizeset|Testing|Sealer|TOP|Shipment|Photoshoot|POQty|
|   IPO1206  |  check | Is Nominated?| Anil kumar |Acrylic Nylon |  80% acrylic 20% nylon|Shell    | Almond   | 5       |4           |2         |4      |6      |     2|3  |4       |4         |5|

@New_Yarn_Sheet
Scenario Outline: Verify the Delete Yarn functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Delete Icon in Yarn details Column
And Click on the Save button in the New Yarn Sheet
When The User click on the Save button the validation message is displayed or not

Examples:
|  StyleOrIPO|
|   IPO1206  |

@New_Yarn_Sheet
Scenario Outline: Check whether the Information bar Selected IPO details
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then the selected style should be displayed
And the selected IPO name should be displayed
And the buyer style should be displayed correctly
And the PO quantity should be displayed
And the IPO quantity should be displayed
And the date submitted data should be displayed

Examples:
|  StyleOrIPO|
|   IPO1206  |

@New_Yarn_Sheet
Scenario Outline: Verify the WithIn IPO Import Yarn details functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New Yarn Sheet button
Then Verify whether the Import popup window is opened when clicked on the Import Yarn Details button
And Select the WithIn_IPO in Import Yarn details popup
And Verify without Select the Yarn and click on the Import button the validation msg is displayed
And Select the Yarn in the Import yarn details Popup
And Click on the Import button in the yarn details Popup
And Select the yarn use "<Use>"
Then Select the Colour"<Color>"
And Select the Combos in the Applicable Combos field
And Select the PO Type
Given User enter the "<BaseSize>" Average
And Enter the data in "<percentage>" field
And Enter the Missy Garment size PO Qty
And Enter the Pettite garment size PO Qty
And Enter the Tall Garment size PO Qty
And Enter the Women Garment size PO Qty
When User enter the Linking Avg data"<LinkingAvg>"
And Enter the data in the Size set field"<Sizeset>"
When User enter the data in the Testing field"<Testing>"
And User enter the data in the Sealer field"<Sealer>"
And User enter the data in the TOP field"<TOP>"
Given User enter the data in the ShipmentPlatform Sample"<Shipment>"
Given User enter the data in the Photoshoot Meeting Sample"<Photoshoot>"
And The User Click on the Submit button
And Click on the Save button in the New Yarn Sheet

Examples:
|  StyleOrIPO| Use       |  Color |BaseSize |percentage |LinkingAvg|Sizeset|Testing|Sealer |TOP|Shipment|Photoshoot|
|   IPO2     | Main body | Blue   | 8       |5          | 4        |7      |2     |   4   |5  |2       |6         |

@New_Yarn_Sheet
Scenario Outline: Verify the Other IPO Import Yarn details functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New Yarn Sheet button
Then Verify whether the Import popup window is opened when clicked on the Import Yarn Details button
And Select the Other_IPO in Import Yarn details popup
And Click on the Import button in the yarn details Popup
Then Validation message should be displayed 
And Select the IPO in the Import yarn details page
And Select the Other IPO Yarn in the Import yarn details Popup
And Click on the Import button in the yarn details Popup
And Select the yarn use "<Use>"
Then Select the Colour"<Color>"
And Select the Combos in the Applicable Combos field
And Select the PO Type
Given User enter the "<BaseSize>" Average
And Enter the data in "<percentage>" field
And Enter the Missy Garment size PO Qty
And Enter the Pettite garment size PO Qty
And Enter the Tall Garment size PO Qty
And Enter the Women Garment size PO Qty
When User enter the Linking Avg data"<LinkingAvg>"
And Enter the data in the Size set field"<Sizeset>"
When User enter the data in the Testing field"<Testing>"
And User enter the data in the Sealer field"<Sealer>"
And User enter the data in the TOP field"<TOP>"
Given User enter the data in the ShipmentPlatform Sample"<Shipment>"
Given User enter the data in the Photoshoot Meeting Sample"<Photoshoot>"
And The User Click on the Submit button
#And Click on the Save button in the New Yarn Sheet

Examples:
|  StyleOrIPO| Use       |  Color |BaseSize |percentage |LinkingAvg|Sizeset|Testing|Sealer |TOP|Shipment|Photoshoot|
|   IPO2     | Main body | Blue   | 8       |5          | 4         |7      |2     |   4   |5  |2       |6         |

@New_Yarn_Sheet
Scenario Outline: Verify the PD YDS Import Yarn details functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New Yarn Sheet button
Then Verify whether the Import popup window is opened when clicked on the Import Yarn Details button
And Select the PD YDS in Import Yarn details popup
And Verify without Select the Yarn and click on the Import button the validation msg is displayed
And Select the PD YDS Yarn in the Import yarn details Popup
And Click on the Import button in the yarn details Popup
And Select the yarn use "<Use>"
Then Select the Colour"<Color>"
And Select the Combos in the Applicable Combos field
And Select the PO Type
Given User enter the "<BaseSize>" Average
And Enter the data in "<percentage>" field
And Enter the Missy Garment size PO Qty
And Enter the Pettite garment size PO Qty
And Enter the Tall Garment size PO Qty
And Enter the Women Garment size PO Qty
When User enter the Linking Avg data"<LinkingAvg>"
And Enter the data in the Size set field"<Sizeset>"
When User enter the data in the Testing field"<Testing>"
And User enter the data in the Sealer field"<Sealer>"
And User enter the data in the TOP field"<TOP>"
Given User enter the data in the ShipmentPlatform Sample"<Shipment>"
Given User enter the data in the Photoshoot Meeting Sample"<Photoshoot>"
And The User Click on the Submit button
#And Click on the Save button in the New Yarn Sheet

Examples:
|  StyleOrIPO| Use       |  Color |BaseSize |percentage |LinkingAvg|Sizeset|Testing|Sealer |TOP|Shipment|Photoshoot|
|   IPO2     | Main body | Blue   | 8       |5          | 4         |7      |2     |   4   |5  |2       |6         |

@New_Yarn_Sheet
Scenario Outline: Verify the Added data is displayed in the Grid
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Verify the Added Yarn details are displayed in the Yarn details grid
And Verify the Garment Average details are displayed in the Garment Average Grid
And Verify the Quantity details are displayed in the Quantity Requirements grid

Examples:
|  StyleOrIPO|
|   IPO1206  |

@New_Yarn_Sheet
Scenario Outline: Verify the View For Print functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on the Merchandising Module in the Sweater module
And Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the View For Print Button
And Verify the IPO details are displayed or not
And Verify the Added Yarn details are displayed in the Yarn details grid
And Verify the Garment Average details are displayed in the Garment Average Grid
And Verify the Quantity details are displayed in the Quantity Requirements grid



Examples:
|  StyleOrIPO|
|   IPO1206  |