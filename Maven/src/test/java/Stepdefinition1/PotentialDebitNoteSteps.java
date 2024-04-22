package Stepdefinition1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PotentialDebitNoteSteps {
	
	PotentialDebitNotePages PDNP = new PotentialDebitNotePages();
	
	@Given ("^Login with the Fabric Manager$")
	public void Login_with_the_Fabric_Manager() {
		PDNP.Login_with_the_Fabric_Manager();
	}

	@Then ("^Navigate to the Potential Debit Note screen$")
	public void Navigate_to_the_Potential_Debit_Note_screen() throws Throwable {
		PDNP.Navigate_to_the_Potential_Debit_Note_screen();
	}
	@Then ("^Verify the Action column$")
	public void Verify_the_Action_column() throws Throwable {
		PDNP.Verify_the_Action_column();
	}
	@When ("^Clicked on the Request Approval Closed$")
	public void Clicked_on_the_Request_Approval_Closed() throws Throwable {
		PDNP.Clicked_on_the_Request_Approval_Closed();
	}
	@Then ("^Check whether the Request Approval To Closed pop-up window is displayed or not$")
	public void Check_whether_the_Request_Approval_To_Closed_popup_window_is_displayed_or_not() throws Throwable {
		PDNP.Check_whether_the_Request_Approval_To_Closed_popup_window_is_displayed_or_not();
	}
	@Then ("^Click on the Submit button in the Reuest Approval Close window$")
	public void Click_on_the_Submit_button_in_the_Reuest_Approval_Close_window() throws Throwable {
		PDNP.Click_on_the_Submit_button_in_the_Reuest_Approval_Close_window();
	}
	@Then ("^Check the validation msg when Remarks field has null values$")
	public void Check_the_validation_msg_when_Remarks_field_has_null_values() throws Throwable {
		PDNP.Check_the_validation_msg_when_Remarks_field_has_null_values();
	}
	@Given ("^Enter Remarks in the Reuest Approval Close window$")
	public void Enter_Remarks_in_the_Reuest_Approval_Close_window() throws Throwable {
		PDNP.Enter_Remarks_in_the_Reuest_Approval_Close_window();
	}
//	@Then ("^Click on the Submit button in the Reuest Approval Close window$")
//	public void Click_on_the_Submit_button_in_the_Reuest_Approval_Close_window() {
//		PDNP.Click_on_the_Submit_button_in_the_Reuest_Approval_Close_window();
//	}
	
	@Then ("^Verify the Successfiull msgn user navigates to Login page$")
	public void Verify_the_Successfiull_msgn_user_navigates_to_Login_page() throws Throwable {
		PDNP.Verify_the_Successfiull_msgn_user_navigates_to_Login_page();
	}
	
	 @When ("^Click on the Debit Note button under the Actions column$")
	 public void Click_on_the_Debit_Note_button_under_the_Actions_column() throws Throwable {
		 PDNP.Click_on_the_Debit_Note_button_under_the_Actions_column();
	 }
	 @Then ("^Verify whether the page is navigated to the Debite Note form$")
	 public void Verify_whether_the_page_is_navigated_to_the_Debite_Note_form() throws Throwable {
		 PDNP.Verify_whether_the_page_is_navigated_to_the_Debite_Note_form();
	 }
	 @Then ("^Verify whether the mandatory validation msg is displayed$")
	 public void Verify_whether_the_mandatory_validation_msg_is_displayed() {
		 PDNP.Verify_whether_the_mandatory_validation_msg_is_displayed();
	 }
	 @Given ("^Enter Reason in the Debit Note form$")
	 public void Enter_Reason_in_the_Debit_Note_form() throws Throwable {
		 PDNP.Enter_Reason_in_the_Debit_Note_form();
	 }
	 @Then ("^Verify the Successfull msg$")
	 public void Verify_the_Successfull_msg() throws Throwable {
		 PDNP.Verify_the_Successfull_msg();
	 }
	 @Then ("^Verify whether the page is navigated to the Potential Debit Note screen$")
	 public void Verify_whether_the_page_is_navigated_to_the_Potential_Debit_Note_screen() throws Throwable {
		 PDNP.Verify_whether_the_page_is_navigated_to_the_Potential_Debit_Note_screen();
	 }
	  
	 @Then ("^Navigate to the Potential Credit Note screen$")
	 public void Navigate_to_the_Potential_Credit_Note_screen() throws Throwable {
		 PDNP.Navigate_to_the_Potential_Credit_Note_screen();
	 }
	 @When ("^Click on the Credit Note button under the Actions column$")
	 public void Click_on_the_Credit_Note_button_under_the_Actions_column() throws Throwable {
		 PDNP.Click_on_the_Credit_Note_button_under_the_Actions_column();
	 }
	 @Then ("^Verify whether the page is navigated to the Credite Note form$")
	 public void Verify_whether_the_page_is_navigated_to_the_Credite_Note_form() throws Throwable {
		 PDNP.Verify_whether_the_page_is_navigated_to_the_Potential_Credite_Note_screen();
	 }
//	 @Then ("^Verify whether the mandatory validation msg is displayed$")
//	 public void Verify_whether_the_mandatory_validation_msg_is_displayed() {
//		 PDNP.Verify_whether_the_mandatory_validation_msg_is_displayed();
//	 }
	 @Given ("^Enter Reason in the Credit Note form$")
	 public void Enter_Reason_in_the_Credit_Note_form() throws Throwable {
		 PDNP.Enter_Reason_in_the_Credit_Note_form();
	 }
//	 @Then ("^Verify the Successfull msg$")
//	 public void Verify_the_Successfull_msg() {
//		 PDNP.Verify_the_Successfull_msg();
//	 }
//	 @Then ("^Verify whether the page is navigated to the Potential Credit Note screen$")
//	 public void Verify_whether_the_page_is_navigated_to_the_Potential_Credit_Note_screen() throws Throwable {
//		 PDNP.Verify_whether_the_page_is_navigated_to_the_Potential_Credit_Note_screen();
//	 }
	 
	 @Then ("^Verify the success msg on submitting the Notes$")
	 public void Verify_the_success_msg_on_submitting_the_Notes() {
		 PDNP.Verify_the_success_msg_on_submitting_the_Notes();
	 }
	 @When ("^Click on Submit button in the Dedit note form$")
	 public void Click_on_Submit_button_in_the_Dedit_note_form() throws Throwable {
		 PDNP.Click_on_Submit_button_in_the_Dedit_note_form();
	 }
	 @When ("^Click on Submit button in the Credit note form$")
	 public void Click_on_Submit_button_in_the_Credit_note_form() throws Throwable {
		 PDNP.Click_on_Submit_button_in_the_Credit_note_form();
	 }
	 @Then ("^Verify whether the page is navigated to the Debit Note print form$")
	 public void Verify_whether_the_page_is_navigated_to_the_Debit_Note_print_form() throws Throwable {
		 PDNP.Verify_whether_the_page_is_navigated_to_the_Debit_Note_print_form();
	 }
	 @When ("^Click on the Cancel button in the Debit Note print form$")
	 public void Click_on_the_Cancel_button_in_the_Debit_Note_print_form() throws Throwable {
		 PDNP.Click_on_the_Cancel_button_in_the_Debit_Note_print_form();
	 }
	 @Then ("^Verify whether the page is navigated to the Credit Note print form$")
	 public void Verify_whether_the_page_is_navigated_to_the_Credit_Note_print_form() throws Throwable {
		 PDNP.Verify_whether_the_page_is_navigated_to_the_Credit_Note_print_form();
	 }
	 @When ("^Click on the Cancel button in the Credit Note print form$")
	 public void Click_on_the_Cancel_button_in_the_Credit_Note_print_form() throws Throwable {
		 PDNP.Click_on_the_Cancel_button_in_the_Credit_Note_print_form();
	 }

}
