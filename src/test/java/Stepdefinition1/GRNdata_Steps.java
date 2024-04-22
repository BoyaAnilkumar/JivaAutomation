package Stepdefinition1;

import Page.GRNdatapages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GRNdata_Steps {

	GRNdatapages grn = new GRNdatapages();
	
	@Then ("^Click on the Audit module$")
	public void Click_on_the_Audit_module() throws Throwable {
		grn.Click_on_the_Audit_module();
	}
	
	@Then("^Click on GRN data screen$")
	public void Click_on_GRN_data_screen() throws Throwable {
		grn.Click_on_GRN_data_screen();
	}
	
	
	@Then ("^Select the Merchant and Supplier$")
	public void Select_the_Merchant_and_Supplier() throws Throwable {
		grn.Select_the_Merchant_and_Supplier();
	}
	
	@And ("^Select the IPO in Style expansion$")
	public void Select_the_IPO_in_Style_expansion() throws Throwable {
		grn.Select_the_IPO_in_Style_expansion();
	}
	
	@When ("^user selects the Ipo verify the Ipo details which are displayed on the screen or not$")
	public void user_selects_the_Ipo_verify_the_Ipo_details_which_are_displayed_on_the_screen_or_not() throws Throwable {
		grn.user_selects_the_Ipo_verify_the_Ipo_details_which_are_displayed_on_the_screen_or_not();
	}
	
	@Then ("^verify the grid is displaying or not$")
	public void verify_the_grid_is_displaying_or_not() throws Throwable {
		grn.verify_the_grid_is_displaying_or_not();
	}
	
	@And ("^Verify the expansion icon is displaying or not$")
	public void Verify_the_expansion_icon_is_displaying_or_not() throws Throwable {
		grn.Verify_the_expansion_icon_is_displaying_or_not();
	}
	
	@And ("^Click on expansion icon$")
	public void Click_on_expansion_icon() throws Throwable {
		grn.Click_on_expansion_icon();
	}
	
	@Then ("^verify the data is displaying in the expansion grid or not$")
	public void verify_the_data_is_displaying_in_the_expansion_grid_or_not() throws Throwable {
		grn.verify_the_data_is_displaying_in_the_expansion_grid_or_not();
	}
	
	@And ("^validate the expansion grid data$")
	public void validate_the_expansion_grid_data() throws Throwable {
		grn.validate_the_expansion_grid_data();
	}
}
