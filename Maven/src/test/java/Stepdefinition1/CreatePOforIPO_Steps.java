package Stepdefinition1;

import Page.CreatePOforIPO_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePOforIPO_Steps {
	
	CreatePOforIPO_pages CreatePOforIPO_pages = new CreatePOforIPO_pages();
	
	@Then("^Click on Fabric sourcing module$")
	public void Click_on_Fabric_sourcing_module() throws Throwable {
		CreatePOforIPO_pages.Click_on_Fabric_sourcing_module();
	}
	
	@And("^click on Data Entry in fabric sourcing module$")
	public void click_on_Data_Entry_in_fabric_sourcing_module() throws Throwable {
		CreatePOforIPO_pages.click_on_Data_Entry_in_fabric_sourcing_module();
	}
	
	@And("^click on Generate PO$")
	public void click_on_Generate_PO() throws Throwable {
		CreatePOforIPO_pages.click_on_Generate_PO();
	}
	
	@Then("^click on Create PO for Fabric$")
	public void click_on_Create_PO_for_Fabric() throws Throwable {
		CreatePOforIPO_pages.click_on_Create_PO_for_Fabric();
	}
	
	@And("^Verify the Create PO for IPO screen is displayed or not$")
	public void Verify_the_Create_PO_for_IPO_screen_is_displayed_or_not() throws Throwable {
		CreatePOforIPO_pages.Verify_the_Create_PO_for_IPO_screen_is_displayed_or_not();
	}               
	
	@And("^Select Type of Order$")
	public void Select_Type_of_Order() throws Throwable {
		CreatePOforIPO_pages.Select_Type_of_Order();
	}
	
	@Then("^verify the PO Date is displaying or not$")
	public void verify_the_PO_Date_is_displaying_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_the_PO_Date_is_displaying_or_not();
	}
	
	@Given("^Verify the PO Number us displaying or not$")
	public void Verify_the_PO_Number_us_displaying_or_not() throws Throwable {
		CreatePOforIPO_pages.Verify_the_PO_Number_us_displaying_or_not();
	}
	
	@When("^Enter Deliver To details and select from the suggestions$")
	public void Enter_Deliver_To_details_and_select_from_the_suggestions() throws Throwable {
		CreatePOforIPO_pages.Enter_Deliver_To_details_and_select_from_the_suggestions();
	}
	
	@When("^Deliver address is displaying after selecting the deliver to details or not$")
	public void Deliver_address_is_displaying_after_selecting_the_deliver_to_details_or_not() throws Throwable {
		CreatePOforIPO_pages.Deliver_address_is_displaying_after_selecting_the_deliver_to_details_or_not();
	}
	
	@When("^verify the GSTIN number is displaying or not$")
	public void verify_the_GSTIN_number_is_displaying_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_the_GSTIN_number_is_displaying_or_not();
	}
	
	@Then("^Enter supplier name and select from the suggestions$")
	public void Enter_supplier_name_and_select_from_the_suggestions() throws Throwable {
		CreatePOforIPO_pages.Enter_supplier_name_and_select_from_the_suggestions();
	}
	
	@And("^verify the supplier address after selecting the supplier$")
	public void verify_the_supplier_address_after_selecting_the_supplier() throws Throwable {
		CreatePOforIPO_pages.verify_the_supplier_address_after_selecting_the_supplier();
	}
	
	@And("^verify the GSTIN number is displaying after selecting the supplier$")
	public void verify_the_GSTIN_number_is_displaying_after_selecting_the_supplier() throws Throwable {
		CreatePOforIPO_pages.verify_the_GSTIN_number_is_displaying_after_selecting_the_supplier();
	}
	
	@And("^verify the payment terms are displaying after selecting the supplier$")
	public void verify_the_payment_terms_are_displaying_after_selecting_the_supplier() throws Throwable {
		CreatePOforIPO_pages.verify_the_payment_terms_are_displaying_after_selecting_the_supplier();
	}
	
	@And("^verify that Delivery terms are displaying after selecting the supplier$")
	public void verify_that_Delivery_terms_are_displaying_after_selecting_the_supplier() throws Throwable {
		CreatePOforIPO_pages.verify_that_Delivery_terms_are_displaying_after_selecting_the_supplier();
	}
	
	@And("^Enter Lead time in Days$")
	public void Enter_Lead_time_in_Days() throws Throwable {
		CreatePOforIPO_pages.Enter_Lead_time_in_Days();
	}
	
	@Then("^verify the Fabric Details are displaying or not$")
	public void verify_the_Fabric_Details_are_displaying_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_the_Fabric_Details_are_displaying_or_not();
	}
	
	@And("^Select Process from dropdown list$")
	public void Select_Process_from_dropdown_list() throws Throwable {
		CreatePOforIPO_pages.Select_Process_from_dropdown_list();
	}
	
	@And("^Select Fabric Type$")
	public void Select_Fabric_Type() throws Throwable {
		CreatePOforIPO_pages.Select_Fabric_Type();
	}
	
	@And("^Select Fabric Name$")
	public void Select_Fabric_Name() throws Throwable {
		CreatePOforIPO_pages.Select_Fabric_Name();
	}
	
	@Then("^verify that content is prepopulating after selecting the fabric name$")
	public void verify_that_content_is_prepopulating_after_selecting_the_fabric_name() throws Throwable {
		CreatePOforIPO_pages.verify_that_content_is_prepopulating_after_selecting_the_fabric_name();
	}
	
	@Then("^verify that count and construction is prepopulated or not$")
	public void verify_that_count_and_construction_is_prepopulated_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_that_count_and_construction_is_prepopulated_or_not();
	}
	
	@Then("^verify that GSM is prepopulated or not$")
	public void verify_that_GSM_is_prepopulated_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_that_GSM_is_prepopulated_or_not();
	}
	
	@Then("^verify that cuttable width is prepopulated or not$")
	public void verify_that_cuttable_width_is_prepopulated_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_that_cuttable_width_is_prepopulated_or_not();
	}
	
	@And("^Select color for the fabric$")
	public void Select_color_for_the_fabric() throws Throwable {
		CreatePOforIPO_pages.Select_color_for_the_fabric();
	}
	
	@Then("^verify the qty required is displaying with value based on the selected process fabric and color$")
	public void verify_the_qty_required_is_displaying_with_value_based_on_the_selected_process_fabric_and_color() throws Throwable {
		CreatePOforIPO_pages.verify_the_qty_required_is_displaying_with_value_based_on_the_selected_process_fabric_and_color();
	}
	
	@Then("^verify the qty available in stock is displaying if qty is available$")
	public void verify_the_qty_available_in_stock_is_displaying_if_qty_is_available() {
		CreatePOforIPO_pages.verify_the_qty_available_in_stock_is_displaying_if_qty_is_available();
	}
	
	@Then("^verify that residual shrinkage is displaying based on the selected process fabric and color$")
	public void verify_the_residual_shrinkage_is_displaying_with_value_based_on_the_selected_process_fabric_and_color() {
		CreatePOforIPO_pages.verify_the_residual_shrinkage_is_displaying_with_value_based_on_the_selected_process_fabric_and_color();
	}
	
	@And("^verify that qty allowed is displaying with default value or not$")
	public void verify_that_qty_allowed_is_displaying_with_default_value_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_that_qty_allowed_is_displaying_with_default_value_or_not();
	}
	
	@And("^verify that currency is displaying with value$")
	public void verify_that_currency_is_displaying_with_value() throws Throwable {
		CreatePOforIPO_pages.verify_that_currency_is_displaying_with_value();
	}
	
	@And("^verify that rate is displaying with value or not$")
	public void verify_that_rate_is_displaying_with_value_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_that_rate_is_displaying_with_value_or_not();
	}
	
	@And("^verify that UOM is displayed or user should select$")
	public void verify_that_UOM_is_displayed_or_user_should_select() throws Throwable {
		CreatePOforIPO_pages.verify_that_UOM_is_displayed_or_user_should_select();
	}
	
	@Given("^Enter the data in L Short If Any field$")
	public void Enter_the_data_in_L_Short_If_Any_field() throws Throwable {
		CreatePOforIPO_pages.Enter_the_data_in_L_Short_If_Any_field();
	}
	
	@Given("^Enter the data in Additional Information1 field$")
	public void Enter_the_data_in_Additional_Information1_field() throws Throwable {
		CreatePOforIPO_pages.Enter_the_data_in_Additional_Information1_field();
	}
	
	@Given("^Enter the data in Additional Information2 field$")
	public void Enter_the_data_in_Additional_Information2_field() throws Throwable {
		CreatePOforIPO_pages.Enter_the_data_in_Additional_Information2_field();
	}
	
	@And("^verify that Add IPO button is enable or not$")
	public void verify_that_Add_IPO_button_is_enable_or_not() throws Throwable {
		CreatePOforIPO_pages.verify_that_Add_IPO_button_is_enable_or_not();
	}
	
	@And("^click on delete icon is able to click or not$")
	public void click_on_delete_icon_is_able_to_click_or_not() throws Throwable {
		CreatePOforIPO_pages.click_on_delete_icon_is_able_to_click_or_not();
	}
	
	@And("^select the IPO from the dropdown list$")
	public void select_the_IPO_from_the_dropdown_list() throws Throwable {
		CreatePOforIPO_pages.select_the_IPO_from_the_dropdown_list();
	}
	
	@And("^verify the due date is displayed as current date$")
	public void verify_the_due_date_is_displayed_as_current_date() {
		CreatePOforIPO_pages.verify_the_due_date_is_displayed_as_current_date();
	}
	
	@And("^verify the quatity is displayed as greater than zero in quantity field$")
	public void verify_the_quatity_is_displayed_as_greater_than_zero_in_quantity_field() {
		CreatePOforIPO_pages.verify_the_quatity_is_displayed_as_greater_than_zero_in_quantity_field();
	}
	
	@And("^verify the quantity is displayed as greater than zero in qty use from stock field$")
	public void verify_the_quantity_is_displayed_as_greater_than_zero_in_qty_use_from_stock_field() {
		CreatePOforIPO_pages.verify_the_quantity_is_displayed_as_greater_than_zero_in_qty_use_from_stock_field();
	}
	
	@And("^verify the quantity is displayed as greater than zero in qty to be bought field$")
	public void verify_the_quantity_is_displayed_as_greater_than_zero_in_qty_to_be_bought_field() {
		CreatePOforIPO_pages.verify_the_quantity_is_displayed_as_greater_than_zero_in_qty_to_be_bought_field();
	}
	
	@And("^verify the rate value is prepopulated in grid or not$")
	public void verify_the_rate_value_is_prepopulated_in_grid_or_not() {
		CreatePOforIPO_pages.verify_the_rate_value_is_prepopulated_in_grid_or_not();
	}
	
	@And("^verify the Amount is displayed after selecting the ipo in grid$")
	public void verify_the_Amount_is_displayed_after_selecting_the_ipo_in_grid() {
		CreatePOforIPO_pages.verify_the_Amount_is_displayed_after_selecting_the_ipo_in_grid();
	}
	
	@Then("^click on save button and verify that save button is enable after inserting the data in mandatory fields$")
	public void click_on_save_button_and_verify_that_save_button_is_enable_after_inserting_the_data_in_mandatory_fields() {
		CreatePOforIPO_pages.click_on_save_button_and_verify_that_save_button_is_enable_after_inserting_the_data_in_mandatory_fields();
	}
}


