package Stepdefinition1;

import Page.YarnType_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class YarnType_Steps {
	
	YarnType_Pages yarntype = new YarnType_Pages();
	
	@And("^Click on the Yarn type screen$")
	public void Click_on_the_Yarn_type_screen() throws Throwable {
		yarntype.Click_on_the_Yarn_type_screen();
	}
	
	@Then("^Click on Add button to add the Yarn type$")
	public void Click_on_Add_button_to_add_the_Yarn_type() throws Throwable {
		yarntype.Click_on_Add_button_to_add_the_Yarn_type();
	}
	
	@And("^Enter the mandatory fields data in Yarn type$")
	public void Enter_the_mandatory_fields_data_in_Yarn_type() throws Throwable {
		yarntype.Enter_the_mandatory_fields_data_in_Yarn_type();
	}
	
	@And("^Click on Save button in create Yarn type screen$")
	public void Click_on_Save_button_in_create_Yarn_type_screen() throws Throwable {
		yarntype.Click_on_Save_button_in_create_Yarn_type_screen();
	}
}
