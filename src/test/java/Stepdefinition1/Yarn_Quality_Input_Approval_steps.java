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
	@And ("^Click on the Expansion icon$")
	public void Click_on_the_Expansion_icon() throws Throwable {
		YQIA.Click_on_the_Expansion_icon();
	}
	@Then ("^The Yarn Quality Shrinkage grid is displayed or not$")
	public void The_Yarn_Quality_Shrinkage_grid_is_displayed_or_not() throws Throwable {
		YQIA.The_Yarn_Quality_Shrinkage_grid_is_displayed_or_not();
	}
	@And ("^The Expansion grid header section names are displayed or not$")
	public void The_Expansion_grid_header_section_names_are_displayed_or_not() throws Throwable {
		YQIA.The_Expansion_grid_header_section_names_are_displayed_or_not();
	}
	@And ("^the Expanison grid data is displayed or not$")
	public void the_Expanison_grid_data_is_displayed_or_not() throws Throwable {
		YQIA.the_Expanison_grid_data_is_displayed_or_not();
	}
	@And ("^Click on the Approve button in the expansion grid$")
	public void Click_on_the_Approve_button_in_the_expansion_grid() throws Throwable {
		YQIA.Click_on_the_Approve_button_in_the_expansion_grid();
	}
	
	@And ("^the Approve Yarn Quality Input Approval popup is displayed or not$")
	public void the_Approve_Yarn_Quality_Input_Approval_popup_is_displayed_or_not() throws Throwable {
		YQIA.the_Approve_Yarn_Quality_Input_Approval_popup_is_displayed_or_not();
	}
	
	
	@And ("^Enter the data in the Solution field$")
	public void Enter_the_data_in_the_Solution_field() throws Throwable {
		YQIA.Enter_the_data_in_the_Solution_field();
	}
	@And ("^Click on the Submit button in the Approve Yarn Quality Input Approval popup$")
	public void Click_on_the_Submit_button_in_the_Approve_Yarn_Quality_Input_Approval_popup() throws Throwable {
		YQIA.Click_on_the_Submit_button_in_the_Approve_Yarn_Quality_Input_Approval_popup();
	}
	@And ("^Click on the Reject button in the expansion grid$")
	public void Click_on_the_Reject_button_in_the_expansion_grid() throws Throwable {
		YQIA.Click_on_the_Reject_button_in_the_expansion_grid();
	}
	
	@And ("^the Reject Yarn Quality Input Approval popup is displayed or not$")
	public void the_Reject_Yarn_Quality_Input_Approval_popup_is_displayed_or_not() throws Throwable {
		YQIA.the_Reject_Yarn_Quality_Input_Approval_popup_is_displayed_or_not();
	}
	@And ("^Click on the Submit button in the Reject Yarn Quality Input Approval popup$")
	public void Click_on_the_Submit_button_in_the_Reject_Yarn_Quality_Input_Approval_popup() throws Throwable {
		YQIA.Click_on_the_Submit_button_in_the_Reject_Yarn_Quality_Input_Approval_popup();
	}
	@And ("^Enter the Reject data in the Solution field$")
	public void Enter_the_Reject_data_in_the_Solution_field() throws Throwable {
		YQIA.Enter_the_Reject_data_in_the_Solution_field();
	}
}
