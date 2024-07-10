package Stepdefinition1;

import Pages.ViewFabricSheetWorkingpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
	public void Click_on_the_Status_field() throws Throwable {
		ViewFabricSheetWorking_page.Click_on_the_Status_field();
	}
	
	@When("^User select the Status$")
	public void User_select_the_Status() throws Throwable {
		ViewFabricSheetWorking_page.User_select_the_Status();
	}
	
	@And("^Click on the IPO in side menu$")
	public void Click_on_the_IPO_in_side_menu() throws Throwable {
		ViewFabricSheetWorking_page.Click_on_the_IPO_in_side_menu();
	}
	
	@When("^Verify the IPO details displaying on the screen$")
	public void Verify_the_IPO_details_displaying_on_the_screen() throws Throwable {
		ViewFabricSheetWorking_page.Verify_the_IPO_details_displaying_on_the_screen();
	}
	
	@And("^Validate that Quantity Requirement grid is displaying with data or not$")
	public void Validate_that_Quantity_Requirement_grid_is_displaying_with_data_or_not() throws Throwable {
		ViewFabricSheetWorking_page.Validate_that_Quantity_Requirement_grid_is_displaying_with_data_or_not();
	}
	
	@And("^Validate that MU Working grid is displaying with data or not$")
	public void Validate_that_MU_Working_grid_is_displaying_with_data_or_not() throws Throwable {
		ViewFabricSheetWorking_page.Validate_that_MU_Working_grid_is_displaying_with_data_or_not();
	}
	
	@When("^verify the view for print button is displaying or not$")
	public void verify_the_view_for_print_button_is_displaying_or_not() throws Throwable {
		ViewFabricSheetWorking_page.verify_the_view_for_print_button_is_displaying_or_not();
	}
	
	@And("^click on view for print button$")
	public void click_on_view_for_print_button() throws Throwable {
		ViewFabricSheetWorking_page.click_on_view_for_print_button();
	}
	
	@Then("^Print screen is opened$")
	public void Print_screen_is_opened() throws Throwable {
		ViewFabricSheetWorking_page.Print_screen_is_opened();
	}
}