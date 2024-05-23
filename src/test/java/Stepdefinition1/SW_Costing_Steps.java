package Stepdefinition1;

import Page.SW_Costing_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_Costing_Steps {
	SW_Costing_Pages SWCosting = new SW_Costing_Pages();
	
	@Then("^click on Costing screen in sweater module$")
	public void click_on_Costing_screen_in_sweater_module() throws Throwable {
		SWCosting.click_on_Costing_screen_in_sweater_module();
	}
	
	@And("^Click on the style in costing expansion$")
	public void Click_on_the_style_in_costing_expansion() throws Throwable {
		SWCosting.Click_on_the_style_in_costing_expansion();
	}
	
	@And("^Click on Add a Combo button$")
	public void Click_on_Add_a_Combo_button() throws Throwable {
		SWCosting.Click_on_Add_a_Combo_button();
	}
	@Then("User has entered {string} and {string}")
	public void User_has_entered_(String comboname , String comboqty) throws Throwable {
		SWCosting.User_has_entered_(comboname,comboqty);
	}
	@And("Enter Garment average{string}")
	public void Enter_Garment_average(String garment) throws Throwable {
		SWCosting.Enter_Garment_average(garment);
	}
	
	@Then("User has entered wastage{string}")
	public void User_has_entered_wastage(String wastage) throws Throwable {
		SWCosting.User_has_entered_wastage(wastage);
	}
	
	@And("User has entered rate{string}")
	public void User_has_entered_rate(String rate) throws Throwable {
		SWCosting.User_has_entered_rate(rate);
	}
	
	@And("User has entered additional sampling cost{string} and {string}")
	public void User_has_entered_additional_sampling_cost(String Addlitionalsamplingcost , String PerPcFreightCost) throws Throwable{
		SWCosting.User_has_entered_additional_sampling_cost(Addlitionalsamplingcost,PerPcFreightCost);
	}
	
	@Then("click on Trims and Accessories{string} and {string} and {string}")
	public void click_on_Trims_and_Accessories(String TrimAccessoriesAvggarment , String TrimsWastage , String TrimsRate ) throws Throwable {
		SWCosting.click_on_Trims_and_Accessories(TrimAccessoriesAvggarment,TrimsWastage,TrimsRate);
	}
		
}
