package Stepdefinition1;

import Page.Yarn_Stock_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Yarn_Stock_Steps {
	Yarn_Stock_Page   Yarn_Stock = new Yarn_Stock_Page();
	
	@And ("^Click on the Yarn Stock under the Reports dropdown$")
	public void Click_on_the_Yarn_Stock_under_the_Reports_dropdown() throws Throwable {
		Yarn_Stock.Click_on_the_Yarn_Stock_under_the_Reports_dropdown();
	}
	
	@Then ("^The Yarn Stock Screen is displayed or not$")
	public void The_Yarn_Stock_Screen_is_displayed_or_not() throws Throwable {
		Yarn_Stock.The_Yarn_Stock_Screen_is_displayed_or_not();
	}
	@And ("^Verify the Stock data is displayed in the grid or not$")
	public void Verify_the_Stock_data_is_displayed_in_the_grid_or_not() throws Throwable {
		Yarn_Stock.Verify_the_Stock_data_is_displayed_in_the_grid_or_not();
	}
	@And ("^Click on the Expansion icon the expansion grid is displayed or not$")
	public void Click_on_the_Expansion_icon_the_expansion_grid_is_displayed_or_not() throws Throwable {
		Yarn_Stock.Click_on_the_Expansion_icon_the_expansion_grid_is_displayed_or_not();
	}
	@And ("^Verify the Search keyword functionality$")
	public void Verify_the_Search_keyword_functionality() throws Throwable {
		Yarn_Stock.Verify_the_Search_keyword_functionality();
	}
	
}
