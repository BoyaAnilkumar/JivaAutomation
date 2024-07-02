package Stepdefinition1;

import Page.SW_NewYarnSheetWorking_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_NewYarnSheetWorking_Steps {
	SW_NewYarnSheetWorking_Pages SNYW = new SW_NewYarnSheetWorking_Pages();
	
	@Then("^Click on the New yarn sheet working$")
	public void Click_on_the_New_yarn_sheet_working() throws Throwable {
		SNYW.Click_on_the_New_yarn_sheet_working();
	}
	
	@And("^Click on style expansion in New yarn sheet working$")
	public void Click_on_style_expansion_in_New_yarn_sheet_working() throws Throwable {
		SNYW.Click_on_style_expansion_in_New_yarn_sheet_working();
	}
	
	@Then("^Verify the IPO details$")
	public void Verify_the_IPO_details() throws Throwable {
		SNYW.Verify_the_IPO_details();
	}

	@And("^Click on Edit button in MU Working grid$")
	public void Click_on_Edit_button_in_MU_Working_grid() throws Throwable {
		SNYW.Click_on_Edit_button_in_MU_Working_grid();
	}
	
	@And("^Add data for the IPO MU Working details$")
	public void Add_data_for_the_IPO_MU_Working_details() throws Throwable {
		SNYW.Add_data_for_the_IPO_MU_Working_details();
	}
	
	@Then("^click on submit button in working form$")
	public void click_on_submit_button_in_working_form() throws Throwable {
		SNYW.click_on_submit_button_in_working_form();
	}
	
	@And("^Verify the Data is displaying in MU Working grid$")
	public void Verify_the_Data_is_displaying_in_MU_Working_grid() throws Throwable {
		SNYW.Verify_the_Data_is_displaying_in_MU_Working_grid();
	}
	
	@And("^Click on Edit icon and submit the sale process$")
	public void Click_on_Edit_icon_and_submit_the_sale_process() throws Throwable {
		SNYW.Click_on_Edit_icon_and_submit_the_sale_process();
	}
	
	@And("^Click on Submit to Audit Team button$")
	public void Click_on_Submit_to_Audit_Team_button() throws Throwable {
		SNYW.Click_on_Submit_to_Audit_Team_button();
	}
}
