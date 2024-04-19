package Stepdefinition1;

import Page.BuyerHouseContact_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BuyerHouseContact_Steps {

	BuyerHouseContact_Pages BHC = new BuyerHouseContact_Pages();
	
	@And("^Click on the Buying House contact in menu$")
	public void Click_on_the_Buying_House_contact_in_menu() throws Throwable {
		BHC.Click_on_the_Buying_House_contact_in_menu();
	}
	
	@Then("^Click on Add button to add the Buying House contact details$")
	public void Click_on_Add_button_to_add_the_Buying_House_contact_details() throws Throwable {
		BHC.Click_on_Add_button_to_add_the_Buying_House_contact_details();
	}
	
	@And("^Enter the data for Buying House contact in add form$")
	public void Enter_the_data_for_Buying_House_contact_in_add_form() throws Throwable {
		BHC.Enter_the_data_for_Buying_House_contact_in_add_form();
	}
	
	@Then("^Click on Save button in create Buying House contact screen$")
	public void Click_on_Save_button_in_create_Buying_House_contact_screen() throws Throwable {
		BHC.Click_on_Save_button_in_create_Buying_House_contact_screen();
	}
	
	@Then("^Click on Edit button to update the Buying House contact details$")
	public void Click_on_Edit_button_to_update_the_Buying_House_contact_details() throws Throwable {
		BHC.Click_on_Edit_button_to_update_the_Buying_House_contact_details();
	}
	
	@And("^Clear and Insert the data for Buying House contact in update form$")
	public void Clear_and_Insert_the_data_for_Buying_House_contact_in_update_form() throws Throwable {
		BHC.Clear_and_Insert_the_data_for_Buying_House_contact_in_update_form();
	}
	
	@Then("^Click on Delete button to update the Buying House contact details$")
	public void Click_on_Delete_button_to_update_the_Buying_House_contact_details() throws Throwable {
		BHC.Click_on_Delete_button_to_update_the_Buying_House_contact_details();
	}
}
