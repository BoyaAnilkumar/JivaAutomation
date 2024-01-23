package Stepdefinition1;

import Page.CreatePOforIPO_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreatePOforIPO_Steps {
	
	CreatePOforIPO_pages CreatePOforIPO_pages = new CreatePOforIPO_pages();
	
	@Then("^Click on Fabric sourcing module$")
	public void Click_on_Fabric_sourcing_module() {
		CreatePOforIPO_pages.Click_on_Fabric_sourcing_module();
	}
	
	@And("^click on Data Entry in fabric sourcing module$")
	public void click_on_Data_Entry_in_fabric_sourcing_module() {
		CreatePOforIPO_pages.click_on_Data_Entry_in_fabric_sourcing_module();
	}
	
	@And("^click on Generate PO$")
	public void click_on_Generate_PO() {
		CreatePOforIPO_pages.click_on_Generate_PO();
	}
	
	@Then("^click on Create PO for Fabric$")
	public void click_on_Create_PO_for_Fabric() {
		CreatePOforIPO_pages.click_on_Create_PO_for_Fabric();
	}
	
	@And("^Verify the Create PO for IPO screen is displayed or not$")
	public void Verify_the_Create_PO_for_IPO_screen_is_displayed_or_not() {
		CreatePOforIPO_pages.Verify_the_Create_PO_for_IPO_screen_is_displayed_or_not();
	}
}
