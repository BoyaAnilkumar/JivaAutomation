package Stepdefinition1;

import Page.TrimSheetWorking_Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrimSheetWorking_Steps {
	
	TrimSheetWorking_Pages TSW = new TrimSheetWorking_Pages();
	
	@Then ("^Navigate to Trim Sheet Working screen$")
	public void Navigate_to_Trim_Sheet_Working_screen() throws Throwable {
		TSW.Navigate_to_Trim_Sheet_Working_screen();
	}
	@Then ("^Verify and print the Trim Details grid records$")
	public void Verify_and_print_the_Trim_Details_grid_records() {
		TSW.Verify_and_print_the_Trim_Details_grid_records();
	}
	@When ("^Click on the Edit button for a Trim$")
	public void Click_on_the_Edit_button_for_a_Trim() throws Throwable {
		TSW.Click_on_the_Edit_button_for_a_Trim();
	}
	@Then ("^Verify whether the page is navigated to the Add Trim Sheet Working$")
	public void Verify_whether_the_page_is_navigated_to_the_Add_Trim_Sheet_Working() throws Throwable {
		TSW.Verify_whether_the_page_is_navigated_to_the_Add_Trim_Sheet_Working();
	}
	@Then ("^Verify and Print the Category name$")
	public void Verify_and_Print_the_Category_name() throws Throwable {
		TSW.Verify_and_Print_the_Category_name();
	}
	@Then ("^Verify and Print the Item name$")
	public void Verify_and_Print_the_Item_name() throws Throwable {
		TSW.Verify_and_Print_the_Item_name();
	}
	@Then ("^Verify and Print the Color name$")
	public void Verify_and_Print_the_Color_name() throws Throwable {
		TSW.Verify_and_Print_the_Color_name();
	}
	@Then ("^Verify and Print the Total Req Qty$")
	public void Verify_and_Print_the_TotalReqQty_name() throws Throwable {
		TSW.Verify_and_Print_the_TotalReqQty_name();
	}
	@Then ("Select an UOM {string}")
	public void Select_an_UOM_(String UOM) throws Throwable {
		TSW.Select_an_UOM_(UOM);
	}
	@Then ("Select Qty Details {string}")
	public void Select_Qty_Details_(String QtyDetails) throws Throwable {
		TSW.Select_Qty_Details_(QtyDetails);
	}

	@Given ("Enter Qty per Unit value {string}")
	public void Enter_Qty_per_Unit_value_(String QtyUnit) throws Throwable {
		TSW.Enter_Qty_per_Unit_value_(QtyUnit);
	}
	@Given ("Enter Rate per Unit value {string}")
	public void Enter_Rate_per_Unit_value_(String Rate) throws Throwable {
		TSW.Enter_Rate_per_Unit_value_(Rate);
	}
	@Given ("Enter Conversion Rate value {string}")
	public void Enter_Conversion_Rate_value_(String ConvRate) throws Throwable {
		TSW.Enter_Conversion_Rate_value_(ConvRate);
	}
	@When ("^Clicked on the Submit button$")
	public void Clicked_on_the_Submit_button() throws Throwable {
		TSW.Clicked_on_the_Submit_button();
	}
	@Then ("^Verify whether navigate to Trim Sheet Working screen$")
	public void Verify_whether_navigate_to_Trim_Sheet_Working_screen() throws Throwable {
		TSW.Verify_whether_navigate_to_Trim_Sheet_Working_screen();
	}
	@Then ("^Verify and print the Trim Sheet Working grid records$")
	public void Verify_and_print_the_Trim_Sheet_Working_grid_records() {
		TSW.Verify_and_print_the_Trim_Sheet_Working_grid_records();
	}
	@Then ("^Verify and print the Job Work grid records$")
	public void Verify_and_print_the_Job_Work_grid_records() {
		TSW.Verify_and_print_the_Job_Work_grid_records();
	}
	@When ("Click on the Edit button for another Trim {string}{string}{string}{string}{string}{string}")
	public void Click_on_the_Edit_button_for_another_Trim(String UOM, String QtyDetails, String QtyUnit, String MU, String GRate, String DRate) throws Throwable {
		TSW.Click_on_the_Edit_button_for_another_Trim(UOM, QtyDetails, QtyUnit, MU, GRate, DRate);
	}
	@When ("Click on the Edit button for a job work Trim {string}{string}")
	public void Click_on_the_Edit_button_for_job_work_Trim_(String JobName, String RateperUnit) throws Throwable {
		TSW.Click_on_the_Edit_button_for_job_work_Trim_(JobName, RateperUnit);
	}
	@Then ("^Click on the Dyeing toggle button$")
	public void Click_on_the_Dyeing_toggle_button() throws Throwable {
		TSW.Click_on_the_Dyeing_toggle_button();
	}
	@Given ("Enter MU Working value {string}")
	public void Enter_MU_Working_value_(String MU) throws Throwable {
		TSW.Enter_MU_Working_value_(MU);
	}
	@Given ("Enter Greige Rate per Unit value {string}")
	public void Enter_Greige_Rate_per_Unit_value(String GRate) throws Throwable {
		TSW.Enter_Greige_Rate_per_Unit_value(GRate);
	}
	@Given ("Enter Greige Conversion Rate value {string}")
	public void Enter_Greige_Conversion_Rate_value_(String GConvRate) throws Throwable {
		TSW.Enter_Greige_Conversion_Rate_value_(GConvRate);
	}
	@Given ("Enter Dyeing Rate per Unit value {string}")
	public void Enter_Dyeing_Rate_per_Unit_value_(String DRate) throws Throwable {
		TSW.Enter_Dyeing_Rate_per_Unit_value_(DRate);
	}
	@Given ("Enter Dyeing Conversion Rate value {string}")
	public void Enter_Dyeing_Conversion_Rate_value_(String DConvRate) throws Throwable {
		TSW.Enter_Dyeing_Conversion_Rate_value_(DConvRate);
	}
	@When ("^Click on Submit to Audit Team button in the Trim Sheet Working screen$")
	public void Click_on_Submit_to_Audit_Team_button_in_the_Trim_Sheet_Working_screen() throws Throwable {
		TSW.Click_on_Submit_to_Audit_Team_button_in_the_Trim_Sheet_Working_screen();
	}
	@Then ("^Verify the toaster msg$")
	public void Verify_the_toaster_msg() throws Throwable {
		TSW.Verify_the_toaster_msg();
	}
	@When ("^Clicked on the Cancel button$")
	public void Clicked_on_the_Cancel_button() throws Throwable {
		TSW.Clicked_on_the_Cancel_button();
	}


}
