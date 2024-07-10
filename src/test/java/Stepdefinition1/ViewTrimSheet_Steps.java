package Stepdefinition1;

import Page.ViewTrimSheet_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewTrimSheet_Steps {

	ViewTrimSheet_Pages VTSP = new ViewTrimSheet_Pages();
	
	@Then("^Click on View Trim Sheet$")
	public void Click_on_View_Trim_Sheet() throws Throwable {
		VTSP.Click_on_View_Trim_Sheet();
	}
	
	@And("^Select the Buyer from dropdown list$")
	public void Select_the_Buyer_from_dropdown_list() throws Throwable {
		VTSP.Select_the_Buyer_from_dropdown_list();
	}
	
	@And("^Enter IPO number in Search By IPO field$")
	public void Enter_IPO_number_in_Search_By_IPO_field() throws Throwable {
		VTSP.Enter_IPO_number_in_Search_By_IPO_field();
	}
	
	@And("^Reset the applied filter and click on Apply button$")
	public void Reset_the_applied_filter_and_click_on_Apply_button() throws Throwable {
		VTSP.Reset_the_applied_filter_and_click_on_Apply_button();
		
	}
	
	@And("^Click on the IPO in view trim sheet$")
	public void Click_on_the_IPO_in_view_trim_sheet() throws Throwable {
		VTSP.Click_on_the_IPO_in_view_trim_sheet();
	}
	
	@And("^IPO details are displaying for Trim Sheet$")
	public void IPO_details_are_displaying_for_Trim_Sheet() throws Throwable {
		VTSP.IPO_details_are_displaying_for_Trim_Sheet();
	}
	
	@Then("^verify the Merchant data and Trim data$")
	public void verify_the_Merchant_data_and_Trim_data() throws Throwable {
		VTSP.verify_the_Merchant_data_and_Trim_data();
	}
	
	@And("^click on View for Print by Item button$")
	public void click_on_View_for_Print_by_Item_button() throws Throwable {
		VTSP.click_on_View_for_Print_by_Item_button();
	}
	
	@And("^Click on History button to view history of the IPO$")
	public void Click_on_History_button_to_view_history_of_the_IPO() throws Throwable {
		VTSP.Click_on_History_button_to_view_history_of_the_IPO();
	}
}
