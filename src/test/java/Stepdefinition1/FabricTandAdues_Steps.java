package Stepdefinition1;

import Page.FabricTandAdues_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FabricTandAdues_Steps {

	FabricTandAdues_Pages Fabricdues = new FabricTandAdues_Pages();
	
	@Then("^Click on Fabric T and A dues screen$")
	public void Click_on_Fabric_T_and_A_dues_screen() throws Throwable {
		Fabricdues.Click_on_Fabric_T_and_A_dues_screen();
	}
	
	@And("^Verify that overdue today upcoming sections are displaying or not$")
	public void Verify_that_overdue_today_upcoming_sections_are_displaying_or_not() throws Throwable {
		Fabricdues.Verify_that_overdue_today_upcoming_sections_are_displaying_or_not();
	}
	
	@Then("^Verify that overdue is opened bydefault$")
	public void Verify_that_overdue_is_opened_bydefault() throws Throwable {
		Fabricdues.Verify_that_overdue_is_opened_bydefault();
	}
	
	@And("^verify the submission and Approval tabs are clickable or not$")
	public void verify_the_submission_and_Approval_tabs_are_clickable_or_not() throws Throwable {
		Fabricdues.verify_the_submission_and_Approval_tabs_are_clickable_or_not();
	}
	
	@Then("^verify the sorting functionality for all sections$")
	public void verify_the_sorting_functionality_for_all_sections() throws Throwable {
		Fabricdues.verify_the_sorting_functionality_for_all_sections();
	}
}
