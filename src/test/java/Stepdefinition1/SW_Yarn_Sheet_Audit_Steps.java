package Stepdefinition1;

import Page.SW_Yarn_Sheet_Audit_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_Yarn_Sheet_Audit_Steps {
	SW_Yarn_Sheet_Audit_Page Sw_Yarn_Sheet_Audit = new SW_Yarn_Sheet_Audit_Page();
	
	@Then ("^Click on the Sweater Audit module$")
	public void Click_on_the_Sweater_Audit_module() throws Throwable {
		Sw_Yarn_Sheet_Audit.Click_on_the_Sweater_Audit_module();
	}
	@And ("^Click on the Data Entry dropdown under the Audit Module$")
	public void Click_on_the_Data_Entry_dropdown_under_the_Audit_Module() throws Throwable {
		Sw_Yarn_Sheet_Audit.Click_on_the_Data_Entry_dropdown_under_the_Audit_Module();
	}
	@And ("^Click on the Yarn Sheet Audit Screen$")
	public void Click_on_the_Yarn_Sheet_Audit_Screen() throws Throwable {
		Sw_Yarn_Sheet_Audit.Click_on_the_Yarn_Sheet_Audit_Screen();
	}
	@And ("^Verify the Selected IPO details are displayed in the Information bar$")
	public void Verify_the_Selected_IPO_details_are_displayed_in_the_Information_bar() throws Throwable {
		Sw_Yarn_Sheet_Audit.Verify_the_Selected_IPO_details_are_displayed_in_the_Information_bar();
	}
	@And ("^Yarn Budget details and Fabric budget details are displayed in the Costing budget Expansion or not$")
	public void Yarn_Budget_details_and_Fabric_budget_details_are_displayed_in_the_Costing_budget_Expansion_or_not() throws Throwable {
		Sw_Yarn_Sheet_Audit.Yarn_Budget_details_and_Fabric_budget_details_are_displayed_in_the_Costing_budget_Expansion_or_not();
	}
	@Then ("^The Upcharge to buyer data is displayed in the grid$")
	public void The_Upcharge_to_buyer_data_is_displayed_in_the_grid() throws Throwable {
		Sw_Yarn_Sheet_Audit.The_Upcharge_to_buyer_data_is_displayed_in_the_grid();
	}
	@And ("^The Final Costing Budget data is displayed in the grid$")
	public void The_Final_Costing_Budget_data_is_displayed_in_the_grid() throws Throwable {
		Sw_Yarn_Sheet_Audit.The_Final_Costing_Budget_data_is_displayed_in_the_grid();
	}
	@And ("^The Target Production Budget data is displayed in the grid$")
	public void The_Target_Production_Budget_data_is_displayed_in_the_grid() throws Throwable {
		Sw_Yarn_Sheet_Audit.The_Target_Production_Budget_data_is_displayed_in_the_grid();
	}
	@And ("^Mu working details are displayed in the Production budget grid$")
	public void Mu_working_details_are_displayed_in_the_Production_budget_grid() throws Throwable {
		Sw_Yarn_Sheet_Audit.Mu_working_details_are_displayed_in_the_Production_budget_grid();
	}
	@And ("^Click on the Production Expansion$")
	public void Click_on_the_Production_Expansion() throws Throwable {
		Sw_Yarn_Sheet_Audit.Click_on_the_Production_Expansion();
	}
}
