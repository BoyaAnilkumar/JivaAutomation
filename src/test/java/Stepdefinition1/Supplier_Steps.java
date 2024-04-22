package Stepdefinition1;

import Page.Supplier_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Supplier_Steps {
	
	Supplier_Pages supplier = new Supplier_Pages();
	
	@And("^Click on the Supplier screen$")
	public void Click_on_the_Supplier_screen() throws Throwable {
		supplier.Click_on_the_Supplier_screen();
	}
	
	@Then("^Click on Add button to add the supplier details$")
	public void Click_on_Add_button_to_add_the_supplier_details() throws Throwable {
		supplier.Click_on_Add_button_to_add_the_supplier_details();
	}
	
	@And("^Enter the mandatory fields data$")
	public void Enter_the_mandatory_fields_data() throws Throwable {
		supplier.Enter_the_mandatory_fields_data();
	}
	
	@And("^Click on Save button in create supplier screen$")
	public void Click_on_Save_button_in_create_supplier_screen() throws Throwable {
		supplier.Click_on_Save_button_in_create_supplier_screen(null);
	}
	
	@And("^Verify the success toaster is displaying or not$")
	public void Verify_the_success_toaster_is_displaying_or_not() {
		supplier.Verify_the_success_toaster_is_displaying_or_not();
	}
	
	@Then("^Verify the Validation messsages for mandatory fields$")
	public void Verify_the_Validation_messsages_for_mandatory_fields() throws Throwable {
		supplier.Verify_the_Validation_messsages_for_mandatory_fields();
	}
	
	@And("^Click on Edit icon in grid table$")
	public void Click_on_Edit_icon_in_grid_table() throws Throwable {
		supplier.Click_on_Edit_icon_in_grid_table();
	}
	
	@And("^Click on Delete icon in grid table$")
	public void Click_on_Delete_icon_in_grid_table() throws Throwable {
		supplier.Click_on_Delete_icon_in_grid_table();
	}
}
