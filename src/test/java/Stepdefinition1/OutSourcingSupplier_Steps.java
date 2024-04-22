package Stepdefinition1;

import Page.OutSourcingSupplier_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OutSourcingSupplier_Steps {
	OutSourcingSupplier_Pages OSS = new OutSourcingSupplier_Pages();
	
	@And("^Click on the Out Sourcing Supplier screen$")
	public void Click_on_the_Out_Sourcing_Supplier_screen() throws Throwable {
		OSS.Click_on_the_Out_Sourcing_Supplier_screen();
	}
	
	@Then("^Click on Add button to add the Out Sourcing Supplier details$")
	public void Click_on_Add_button_to_add_the_Out_Sourcing_Supplier_details() throws Throwable {
		OSS.Click_on_Add_button_to_add_the_Out_Sourcing_Supplier_details();
	}
	
	@And("^Enter the mandatory fields data in Out Sourcing Supplier$")
	public void Enter_the_mandatory_fields_data_in_Out_Sourcing_Supplier() throws Throwable {
		OSS.Enter_the_mandatory_fields_data_in_Out_Sourcing_Supplier();
	}
	
	@And("^Click on Save button in create Out Sourcing Supplier screen$")
	public void Click_on_Save_button_in_create_Out_Sourcing_Supplier_screen() throws Throwable {
		OSS.Click_on_Save_button_in_create_Out_Sourcing_Supplier_screen();
	}
	
	@Then("^Click on Edit icon to update the Out Sourcing Supplier details$")
	public void Click_on_Edit_icon_to_update_the_Out_Sourcing_Supplier_details() throws Throwable {
		OSS.Click_on_Edit_icon_to_update_the_Out_Sourcing_Supplier_details();
	}
	
	@Then("^Click on delete icon to update the Out Sourcing Supplier details$")
	public void Click_on_delete_icon_to_update_the_Out_Sourcing_Supplier_details() throws Throwable {
		OSS.Click_on_delete_icon_to_update_the_Out_Sourcing_Supplier_details();
	}
}
