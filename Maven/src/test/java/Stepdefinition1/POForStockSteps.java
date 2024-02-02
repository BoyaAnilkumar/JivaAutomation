package Stepdefinition1;

import Page.POForStockPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POForStockSteps {
	
	POForStockPages POS = new POForStockPages();
	
	
	@Then ("^Navigate to PO For Stock screen$")
	public void Navigate_to_PO_For_Stock_screen() throws Throwable {
		POS.Navigate_to_PO_For_Stock_screen();
	}
	@Then ("^Click on the Filter showhide button$")
	public void Click_on_the_Filter_showhide_button() throws Throwable {
		POS.Click_on_the_Filter_showhide_button();
	}
	
	@Given ("^Enter the Style name in Search By Style field$")
	public void Enter_the_Style_name_in_Search_By_Style_field() throws Throwable {
		POS.Enter_the_Style_name_in_Search_By_Style_field();
	}
	@When ("^Click on the Add Data Entry button$")
	public void Click_on_the_Add_Data_Entry_button() throws Throwable {
		POS.Click_on_the_Add_Data_Entry_button();
	}
	@Then ("^Verify whether the page is navigated to the Create PO For Stock or not$")
	public void Verify_whether_the_page_is_navigated_to_the_Create_PO_For_Stock_or_not() throws Throwable {
		POS.Verify_whether_the_page_is_navigated_to_the_Create_PO_For_Stock_or_not();
	}
	@Then ("^Verify the count of the PO Records in the PO grid$")
	public void Verify_the_count_of_the_PO_Records_in_the_PO_grid() throws Throwable {
		POS.Verify_the_count_of_the_PO_Records_in_the_PO_grid();
	}

}
