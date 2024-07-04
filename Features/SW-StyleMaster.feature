@SweaterStylemaster
Feature: Create Styles in sweater style master
  I want to create style for the buyer by assigning the pd merchat to the style

  Background: 
    Given User navigates to Login page
    Then User enters the username and password
    And User click on the signIn
    And Click on Sweater module
    Then Click on PD module in sw module
    And Click on Data Entry in PD Module
    Then click on Style master screen in sweater module

  @SWStyleMasterCreate
  Scenario Outline: Create Style Master
    Then Click on Add Style button
    And Enter PD Merchant Name and Select
    Then Enter Buyer Style name "<BuyerStyle>"
    Then Select Buyer from the dropdown list "<Buyer>"
    Then Select Season from dropddown list "<Season>"
    Then Select Garment Type from dropdown list "<GarmentType>"
    Then Select Garment Process from dropdown list "<GarmentProcess>"
    Then Enter the Garment Gauge "<GarmentGauge>"
    And Click on Save button to create style

    Examples: 
      | BuyerStyle | Buyer            | Season  | GarmentType | GarmentProcess | GarmentGauge |
      | Style5     | Amazon (Core)    | Fall    | Baby set    | Basic          |           35 |
      | Style6     | Amazon (Release) | Holiday | Cami        | Computer emb   |           25 |
      | Style7     | Beach Riot       | Spring  | Henley      | Basic          |           14 |

  @SWStyledetails
  Scenario Outline: update order details for the selected style
    And Click on Filter button in style master
    Then Enter the Style name in Search By Style"<Search>"
    And Click on style name
    When User click on the add revise estimates button
    And Click on the Generate new order radio button
    And Select the Order Type
    And Select the Order date
    And Select the Exfactory date
    Given User enter the Order qty
    And Select the Costing Version
    And click on the Save button in create style master

    Examples: 
      | Search |
      | Style5 |
      | Style6 |
      | Style7 |

  @SWStyleEditandUpdate
  Scenario Outline: Edit and Update Style Master
    And Click on Filter button in style master
    Then Enter the Style name in Search By Style"<Search>"
    When user clicked on Edit icon
    And update the style master data"<Buyer>","<Season>","<GarmentType>","<GarmentProcess>","<GarmentGauge>"
    Then Click on update button to save the data

    Examples: 
      | Search | Buyer   | Season  | GarmentType | GarmentProcess | GarmentGauge |
      | Style5 | Andamen | Holiday | Blazer      | Computer emb   |           40 |

  @SWStyleTechpackdetails
  Scenario Outline: update Tech pack details for style
    And Click on Filter button in style master
    Then Enter the Style name in Search By Style"<Search>"
    And Click on style name
    And Click on the Add new tech pack button"<TechpackName>","<TechPackDesc>","<ReceivedDate>"
    Then Click on update button to save the data

    Examples: 
      | Search | TechpackName | TechPackDesc | ReceivedDate |
      | Style5 | Andamen      | Holiday      |     04072024 |

  @SWStyleSamplingDetails
  Scenario Outline: update sampling details for style
    And Click on Filter button in style master
    Then Enter the Style name in Search By Style"<Search>"
    And Click on style name
    And Click on the Add sampling details button
    #And Select the sampling status"<samplingstatus>"
    Given User Click the Sampling type"<sampplingtype>"
    And Select the Submission date"<submissiondate>"
    And Click on the sampling Save button

    Examples: 
      | Search | samplingstatus | sampplingtype    | submissiondate |
      #| Style5 | Submitted      | Development      |     04072024   |
      |Style5  |								|	Fit              |     05072024   |
      
      
     @SWStyleMasterSorting
     Scenario: Sorting the Style Master grid data
     Given user clicked on Sorting icon in grid header
      
      
      
      
      
