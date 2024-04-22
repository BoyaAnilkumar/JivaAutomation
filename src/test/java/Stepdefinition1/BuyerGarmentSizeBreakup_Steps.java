package Stepdefinition1;

import Page.BuyerGarmentSizeBreakup_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BuyerGarmentSizeBreakup_Steps {
	BuyerGarmentSizeBreakup_Pages BGSB = new BuyerGarmentSizeBreakup_Pages();
	
	@And("^Click on the Buyer garment size breakup screen$")
	public void Click_on_the_Buyer_garment_size_breakup_screen() throws Throwable {
		BGSB.Click_on_the_Buyer_garment_size_breakup_screen();
	}
	
	@Then("^Click on Add button to add the Buyer garment size breakup details$")
	public void Click_on_Add_button_to_add_the_Buyer_garment_size_breakup_details() throws Throwable {
		BGSB.Click_on_Add_button_to_add_the_Buyer_garment_size_breakup_details();
	}
	
	@And("^Enter the mandatory fields data in Buyer garment size breakup$")
	public void Enter_the_mandatory_fields_data_in_Buyer_garment_size_breakup() throws Throwable {
		BGSB.Enter_the_mandatory_fields_data_in_Buyer_garment_size_breakup();
	}
	
	@And("^Click on Save button in create Buyer garment size breakup screen$")
	public void Click_on_Save_button_in_create_Buyer_garment_size_breakup_screen() throws Throwable {
		BGSB.Click_on_Save_button_in_create_Buyer_garment_size_breakup_screen();
	}
	
	@Then("^Click on edit icon to update the Buyer garment size breakup details$")
	public void Click_on_edit_icon_to_update_the_Buyer_garment_size_breakup_details() throws Throwable {
		BGSB.Click_on_edit_icon_to_update_the_Buyer_garment_size_breakup_details();
	}
	
	@And("^change the data in edit form$")
	public void change_the_data_in_edit_form() throws Throwable {
		BGSB.change_the_data_in_edit_form();
	}
	
	@Then("^Click on delete icon to update the Buyer garment size breakup details$")
	public void Click_on_delete_icon_to_update_the_Buyer_garment_size_breakup_details() throws Throwable {
		BGSB.Click_on_delete_icon_to_update_the_Buyer_garment_size_breakup_details();
	}
}
