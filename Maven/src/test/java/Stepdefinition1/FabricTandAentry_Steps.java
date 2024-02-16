package Stepdefinition1;

import Page.FabricTandAentrypage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FabricTandAentry_Steps {

	FabricTandAentrypage FabricTandAentrypage = new FabricTandAentrypage();
	
	@And("^Click on the T and A Data Entry Screen$")
	public void Click_on_the_T_and_A_Data_Entry_Screen() throws Throwable{
		FabricTandAentrypage.Click_on_the_T_and_A_Data_Entry_Screen();
	}
	
	@And("^click on vendor field$")
	public void click_on_vendor_field() throws Throwable {
		FabricTandAentrypage.click_on_vendor_field();
	}
	
	@And("^Search and select the IPO$")
	public void Search_and_select_the_IPO() throws Throwable {
		FabricTandAentrypage.Search_and_select_the_IPO();
	}
	
	@When("^IPO details are displaying after selecting the IPO$")
	public void IPO_details_are_displaying_after_selecting_the_IPO() throws Throwable {
		FabricTandAentrypage.IPO_details_are_displaying_after_selecting_the_IPO();
	}
	
	@And("^verify the search by process functionality is working or not$")
	public void verify_the_search_by_process_functionality_is_working_or_not() throws Throwable {
		FabricTandAentrypage.verify_the_search_by_process_functionality_is_working_or_not();
	}
	
	@And("^click on add button to submit the T and A$")
	public void click_on_add_button_to_submit_the_T_and_A() throws Throwable {
		FabricTandAentrypage.click_on_add_button_to_submit_the_T_and_A();
	}
	
	@Given("^Enter Submission date for quality Test$")
	public void Enter_Submission_date_for_quality_Test() throws Throwable {
		FabricTandAentrypage.Enter_Submission_date_for_quality_Test();
	}
	
	@Given("^Remarks for Quality Test$")
	public void Remarks_for_Quality_Test() throws Throwable {
		FabricTandAentrypage.Remarks_for_Quality_Test();
	}
	
	@Given("^Enter Initial Bulk Submission and Approval dates$")
	public void Enter_Initial_Bulk_Submission_and_Approval_dates() throws Throwable {
		FabricTandAentrypage.Enter_Initial_Bulk_Submission_and_Approval_dates();
	}
	
	@Given("^Remarks for Initial Bulk Test$")
	public void Remarks_for_Initial_Bulk_Test() throws Throwable {
		FabricTandAentrypage.Remarks_for_Initial_Bulk_Test();
	}
	
	@Given("^Enter Bulk Lot In House dates$")
	public void Enter_Bulk_Lot_In_House_dates() throws Throwable {
		FabricTandAentrypage.Enter_Bulk_Lot_In_House_dates();
	}
	
	@Given("^Remarks for Bulk Test$")
	public void Remarks_for_Bulk_Test() throws Throwable {
		FabricTandAentrypage.Remarks_for_Bulk_Test();
	}
	
	@When("^click on the save button$")
	public void click_on_the_save_button() throws Throwable {
		FabricTandAentrypage.click_on_the_save_button();
	}
	
	@When("^click on add button for griege process$")
	public void click_on_add_button_for_griege_process() throws Throwable {
		FabricTandAentrypage.click_on_add_button_for_griege_process();
	}
	
	@And("^Click on Add button to insert the another test for quality$")
	public void Click_on_Add_button_to_insert_the_another_test_for_quality() throws Throwable {
		FabricTandAentrypage.Click_on_Add_button_to_insert_the_another_test_for_quality();
	}
	
	@Given("^Enter dates for second test and change the first test$")
	public void Enter_dates_for_second_test_and_change_the_first_test() throws Throwable {
		FabricTandAentrypage.Enter_dates_for_second_test_and_change_the_first_test();
	}
	
	@And("^Click on Add button to insert the second test for Initial Bulk$")
	public void Click_on_Add_button_to_insert_the_second_test_for_Initial_Bulk() throws Throwable {
		FabricTandAentrypage.Click_on_Add_button_to_insert_the_second_test_for_Initial_Bulk();
	}
	
	@Given("^Enter dates for Initial Bulk second test and change the first test$")
	public void Enter_dates_for_Initial_Bulk_second_test_and_change_the_first_test() throws Throwable {
		FabricTandAentrypage.Enter_dates_for_Initial_Bulk_second_test_and_change_the_first_test();
	}
	
	@And("^Click on Add button to insert the second test for bulk$")
	public void Click_on_Add_button_to_insert_the_second_test_for_bulk() throws Throwable {
		FabricTandAentrypage.Click_on_Add_button_to_insert_the_second_test_for_bulk();
	}
	
	@Given("^Enter dates and change the first tests data$")
	public void Enter_dates_and_change_the_first_tests_data() {
		FabricTandAentrypage.Enter_dates_and_change_the_first_tests_data();
	}
	
}
