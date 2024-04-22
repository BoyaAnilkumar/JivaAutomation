package Stepdefinition1;

import Page.PDCostConfig_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDCostConfig_Steps {
	PDCostConfig_Pages pdcostconfig = new PDCostConfig_Pages();
	
	@And("^Click on the PDCostConfig screen$")
	public void Click_on_the_PDCostConfig_screen() throws Throwable {
		pdcostconfig.Click_on_the_PDCostConfig_screen();
	}
	
	@When("^click on edit icon for each row$")
	public void click_on_edit_icon_for_each_row() throws Throwable {
		pdcostconfig.click_on_edit_icon_for_each_row();
	}
	
	@And("^change the value in edit form$")
	public void change_the_value_in_edit_form() throws Throwable {
		pdcostconfig.change_the_value_in_edit_form();
	}
	
	@Then("^click on update button to update the value$")
	public void click_on_update_button_to_update_the_value() throws Throwable {
		pdcostconfig.click_on_update_button_to_update_the_value();
	}
}
