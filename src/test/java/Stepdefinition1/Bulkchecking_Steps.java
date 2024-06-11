package Stepdefinition1;

import Page.Bulkchecking_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bulkchecking_Steps {

	Bulkchecking_Pages bulkchecking = new Bulkchecking_Pages();
	
	@Then("^click on Bulk checking screen name$")
	public void click_on_Bulk_checking_screen_name() throws Throwable {
		bulkchecking.click_on_Bulk_checking_screen_name();
	}
	
	@And("^Select the po number in filter expansion$")
	public void Select_the_po_number_in_filter_expansion() throws Throwable {
		bulkchecking.Select_the_po_number_in_filter_expansion();
	}
	
	@When("^clicked on Lot Checking data icon$")
	public void clicked_on_Lot_Checking_data_icon() throws Throwable {
		bulkchecking.clicked_on_Lot_Checking_data_icon();
	}
	
	@And("^Add data for add lot checking data$")
	public void Add_data_for_add_lot_checking_data() {
		bulkchecking.Add_data_for_add_lot_checking_data();
	}
	
	@And("^clicked on save button$")
	public void clicked_on_save_button() {
		bulkchecking.clicked_on_save_button();
	}
}
