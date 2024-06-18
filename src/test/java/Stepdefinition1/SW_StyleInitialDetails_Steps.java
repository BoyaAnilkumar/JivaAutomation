package Stepdefinition1;

import Page.SW_StyleInitialDetails_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SW_StyleInitialDetails_Steps {
	
	SW_StyleInitialDetails_Pages StylePageSW = new SW_StyleInitialDetails_Pages();

	@Then("^click on the SW Merchandising Module$")
	public void click_on_the_SW_Merchandising_Module() throws Throwable {
		StylePageSW.click_on_the_SW_Merchandising_Module();
	}
	
	@And("^click on SW Data Entry dropdown$")
	public void click_on_SW_Data_Entry_dropdown() throws Throwable {
		StylePageSW.click_on_SW_Data_Entry_dropdown();
	}
	
	@And("^click on SW Style Initial Details screen$")
	public void click_on_SW_Style_Initial_Details_screen() throws Throwable {
		StylePageSW.click_on_SW_Style_Initial_Details_screen();
	}
	
	@Then("Select the IPO from the list {string}")
	public void Select_the_IPO_from_the_list_(String ipo) throws Throwable {
		StylePageSW.Select_the_IPO_from_the_list_(ipo);
	}
	
	@And("Select file handover date{string}")
	public void Select_file_handover_date(String date) throws Throwable {
		StylePageSW.Select_file_handover_date(date);
	}
	
	@Then("click on Add combination button and enter combination names{string} and {string}")
	public void click_on_Add_combination_button_and_enter_combination_names(String combination1, String combination2) throws Throwable {
		StylePageSW.click_on_Add_combination_button_and_enter_combination_names(combination1,combination2);
	}
	
	@And("^click on Submit order details button$")
	public void click_on_Submit_order_details_button() throws Throwable {
		StylePageSW.click_on_Submit_order_details_button();
	}
	
	@Given("^User enter the data in PO Qty field for combos$")
	public void User_enter_the_data_in_PO_Qty_field_for_combos() throws Throwable {
		StylePageSW.User_enter_the_data_in_PO_Qty_field_for_combos();
	}
	
	@And("^Enter the data in IPO% field in order details$")
	public void Enter_the_data_in_IPO_field_in_order_details() throws Throwable{
		StylePageSW.Enter_the_data_in_IPO_field_in_order_details();
	}
}
