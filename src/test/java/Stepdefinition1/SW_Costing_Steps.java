package Stepdefinition1;

import Page.SW_Costing_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SW_Costing_Steps {
	SW_Costing_Pages SWCosting = new SW_Costing_Pages();
	
	@Then("^click on Costing screen in sweater module$")
	public void click_on_Costing_screen_in_sweater_module() throws Throwable {
		SWCosting.click_on_Costing_screen_in_sweater_module();
	}
	
	@And("Click on style in costing expansion{string}")
	public void Click_on_style_in_costing_expansion(String StyleName) throws Throwable {
		SWCosting.Click_on_style_in_costing_expansion(StyleName);
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
	
	@Given("Enter Rate in Sweater costing{string}")
	public void Enter_Rate_in_Sweater_costing(String ComputerEMBrate) throws Throwable {
		SWCosting.Enter_Rate_in_Sweater_costing(ComputerEMBrate);
	}
	
	@And("User has entered additional sampling cost{string} and {string}")
	public void User_has_entered_additional_sampling_cost(String Addlitionalsamplingcost , String PerPcFreightCost) throws Throwable{
		SWCosting.User_has_entered_additional_sampling_cost(Addlitionalsamplingcost,PerPcFreightCost);
	}
	
	@Then("click on Trims and Accessories{string} and {string} and {string} and {string} and {string}")
	public void click_on_Trims_and_Accessories(String Trimcategory , String TrimItem, String TrimAccessoriesAvggarment , String TrimsWastage , String TrimsRate ) throws Throwable {
		SWCosting.click_on_Trims_and_Accessories(Trimcategory,TrimItem,TrimAccessoriesAvggarment,TrimsWastage,TrimsRate);
	}
	
	@And("Click on Add Knitting button and enter data for{string} and {string} and {string} and {string} and {string}")
	public void Click_on_Add_Knitting_button_and_enter_data_for(String Knittingstructure, String GG, String Numberofends, String KnittingTime, String Knittingbuffer) throws Throwable {
		SWCosting.Click_on_Add_Knitting_button_and_enter_data_for(Knittingstructure, GG, Numberofends, KnittingTime, Knittingbuffer);
	}
	
	@And("Enter Garment Linking rate{string}")
	public void Enter_Garment_Linking_rate(String GarmentLinking) throws Throwable {
		SWCosting.Enter_Garment_Linking_rate(GarmentLinking);
	}
	
	@And("^Enter Additional Process cost in INR$")
	public void Enter_Additional_Process_cost_in_INR() throws Throwable {
		SWCosting.Enter_Additional_Process_cost_in_INR();
	}
	
	@Then("^Click on Finishing process and select value from dropdown$")
	public void Click_on_Finishing_process_and_select_value_from_dropdown() throws Throwable {
		SWCosting.Click_on_Finishing_process_and_select_value_from_dropdown();
	}
	
	@Given("^Enter cost for the selected value$")
	public void Enter_cost_for_the_selected_value() throws Throwable {
		SWCosting.Enter_cost_for_the_selected_value();
	}
	
	@Then("^Select a Washing Process1 in sw costing$")
	public void Select_a_Washing_Process1_in_sw_osting() throws Throwable {
		SWCosting.Select_a_Washing_Process1_in_sw_osting();
	}
	
	@Given("^Enter the Washing Cost1 in sw costing$")
	public void Enter_the_Washing_Cost1_in_sw_costing() throws Throwable {
		SWCosting.Enter_the_Washing_Cost1_in_sw_costing();
	}
		
}
