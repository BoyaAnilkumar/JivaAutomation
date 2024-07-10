package Stepdefinition1;

import Page.BuyerPOtypes_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BuyerPOtypes_Steps {
	BuyerPOtypes_Pages BPOT = new BuyerPOtypes_Pages();
	
	@And("^Click on the Buyer PO Types screen$")
	public void Click_on_the_Buyer_PO_Types_screen() throws Throwable {
		BPOT.Click_on_the_Buyer_PO_Types_screen();
	}
	
	@Then("^Click on Add button to add the Buyer PO Types details$")
	public void Click_on_Add_button_to_add_the_Buyer_PO_Types_details() throws Throwable {
		BPOT.Click_on_Add_button_to_add_the_Buyer_PO_Types_details();
	}
	
	@And("^Enter the mandatory fields data in Buyer PO Types$")
	public void Enter_the_mandatory_fields_data_in_Buyer_PO_Types() throws Throwable {
		BPOT.Enter_the_mandatory_fields_data_in_Buyer_PO_Types();
	}
	
	@And("^Click on Save button in create Buyer PO Types screen$")
	public void Click_on_Save_button_in_create_Buyer_PO_Types_screen() throws Throwable {
		BPOT.Click_on_Save_button_in_create_Buyer_PO_Types_screen();
	}
	
	@And("^Click on Edit icon to update the Buyer PO Types details$")
	public void Click_on_Edit_icon_to_update_the_Buyer_PO_Types_details() throws Throwable {
		BPOT.Click_on_Edit_icon_to_update_the_Buyer_PO_Types_details();
	}
	
	@Then("^Click on delete icon to update the Buyer PO Types details$")
	public void Click_on_delete_icon_to_update_the_Buyer_PO_Types_details() throws Throwable {
		BPOT.Click_on_delete_icon_to_update_the_Buyer_PO_Types_details();
	}
}
