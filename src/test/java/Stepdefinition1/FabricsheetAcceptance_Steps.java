package Stepdefinition1;


import Page.FabricsheetAcceptance_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FabricsheetAcceptance_Steps {
	
	FabricsheetAcceptance_page Fabricsheetacceptancepage = new FabricsheetAcceptance_page();
	
	
	@Given("^Fabric Manager should login to accept the fabric sheet$")
	public void Fabric_Manager_should_login_to_accept_the_fabric_sheet() throws Throwable {
		Fabricsheetacceptancepage.Fabric_Manager_should_login_to_accept_the_fabric_sheet();
		
	}
	
	@And("^navigate to dashboard after login the application or not$")
	public void navigate_to_dashboard_after_login_the_application_or_not() throws Throwable {
		Fabricsheetacceptancepage.navigate_to_dashboard_after_login_the_application_or_not();
		
	}
	
	@When("^user should navigate to Fabric sheet acceptance screen by clicking on menu$")
	public void user_should_navigate_to_Fabric_sheet_acceptance_screen_by_clicking_on_menu() throws Throwable {
		Fabricsheetacceptancepage.user_should_navigate_to_Fabric_sheet_acceptance_screen_by_clicking_on_menu();
		
	}
	
	@And("^user should click on styles expansion to view the IPOs$")
	public void user_should_click_on_styles_expansion_to_view_the_IPOs() throws Throwable {
		Fabricsheetacceptancepage.user_should_click_on_styles_expansion_to_view_the_IPOs();
		
	}
	
	@And("^Verify that IPOs are displaying in styles expansion view$")
	public void Verify_that_IPOs_are_displaying_in_styles_expansion_view() throws Throwable{
		Fabricsheetacceptancepage.Verify_that_IPOs_are_displaying_in_styles_expansion_view();
		
	}
	
	@Then("^Click on filters icon to apply the filter to get the IPOs$")
	public void Click_on_filters_icon_to_apply_the_filter_to_get_the_IPOs() throws Throwable {
		Fabricsheetacceptancepage.Click_on_filters_icon_to_apply_the_filter_to_get_the_IPOs();
		
	}
	
	@And("^verify the IPOs are displaying based on the selection of items in filter$")
	public void verify_the_IPOs_are_displaying_based_on_the_selection_of_items_in_filter() throws Throwable {
		Fabricsheetacceptancepage.verify_the_IPOs_are_displaying_based_on_the_selection_of_items_in_filter();
		
	}
	
	@Then("^Click on the IPO to approve or reject$")
	public void Click_on_the_IPO_to_approve_or_reject() throws Throwable {
		Fabricsheetacceptancepage.Click_on_the_IPO_to_approve_or_reject();
		
	}
	
	@And("^Verify that Bulk fabric dealine text data is displaying or not$")
	public void Verify_that_Bulk_fabric_dealine_text_data_is_displaying_or_not() throws Throwable {
		Fabricsheetacceptancepage.Verify_that_Bulk_fabric_dealine_text_data_is_displaying_or_not();
	}
	
	@And("^Accepting the fabric sheet by clicking Accept Fabric Sheet button$")
	public void Accepting_the_fabric_sheet_by_clicking_Accept_Fabric_Sheet_button() throws Throwable {
		Fabricsheetacceptancepage.Accepting_the_fabric_sheet_by_clicking_Accept_Fabric_Sheet_button();
		
	}
	
	@And("^Enter Reason for accepting the IPO by clicking on submit button$")
	public void Enter_Reason_for_accepting_the_IPO_by_clicking_on_submit_button() throws Throwable {
		Fabricsheetacceptancepage.Enter_Reason_for_accepting_the_IPO_by_clicking_on_submit_button();
	}
	
	@And("^Click on View for Print button to view the fabric sheet in print view$")
	public void Click_on_View_for_Print_button_to_view_the_fabric_sheet_in_print_view() throws Throwable {
		Fabricsheetacceptancepage.Click_on_View_for_Print_button_to_view_the_fabric_sheet_in_print_view();
		
	}
	
	@When("^clicked on reject fabric sheet button IPO is getting rejected or not$")
	public void clicked_on_reject_fabric_sheet_button_IPO_is_getting_rejected_or_not() throws Throwable {
		Fabricsheetacceptancepage.clicked_on_reject_fabric_sheet_button_IPO_is_getting_rejected_or_not();
		
	}
	
	@When("^clicked on History button should display the transactions in history table$")
	public void clicked_on_History_button_should_display_the_transactions_in_history_table() throws Throwable {
		Fabricsheetacceptancepage.clicked_on_History_button_should_display_the_transactions_in_history_table();
		
	}
	
	@When("^User navigated to history screen should click on Open button to view the History of that record$")
	public void User_navigated_to_history_screenshould_click_on_Open_button_to_view_the_History_of_that_record() throws Throwable {
		Fabricsheetacceptancepage.User_navigated_to_history_screenshould_click_on_Open_button_to_view_the_History_of_that_record();
		
	}
	
	
	
	
	
	
	
	
	
}
