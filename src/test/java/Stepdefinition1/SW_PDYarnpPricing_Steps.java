package Stepdefinition1;

import Page.SW_PDYarnpPricing_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_PDYarnpPricing_Steps {
	SW_PDYarnpPricing_Page SWPDY = new SW_PDYarnpPricing_Page();
	
	@Then("^click on Yarn Sourcing module$")
	public void click_on_Yarn_Sourcing_module() {
		SWPDY.click_on_Yarn_Sourcing_module();	
	}
	
	@And("^click on data entry in yarn sourcing$")
	public void click_on_data_entry_in_yarn_sourcing() {
		SWPDY.click_on_data_entry_in_yarn_sourcing();
	}
	
	@Then("^Click on PD yarn pricing$")
	public void Click_on_PD_yarn_pricing() {
		SWPDY.Click_on_PD_yarn_pricing();
	}
}
