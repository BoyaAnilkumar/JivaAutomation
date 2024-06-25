@FeatureGroup
Feature: feature to test Jiva design Sweater PD Yarn Pricing screen functionality

@SW_PD_Yarn_Pricing
Scenario Outline: Validate user click on the Sweater PD Yarn Pricing screen in menu
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Data Entry dropdown
And Click on the PD Yarn Pricing Screen
Examples:
| username   | password   |
| ravi       | Abcd@123   |
@SW_PD_Yarn_Pricing
Scenario Outline: Verify the Filter functionality in the Style expansion
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Data Entry dropdown
And Click on the PD Yarn Pricing Screen
And User click on the Style Expansion
And Click on the Filter Icon in Pricing Style Expansion
And Select the "<Buyer>" in Filter option page
Then Select the season "<Season>" in the Filter option page
And Select the Status "<Status>" in filter Option page
And Enter the Buyer "<Style>" in Search By Style
And click on the Apply button 
And Select the Style in the Styles List
And Verify the Selected Style Details are displayed or not
Examples: 
|Buyer             |     Season     | Status       | Style           | username   | password   |
|8 Seconds         |     Fall       |   Expected   |  Style90        |ravi        | Abcd@123   |

@SW_PD_Yarn_Pricing
Scenario Outline: Verify the Nominated Yarn functionality
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Data Entry dropdown
And Click on the PD Yarn Pricing Screen
And User click on the Style Expansion
And Click on the Filter Icon in Pricing Style Expansion
And Enter the Buyer "<Style>" in Search By Style
And click on the Apply button 
And Select the IPO in the Styles List
And Verify whether the Yarn Quality field data is prepopulated or not
And Verify the Content field data is prepopulated or not
And Verify the Spin Type field data is prepopulated or not
And Verify the color field data is prepopulated or not
And Verify the Count Construction field data is prepopulated or not
And Verify the Finish field data is prepopulated or not
And Verify the Specific Requirements field data is prepopulated or not
And Verify the Yarn Quantity field data is prepopulated or not
And Verify the Use field data is prepopulated or not

Examples:
| Style           | username   | password   |
|  Style90        |ravi        | Abcd@123   |

@SW_PD_Yarn_Pricing
Scenario Outline: Verify the Add Yarn Pricing functionlity
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Data Entry dropdown
And Click on the PD Yarn Pricing Screen
And User click on the Style Expansion
And Click on the Filter Icon in Pricing Style Expansion
And Enter the Buyer "<Style>" in Search By Style
And click on the Apply button 
And Select the IPO in the Styles List
And Verify whether the Yarn Quality field data is prepopulated or not
And Verify the Content field data is prepopulated or not
And Verify the Spin Type field data is prepopulated or not
And Verify the color field data is prepopulated or not
And Verify the Count Construction field data is prepopulated or not
And Verify the Finish field data is prepopulated or not
And Verify the Specific Requirements field data is prepopulated or not
And Verify the Yarn Quantity field data is prepopulated or not
And Verify the Use field data is prepopulated or not
And Verify the first Process is not selected and CLick on the Add Pricing button
Then Validation message should be displayed 
And Verify the without adding the data click on the Delete icon the validation is displayed or not
And Select the "<Process>" in the Pricing Grid
Given Enter data in the "<Price>" field the Pricing Grid
And Select the Yarn Supplier
When Enter the data in the Process Remarks field
And Enter the data in the "<TotalPrice>" total Price field 
And Enter the data in the Remarks field
And enter the data in the Total Yarn Lead Time
And Enter the data in the Price Valid For Days
And Enter the Yarn call outs Remarks
And Click on the Save button in the PD Yarn Pricing
And Verify the On Save validation is displayed or not
And Click on the Submit to Po Merchant team the validation msg is displayed or not


Examples:
| Style           | username   | password   |Process     |Price     |TotalPrice    |
|  Style90        |ravi        | Abcd@123   | Dyeing     | 5        |10            |

@SW_PD_Yarn_Pricing
Scenario Outline: Verify the View for Print functionlity
Given User navigates to Login page
Then the User enters "<username>", and "<password>"
And User click on the signIn
And Click on Sweater module
Then Click on the Yarn Sourcing Module
And Click on the Sourcing Data Entry dropdown
And Click on the PD Yarn Pricing Screen
And User click on the Style Expansion
And Click on the Filter Icon in Pricing Style Expansion
And Enter the Buyer "<Style>" in Search By Style
And click on the Apply button 
And Select the IPO in the Styles List
And Click on the View for Print button
And Verify the Select Style Details are displayed or not
#And CLick on the Print button

Examples:
| Style           | username   | password   |
|  Style90        |ravi        | Abcd@123   |

