package Stepdefinition1;

import Page.MerchandisingTandAduesCalendar_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MerchandisingTandAduesCalendar_Steps {

	MerchandisingTandAduesCalendar_pages  TandAduesCalendar = new MerchandisingTandAduesCalendar_pages();
	
	
	@Then("^Click on Merchandising T and A Dues Calendar$")
	public void Click_on_Merchandising_T_and_A_Dues_Calendar() throws Throwable {
		TandAduesCalendar.Click_on_Merchandising_T_and_A_Dues_Calendar();
	}
	
	@And("^click on Sr Merchant dropdown field and verify that bydefault select all merchants are selected or not$")
	public void click_on_Sr_Merchant_dropdown_field_and_verify_that_bydefault_select_all_merchants_are_selected_or_not() throws Throwable {
		TandAduesCalendar.click_on_Sr_Merchant_dropdown_field_and_verify_that_bydefault_select_all_merchants_are_selected_or_not();
	}
	
	@Then("^change from date and To date$")
	public void change_from_date_and_To_date() throws Throwable {
		TandAduesCalendar.change_from_date_and_To_date();
	}
	
	@And("^click on Download button$")
	public void click_on_Download_button() throws Throwable {
		TandAduesCalendar.click_on_Download_button();
	}
}
