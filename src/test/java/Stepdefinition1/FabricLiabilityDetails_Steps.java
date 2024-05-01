package Stepdefinition1;

import Page.FabricLiabilityDetails_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FabricLiabilityDetails_Steps {

	FabricLiabilityDetails_page FLDP = new FabricLiabilityDetails_page();
	
	@And("^click on Fabric liability details in menu$")
	public void click_on_Fabric_liability_details_in_menu() throws Throwable {
		FLDP.click_on_Fabric_liability_details_in_menu();
	}
	
	@Then("^Verify that user navigated to fabric liability details screen$")
	public void Verify_that_user_navigated_to_fabric_liability_details_screen() throws Throwable {
		FLDP.Verify_that_user_navigated_to_fabric_liability_details_screen();
	}
	
	@Then("^Select the IPO in styles expansion in liability details$")
	public void Select_the_IPO_in_styles_expansion_in_liability_details() throws Throwable {
		FLDP.Select_the_IPO_in_styles_expansion_in_liability_details();
	}
	
	@When("^IPO is selected verify the IPO details$")
	public void IPO_is_selected_verify_the_IPO_details() throws Throwable {
		FLDP.IPO_is_selected_verify_the_IPO_details();
	}
	
	@And("^Verify the data is displaying in the grid or not$")
	public void Verify_the_data_is_displaying_in_the_grid_or_not() throws Throwable {
		FLDP.Verify_the_data_is_displaying_in_the_grid_or_not();
	}
	
	@And("^click on add liability information button to navigate to the add fabric liability details$")
	public void click_on_add_liability_information_button_to_navigate_to_the_add_fabric_liability_details() throws Throwable {
		FLDP.click_on_add_liability_information_button_to_navigate_to_the_add_fabric_liability_details();
	}
	
	@Then("^verify the Process details are displaying or not$")
	public void verify_the_Process_details_are_displaying_or_not() throws Throwable {
		FLDP.verify_the_Process_details_are_displaying_or_not();
	}
	
	
	
	@When("^Enter the data in mandatory fields for liability$")
	public void Enter_the_data_in_mandatory_fields_for_liability() throws Throwable {
		FLDP.Enter_the_data_in_mandatory_fields_for_liability();
	}
	
	@And("^click on Add liability details button$")
	public void click_on_Add_liability_details_button() throws Throwable {
		FLDP.click_on_Add_liability_details_button();
	}
	
	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		FLDP.click_on_submit_button();
	}
	
	@Then("^click on expansion icon to view the data$")
	public void click_on_expansion_icon_to_view_the_data() throws Throwable {
		FLDP.click_on_expansion_icon_to_view_the_data();
	}
	
	@And("^verify that data is displaying in expansion grid or not$")
	public void verify_that_data_is_displaying_in_expansion_grid_or_not() throws Throwable {
		FLDP.verify_that_data_is_displaying_in_expansion_grid_or_not();
	}
	
	@And("^click on edit icon in liability details$")
	public void click_on_edit_icon_in_liability_details() throws Throwable {
		FLDP.click_on_edit_icon_in_liability_details();
	}
	
	@And("^verify that details are displaying in edit form$")
	public void verify_that_details_are_displaying_in_edit_form() throws Throwable {
		FLDP.verify_that_details_are_displaying_in_edit_form();
	}
	
	@When("^enter the data in physical liability$")
	public void enter_the_data_in_physical_liability() throws Throwable {
		FLDP.enter_the_data_in_physical_liability();
	}
	
	@Then("^submit the edit form$")
	public void submit_the_edit_form() throws Throwable {
		FLDP.submit_the_edit_form();
	}
	
	@When("^user enter the mandatory fields with knitting and spinning process$")
	public void user_enter_the_mandatory_fields_with_knitting_and_spinning_process() throws Throwable {
		FLDP.user_enter_the_mandatory_fields_with_knitting_and_spinning_process();
	}
	
	@And("^click on submit button to save the knitting and spinning process liability details$")
	public void click_on_submit_button_to_save_the_knitting_and_spinning_process_liability_details() throws Throwable {
		FLDP.click_on_submit_button_to_save_the_knitting_and_spinning_process_liability_details();
	}
	
	@Then("^user enter the data for dyeing process and shiffly process in add liability$")
	public void user_enter_the_data_for_dyeing_process_and_shiffly_process_in_add_liability() throws Throwable {
		FLDP.user_enter_the_data_for_dyeing_process_and_shiffly_process_in_add_liability();
	}
	
	@And("^submit the data and verify the process data in expansion grid$")
	public void submit_the_data_and_verify_the_process_data_in_expansion_grid() throws Throwable {
		FLDP.submit_the_data_and_verify_the_process_data_in_expansion_grid();
	}
	
}
