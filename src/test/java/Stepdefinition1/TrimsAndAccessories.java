package Stepdefinition1;

import Page.TrimsAndAccessoriespages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TrimsAndAccessories {
	
	TrimsAndAccessoriespages TrimsAndAccessoriespages = new TrimsAndAccessoriespages();
	
	@And("^Click on Trims and Accessories screen$")
	public void Click_on_Trims_and_Accessories_screen() throws Throwable {
		TrimsAndAccessoriespages.Click_on_Trims_and_Accessories_screen();
	}
	
	@And("^Click on Add button in Trims and Accessories Screen$")
	public void Click_on_Add_button_in_Trims_and_Accessories_Screen() throws Throwable {
		TrimsAndAccessoriespages.Click_on_Add_button_in_Trims_and_Accessories_Screen();
	}
	
	@And("^Click on Category dropdown and select the option$")
	public void Click_on_Category_dropdown_and_select_the_option() throws Throwable {
		TrimsAndAccessoriespages.Click_on_Category_dropdown_and_select_the_option();
	}
	
	@Then("^Enter the Name$")
	public void Enter_the_Name() throws Throwable {
		TrimsAndAccessoriespages.Enter_the_Name();
	}
	
	@And("^Select the UOM from dropdown list$")
	public void Select_the_UOM_from_dropdown_list() throws Throwable {
		TrimsAndAccessoriespages.Select_the_UOM_from_dropdown_list();
	}
	
	@Then("^Search with keyword in search field to validate the created Trims and Accessories$")
	public void Search_with_keyword_in_search_field_to_validate_the_created_Trims_and_Accessories() throws Throwable {
		TrimsAndAccessoriespages.Search_with_keyword_in_search_field_to_validate_the_created_Trims_and_Accessories();
	}
	
	@Then("^verify the validation text for the mandatory fields in Trims and Accessories$")
	public void verify_the_validation_text_for_the_mandatory_fields_in_Trims_and_Accessories() throws Throwable {
		TrimsAndAccessoriespages.verify_the_validation_text_for_the_mandatory_fields_in_Trims_and_Accessories();
	}
	
	@And("^click on delete and check the delete functionality$")
	public void click_on_delete_and_check_the_delete_functionality() throws Throwable {
		TrimsAndAccessoriespages.click_on_delete_and_check_the_delete_functionality();
	}
	
	@And("^Click on edit icon to update the Trim and Accessories$")
	public void Click_on_edit_icon_to_update_the_Trim_and_Accessories() throws Throwable {
		TrimsAndAccessoriespages.Click_on_edit_icon_to_update_the_Trim_and_Accessories();
	}
}
