package Stepdefinition1;

import Page.FabricTandAduesCalendar_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FabricTandAduesCalendar_Steps {

	FabricTandAduesCalendar_Pages FTADC = new FabricTandAduesCalendar_Pages();
	
	@Then("^Click on Fabric T and A Dues Calendar$")
	public void Click_on_Fabric_T_and_A_Dues_Calendar() throws Throwable {
		FTADC.Click_on_Fabric_T_and_A_Dues_Calendar();
	}
	
	@And("^Click on Senior merchant dropdown list and verify that checkbox is selected or not$")
	public void Click_on_Senior_merchant_dropdown_list_and_verify_that_checkbox_is_selected_or_not() throws Throwable {
		FTADC.Click_on_Senior_merchant_dropdown_list_and_verify_that_checkbox_is_selected_or_not();
	}
	
	@Then("^change from date and To date in Fabric T&A Dues calendar$")
	public void change_from_date_and_To_date_in_Fabric_TandA_Dues_calendar() throws Throwable {
		FTADC.change_from_date_and_To_date_in_Fabric_TandA_Dues_calendar();
	}
}
