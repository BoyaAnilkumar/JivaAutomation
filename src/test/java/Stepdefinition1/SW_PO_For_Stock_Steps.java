package Stepdefinition1;

import Page.SW_PO_For_Stock_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_PO_For_Stock_Steps {
	SW_PO_For_Stock_Page Sw_Po_Stock = new SW_PO_For_Stock_Page();
	
	@And ("^Click on the PO For Stock Screen$")
	public void Click_on_the_PO_For_Stock_Screen() throws Throwable {
		Sw_Po_Stock.Click_on_the_PO_For_Stock_Screen();
	}
	@And ("^The PO For Stock Screen is displayed or not$")
	public void Click_on_the_Create_PO_For_Stock_Screen() throws Throwable {
		Sw_Po_Stock.Click_on_the_Create_PO_For_Stock_Screen();
	}
	@And ("Select the {string} in Filters page")
	public void Select_the_in_Filters_page(String Supplier) throws Throwable {
		Sw_Po_Stock.Select_the_in_Filters_page(Supplier);
	}
	@Then ("Select the Buyer {string} in the Filters page")
	public void Select_the_Buyer_in_the_Filters_page(String Buyer) throws Throwable {
		Sw_Po_Stock.Select_the_Buyer_in_the_Filters_page(Buyer);
	}
	@And ("Select the {string} in filters page")
	public void Select_the_yarn_quality_in_filters_page(String yarn_Quality) throws Throwable {
		Sw_Po_Stock.Select_the_yarn_quality_in_filters_page(yarn_Quality);
	}
	@And ("Enter the {string} in Search By Style")
	public void Enter_the_in_Search_By_Style(String Style_name) throws Throwable {
		Sw_Po_Stock.Enter_the_in_Search_By_Style(Style_name);
	}
	@And ("^the Selected Style records are displayed in the grid or not$")
	public void the_Selected_Style_records_are_displayed_in_the_grid_or_not() throws Throwable {
		Sw_Po_Stock.the_Selected_Style_records_are_displayed_in_the_grid_or_not();
	}
	@And ("^The Revised PO For Stock Screen is displayed or not$")
	public void The_Revised_PO_For_Stock_Screen_is_displayed_or_not() throws Throwable {
		Sw_Po_Stock.The_Revised_PO_For_Stock_Screen_is_displayed_or_not();
	}
	@And ("^The PO Details are prepopulated or not$")
	public void The_PO_Details_are_prepopulated_or_not() throws Throwable {
		Sw_Po_Stock.The_PO_Details_are_prepopulated_or_not();
	}
	@And ("^Deliver Details are prepopulated or not$")
	public void Deliver_Details_are_prepopulated_or_not() throws Throwable {
		Sw_Po_Stock.Deliver_Details_are_prepopulated_or_not();
	}
	@And ("^Supplier details are prepopulated or not$")
	public void Supplier_details_are_prepopulated_or_not() throws Throwable {
		Sw_Po_Stock.Supplier_details_are_prepopulated_or_not();
	}
	@And ("^The Yarn details are prepopulated or not$")
	public void The_Yarn_details_are_prepopulated_or_not() throws Throwable {
		Sw_Po_Stock.The_Yarn_details_are_prepopulated_or_not();
	}
	@And ("^The Quantity details are prepopulated or not$")
	public void The_Quantity_details_are_prepopulated_or_not() throws Throwable {
		Sw_Po_Stock.The_Quantity_details_are_prepopulated_or_not();
	}
	@And ("^Stock details are prepopulated or not$")
	public void Stock_details_are_prepopulated_or_not() throws Throwable {
		Sw_Po_Stock.Stock_details_are_prepopulated_or_not();
	}
	@And ("^Edit the Deliver details$")
	public void Edit_the_Deliver_details() throws Throwable {
		Sw_Po_Stock.Edit_the_Deliver_details();
	}

	@And ("^The Save Revised PO validation message is displayed or not$")
	public void The_Save_Revised_PO_validation_message_is_displayed_or_not() throws Throwable {
		Sw_Po_Stock.The_Save_Revised_PO_validation_message_is_displayed_or_not();
	}
	@And ("^Click on the Cancel Po Icon$")
	public void Click_on_the_Cancel_Po_Icon() throws Throwable {
		Sw_Po_Stock.Click_on_the_Cancel_Po_Icon();
	}
	@And ("^The Save Cancel PO validation message is displayed or not$")
	public void The_Save_Cancel_PO_validation_message_is_displayed_or_not() throws Throwable {
		Sw_Po_Stock.The_Save_Cancel_PO_validation_message_is_displayed_or_not();
	}
	@And ("^Enter the data in the Revised Quantity field$")
	public void Enter_the_data_in_the_Revised_Quantity_field() throws Throwable {
		Sw_Po_Stock.Enter_the_data_in_the_Revised_Quantity_field();
	}
}
