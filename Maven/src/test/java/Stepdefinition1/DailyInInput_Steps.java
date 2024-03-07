package Stepdefinition1;

import Page.DailyInInputpages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DailyInInput_Steps {

	DailyInInputpages DailyInInput_pages = new DailyInInputpages();
	
	@And("^click on Fabric Store module$")
	public void click_on_Fabric_Store_module() throws Throwable {
		DailyInInput_pages.click_on_Fabric_Store_module();
	}
	
	@And("^Click on Data Entry in Fabric Store$")
	public void Click_on_Data_Entry_in_Fabric_Store() throws Throwable {
		DailyInInput_pages.Click_on_Data_Entry_in_Fabric_Store();
	}
	
	@When("^click on Daily In and Out menu$")
	public void click_on_Daily_In_and_Out_menu() throws Throwable {
		DailyInInput_pages.click_on_Daily_In_and_Out_menu();
	}
	
	@And("^Click on Daily In Data Entry$")
	public void Click_on_Daily_In_Data_Entry() throws Throwable {
		DailyInInput_pages.Click_on_Daily_In_Data_Entry();
	}
	
	@When("^Verify that Daily In Data Entry screen is displaying or not$")
	public void Verify_that_Daily_In_Data_Entry_screen_is_displaying_or_not() throws Throwable {
		DailyInInput_pages.Verify_that_Daily_In_Data_Entry_screen_is_displaying_or_not();
	}
	
	@And("^Click on Add Data Entry button$")
	public void Click_on_Add_Data_Entry_button() throws Throwable {
		DailyInInput_pages.Click_on_Add_Data_Entry_button();
	}
	
	@Then("^Verify that user navigated to daily in data entry screen or not$")
	public void Verify_that_user_navigated_to_daily_in_data_entry_screen_or_not() throws Throwable {
		DailyInInput_pages.Verify_that_user_navigated_to_daily_in_data_entry_screen_or_not();
	}
	
	@And("^Select the Date if you need to change the date$")
	public void Select_the_Date_if_you_need_to_change_the_date() throws Throwable {
		DailyInInput_pages.Select_the_Date_if_you_need_to_change_the_date();
	}
	
	@Then("^verify that current date is displaying or not$")
	public void verify_that_current_date_is_displaying_or_not() throws Throwable {
		DailyInInput_pages.verify_that_current_date_is_displaying_or_not();
	}
	
	@And("^Enter the Challan No$")
	public void Enter_the_Challan_No() throws Throwable {
		DailyInInput_pages.Enter_the_Challan_No();
	}
	
	@And("^Enter the Bill No$")
	public void Enter_the_Bill_No() throws Throwable {
		DailyInInput_pages.Enter_the_Bill_No();
	}
	
	@And("^Enter the Gate Entry No$")
	public void Enter_the_Gate_Entry_No() throws Throwable {
		DailyInInput_pages.Enter_the_Gate_Entry_No();
	}
	
	@And("^Select Party Name$")
	public void Select_Party_Name() throws Throwable {
		DailyInInput_pages.Select_Party_Name();
	}
	
	@And("^Enter PO Number$")
	public void Enter_PO_Number() throws Throwable {
		DailyInInput_pages.Enter_PO_Number();
	}
	
	@Then("^Verify that Supplier FromLocation ProcessName FabricName Color ApplicableIPO Content Count GSM CuttableWidth UOM has prepopulated data after selecting the PO number$")
	public void Verify_that_Supplier_FromLocation_ProcessName_FabricName_Color_ApplicableIPO_Content_Count_GSM_CuttableWidth_UOM_has_prepopulated_data_after_selecting_the_PO_number() throws Throwable {
		DailyInInput_pages.Verify_that_Supplier_FromLocation_ProcessName_FabricName_Color_ApplicableIPO_Content_Count_GSM_CuttableWidth_UOM_has_prepopulated_data_after_selecting_the_PO_number();
	}
	
	@And("^Enter No of Thaans$")
	public void Enter_No_of_Thaans() throws Throwable {
		DailyInInput_pages.Enter_No_of_Thaans();
	}
	
	@And("^Enter No of Qty$")
	public void Enter_No_of_Qty() throws Throwable {
		DailyInInput_pages.Enter_No_of_Qty();
	}
	
	@And("^Enter the Rate for the Qty$")
	public void Enter_the_Rate_for_the_Qty() {
		DailyInInput_pages.Enter_the_Rate_for_the_Qty();
	}
	
	@And("^Select To Location from dropdown$")
	public void Select_To_Location_from_dropdown() {
		DailyInInput_pages.Select_To_Location_from_dropdown();
	}
	
	@And("^Enter Remarks for the Daily In Input$")
	public void Enter_Remarks_for_the_Daily_In_Input() {
		DailyInInput_pages.Enter_Remarks_for_the_Daily_In_Input();
	}
	
	@Then("^click on save button to create the Daily In Input$")
	public void click_on_save_button_to_create_the_Daily_In_Input() throws Throwable {
		DailyInInput_pages.click_on_save_button_to_create_the_Daily_In_Input();
	}
	
	
}
