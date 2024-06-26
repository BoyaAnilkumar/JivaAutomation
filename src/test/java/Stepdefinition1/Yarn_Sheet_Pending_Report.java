package Stepdefinition1;


import Page.SW_YarnSheet_Pen_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Yarn_Sheet_Pending_Report {
	
	SW_YarnSheet_Pen_Pages SWViewYarnSheetPending = new SW_YarnSheet_Pen_Pages();
	
	
	
	@And ("^Click on the Yarn Sheet Pending Report$")
	public void Click_on_the_Yarn_Sheet_Pending_Report() throws Throwable {
		SWViewYarnSheetPending.Click_on_the_Yarn_Sheet_Pending_Report();
	}
	@Then ("^Click on the Filter Expansion$")
	public void Click_on_the_Filter_Expansion() throws Throwable {
		SWViewYarnSheetPending.Click_on_the_Filter_Expansion();
	}
	@And ("Select the Merchant {string} in the Filter option page")
	public void Select_the_Merchant_in_the_Filter_option_page(String Merchant) throws Throwable {
		SWViewYarnSheetPending.Select_the_Merchant_in_the_Filter_option_page(Merchant);
	}
	
	@And ("Select the {string} in Filter Option Page")
	public void Select_the_in_Filter_Option_Page(String Status) throws Throwable {
		SWViewYarnSheetPending.Select_the_in_Filter_Option_Page(Status);
	}
	@And ("^The Search related data is displayed in the main grid$")
	public void The_Search_related_data_is_displayed_in_the_main_grid() throws Throwable {
		SWViewYarnSheetPending.The_Search_related_data_is_displayed_in_the_main_grid();
	}
	@And ("^Click on the Export button$")
	public void Click_on_the_Export_button() throws Throwable {
		SWViewYarnSheetPending.Click_on_the_Export_button();
	}
	@And ("^Verify the without displaying the data in the grid the Export button is displaying disabled state or not$")
	public void Verify_the_without_displaying_the_data_in_the_grid_the_Export_button_is_displaying_disabled_state_or_not() throws Throwable {
		SWViewYarnSheetPending.Verify_the_without_displaying_the_data_in_the_grid_the_Export_button_is_displaying_disabled_state_or_not();
	}
	@Then ("^By default five records are displayed$")
	public void By_default_five_records_are_displayed() throws Throwable{
		SWViewYarnSheetPending.By_default_five_records_are_displayed();
	}
	@And ("^check whether it is navigating to the after page records when the user clicks on Next page icon$")
	public void check_whether_it_is_navigating_to_the_after_page_records_when_the_user_clicks_on_Next_page_icon() throws Throwable{
		SWViewYarnSheetPending.check_whether_it_is_navigating_to_the_after_page_records_when_the_user_clicks_on_Next_page_icon();
	}
	@And ("^check whether it is navigating to the before page records when the user clicks on before page icon$")
	public void check_whether_it_is_navigating_to_the_before_page_records_when_the_user_clicks_on_before_page_icon() throws Throwable{
		SWViewYarnSheetPending.check_whether_it_is_navigating_to_the_before_page_records_when_the_user_clicks_on_before_page_icon();
	}

	@And ("^check whether it is displaying the last page records when the user clicks on last page icon$")
	public void check_whether_it_is_displaying_the_last_page_records_when_the_user_clicks_on_last_page_icon() throws Throwable{
		SWViewYarnSheetPending.check_whether_it_is_displaying_the_last_page_records_when_the_user_clicks_on_last_page_icon();
	}
}
