package Stepdefinition1;

import Page.SW_Merchandising_T_and_A_Dues_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_Merchandising_T_and_A_Dues_steps {
	SW_Merchandising_T_and_A_Dues_Page Sw_Mer_T_and_A_Dues = new SW_Merchandising_T_and_A_Dues_Page();

	@And ("^Click on the Merchandising Reports dropdown$")
	public void Click_on_the_Merchandising_Reports_dropdown() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_Merchandising_Reports_dropdown();
	}
	@And ("^Click on the T and A dues under the T and A dropdown$")
	public void Click_on_the_T_and_A_dues_under_the_T_and_A_dropdown() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_T_and_A_dues_under_the_T_and_A_dropdown();
	}
	@Then ("^the Merchandising T and A Dues Screen is displayed or not$")
	public void the_Merchandising_T_and_A_Dues_Screen_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.the_Merchandising_T_and_A_Dues_Screen_is_displayed_or_not();
	}
	@And ("Select the {string} in the Filters page")
	public void Select_the_in_the_Filters_page(String Merchant) throws Throwable {
		Sw_Mer_T_and_A_Dues.Select_the_in_the_Filters_page(Merchant);
	}
	@And ("Select the {string} in the filters page")
	public void Select_the_in_the_filters_page(String Season) throws Throwable {
		Sw_Mer_T_and_A_Dues.Select_the_in_the_filters_page(Season);
	}
	@And ("Select the {string} in the filter page")
	public void Select_the_in_the_filter_page(String Month) throws Throwable {
		Sw_Mer_T_and_A_Dues.Select_the_in_the_filter_page(Month);
	}
	@And ("^Click on the Overdue expansion$")
	public void Click_on_the_Overdue_expansion() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_Overdue_expansion();
	}
	@Then ("^Verify the Merchandising Dues Tab and Yarn Dues Tabs are displayed or not$")
	public void Verify_the_Merchandising_Dues_Tab_and_Yarn_Dues_Tabs_are_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Merchandising_Dues_Tab_and_Yarn_Dues_Tabs_are_displayed_or_not();
	}
	@And ("^Verify the Merchandising Submissions Due and Merchandising Approvals Due grids are displayed or not$")
	public void Verify_the_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not();
	}
	@And ("^Verify the Merchandising Submissions Due grid data is displayed or not$")
	public void Verify_the_Merchandising_Submissions_Due_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Merchandising_Submissions_Due_grid_data_is_displayed_or_not();
	}
	@And ("^Verify the Merchandising Approvals Due grid data is displayed or not$")
	public void Verify_the_Merchandising_Approvals_Due_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Merchandising_Approvals_Due_grid_data_is_displayed_or_not();
	}
	@Then ("^Click on the Yarn Dues Tab$")
	public void Click_on_the_Yarn_Dues_Tab() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_Yarn_Dues_Tab();
	}
	@And ("^Verify the Submissions Due From Yarn Team grid data is displayed or not$")
	public void Verify_the_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not();
	}
	@And ("^Verify the Approvals Due From Yarn Team grid data is displayed or not$")
	public void Verify_the_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not();
	}
	@And ("^Click on the Today expansion$")
	public void Click_on_the_Today_expansion() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_Today_expansion();
	}
	@And ("^Verify the Today Merchandising Submissions Due and Merchandising Approvals Due grids are displayed or not$")
	public void Verify_the_Today_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Today_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not();
	}
	@And ("^Verify the Today Merchandising Submissions Due grid data is displayed or not$")
	public void Verify_the_Today_Merchandising_Submissions_Due_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Today_Merchandising_Submissions_Due_grid_data_is_displayed_or_not();
	}
	@And ("^Verify the Today Merchandising Approvals Due grid data is displayed or not$")
	public void Verify_the_Today_Merchandising_Approvals_Due_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Today_Merchandising_Approvals_Due_grid_data_is_displayed_or_not();
	}
	@Then ("^Click on the Today Yarn Dues Tab$")
	public void Click_on_the_Today_Yarn_Dues_Tab() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_Today_Yarn_Dues_Tab();
	}
	@And ("^Verify the Today Submissions Due From Yarn Team grid data is displayed or not$")
	public void Verify_the_Today_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Today_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not();
	}
	@And ("^Verify the Today Approvals Due From Yarn Team grid data is displayed or not$")
	public void Verify_the_Today_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Today_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not();
	}
	@And ("^Click on the Upcoming expansion$")
	public void Click_on_the_Upcoming_expansion() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_Upcoming_expansion();
	}
	@And ("^Verify the Upcoming Merchandising Submissions Due and Merchandising Approvals Due grids are displayed or not$")
	public void Verify_the_Upcoming_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Upcoming_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not();
	}
	@And ("^Verify the Upcoming Merchandising Submissions Due grid data is displayed or not$")
	public void Verify_the_Upcoming_Merchandising_Submissions_Due_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Upcoming_Merchandising_Submissions_Due_grid_data_is_displayed_or_not();
	}
	@And ("^Verify the Upcoming Merchandising Approvals Due grid data is displayed or not$")
	public void Verify_the_Upcoming_Merchandising_Approvals_Due_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Upcoming_Merchandising_Approvals_Due_grid_data_is_displayed_or_not();
	}
	@Then ("^Click on the Upcoming Yarn Dues Tab$")
	public void Click_on_the_Upcoming_Yarn_Dues_Tab() throws Throwable {
		Sw_Mer_T_and_A_Dues.Click_on_the_Upcoming_Yarn_Dues_Tab();
	}
	@And ("^Verify the Upcoming Submissions Due From Yarn Team grid data is displayed or not$")
	public void Verify_the_Upcoming_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Upcoming_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not();
	}
	@And ("^Verify the Upcoming Approvals Due From Yarn Team grid data is displayed or not$")
	public void Verify_the_Upcoming_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Upcoming_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not();
	}
	@And ("^Verify the Overdue section sorting functionality$")
	public void Verify_the_Overdue_section_sorting_functionality() throws Throwable {
		Sw_Mer_T_and_A_Dues.Verify_the_Overdue_section_sorting_functionality();
	}
}
