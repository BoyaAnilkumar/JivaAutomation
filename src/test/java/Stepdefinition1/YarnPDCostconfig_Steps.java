package Stepdefinition1;

import Page.YarnPDCostconfig_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YarnPDCostconfig_Steps {

	YarnPDCostconfig_pages yarnpdconfig = new YarnPDCostconfig_pages();
	
	@And("^Click on the YarnPDCostConfig screen$")
	public void Click_on_the_YarnPDCostConfig_screen() throws Throwable {
		yarnpdconfig.Click_on_the_YarnPDCostConfig_screen();
	}
	
	@When("^click on edit icon for each row in YarnPDCostConfig$")
	public void click_on_edit_icon_for_each_row_in_YarnPDCostConfig() throws Throwable {
		yarnpdconfig.click_on_edit_icon_for_each_row_in_YarnPDCostConfig();
	}
	
	@And("^change the value in edit form in YarnPDCostConfig$")
	public void change_the_value_in_edit_form_in_YarnPDCostConfig() throws Throwable {
		yarnpdconfig.change_the_value_in_edit_form_in_YarnPDCostConfig();
	}
	
	@Then("^click on update button to update the value in YarnPDCostConfig$")
	public void click_on_update_button_to_update_the_value_in_YarnPDCostConfig() throws Throwable {
		yarnpdconfig.click_on_update_button_to_update_the_value_in_YarnPDCostConfig();
	}
}
