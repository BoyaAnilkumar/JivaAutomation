package Stepdefinition1;

import Page.DailyOut_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DailyOut_Steps {
	
	DailyOut_page DO = new DailyOut_page();
	
	
	@Then ("^Navigate to the Daily Out Data Entry screen$")
	public void Navigate_to_the_Daily_Out_Data_Entry_screen() {
		DO.Navigate_to_the_Daily_Out_Data_Entry_screen();
	}
	@And ("^Verify whether the page is navigated to the Add Daily Out Data Entry form$")
	public void Verify_whether_the_page_is_navigated_to_the_Add_Daily_Out_Data_Entry_form() {
		DO.Verify_whether_the_page_is_navigated_to_the_Add_Daily_Out_Data_Entry_form();
	}
	@And ("^Verify whether the page is navigated to the Daily Out Data Entry screen$")
	public void Verify_whether_the_page_is_navigated_to_the_Daily_Out_Data_Entry_screen() {
		DO.Verify_whether_the_page_is_navigated_to_the_Daily_Out_Data_Entry_screen();
	}
	@Then ("^Verify and print the mandatory validation msg$")
	public void Verify_and_print_the_mandatory_validation_msg() {
		DO.Verify_and_print_the_mandatory_validation_msg();
	}

}
