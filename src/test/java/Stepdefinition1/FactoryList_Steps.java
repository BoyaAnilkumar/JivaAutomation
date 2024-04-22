package Stepdefinition1;

import Page.FactoryList_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FactoryList_Steps {
	
	FactoryList_Pages factorylist = new FactoryList_Pages();
	
	@And("^Click on the Factory List screen$")
	public void Click_on_the_Factory_List_screen() throws Throwable {
		factorylist.Click_on_the_Factory_List_screen();
	}
	
	@Then("^Click on Add button to add the Factory List details$")
	public void Click_on_Add_button_to_add_the_Factory_List_details() throws Throwable {
		factorylist.Click_on_Add_button_to_add_the_Factory_List_details();
	}
	
	@And("^Enter the mandatory fields data in Factory List$")
	public void Enter_the_mandatory_fields_data_in_Factory_List() throws Throwable {
		factorylist.Enter_the_mandatory_fields_data_in_Factory_List();
		
	}
	
	@And("^Click on Save button in create Factory List screen$")
	public void Click_on_Save_button_in_create_Factory_List_screen() throws Throwable {
		factorylist.Click_on_Save_button_in_create_Factory_List_screen();
	}
	
	@Then("^Click on Edit icon to update the Factory List details$")
	public void Click_on_Edit_icon_to_update_the_Factory_List_details() throws Throwable {
		factorylist.Click_on_Edit_icon_to_update_the_Factory_List_details();
	}
	
	@And("^Click on delete icon to update the Factory List details$")
	public void Click_on_delete_icon_to_update_the_Factory_List_details() throws Throwable {
		factorylist.Click_on_delete_icon_to_update_the_Factory_List_details();
	}
}
