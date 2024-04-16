package Stepdefinition1;

import Page.Machine_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Machine_Steps {

	Machine_Pages machine = new Machine_Pages();
	
	@And("^Click on the Machine screen$")
	public void Click_on_the_Machine_screen() throws Throwable {
		machine.Click_on_the_Machine_screen();
	}
	
	@Then("^Click on Add button to add the Machine details$")
	public void Click_on_Add_button_to_add_the_Machine_details() throws Throwable {
		machine.Click_on_Add_button_to_add_the_Machine_details();
	}
	
	@And("^Enter the mandatory fields data in Machine$")
	public void Enter_the_mandatory_fields_data_in_Machine() throws Throwable {
		machine.Enter_the_mandatory_fields_data_in_Machine();
	}
	
	@And("^Click on Save button in create Machine screen$")
	public void Click_on_Save_button_in_create_Machine_screen() throws Throwable {
		machine.Click_on_Save_button_in_create_Machine_screen();
	}
	
	@Then("^Click on Edit icon to update the Machine details$")
	public void Click_on_Edit_icon_to_update_the_Machine_details() throws Throwable {
		machine.Click_on_Edit_icon_to_update_the_Machine_details();
	}
	
	@Then("^Click on delete icon to update the Machine details$")
	public void Click_on_delete_icon_to_update_the_Machine_details() throws Throwable {
		machine.Click_on_delete_icon_to_update_the_Machine_details();
	}
}
