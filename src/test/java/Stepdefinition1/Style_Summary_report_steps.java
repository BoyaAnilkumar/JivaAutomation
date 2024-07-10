package Stepdefinition1;

import Page.Style_Summary_Report_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Style_Summary_report_steps {

	Style_Summary_Report_Page    Style_Summary_report    = new Style_Summary_Report_Page();
	
	
	
	@And ("^Click on the Merchandising Style Summary Report under the T and A dropdown$")
	public void Click_on_the_Merchandising_Style_Summary_Report_under_the_T_and_A_dropdown()throws Throwable {
		Style_Summary_report.Click_on_the_Merchandising_Style_Summary_Report_under_the_T_and_A_dropdown();
	}
	
	@Then ("^the Style Summary Report Screen is displayed or not$")
	public void the_Style_Summary_Report_Screen_is_displayed_or_not()throws Throwable {
		Style_Summary_report.the_Style_Summary_Report_Screen_is_displayed_or_not();
	}
	@Then ("User select the fabric{string} in the filter page")
	public void User_select_the_fabric_in_the_filter_page(String Fabric_Quality)throws Throwable {
		Style_Summary_report.User_select_the_fabric_in_the_filter_page(Fabric_Quality);
    }
	
}
