@tag
Feature: Adding the processes for a fabric

@RevisedMUWorking1
Scenario: Submit the fabric sheet details in Revised fabric sheet
When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to Revised Fabric Sheet Working screen
And click on Styles expansion
And click on clear filter icon
Then click on filter icon
#And Click on buyer1 dropdown 
#Given Enter Buyer in search box
Then Select a Buyer from dropdown list
Then Select a Season from dropdown list
Then Select a Status from dropdown list
Then Enter an IPO name in the Search by Buyer Style or IPO textbox field
And Click on the Filt_Apply button
Then Click on Filter button 
Then Verify whether data is getting cleared or not on OnClick the Reset button
And Verify whether the user is able to Select an IPO from the Menu list
Then Click on the Style ShowHide button for closing the menu list
Then Verify the count of the Fabric records under the Fabric Details grid



  @RevisedMUWorking
  Scenario: Adding the Dyeing and Printing processes
  When user navigates to Login page
  Given Login with the Production Manager
  And Click on the SignIn button
  Then Navigate to Revised Fabric Sheet Working screen
  Then Click_on_the_Styles_expansion
  Then Click_on_Clear_Filter_icon
  And Select an IPO from the Menu list
  #And Verify that data is displaying in grids after selecting the IPO
  #And Navigate_to_Revised_Fabric_Sheet_Working_screen
  And Click_on_Edit_icon_in_MU_Working_grid_for_a_Fabric
  #And Verify the Final Fabric Required qty value
  #Given Enter_the_value_in_the_Residual_Shrinkage_field
  #Then Select_a_process_in_the_Process1_field
  #Then Select_another_process_in_the_Process2_field
  #Then Verify_the_Greige_Qty_value
  #Given Enter_Dyeing_MU_value_in_the_MU_field
  And Verify_the_Dyeing_qty_value_in_the_Qty_field
  #Given Enter_the_text_in_the_Print_Type_field
  #Given Enter_Printing_MU_value_in_the_MU_field
  Then Verify_the_Printing_qty_value_in_the_Qty_field
  Then Verify_the_Greige_Qty_value_in_the_Greige_Fabric_Qty_field
  Given Enter_the_Rate_for_Griege_Fabric_Qty
  #Given Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process
  #And Verify_the_Greige_Cost_field_value_is_displayed_as_per_formula
  Then Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Griege_process
  #Then Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Griege_process
  Then Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Griege_process
  When Verify_the_Dyeing_Qty_value_in_the_Dyeing_Qty_field
  Given Enter_the_Rate_for_Dyeing_Qty
  #Given Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process
  #Then Verify_the_Dyeing_Cost_field_value_is_displayed_as_per_formula
  Then Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Dyeing_process
  #Then Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Dyeing_process
  Then Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Dyeing_process
  When Verify_the_Printing_Qty_value_in_the_Printing_Qty_field
  Given Enter_the_Rate_for_Printing_Qty
  #Given Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process
  #Then Verify_the_Printing_Cost_field_value_is_displayed_as_per_formula
  Then Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Printing_process
  #Then Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Printing_process
  Then Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Printing_process
  When Verify_the_Freight_Greige_Qty_value_in_the_Greige_Fabric_Qty_field
  Given Enter_the_Rate_for_FreightGriege_Fabric_Qty
  #Given Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process
  #Then Verify_the_Freight_Greige_Cost_field_value_is_displayed_as_per_formula
  When Verify_the_Freight_Dyeing_Qty_value_in_the_Dyeing_Fabric_Qty_field
  Given Enter_the_Rate_for_Freight_Dyeing_Qty
  #Given Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process
  #Then Verify_the_Freight_Dyeing_Cost_field_value_is_displayed_as_per_formula
  When Verify_the_Freight_Printing_Qty_value_in_the_Printing_Fabric_Qty_field
  Given Enter_the_Rate_for_Freight_Printing_Qty
  #Given Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process
  #Then Verify_the_Freight_Printing_Cost_field_value_is_displayed_as_per_formula
  #Then Verify_the_Cancel_button_properties
  Then Verify_the_Submit_button_properties
  

  