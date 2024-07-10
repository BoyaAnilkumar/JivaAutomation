package Stepdefinition1;

import Page.SW_YarnSheetAcceptance_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_YarnSheetAcceptance_Steps {
	SW_YarnSheetAcceptance_Pages SYSA = new SW_YarnSheetAcceptance_Pages();
	
	@Then("^Click on the Yarn Sourcing Module$")
	public void Click_on_the_Yarn_Sourcing_Module() throws Throwable {
		SYSA.Click_on_the_Yarn_Sourcing_Module();
	}
	
	@And("^Click on Data Entry in yarn sourcing$")
	public void Click_on_Data_Entry_in_yarn_sourcing() throws Throwable {
		SYSA.Click_on_Data_Entry_in_yarn_sourcing();
	}
	
	@Then("^Click on the Yarn Sheet Acceptance$")
	public void Click_on_the_Yarn_Sheet_Acceptance() throws Throwable {
		SYSA.Click_on_the_Yarn_Sheet_Acceptance();
	}
	
	@And("^Click on style expansion in yarn sheet acceptance$")
	public void Click_on_style_expansion_in_yarn_sheet_acceptance() throws Throwable {
		SYSA.Click_on_style_expansion_in_yarn_sheet_acceptance();
	}
	
	@And("Enter the IPO {string} in Search By IPO")
	public void Enter_the_IPO_in_Search_By_IPO(String searchbyipo) throws Throwable {
		SYSA.Enter_the_IPO_in_Search_By_IPO(searchbyipo);
	}
	
	@And("^Verify the grid details in page$")
	public void Verify_the_grid_details_in_page() throws Throwable {
		SYSA.Verify_the_grid_details_in_page();
	}
	
	@And("^Click on View for Print button$")
	public void Click_on_View_for_Print_button() throws Throwable {
		SYSA.Click_on_View_for_Print_button();
	}
	
	@Then("^click on cancel button in print view$")
	public void click_on_cancel_button_in_print_view() throws Throwable {
		SYSA.click_on_cancel_button_in_print_view();
	}

	
	@And("^click on Accept yarn sheet$")
	public void click_on_Accept_yarn_sheet() throws Throwable {
		SYSA.click_on_Accept_yarn_sheet();
	}

}
