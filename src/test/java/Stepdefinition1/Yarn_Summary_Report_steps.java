package Stepdefinition1;

import Page.Yarn_Summary_Report_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Yarn_Summary_Report_steps {
	Yarn_Summary_Report_Page  Yarn_Summary_Report = new Yarn_Summary_Report_Page();

	@And ("^Click on the Yarn Summary Report under the T&A dropdown$")
	public void Click_on_the_Yarn_Summary_Report_under_the_T_and_A_dropdown()throws Throwable {
		Yarn_Summary_Report.Click_on_the_Yarn_Summary_Report_under_the_T_and_A_dropdown();
	}
	@Then ("^the Yarn Summary Report Screen is displayed or not$")
	public void the_Yarn_Summary_Report_Screen_is_displayed_or_not()throws Throwable {
		Yarn_Summary_Report.the_Yarn_Summary_Report_Screen_is_displayed_or_not();
	}
	@And ("Select the Buyer in the {string} field")
	public void Select_the_Buyer_in_the_field(String Buyer)throws Throwable {
	Yarn_Summary_Report.Select_the_Buyer_in_the_field(Buyer);
    }
	@And ("Select the Supplier in the {string} field")
	public void Select_the_Supplier_in_the_field(String Supplier)throws Throwable {
	Yarn_Summary_Report.Select_the_Supplier_in_the_field(Supplier);
	}
	@Then ("User select the {string} in the filter page")
	public void User_select_the_in_the_filter_page(String Yarn_Quality)throws Throwable {
	Yarn_Summary_Report.User_select_the_in_the_filter_page(Yarn_Quality);
    }
	@And ("Select the Month in the {string} field")
	public void Select_the_Month_in_the_field(String Month)throws Throwable {
	Yarn_Summary_Report.Select_the_Month_in_the_field(Month);
	}
	@And ("Select the {string} in the Search by IPO field")
	public void Select_the_in_the_Search_by_IPO_field(String IPO)throws Throwable {
	Yarn_Summary_Report.Select_the_in_the_Search_by_IPO_field(IPO);
	}
	@And ("^Click on the Excel Export button$")
	public void Click_on_the_Excel_Export_button()throws Throwable {
		Yarn_Summary_Report.Click_on_the_Excel_Export_button();
	}
	@And ("^Click on the Columns Dropdown$")
	public void Click_on_the_Columns_Dropdown()throws Throwable {
		Yarn_Summary_Report.Click_on_the_Columns_Dropdown();
	}
	@And ("^Select the Select All Option in the column dropdown$")
	public void Select_the_Select_All_Option_in_the_column_dropdown()throws Throwable {
		Yarn_Summary_Report.Select_the_Select_All_Option_in_the_column_dropdown();
	}
	@And ("^Click on the Ok button in the Column dropdown$")
	public void Click_on_the_Ok_button_in_the_Column_dropdown()throws Throwable {
		Yarn_Summary_Report.Click_on_the_Ok_button_in_the_Column_dropdown();
	}
	@Then ("^Verify the filter related data is displayed in the grid or not$")
	public void Verify_the_filter_related_data_is_displayed_in_the_grid_or_not()throws Throwable {
		Yarn_Summary_Report.Verify_the_filter_related_data_is_displayed_in_the_grid_or_not();
	}
}
