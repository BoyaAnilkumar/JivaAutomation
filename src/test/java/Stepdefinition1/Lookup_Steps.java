package Stepdefinition1;

import Page.Lookuppages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Lookup_Steps {

	Lookuppages lookup_pages = new Lookuppages();
	
	@And("^Click on Lookup screen$")
	public void Click_on_Lookup_Screen() throws Throwable {
		lookup_pages.Click_on_Lookup_Screen();
	}
	
	@And("^Click on Add button in Lookup Screen$")
	public void Click_on_Add_button_in_Lookup_Screen() throws Throwable {
		lookup_pages.Click_on_Add_button_in_Lookup_Screen();
	}
	
	@And("^Click on Add button to create the Lookup$")
	public void Click_on_Add_button_to_create_the_Lookup() throws Throwable {
		lookup_pages.Click_on_Add_button_to_create_the_Lookup();
	}
	
	@And("^Select the category from dropdown list$")
	public void Select_the_category_from_dropdown_list() throws Throwable {
		lookup_pages.Select_the_category_from_dropdown_list();
	}
	
	@Then("^Enter the Name and Remarks$")
	public void Enter_the_Name_and_Remarks() throws Throwable {
		lookup_pages.Enter_the_Name_and_Remarks();
	}
	
	@And("^verify the active checkbox is displaying as true bydefault$")
	public void verify_the_active_checkbox_is_displaying_as_true_bydefault() {
		lookup_pages.verify_the_active_checkbox_is_displaying_as_true_bydefault();
	}
	
	@Then("^Search with keyword in search field to validate the created lookup$")
	public void Search_with_keyword_in_search_field_to_validate_the_created_lookup() throws Throwable {
		lookup_pages.Search_with_keyword_in_search_field_to_validate_the_created_lookup();
	}
	
	
	@Then("^verify the validation text for the mandatory fields$")
	public void verify_the_validation_text_for_the_mandatory_fields() throws Throwable {
		lookup_pages.verify_the_validation_text_for_the_mandatory_fields();
	}
	
	
	@Then("^click on sorting icon for each column$")
	public void click_on_sorting_icon_for_each_column() throws Throwable {
		lookup_pages.click_on_sorting_icon_for_each_column();
	}
	
	@And("^click on pagination to view remaining pages$")
	public void click_on_pagination_to_view_remaining_pages() throws Throwable {
		lookup_pages.click_on_pagination_to_view_remaining_pages();
	}
}


