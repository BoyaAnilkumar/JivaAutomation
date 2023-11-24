package Stepdefinition1;

import Page.FabricsheetAcceptance_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FabricsheetAcceptance_Steps {
	
	FabricsheetAcceptance_page Fabricsheetacceptancepage = new FabricsheetAcceptance_page();
	
	
	@Given("^Fabric Manager should login to accept the fabric sheet$")
	public void Fabric_Manager_should_login_to_accept_the_fabric_sheet() {
		Fabricsheetacceptancepage.Fabric_Manager_should_login_to_accept_the_fabric_sheet();
		
	}
	
	@And("^navigate to dashboard after login the application or not$")
	public void navigate_to_dashboard_after_login_the_application_or_not() {
		Fabricsheetacceptancepage.navigate_to_dashboard_after_login_the_application_or_not();
		
	}
	
	@When("^user should navigate to Fabric sheet acceptance screen by clicking on menu$")
	public void user_should_navigate_to_Fabric_sheet_acceptance_screen_by_clicking_on_menu() {
		Fabricsheetacceptancepage.user_should_navigate_to_Fabric_sheet_acceptance_screen_by_clicking_on_menu();
		
	}
	
	@And("^user should click on styles expansion to view the IPOs$")
	public void user_should_click_on_styles_expansion_to_view_the_IPOs() {
		Fabricsheetacceptancepage.user_should_click_on_styles_expansion_to_view_the_IPOs();
		
	}
	
	@And("^Verify that IPOs are displaying in styles expansion view$")
	public void Verify_that_IPOs_are_displaying_in_styles_expansion_view(){
		Fabricsheetacceptancepage.Verify_that_IPOs_are_displaying_in_styles_expansion_view();
		
	}
	
	@Then("^Click on filters icon to apply the filter to get the IPOs$")
	public void Click_on_filters_icon_to_apply_the_filter_to_get_the_IPOs() {
		Fabricsheetacceptancepage.Click_on_filters_icon_to_apply_the_filter_to_get_the_IPOs();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
