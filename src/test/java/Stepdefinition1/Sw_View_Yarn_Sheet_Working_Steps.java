package Stepdefinition1;


import Page.Sw_View_Yarn_Sheet_Working_Pages;
import io.cucumber.java.en.And;

public class Sw_View_Yarn_Sheet_Working_Steps {
	Sw_View_Yarn_Sheet_Working_Pages Sw_View_Yarn_Working = new Sw_View_Yarn_Sheet_Working_Pages();

	
	
	@And ("^Click on the Sourcing Reports dropdown$")
	public void Click_on_the_Sourcing_Reports_dropdown() throws Throwable {
		Sw_View_Yarn_Working.Click_on_the_Sourcing_Reports_dropdown();
	}
	@And ("^Click on the View Yarn Sheet Working Screen Screen$")
	public void Click_on_the_View_Yarn_Sheet_Working_Screen_Screen() throws Throwable {
		Sw_View_Yarn_Working.Click_on_the_View_Yarn_Sheet_Working_Screen_Screen();
	}
	@And ("Enter the Buyer {string} in Search By IPO")
	public void Enter_the_Buyer_in_Search_By_IPO(String IPO) throws Throwable {
		Sw_View_Yarn_Working.Enter_the_Buyer_in_Search_By_IPO(IPO);
	}
	@And ("^Verify the Quantity Requirements Grid and Yarn details are displayed in the grid or not$")
	public void Verify_the_Quantity_Requirements_Grid_and_Yarn_details_are_displayed_in_the_grid_or_not() throws Throwable {
		Sw_View_Yarn_Working.Verify_the_Quantity_Requirements_Grid_and_Yarn_details_are_displayed_in_the_grid_or_not();
	}
	@And ("^Verify the Yarn Liability Details are displayed in the grid or not$")
	public void Verify_the_Yarn_Liability_Details_are_displayed_in_the_grid_or_not() throws Throwable {
		Sw_View_Yarn_Working.Verify_the_Yarn_Liability_Details_are_displayed_in_the_grid_or_not();
	}
	@And ("^Verify the Mu working grid is displayed with yarn process details or not$")
	public void Verify_the_Mu_working_grid_is_displayed_with_yarn_process_details_or_not() throws Throwable {
		Sw_View_Yarn_Working.Verify_the_Mu_working_grid_is_displayed_with_yarn_process_details_or_not();
	}
	@And ("^Click on the Expansion the Yarn details are displayed or not$")
	public void Click_on_the_Expansion_the_Yarn_details_are_displayed_or_not() throws Throwable {
		Sw_View_Yarn_Working.Click_on_the_Expansion_the_Yarn_details_are_displayed_or_not();
	}
	@And ("Select the status {string} in filter Option page")
	public void Select_the_status_in_filter_Option_page(String status) throws Throwable {
		Sw_View_Yarn_Working.Select_the_status_in_filter_Option_page(status);
	}
}
