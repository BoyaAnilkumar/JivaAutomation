@FeatureGroup
Feature: feature to test Jiva design Sweater View Yarn Sheet screen functionality

@SWViewYarnSheet
Scenario: Validate user click on the Sweater View Yarn Sheet screen in menu
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet

@SWViewYarnSheet
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet
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

@SWViewYarnSheet
Scenario Outline: Check whether the Information bar Selected IPO details
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet
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
And the Bulk Yarn Deadline should be displayed correctly
And the Sourcing Manager should be displayed
And the Sourcing Manager Assistants should be displayed
Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWViewYarnSheet
Scenario Outline: Verify the Yarn Details,Garment Average, and Quantity Requirements Grid
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Click on the Yarn Details Expansion 
And the Yarn details Data is displayed or not
And Click on the Garment Average Expansion 
Then the Garment details are displayed or not
And Quantity Requirement Grid data is displayed or not

Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWViewYarnSheet
Scenario Outline: Verify the View For Print by Combo Name button Functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the View For Print by Combo Name button
And Verify the IPO details are displayed or not
And Verify the Quantity Requirements Grid Data is displayed or not
And Click on the Print button


Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWViewYarnSheet
Scenario Outline: Verify the View For Print by Yarn Quality button Functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the View For Print by Yarn Quality button
And Verify the IPO details are displayed or not
And Verify the Quantity Requirements Grid Data is displayed or not
And Click on the Print button
Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWViewYarnSheet
Scenario Outline: Verify the View For Print by Yarn Sheet button Functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the View For Print by Yarn Sheet button
And the Yarn details Data is displayed or not
Then the Garment details are displayed or not
And Quantity Requirement Grid data is displayed or not
Examples:
|  StyleOrIPO|
|   IPO1806  |

@SWViewYarnSheet
Scenario Outline: Verify the History button Functionality
Given User navigates to Login page
Then user enter the Username and password
And User click on the signIn
And Click on Sweater module
Then Click on the Merchandising Module
And Click on the Reports dropdown
And Click on the View Yarn Sheet
And User click on the Style Expansion
And Click on the Filter Icon in Style Expansion
And Enter the Buyer "<StyleOrIPO>" in Search By Buyer Style Or IPO
And click on the Apply button 
And Select the IPO in the Styles List
Then Click on the History Button
And The History Grid Header names are displayed or not
Then the History Grid Data is displayed or not
And Click on the Back Button


Examples:
|  StyleOrIPO|
|   IPO1806  |

