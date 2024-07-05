package Stepdefinition1;

import Page.Yarn_Quality_Input_Approval_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Yarn_Quality_Input_Approval_steps {
	
	Yarn_Quality_Input_Approval_Page   YQIA = new Yarn_Quality_Input_Approval_Page();

	
	@And ("^Click on the Yarn Quality Input Approval under the Data Entry dropdown$")
	public void Click_on_the_Yarn_Quality_Input_Approval_under_the_Data_Entry_dropdown() throws Throwable {
		YQIA.Click_on_the_Yarn_Quality_Input_Approval_under_the_Data_Entry_dropdown();
	}
	
	@Then ("^The Yarn Quality Input Approval Screen is displayed or not$")
	public void The_Yarn_Quality_Input_Approval_Screen_is_displayed_or_not() throws Throwable {
		YQIA.The_Yarn_Quality_Input_Approval_Screen_is_displayed_or_not();
	}
	@And ("^Verify the grid header section names are displayed or not$")
	public void Verify_the_grid_header_section_names_are_displayed_or_not() throws Throwable {
		YQIA.Verify_the_grid_header_section_names_are_displayed_or_not();
	}
	@Then ("^Verify the Sorting functionality is working or not$")
	public void Verify_the_Sorting_functionality_is_working_or_not() throws Throwable {
		YQIA.Verify_the_Sorting_functionality_is_working_or_not();
	}
	@And ("^Verify the IPO data is displayed in the grid or not$")
	public void Verify_the_IPO_data_is_displayed_in_the_grid_or_not() throws Throwable {
		YQIA.Verify_the_IPO_data_is_displayed_in_the_grid_or_not();
	}
}
