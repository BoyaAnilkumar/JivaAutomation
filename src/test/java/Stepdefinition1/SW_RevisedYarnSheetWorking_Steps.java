package Stepdefinition1;

import Page.SW_RevisedYarnSheetWorking_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_RevisedYarnSheetWorking_Steps {
	
	SW_RevisedYarnSheetWorking_Pages SRYW = new SW_RevisedYarnSheetWorking_Pages();
	

	@Then("^Click on the Revised yarn sheet working$")
	public void Click_on_the_Revised_yarn_sheet_working() throws Throwable {
		SRYW.Click_on_the_Revised_yarn_sheet_working();
	}
	
	@And("^Click on style expansion in Revised yarn sheet working$")
	public void Click_on_style_expansion_in_Revised_yarn_sheet_working() throws Throwable {
		SRYW.Click_on_style_expansion_in_Revised_yarn_sheet_working();
	}
	
	@And("^Verify the MU Working details are available for the selected IPO$")
	public void Verify_the_MU_Working_details_are_available_for_the_selected_IPO() throws Throwable {
		SRYW.Verify_the_MU_Working_details_are_available_for_the_selected_IPO();
	}
	
	@Then("^Click on Edit icon for another yarn$")
	public void Click_on_Edit_icon_for_another_yarn() throws Throwable {
		SRYW.Click_on_Edit_icon_for_another_yarn();
	}
	
	@And("^Click on Edit icon and change values then submit the form$")
	public void Click_on_Edit_icon_and_change_values_then_submit_the_form() throws Throwable {
		SRYW.Click_on_Edit_icon_and_change_values_then_submit_the_form();
	}
}
