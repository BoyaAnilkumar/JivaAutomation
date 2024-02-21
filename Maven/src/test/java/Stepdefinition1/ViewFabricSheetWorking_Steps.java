package Stepdefinition1;

import Page.ViewFabricSheetWorkingpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ViewFabricSheetWorking_Steps {

	ViewFabricSheetWorkingpage ViewFabricSheetWorking_page = new ViewFabricSheetWorkingpage();
	
	@And("^click on Reports in fabric sourcing module$")
	public void click_on_Reports_in_fabric_sourcing_module() throws Throwable {
		ViewFabricSheetWorking_page.click_on_Reports_in_fabric_sourcing_module();
	}
	
	@And("^click on View fabric sheet working$")
	public void click_on_View_fabric_sheet_working() throws Throwable {
		ViewFabricSheetWorking_page.click_on_View_fabric_sheet_working();
	}
	
	@And("^Click on the Status field$")
	public void Click_on_the_Status_field() {
		ViewFabricSheetWorking_page.Click_on_the_Status_field();
	}
	
	@When("^User select the Status$")
	public void User_select_the_Status() {
		ViewFabricSheetWorking_page.User_select_the_Status();
	}
	
}
