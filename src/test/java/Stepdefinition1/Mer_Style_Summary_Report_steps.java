package Stepdefinition1;

import Page.SW_Merchant_style_Summary_Report_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Mer_Style_Summary_Report_steps {
	SW_Merchant_style_Summary_Report_Page  Mer_Style_Summary_Report = new SW_Merchant_style_Summary_Report_Page();
	
	@And ("^Click on the Style Summary Report under the T and A dropdown$")
	public void Click_on_the_Style_Summary_Report_under_the_T_and_A_dropdown()throws Throwable {
		Mer_Style_Summary_Report.Click_on_the_Style_Summary_Report_under_the_T_and_A_dropdown();
	}
	@Then ("^the Merchandising Style Summary Report Screen is displayed or not$")
	public void the_Merchandising_Style_Summary_Report_Screen_is_displayed_or_not()throws Throwable {
		Mer_Style_Summary_Report.the_Merchandising_Style_Summary_Report_Screen_is_displayed_or_not();
	}
	@And ("^Select the Select All Column Option in the column dropdown$")
	public void Select_the_Select_All_Column_Option_in_the_column_dropdown()throws Throwable {
		Mer_Style_Summary_Report.Select_the_Select_All_Column_Option_in_the_column_dropdown();
	}
}
