package Stepdefinition1;


import Page.RevisedMUWorkingPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RevisedMUWorkingSteps {

	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	
@Given ("^Login with the Production Manager$")
public void Login_with_the_Production_Manager() {
	RMUW.Login_with_the_Production_Manager();
}
	
@Then ("^Navigate to Revised Fabric Sheet Working screen$")
public void Navigate_to_Revised_Fabric_Sheet_Working_screen() throws Throwable {
	RMUW.Navigate_to_Revised_Fabric_Sheet_Working_screen();
}
@Then ("^Click_on_the_Styles_expansion$")
public void Click_on_the_Styles_expansion() throws Throwable {
	RMUW.Click_on_the_Styles_expansion();
}

@And ("^Select an IPO from the Menu list$")
public void Select_an_IPO_from_the_Menu_list() throws Throwable {
	RMUW.Select_an_IPO_from_the_Menu_list();
}

@Then ("^Click_on_Clear_Filter_icon$")
public void Click_on_Clear_Filter_icon() throws Throwable {
	RMUW.Click_on_Clear_Filter_icon();
}
@And ("^Click_on_Edit_icon_in_MU_Working_grid_for_a_Fabric$")
public void Click_on_Edit_icon_in_MU_Working_grid_for_a_Fabric() throws Throwable {
	RMUW.Click_on_Edit_icon_in_MU_Working_grid_for_a_Fabric();
}
@And ("^Verify the Final Fabric Required qty value$")
public void Verify_the_Final_Fabric_Required_qty_value() throws Throwable {
	RMUW.Verify_the_Final_Fabric_Required_qty_value();
}
@Given ("^Enter_the_value_in_the_Residual_Shrinkage_field$")
public void Enter_the_value_in_the_Residual_Shrinkage_field() throws Throwable {
	RMUW.Enter_the_value_in_the_Residual_Shrinkage_field();
}
@Then ("^Select_a_process_in_the_Process1_field$")
public void Select_a_process_in_the_Process1_field() throws Throwable {
	RMUW.Select_a_process_in_the_Process1_field();
}
@Then ("^Select_another_process_in_the_Process2_field$")
public void Select_another_process_in_the_Process2_field() throws Throwable {
	RMUW.Select_another_process_in_the_Process2_field();
}
@Then ("^Verify_the_Greige_Qty_value$")
public void Verify_the_Greige_Qty_value() throws Throwable {
	RMUW.Verify_the_Greige_Qty_value();
}
@Given ("^Enter_Dyeing_MU_value_in_the_MU_field$")
public void Enter_Dyeing_MU_value_in_the_MU_field() throws Throwable {
	RMUW.Enter_Dyeing_MU_value_in_the_MU_field();
}
@And ("^Verify_the_Dyeing_qty_value_in_the_Qty_field$")
public void Verify_the_Dyeing_qty_value_in_the_Qty_field() throws Throwable {
	RMUW.Verify_the_Dyeing_qty_value_in_the_Qty_field();
}
@Given ("^Enter_the_text_in_the_Print_Type_field$")
public void Enter_the_text_in_the_Print_Type_field() throws Throwable {
	RMUW.Enter_the_text_in_the_Print_Type_field();
}
@Given ("^Enter_Printing_MU_value_in_the_MU_field$")
public void Enter_Printing_MU_value_in_the_MU_field() throws Throwable {
	RMUW.Enter_Printing_MU_value_in_the_MU_field();
}
@Then ("^Verify_the_Printing_qty_value_in_the_Qty_field$")
public void Verify_the_Printing_qty_value_in_the_Qty_field() throws Throwable {
	RMUW.Verify_the_Printing_qty_value_in_the_Qty_field();
}
@Then ("^Verify_the_Greige_Qty_value_in_the_Greige_Fabric_Qty_field$")
public void Verify_the_Greige_Qty_value_in_the_Greige_Fabric_Qty_field() throws Throwable {
	RMUW.Verify_the_Greige_Qty_value_in_the_Greige_Fabric_Qty_field();
}
@Given ("^Enter_the_Rate_for_Griege_Fabric_Qty$")
public void Enter_the_Rate_for_Griege_Fabric_Qty() throws Throwable {
	RMUW.Enter_the_Rate_for_Griege_Fabric_Qty();
}
@Given ("^Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process$")
public void Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process() throws Throwable {
	RMUW.Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process();
}
@And ("^Verify_the_Greige_Cost_field_value_is_displayed_as_per_formula$")
public void Verify_the_Greige_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
	RMUW.Verify_the_Greige_Cost_field_value_is_displayed_as_per_formula();
}
@Then ("^Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Griege_process$")
public void Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Griege_process() throws Throwable {
	RMUW.Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Griege_process();
}
@Then ("^Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Griege_process$")
public void Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Griege_process() throws Throwable {
	RMUW.Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Griege_process();
}
@Then ("^Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Griege_process$")
public void Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Griege_process() throws Throwable {
	RMUW.Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Griege_process();
}
@When ("^Verify_the_Dyeing_Qty_value_in_the_Dyeing_Qty_field$")
public void Verify_the_Dyeing_Qty_value_in_the_Dyeing_Qty_field() throws Throwable {
	RMUW.Verify_the_Dyeing_Qty_value_in_the_Dyeing_Qty_field();
}
@Given ("^Enter_the_Rate_for_Dyeing_Qty$")
public void Enter_the_Rate_for_Dyeing_Qty() throws Throwable {
	RMUW.Enter_the_Rate_for_Dyeing_Qty();
}
@Given ("^Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process$")
public void Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process() throws Throwable {
	RMUW.Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process();
}
@Then ("^Verify_the_Dyeing_Cost_field_value_is_displayed_as_per_formula$")
public void Verify_the_Dyeing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
	RMUW.Verify_the_Dyeing_Cost_field_value_is_displayed_as_per_formula();
}
@Then ("^Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Dyeing_process$")
public void Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Dyeing_process() throws Throwable {
	RMUW.Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Dyeing_process();
}
@Then ("^Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Dyeing_process$")
public void Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Dyeing_process() throws Throwable {
	RMUW.Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Dyeing_process();
}
@Then ("^Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Dyeing_process$")
public void Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Dyeing_process() throws Throwable {
	RMUW.Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Dyeing_process();
}
@When ("^Verify_the_Printing_Qty_value_in_the_Printing_Qty_field$")
public void Verify_the_Printing_Qty_value_in_the_Printing_Qty_field() throws Throwable {
	RMUW.Verify_the_Printing_Qty_value_in_the_Printing_Qty_field();
}
@Given ("^Enter_the_Rate_for_Printing_Qty$")
public void Enter_the_Rate_for_Printing_Qty() throws Throwable {
	RMUW.Enter_the_Rate_for_Printing_Qty();
}
@Given ("^Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process$")
public void Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process() throws Throwable {
	RMUW.Verify_the_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process();
}
@Then ("^Verify_the_Printing_Cost_field_value_is_displayed_as_per_formula$")
public void Verify_the_Printing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
	RMUW.Verify_the_Printing_Cost_field_value_is_displayed_as_per_formula();
}
@Then ("^Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Printing_process$")
public void Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Printing_process() throws Throwable {
	RMUW.Select_the_Fabric_Manager_from_the_dropdown_list_in_the_Fabric_Manager_field_for_Printing_process();
}
@Then ("^Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Printing_process$")
public void Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Printing_process() throws Throwable {
	RMUW.Select_the_Assitant_Fabric_Manager_from_the_dropdown_list_in_the_Assitant_Fabric_Manager_field_for_Printing_process();
}
@Then ("^Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Printing_process$")
public void Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Printing_process() throws Throwable {
	RMUW.Select_the_Fabric_Executives_from_the_dropdown_list_in_the_Fabric_Executives_field_for_Printing_process();
}
@When ("^Verify_the_Freight_Greige_Qty_value_in_the_Greige_Fabric_Qty_field$")
public void Verify_the_Freight_Greige_Qty_value_in_the_Greige_Fabric_Qty_field() throws Throwable {
	RMUW.Verify_the_Freight_Greige_Qty_value_in_the_Greige_Fabric_Qty_field();
}
@Given ("^Enter_the_Rate_for_FreightGriege_Fabric_Qty$")
public void Enter_the_Rate_for_FreightGriege_Fabric_Qty() throws Throwable {
	RMUW.Enter_the_Rate_for_FreightGriege_Fabric_Qty();
}
@Given ("^Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process$")
public void Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process() throws Throwable {
	RMUW.Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Greige_process();
}
@Then ("^Verify_the_Freight_Greige_Cost_field_value_is_displayed_as_per_formula$")
public void Verify_the_Freight_Greige_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
	RMUW.Verify_the_Freight_Greige_Cost_field_value_is_displayed_as_per_formula();
}
@When ("^Verify_the_Freight_Dyeing_Qty_value_in_the_Dyeing_Fabric_Qty_field$")
public void Verify_the_Freight_Dyeing_Qty_value_in_the_Dyeing_Fabric_Qty_field() throws Throwable {
	RMUW.Verify_the_Freight_Dyeing_Qty_value_in_the_Dyeing_Fabric_Qty_field();
}
@Given ("^Enter_the_Rate_for_Freight_Dyeing_Qty$")
public void Enter_the_Rate_for_Freight_Dyeing_Qty() throws Throwable {
	RMUW.Enter_the_Rate_for_Freight_Dyeing_Qty();
}
@Given ("^Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process$")
public void Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process() throws Throwable {
	RMUW.Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Dyeing_process();
}
@Then ("^Verify_the_Freight_Dyeing_Cost_field_value_is_displayed_as_per_formula$")
public void Verify_the_Freight_Dyeing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
	RMUW.Verify_the_Freight_Dyeing_Cost_field_value_is_displayed_as_per_formula();
}
@When ("^Verify_the_Freight_Printing_Qty_value_in_the_Printing_Fabric_Qty_field$")
public void Verify_the_Freight_Printing_Qty_value_in_the_Printing_Fabric_Qty_field() throws Throwable {
	RMUW.Verify_the_Freight_Printing_Qty_value_in_the_Printing_Fabric_Qty_field();
}
@Given ("^Enter_the_Rate_for_Freight_Printing_Qty$")
public void Enter_the_Rate_for_Freight_Printing_Qty() throws Throwable {
	RMUW.Enter_the_Rate_for_Freight_Printing_Qty();
}
@Given ("^Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process$")
public void Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process() throws Throwable {
	RMUW.Verify_the_Freight_Conversion_Rate_is_autopopulate_and_is_an_editable_field_for_Printing_process();
}
@Then ("^Verify_the_Freight_Printing_Cost_field_value_is_displayed_as_per_formula$")
public void Verify_the_Freight_Printing_Cost_field_value_is_displayed_as_per_formula() throws Throwable {
	RMUW.Verify_the_Freight_Printing_Cost_field_value_is_displayed_as_per_formula();
}
@Then ("^Verify_the_Cancel_button_properties$")
public void Verify_the_Cancel_button_properties() throws Throwable {
	RMUW.Verify_the_Cancel_button_properties();
}
@Then ("^Verify_the_Submit_button_properties$")
public void Verify_the_Submit_button_properties() throws Throwable {
	RMUW.Verify_the_Submit_button_properties();
}

@Then ("^Select a Buyer from dropdown list$")
public void Select_a_Buyer_from_dropdown_list() throws Throwable {
	RMUW.Select_a_Buyer_from_dropdown_list();
}
@Then ("^Select a Season from dropdown list$")
public void Select_a_Season_from_dropdown_list() throws Throwable {
	RMUW.Select_a_Season_from_dropdown_list();
}
@Then ("^Select a Status from dropdown list$")
public void Select_a_Status_from_dropdown_list() throws Throwable {
	RMUW.Select_a_Status_from_dropdown_list();
}


}
	
	
	
