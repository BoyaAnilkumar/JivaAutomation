package Stepdefinition1;

import Pages.TrimSheetAcceptancePages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrimSheetAcceptanceSteps {
	
	TrimSheetAcceptancePages TSA = new TrimSheetAcceptancePages();
	
	
	@Given ("^Login with the Trim Manager$")
	public void Login_with_the_Trim_Manager() throws Throwable {
		TSA.Login_with_the_Trim_Manager();
	}
	@Then ("^Navigate to Trim Sheet Acceptance screen$")
	public void Navigate_to_Trim_Sheet_Acceptance_screen() throws Throwable {
		TSA.Navigate_to_Trim_Sheet_Acceptance_screen();
	}
	@Then ("^Verify and Print the Accepted Rejected Date$")
	public void Verify_and_Print_the_Accepted_Rejected_Date() throws Throwable {
		TSA.Verify_and_Print_the_Accepted_Rejected_Date();
	}
	@Then ("^Click on the Reject Trim Sheet button$")
	public void Click_on_the_Reject_Trim_Sheet_button() throws Throwable {
		TSA.Click_on_the_Reject_Trim_Sheet_button();
	}
	@Then ("^Verify whether the Reject Trim Sheet popup is displayed$")
	public void Verify_whether_the_Reject_Trim_Sheet_popup_is_displayed() throws Throwable {
		TSA.Verify_whether_the_Reject_Trim_Sheet_popup_is_displayed();
	}
	@Then ("^Click on the Submit button in popup window$")
	public void Click_on_the_Submit_button_in_popup_window() throws Throwable {
		TSA.Click_on_the_Submit_button_in_popup_window();
	}
	@Then ("^Click on Cancel button in the Reject Trim Sheet popup$")
	public void Click_on_Cancel_button_in_the_Reject_Trim_Sheet_popup() throws Throwable {
		TSA.Click_on_Cancel_button_in_the_Reject_Trim_Sheet_popup();
	}
	@Given ("Enter the Reason for Rejecting the Trim {string}")
	public void Enter_the_Reason_for_Rejecting_the_Trim(String Reason) throws Throwable {
		TSA.Enter_the_Reason_for_Rejecting_the_Trim(Reason);
	}
	@And ("^Click on the Submit button in the popup window$")
	public void Click_on_the_Submit_button_in_the_popup_window() throws Throwable {
		TSA.Click_on_the_Submit_button_in_popup_window();
	}
	@Then ("^Print the Rejected successful msg$")
	public void Print_the_Rejected_successful_msg() throws Throwable {
		TSA.Print_the_Rejected_successful_msg();
	}
	@Then ("^Click on the Accept Trim Sheet button$")
	public void Click_on_the_Accept_Trim_Sheet_button() throws Throwable {
		TSA.Click_on_the_Accept_Trim_Sheet_button();
	}
	@Then ("^Verify whether the Accept Trim Sheet popup is displayed$")
	public void Verify_whether_the_Accept_Trim_Sheet_popup_is_displayed() throws Throwable {
		TSA.Verify_whether_the_Accept_Trim_Sheet_popup_is_displayed();
	}
	@Then ("^Click on Cancel button in the Accept Trim Sheet popup$")
	public void Click_on_Cancel_button_in_the_Accept_Trim_Sheet_popup() throws Throwable {
		TSA.Click_on_Cancel_button_in_the_Accept_Trim_Sheet_popup();
	}
	@Given ("Enter the Reason for Accepting the Trim {string}")
	public void Enter_the_Reason_for_Accepting_the_Trim(String Reason) throws Throwable {
		TSA.Enter_the_Reason_for_Accepting_the_Trim(Reason);
	}
	@Then ("^Print the Accepted successful msg$")
	public void Print_the_Accepted_successful_msg() throws Throwable {
		TSA.Print_the_Accepted_successful_msg();
	}
	@Then ("^Click on the View for Print button$")
	public void Click_on_the_View_for_Print_button() throws Throwable {
		TSA.Click_on_the_View_for_Print_button();
	}
	@And ("^Verify the Trim Print form$")
	public void Verify_the_Trim_Print_form() throws Throwable {
		TSA.Verify_the_Trim_Print_form();
	}
	@When ("^Clicked on the Cancel button in the Trim Print form$")
	public void Clicked_on_the_Cancel_button_in_the_Trim_Print_form() throws Throwable {
		TSA.Clicked_on_the_Cancel_button_in_the_Trim_Print_form();
	}
	@Then ("^Verify page navigated to Trim Sheet Acceptance$")
	public void Verify_page_navigated_to_Trim_Sheet_Acceptance() throws Throwable {
		TSA.Verify_page_navigated_to_Trim_Sheet_Acceptance();
	}
			
	  

}
