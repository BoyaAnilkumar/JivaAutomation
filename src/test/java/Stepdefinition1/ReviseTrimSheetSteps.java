package Stepdefinition1;

import Pages.ReviseTrimSheetPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviseTrimSheetSteps {
	
	ReviseTrimSheetPages RTS = new ReviseTrimSheetPages();

	@Then ("^Navigate to Revise Trim Sheet screen$")
	public void Navigate_to_Revise_Trim_Sheet_screen() throws Throwable {
		RTS.Navigate_to_Revise_Trim_Sheet_screen();
	}
	@Then ("^Select a Status in the filter window$")
	public void Select_a_Status_in_the_filter_window() throws Throwable {
		RTS.Select_a_Status_in_the_filter_window();
	}
	@Then ("^Verify and Print the BulkTime DeadLine$")
	public void Verify_and_Print_the_BulkTime_DeadLine() throws Throwable {
		RTS.Verify_and_Print_the_BulkTime_DeadLine();
	}
	@Then ("^Verify and Print the Reason For Revision$")
	public void Verify_and_Print_the_Reason_For_Revision() throws Throwable {
		RTS.Verify_and_Print_the_Reason_For_Revision();
	}
	@Then ("^Verify and Print the Trim Manager$")
	public void Verify_and_Print_the_Trim_Manager() throws Throwable {
		RTS.Verify_and_Print_the_Trim_Manager();
	}
	@Then ("^Verify and Print the Trim Manager Assistants$")
	public void Verify_and_Print_the_Trim_Manager_Assistants() throws Throwable {
		RTS.Verify_and_Print_the_Trim_Manager_Assistants();
	}
	@Then ("^Verify and print records data in the Merchant and Trim team grids$")
	public void Verify_and_print_records_data_in_the_Merchant_and_Trim_team_grids() throws Throwable {
		RTS.Verify_and_print_records_data_in_the_Merchant_and_Trim_team_grids();
	}
	@Then ("^Verify whether navigated to the Add Revised Trim Sheet form$")
	public void Verify_whether_navigated_to_the_Add_Revised_Trim_Sheet_form() throws Throwable {
		RTS.Verify_whether_navigated_to_the_Add_Revised_Trim_Sheet_form();
	}
	@Then ("^Verify whether the page is navigated to the Revised Trim Sheet$")
	public void Verify_whether_the_page_is_navigated_to_the_Revised_Trim_Sheet() throws Throwable {
		RTS.Verify_whether_the_page_is_navigated_to_the_Revised_Trim_Sheet();
	}
	@Given ("Enter the Reason For Revision field{string}")
	public void Enter_the_Reason_For_Revision_field(String Reason) throws Throwable {
		RTS.Enter_the_Reason_For_Revision_field(Reason);
	}
	@And ("^Verify and print the Revised Successful submit msg$")
	public void Verify_and_print_the_Revised_Successful_submit_msg() {
		RTS.Verify_and_print_the_Revised_Successful_submit_msg();
	}
	@When ("^Click the Cancel button$")
	public void Click_the_Cancel_button() throws Throwable {
		RTS.Click_the_Cancel_button();
	}
}
