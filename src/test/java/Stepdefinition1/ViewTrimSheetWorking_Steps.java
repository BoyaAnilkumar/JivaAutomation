package Stepdefinition1;

import Page.ViewTrimSheetWorking_Pages;
import io.cucumber.java.en.Then;

public class ViewTrimSheetWorking_Steps {
	
	ViewTrimSheetWorking_Pages VTSW = new ViewTrimSheetWorking_Pages();
	
	
	@Then ("^Navigate to View Trim Sheet Working screen$")
	public void Navigate_to_View_Trim_Sheet_Working_screen() throws Throwable {
		VTSW.Navigate_to_View_Trim_Sheet_Working_screen();
	}
	@Then ("^Verify whether page is navigated to the Print form$")
	public void Verify_whether_page_is_navigated_to_the_Print_form() throws Throwable {
		VTSW.Verify_whether_page_is_navigated_to_the_Print_form();
	}
	@Then ("^Verify and print the View Trim MU Working grid records$")
	public void Verify_and_print_the_View_Trim_MU_Working_grid_records() {
		VTSW.Verify_and_print_the_View_Trim_MU_Working_grid_records();
	}
	@Then ("^Verify and print View Job Work grid records$")
	public void Verify_and_print_View_Job_Work_grid_records() {
		VTSW.Verify_and_print_View_Job_Work_grid_records();
	}

}
