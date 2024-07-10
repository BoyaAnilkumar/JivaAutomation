package Stepdefinition1;

import Page.Bulk_Checking_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bulk_Checking_Steps {
	Bulk_Checking_Page   Bulk_Checking = new Bulk_Checking_Page();
	
	@Then ("^Click on the Fabric Store Module$")
	public void Click_on_the_Fabric_Store_Module() throws Throwable {
		Bulk_Checking.Click_on_the_Fabric_Store_Module();
	}
	@And ("^Click on the Fabric Bulk Checking under the Data Entry dropdown$")
	public void Click_on_the_Fabric_Bulk_Checking_under_the_Data_Entry_dropdown() throws Throwable {
		Bulk_Checking.Click_on_the_Fabric_Bulk_Checking_under_the_Data_Entry_dropdown();
	}

	@Then ("^The Bulk Checking Screen is displayed or not$")
	public void The_Bulk_Checking_Screen_is_displayed_or_not() throws Throwable {
		Bulk_Checking.The_Bulk_Checking_Screen_is_displayed_or_not();
	}
	@And ("^Click on the Add Lot Checking Icon and enter the data in all fields$")
	public void Click_on_the_Add_Lot_Checking_Icon_and_enter_the_data_in_all_fields() throws Throwable {
		Bulk_Checking.Click_on_the_Add_Lot_Checking_Icon_and_enter_the_data_in_all_fields();
	}
	@And ("^Click on the Save Button in the Bulk Checking screen$")
	public void Click_on_the_Save_Button_in_the_Bulk_Checking_screen() throws Throwable {
		Bulk_Checking.Click_on_the_Save_Button_in_the_Bulk_Checking_screen();
	}
	@And ("^Click on the Add Quality Checking Icon$")
	public void Click_on_the_Add_Quality_Checking_Icon() throws Throwable {
		Bulk_Checking.Click_on_the_Add_Quality_Checking_Icon();
	}
	
	@Then ("^the Add Quality Checking data form is displayed or not$")
	public void the_Add_Quality_Checking_data_form_is_displayed_or_not() throws Throwable {
		Bulk_Checking.the_Add_Quality_Checking_data_form_is_displayed_or_not();
	}
	
	@Then ("^Verify the IPO, Date of initial recd, PO Number, and Qty Received data is displayed or not$")
	public void Verify_the_IPO_Date_of_initial_recd_PO_Number_and_Qty_Received_data_is_displayed_or_not() throws Throwable {
		Bulk_Checking.Verify_the_IPO_Date_of_initial_recd_PO_Number_and_Qty_Received_data_is_displayed_or_not();
	}
	@And ("^The Fabric Details are displayed or not$")
	public void The_Fabric_Details_are_displayed_or_not() throws Throwable {
		Bulk_Checking.The_Fabric_Details_are_displayed_or_not();
	}
	@And ("^Select the Thaan name$")
	public void Select_the_Thaan_name() throws Throwable {
		Bulk_Checking.Select_the_Thaan_name();
	}
	@Then ("^Enter the data in Before Wash field$")
	public void Enter_the_data_in_Before_Wash_field() throws Throwable {
		Bulk_Checking.Enter_the_data_in_Before_Wash_field();
	}
	@And ("^Enter the data in After Wash field$")
	public void Enter_the_data_in_After_Wash_field() throws Throwable {
		Bulk_Checking.Enter_the_data_in_After_Wash_field();
	}
	@And ("^Enter the data in the Approve or Reject Date field$")
	public void Enter_the_data_in_the_Approve_or_Reject_Date_field() throws Throwable {
		Bulk_Checking.Enter_the_data_in_the_Approve_or_Reject_Date_field();
	}
	@And ("^Enter the data in the Qty field$")
	public void Enter_the_data_in_the_Qty_field() throws Throwable {
		Bulk_Checking.Enter_the_data_in_the_Qty_field();
	}
	@Then ("^Enter the data in L Shrinkage field$")
	public void Enter_the_data_in_L_Shrinkage_field() throws Throwable {
		Bulk_Checking.Enter_the_data_in_L_Shrinkage_field();
	}
	@And ("^Enter the data in W Shrinkage field$")
	public void Enter_the_data_in_W_Shrinkage_field() throws Throwable {
		Bulk_Checking.Enter_the_data_in_W_Shrinkage_field();
	}
	@Then ("^Verify the Fabric description, PO details, Total Approved Qty, and Quantity Received data is displayed or not$")
	public void Verify_the_Fabric_description_PO_details_Total_Approved_Qty_and_Quantity_Received_data_is_displayed_or_not() throws Throwable {
		Bulk_Checking.Verify_the_Fabric_description_PO_details_Total_Approved_Qty_and_Quantity_Received_data_is_displayed_or_not();
	}
	@And ("^Enter the data in the Qty Checked field$")
	public void Enter_the_data_in_the_Qty_Checked_field() throws Throwable {
		Bulk_Checking.Enter_the_data_in_the_Qty_Checked_field();
	}
	@When ("^the Can Cut Section is displayed and Enter the Can Cut data$")
	public void the_Can_Cut_Section_is_displayed_and_Enter_the_Can_Cut_data() throws Throwable {
		Bulk_Checking.the_Can_Cut_Section_is_displayed_and_Enter_the_Can_Cut_data();
	}
	@When ("^Click on the Expansion icon the Lot Checking Data, Quality Checking Data, and Bulk Checking Data grids are displayed or not$")
	public void Click_on_the_Expansion_icon_the_Lot_Checking_Data_Quality_Checking_Data_and_Bulk_Checking_Data_grids_are_displayed_or_not() throws Throwable {
		Bulk_Checking.Click_on_the_Expansion_icon_the_Lot_Checking_Data_Quality_Checking_Data_and_Bulk_Checking_Data_grids_are_displayed_or_not();
	}
	@And ("^Update the Lot Checking Data$")
	public void Update_the_Lot_Checking_Data() throws Throwable {
		Bulk_Checking.Update_the_Lot_Checking_Data();
	}
	@And ("^CLick on the Update button$")
	public void CLick_on_the_Update_button() throws Throwable {
		Bulk_Checking.CLick_on_the_Update_button();
	}
}
