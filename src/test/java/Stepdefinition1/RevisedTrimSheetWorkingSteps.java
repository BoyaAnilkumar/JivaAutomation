package Stepdefinition1;

import Pages.RevisedTrimSheetWorkingPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RevisedTrimSheetWorkingSteps {
	
	RevisedTrimSheetWorkingPages RTSW = new RevisedTrimSheetWorkingPages();
	
	
	@Then ("^Navigate to Revised Trim Sheet Working screen$")
	public void Navigate_to_Revised_Trim_Sheet_Working_screen() throws Throwable {
		RTSW.Navigate_to_Revised_Trim_Sheet_Working_screen();
	}
	@Then ("^Verify whether the page is navigated to the Add Revised Trim Sheet Working$")
	public void Verify_whether_the_page_is_navigated_to_the_Add_Revised_Trim_Sheet_Working() throws Throwable {
		RTSW.Verify_whether_the_page_is_navigated_to_the_Add_Revised_Trim_Sheet_Working();
	}
	@Then ("^Verify and print the Trim MU Working grid records$")
	public void Verify_and_print_the_Trim_MU_Working_grid_records() {
		RTSW.Verify_and_print_the_Trim_MU_Working_grid_records();
	}
	@Then ("^Verify and print Job Work grid records$")
	public void Verify_and_print_Job_Work_grid_records() {
		RTSW.Verify_and_print_Job_Work_grid_records();
	}
	@Then ("^Verify whether navigate to Revised Trim Sheet Working screen$")
	public void Verify_whether_navigate_to_Revised_Trim_Sheet_Working_screen() throws Throwable {
		RTSW.Verify_whether_navigate_to_Revised_Trim_Sheet_Working_screen();
	}
	@When ("Click on the Edit button for another Trim {string}{string}{string}{string}")
	public void Click_on_the_Edit_button_for_another_Trim_(String QtyUnit, String MU, String GRate, String DRate) throws Throwable {
		RTSW.Click_on_the_Edit_button_for_another_Trim_(QtyUnit, MU, GRate, DRate);
	}
	@When ("^Click on Submit to Audit Team button in the Revised Trim Sheet Working screen$")
	public void Click_on_Submit_to_Audit_Team_button_in_the_Revised_Trim_Sheet_Working_screen() throws Throwable {
		RTSW.Click_on_Submit_to_Audit_Team_button_in_the_Revised_Trim_Sheet_Working_screen();
	}
	@When ("Click on the Edit button for a job work Trim in revised sheet {string}{string}")
	public void Click_on_the_Edit_button_for_a_job_work_Trim_in_revised_sheet_(String JobName, String RateperUnit) throws Throwable {
		RTSW.Click_on_the_Edit_button_for_a_job_work_Trim_in_revised_sheet_(JobName, RateperUnit);
	}
	@When ("^Click on the Edit button for a Trim in revised sheet$")
	public void Click_on_the_Edit_button_for_a_Trim_in_revised_sheet() throws Throwable {
		RTSW.Click_on_the_Edit_button_for_a_Trim_in_revised_sheet();
	}

}
