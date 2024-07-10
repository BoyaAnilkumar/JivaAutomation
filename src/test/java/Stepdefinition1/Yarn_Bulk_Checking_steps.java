package Stepdefinition1;

import Page.Yarn_Bulk_Checking_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Yarn_Bulk_Checking_steps {
	Yarn_Bulk_Checking_Page   Yarn_Bulk_Checking = new Yarn_Bulk_Checking_Page();
	
	@And ("^Click on the Yarn Bulk Checking under the Data Entry dropdown$")
	public void Click_on_the_Yarn_Bulk_Checking_under_the_Data_Entry_dropdown() throws Throwable {
		Yarn_Bulk_Checking.Click_on_the_Yarn_Bulk_Checking_under_the_Data_Entry_dropdown();
	}

	@Then ("^The Yarn Bulk Checking Screen is displayed or not$")
	public void The_Yarn_Bulk_Checking_Screen_is_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.The_Yarn_Bulk_Checking_Screen_is_displayed_or_not();
	}
	@And ("Enter the From Date in the {string} field")
	public void Enter_the_From_Date_in_the_field(String From_Date) throws Throwable {
		Yarn_Bulk_Checking.Enter_the_From_Date_in_the_field(From_Date);
	}
	@And ("Enter the To Date in the {string} field")
	public void Enter_the_To_Date_in_the_field(String To_Date) throws Throwable {
		Yarn_Bulk_Checking.Enter_the_To_Date_in_the_field(To_Date);
	}
	@And ("Select the supplier name in the {string} field")
	public void Select_the_supplier_name_in_the_field(String Supplier) throws Throwable {
		Yarn_Bulk_Checking.Select_the_supplier_name_in_the_field(Supplier);
	}
	@And ("Select the {string} in the Search by IPO or PO field")
	public void Select_the_in_the_Search_by_IPO_or_PO_field(String IPO) throws Throwable {
		Yarn_Bulk_Checking.Select_the_in_the_Search_by_IPO_or_PO_field(IPO);
	}
	@And ("^Click on the Add bulk Checking data Icon in the Actions Column$")
	public void Click_on_the_Add_bulk_Checking_data_Icon_in_the_Actions_Column() throws Throwable {
		Yarn_Bulk_Checking.Click_on_the_Add_bulk_Checking_data_Icon_in_the_Actions_Column();
	}
	@And ("^Verify the Add Bulk Checking Data page is displayed or not$")
	public void Verify_the_Add_Bulk_Checking_Data_page_is_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.Verify_the_Add_Bulk_Checking_Data_page_is_displayed_or_not();
	}
	@Then ("^the Yarn Description data is displayed or not$")
	public void the_Yarn_Description_data_is_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.the_Yarn_Description_data_is_displayed_or_not();
	}
	@And ("^The PO Details are displayed or not$")
	public void The_PO_Details_are_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.The_PO_Details_are_displayed_or_not();
	}
	@And ("^the Total Approved Qty value is displayed or not$")
	public void the_Total_Approved_Qty_value_is_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.the_Total_Approved_Qty_value_is_displayed_or_not();
	}
	@And ("^the Quantity Received value is displayed or not$")
	public void the_Quantity_Received_value_is_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.the_Quantity_Received_value_is_displayed_or_not();
	}
	@Then ("^the Bulk Checking section is displayed or not$")
	public void the_Bulk_Checking_section_is_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.the_Bulk_Checking_section_is_displayed_or_not();
	}
	@And ("^Verify the by default current date is displayed in the date field or not$")
	public void Verify_the_by_default_current_date_is_displayed_in_the_date_field_or_not() throws Throwable {
		Yarn_Bulk_Checking.Verify_the_by_default_current_date_is_displayed_in_the_date_field_or_not();
	}
	@And ("^Enter the data in the Qty Approved field$")
	public void Enter_the_data_in_the_Qty_Approved_field() throws Throwable {
		Yarn_Bulk_Checking.Enter_the_data_in_the_Qty_Approved_field();
	}
	@Given ("^enter the data in the Remarks field$")
	public void enter_the_data_in_the_Remarks_field() throws Throwable {
		Yarn_Bulk_Checking.enter_the_data_in_the_Remarks_field();
	}
	@When ("^the Can Net Section is displayed and Enter the Can Net data$")
	public void the_Can_Net_Section_is_displayed_and_Enter_the_Can_Net_data() throws Throwable {
		Yarn_Bulk_Checking.the_Can_Net_Section_is_displayed_and_Enter_the_Can_Net_data();
	}
	@And ("^Click on the Save Button in the Add Bulk Checking Data page$")
	public void Click_on_the_Save_Button_in_the_Add_Bulk_Checking_Data_page() throws Throwable {
		Yarn_Bulk_Checking.Click_on_the_Save_Button_in_the_Add_Bulk_Checking_Data_page();
	}
	@And ("^Click on the Expansion icon the bulk checking expansion grid data is displayed or not$")
	public void Click_on_the_Expansion_icon_the_bulk_checking_expansion_grid_data_is_displayed_or_not() throws Throwable {
		Yarn_Bulk_Checking.Click_on_the_Expansion_icon_the_bulk_checking_expansion_grid_data_is_displayed_or_not();
	}
	
}
