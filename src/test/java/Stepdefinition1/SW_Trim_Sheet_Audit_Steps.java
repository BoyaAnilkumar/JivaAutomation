package Stepdefinition1;

import Page.SW_Trim_Sheet_Audit_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_Trim_Sheet_Audit_Steps {
	SW_Trim_Sheet_Audit_Page Sw_Trim_Sheet_Audit = new SW_Trim_Sheet_Audit_Page();
	
	
	
	@And ("^Click on the Trim Sheet Audit Screen$")
	public void Click_on_the_Trim_Sheet_Audit_Screen() throws Throwable {
		Sw_Trim_Sheet_Audit.Click_on_the_Trim_Sheet_Audit_Screen();
	}
	@And ("^Costing budget details are displayed in the Costing budget Expansion or not$")
	public void Costing_budget_details_are_displayed_in_the_Costing_budget_Expansion_or_not() throws Throwable {
		Sw_Trim_Sheet_Audit.Costing_budget_details_are_displayed_in_the_Costing_budget_Expansion_or_not();
	}
	@And ("^The 3 percent saving data is displayed in the grid$")
	public void The_3_percent_saving_data_is_displayed_in_the_grid() throws Throwable {
		Sw_Trim_Sheet_Audit.The_3_percent_saving_data_is_displayed_in_the_grid();
	}
	@Then ("^Verify the Costing budget expansion grid header section names are displayed or not$")
	public void Verify_the_Costing_budget_expansion_grid_header_section_names_are_displayed_or_not() throws Throwable {
		Sw_Trim_Sheet_Audit.Verify_the_Costing_budget_expansion_grid_header_section_names_are_displayed_or_not();
	}
	@Then ("^Verify the Production budget expansion grid header section names are displayed or not$")
	public void Verify_the_Production_budget_expansion_grid_header_section_names_are_displayed_or_not() throws Throwable {
		Sw_Trim_Sheet_Audit.Verify_the_Production_budget_expansion_grid_header_section_names_are_displayed_or_not();
	}
	@And ("^Verify the Selected IPO details are displayed in the Information bar or not$")
	public void Verify_the_Selected_IPO_details_are_displayed_in_the_Information_bar_or_not() throws Throwable {
		Sw_Trim_Sheet_Audit.Verify_the_Selected_IPO_details_are_displayed_in_the_Information_bar_or_not();
	}
	@And ("^Verify the Trim Production budget expansion grid data is displayed or not$")
	public void Verify_the_Trim_Production_budget_expansion_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Trim_Sheet_Audit.Verify_the_Trim_Production_budget_expansion_grid_data_is_displayed_or_not();
	}

}

