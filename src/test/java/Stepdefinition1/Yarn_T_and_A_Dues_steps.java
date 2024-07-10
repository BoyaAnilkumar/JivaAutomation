package Stepdefinition1;

import Page.Yarn_T_and_A_Dues_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Yarn_T_and_A_Dues_steps {

	Yarn_T_and_A_Dues_Page Yarn_T_and_A_Dues= new Yarn_T_and_A_Dues_Page();
	
	@And ("^Click on the Yarn Sourcing Reports dropdown$")
	public void Click_on_the_Yarn_Sourcing_Reports_dropdown()throws Throwable {
		Yarn_T_and_A_Dues.Click_on_the_Yarn_Sourcing_Reports_dropdown();
	}
	@And ("^Click on the T and A dues under the T&A dropdown$")
	public void Click_on_the_T_and_A_dues_under_the_T_and_A_dropdown()throws Throwable {
		Yarn_T_and_A_Dues.Click_on_the_T_and_A_dues_under_the_T_and_A_dropdown();
	}
	@Then ("^the Yarn T and A Dues Screen is displayed or not$")
	public void the_Yarn_T_and_A_Dues_Screen_is_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.the_Yarn_T_and_A_Dues_Screen_is_displayed_or_not();
	}
	@And ("^User click on the filter Expansion$")
	public void User_click_on_the_filter_Expansion()throws Throwable {
		Yarn_T_and_A_Dues.User_click_on_the_filter_Expansion();
	}
	@And ("Select the Sourcing {string} in the filters page")
	public void Select_the_Sourcing_in_the_filters_page(String Manager)throws Throwable {
		Yarn_T_and_A_Dues.Select_the_Sourcing_in_the_filters_page(Manager);
	}
	@And ("Select the yarn{string} in the filter page")
	public void Select_the_yarn_in_the_filter_page(String Supplier)throws Throwable {
		Yarn_T_and_A_Dues.Select_the_yarn_in_the_filter_page(Supplier);
	}
	@Then ("^Verify the Submissions Due from yarn Team Tab and Approvals Due from Merchant Team tabs are displayed or not$")
	public void Verify_the_Submissions_Due_from_yarn_Team_Tab_and_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Submissions_Due_from_yarn_Team_Tab_and_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not();
	}
	@And ("^Verify the Submissions Due from yarn Team Tab grid are displayed or not$")
	public void Verify_the_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not();
	}
	@Then ("^Click on the Approvals Due from Merchant Team Tab$")
	public void Click_on_the_Approvals_Due_from_Merchant_Team_Tab()throws Throwable {
		Yarn_T_and_A_Dues.Click_on_the_Approvals_Due_from_Merchant_Team_Tab();
	}
	@And ("^Verify the Approvals Due from Merchant Team grid data is displayed or not$")
	public void Verify_the_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not();
	}
	@Then ("^Verify the Today Submissions Due from yarn Team Tab and Today Approvals Due from Merchant Team tabs are displayed or not$")
	public void Verify_the_Today_Submissions_Due_from_yarn_Team_Tab_and_Today_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Today_Submissions_Due_from_yarn_Team_Tab_and_Today_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not();
	}
	@And ("^Verify the Today Submissions Due from yarn Team Tab grid are displayed or not$")
	public void Verify_the_Today_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Today_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not();
	}
	@Then ("^Click on the Today Approvals Due from Merchant Team Tab$")
	public void Click_on_the_Today_Approvals_Due_from_Merchant_Team_Tab()throws Throwable {
		Yarn_T_and_A_Dues.Click_on_the_Today_Approvals_Due_from_Merchant_Team_Tab();
	}
	@And ("^Verify the Today Approvals Due from Merchant Team grid data is displayed or not$")
	public void Verify_the_Today_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Today_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not();
	}
	@Then ("^Verify the Upcoming Submissions Due from yarn Team Tab and Today Approvals Due from Merchant Team tabs are displayed or not$")
	public void Verify_the_Upcoming_Submissions_Due_from_yarn_Team_Tab_and_Today_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Upcoming_Submissions_Due_from_yarn_Team_Tab_and_Today_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not();
	}
	@And ("^Verify the Upcoming Submissions Due from yarn Team Tab grid are displayed or not$")
	public void Verify_the_Upcoming_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Upcoming_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not();
	}
	@Then ("^Click on the Upcoming Approvals Due from Merchant Team Tab$")
	public void Click_on_the_Upcoming_Approvals_Due_from_Merchant_Team_Tab()throws Throwable {
		Yarn_T_and_A_Dues.Click_on_the_Upcoming_Approvals_Due_from_Merchant_Team_Tab();
	}
	@And ("^Verify the Upcoming Approvals Due from Merchant Team grid data is displayed or not$")
	public void Verify_the_Upcoming_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues.Verify_the_Upcoming_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not();
	}
}
