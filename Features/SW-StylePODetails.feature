
@FeatureGroup
Feature: feature to test Jiva design Sweater Style Po Details screen functionality

@SWStylePODetails
Scenario: Validate user click on the Style PO Details screen in menu
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details

@SWStylePODetails
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Validate whether the Selected IPO "<StyleIPO>" is displayed in the IPO list or not
And Click on the Filter Icon in Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select "<Season>" in the Filter option page
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List

Examples:
|Buyer       |     Season     |  StyleOrIPO      |StyleIPO         |
|Test buyer  |     Fall       |   IPO1806        |IPO1806 / Style2 |
 
@SWStylePODetails
Scenario Outline: Verify the Add PO details functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New PO button in the Style PO Details Screen
When User enter the data in the "<PO>" field in the PO details section
And Select the PO Details 
And Enter the "<POQty>" in the PO Qty field
When Enter the data in the "<Shortage>" Allowed field
And Enter the data in the "<Addl_Shippment>" field
And Enter the data in the Shippment Priority "<Priority>" field
And Select the Combos in the Applicable Combos field in the Combos Section
And Select the Garments in the Garment Size Type Selection field
And Select the Ex factory date
And Enter the data "<Days>" Kept In Hand field
And Check the Ex Factory For Production field data is preopulated or not
And Select the Requested Ex "<Factory>" field
Then Select the Handover Date in handover details section
And Select the "<Mode>" in Handover details section
Given Enter the data "<Comments>" in the Comments section 
And Enter the PO Size wise details 
And Check the Size wise Details PO Qty fields data is preppopulated or not
And The User Click on the Submit button in the Style PO Details Screen
And Verify the on Submit the Validation msg is displaying or not
Examples:
|  StyleOrIPO|PO    |POQty |Shortage  |Addl_Shippment |Priority |Days  |Factory  |Mode  |Comments          |
|   IPO1806  |PO1   |100   |5         |8              |2        |5     |02032024 |Sea   |Style Po details  |


@SWStylePODetails
Scenario Outline: Check whether the Information bar Selected IPO details
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
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
And Verify the Selected IPO Combinations and Garment size types are displayed or not

Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWStylePODetails
Scenario Outline: Verify the PO Summary and PO Size wise details Grids are displayed or not
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
 And Check the PO Summary grid is displaying or not
 And Verify the PO Summary grid header section columnn names are displaying or not
 And Check the PO Size wise details Grid is displaying or not

Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWStylePODetails
Scenario Outline: Validate Add PO without enter the data
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New PO button in the Style PO Details Screen
Then Without enter the data and click on the Submit button the toaster message is displayed
Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWStylePODetails
Scenario Outline: Verify the Added data is displayed in the Grid
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Verify the Added PO Summary are displayed in the PO Summary grid
And Verify the PO Size wise details are displayed in the PO Size wise details Grid

Examples:
|  StyleOrIPO|
|   IPO1806  |


@SWStylePODetails
Scenario Outline: Verify the Update Style PO details functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And User Click on the Edit Icon in the Actions Column and the update form is displayed or not
When User enter the data in the "<PO>" field in the PO details section
And Enter the "<POQty>" in the PO Qty field
When Enter the data in the "<Shortage>" Allowed field
And Enter the data in the "<Addl_Shippment>" field
And Enter the data in the Shippment Priority "<Priority>" field
And Select the "<Mode>" in Handover details section
Given Enter the data "<Comments>" in the Comments section 
And Enter the PO Size wise details 
And Check the Size wise Details PO Qty fields data is preppopulated or not
And The User Click on the Submit button in the Style PO Details Screen
And Verify On Submit in Update form the update Validation msg is displaying or not

Examples:
|  StyleOrIPO|PO    |POQty |Shortage  |Addl_Shippment |Priority |Days  |Factory  |Mode                |Comments                 |
|   IPO1806  |PO2   |150   |6         |3              |1        |6     |02032024 | Air at Jiva cost   |Update Style Po details  |

@SWStylePODetails
Scenario Outline: Verify the View Icon functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Click on the View Icon the Comments Popup page is displayed or not
And Check the Comments Data is displayed or not and Click on the Close button

Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWStylePODetails
Scenario Outline: Verify the PO Qty and IPO Qtys validation functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New PO button in the Style PO Details Screen
When User enter the data in the "<PO>" field in the PO details section
And Select the PO Details 
And Enter the "<POQty>" in the PO Qty field
When Enter the data in the "<Shortage>" Allowed field
And Enter the data in the "<Addl_Shippment>" field
And Enter the data in the Shippment Priority "<Priority>" field
And Select the Combos in the Applicable Combos field in the Combos Section
And Select the Garments in the Garment Size Type Selection field
And Select the Ex factory date
And Enter the data "<Days>" Kept In Hand field
And Check the Ex Factory For Production field data is preopulated or not
And Select the Requested Ex "<Factory>" field
Then Select the Handover Date in handover details section
And Select the "<Mode>" in Handover details section
Given Enter the data "<Comments>" in the Comments section 
And Enter the PO Size wise details 
And Check the Size wise Details PO Qty fields data is preppopulated or not
And The User Click on the Submit button in the Style PO Details Screen
And Verify the PO Qty field Validation msg is displaying or not

Examples:
|  StyleOrIPO|PO    |POQty   |Shortage  |Addl_Shippment |Priority |Days  |Factory  |Mode  |Comments          |
|   IPO1806  |PO1   |10000   |5         |8              |2        |5     |02032024 |Sea   |Style Po details  |

@SWStylePODetails
Scenario Outline: Verify the PO Qty and IPO Qtys validation functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Add New PO button in the Style PO Details Screen
When User enter the data in the "<PO>" field in the PO details section
And Select the PO Details 
And Enter the "<POQty>" in the PO Qty field
When Enter the data in the "<Shortage>" Allowed field
And Enter the data in the "<Addl_Shippment>" field
And Enter the data in the Shippment Priority "<Priority>" field
And Select the Combos in the Applicable Combos field in the Combos Section
And Select the Garments in the Garment Size Type Selection field
And Select the Ex factory date
And Enter the data "<Days>" Kept In Hand field
And Check the Ex Factory For Production field data is preopulated or not
And Select the Requested Ex "<Factory>" field
Then Select the Handover Date in handover details section
And Select the "<Mode>" in Handover details section
Given Enter the data "<Comments>" in the Comments section 
And Enter the PO Size wise details Should not be more than the"<POSizeQty>" 
And Check the Size wise Details PO Qty fields data is preppopulated or not
And The User Click on the Submit button in the Style PO Details Screen
And Verify the garment Size breakups Qty and PO Qty field Validation msg is displaying or not

Examples:
|  StyleOrIPO|PO    |POQty   |Shortage  |Addl_Shippment |Priority |Days  |Factory  |Mode  |Comments          |POSizeQty|
|   IPO1806  |PO1   |10      |5         |8              |2        |5     |02032024 |Sea   |Style Po details  |1111112  |


@SWStylePODetails
Scenario Outline: Verify the Delete Added PO functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on Data Entry dropdown
And Click on the Style PO Details
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the Delete Icon in Actions Column


Examples:
|  StyleOrIPO|
|   IPO1806  |


