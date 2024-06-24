package Stepdefinition1;

import Page.SW_ViewYarnSheet_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_View_Yarn_Sheet {

	SW_ViewYarnSheet_Pages SWViewYarnSheet = new SW_ViewYarnSheet_Pages();
	
	@And ("^Click on the Reports dropdown$")
	public void Click_on_the_Reports_dropdown() throws Throwable {
		SWViewYarnSheet.Click_on_the_Reports_dropdown();
	}
	@And ("^Click on the View Yarn Sheet$")
	public void Click_on_the_View_Yarn_Sheet() throws Throwable {
		SWViewYarnSheet.Click_on_the_View_Yarn_Sheet();
	}
	@And ("^the Bulk Yarn Deadline should be displayed correctly$")
	public void the_Bulk_Yarn_Deadline_should_be_displayed_correctly() throws Throwable {
		SWViewYarnSheet.the_Bulk_Yarn_Deadline_should_be_displayed_correctly();
	}
	@And ("^the Sourcing Manager should be displayed$")
	public void the_Sourcing_Manager_should_be_displayed() throws Throwable {
		SWViewYarnSheet.the_Sourcing_Manager_should_be_displayed();
	}
	@And ("^the Sourcing Manager Assistants should be displayed$")
	public void the_Sourcing_Manager_Assistants_should_be_displayed() throws Throwable {
		SWViewYarnSheet.the_Sourcing_Manager_Assistants_should_be_displayed();
	}
	@Then ("^Click on the Yarn Details Expansion$")
	public void Click_on_the_Yarn_Details_Expansion() throws Throwable {
		SWViewYarnSheet.Click_on_the_Yarn_Details_Expansion();
	}
	@And ("^the Yarn details Data is displayed or not$")
	public void the_Yarn_details_Data_is_displayed_or_not() throws Throwable {
		SWViewYarnSheet.the_Yarn_details_Data_is_displayed_or_not();
	}
	@And ("^Click on the Garment Average Expansion$")
	public void Click_on_the_Garment_Average_Expansion() throws Throwable {
		SWViewYarnSheet.Click_on_the_Garment_Average_Expansion();
	}
	@Then ("^the Garment details are displayed or not$")
	public void the_Garment_details_are_displayed_or_not() throws Throwable {
		SWViewYarnSheet.the_Garment_details_are_displayed_or_not();
	}
	@And ("^Quantity Requirement Grid data is displayed or not$")
	public void Quantity_Requirement_Grid_data_is_displayed_or_not() throws Throwable {
		SWViewYarnSheet.Quantity_Requirement_Grid_data_is_displayed_or_not();
	}
	@And ("^Click on the View For Print by Combo Name button$")
	public void Click_on_the_View_For_Print_by_Combo_Name_button() throws Throwable {
		SWViewYarnSheet.Click_on_the_View_For_Print_by_Combo_Name_button();
	}
	@And ("^Verify the Quantity Requirements Grid Data is displayed or not$")
	public void Verify_the_Quantity_Requirements_Grid_Data_is_displayed_or_not() throws Throwable {
		SWViewYarnSheet.Verify_the_Quantity_Requirements_Grid_Data_is_displayed_or_not();
	}
	@And ("^Click on the Print button$")
	public void Click_on_the_Print_button() throws Throwable {
		SWViewYarnSheet.Click_on_the_Print_button();
	}
	@And ("^Click on the View For Print by Yarn Quality button$")
	public void Click_on_the_View_For_Print_by_Yarn_Quality_button() throws Throwable {
		SWViewYarnSheet.Click_on_the_View_For_Print_by_Yarn_Quality_button();
	}
	@And ("^Click on the View For Print by Yarn Sheet button$")
	public void Click_on_the_View_For_Print_by_Yarn_Sheet_button() throws Throwable {
		SWViewYarnSheet.Click_on_the_View_For_Print_by_Yarn_Sheet_button();
	}
	@Then ("^Click on the History Button$")
	public void Click_on_the_History_Button() throws Throwable {
		SWViewYarnSheet.Click_on_the_History_Button();
	}
	@And ("^The History Grid Header names are displayed or not$")
	public void The_History_Grid_Header_names_are_displayed_or_not() throws Throwable {
		SWViewYarnSheet.The_History_Grid_Header_names_are_displayed_or_not();
	}
	@Then ("^the History Grid Data is displayed or not$")
	public void the_History_Grid_Data_is_displayed_or_not() throws Throwable {
		SWViewYarnSheet.the_History_Grid_Data_is_displayed_or_not();
	}
	@And ("^Click on the Back Button$")
	public void Click_on_the_Back_Button() throws Throwable {
		SWViewYarnSheet.Click_on_the_Back_Button();
	}
	
}
