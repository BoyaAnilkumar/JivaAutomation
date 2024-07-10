package Stepdefinition1;

import Page.TrimSheetAudit_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TrimSheetAudit_Steps {

	TrimSheetAudit_pages TSA = new TrimSheetAudit_pages();
	
	@And("^click on Trim sheet audit under audit module$")
	public void click_on_Trim_sheet_audit_under_audit_module() throws Throwable {
		TSA.click_on_Trim_sheet_audit_under_audit_module();
	}
	
	@And("^click on Style expansion$")
	public void click_on_Style_expansion() throws Throwable {
		TSA.click_on_Style_expansion();
	}
	
	@And("^Select the IPO in styles expansion$")
	public void Select_the_IPO_in_styles_expansion() throws Throwable {
		TSA.Select_the_IPO_in_styles_expansion();
	}
	
	@And("^Click on Expansion icon for costing budget$")
	public void Click_on_Expansion_icon_for_costing_budget() {
		TSA.Click_on_Expansion_icon_for_costing_budget();
	}
	
	@And("^Click on Expansion icon for production budget$")
	public void Click_on_Expansion_icon_for_production_budget() {
		TSA.Click_on_Expansion_icon_for_production_budget();
	}
	
	@Then("^Click on Approve button for that ipo$")
	public void Click_on_Approve_button_for_that_ipo() {
		TSA.Click_on_Approve_button_for_that_ipo();
	}
}
