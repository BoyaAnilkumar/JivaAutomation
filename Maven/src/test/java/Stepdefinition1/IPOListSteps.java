package Stepdefinition1;

import Page.IPOListPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IPOListSteps {
	IPOListPages IPOl = new IPOListPages();

	@Given ("^Navigates to the Login page$")
	public void Navigates_to_the_Login_page() {
		IPOl.Navigates_to_the_Login_page();
	}
	@Then ("^Enter valid Username and password$")
	public void Enter_valid_Username_and_password() throws Throwable {
		IPOl.Enter_valid_Username_and_password();
	}
	@And ("^Click on SignIn$")
	public void Click_on_SignIn() {
		IPOl.Click_on_SignIn();
	}
	@Then ("^Click on the Woven Modules$")
	public void Click_on_the_Woven_Modules() throws Throwable {
		IPOl.Click_on_the_Woven_Modules();
	}
	@Then ("^Click on Audit module$")
	public void Click_on_Audit_module() throws Throwable {
		IPOl.Click_on_Audit_module();
	}
	@Then ("^Click on IPO List module$")
	public void Click_on_IPO_List_module() throws Throwable {
		IPOl.Click_on_IPO_List_module();
	}
	@Then ("^Click on the Filter button$")
	public void Click_on_the_Filter_button() throws Throwable {
		IPOl.Click_on_the_Filter_button();
	}
	@Then ("^Click in the IPO From Date field$")
	public void Click_in_the_IPO_From_Date_field() throws Throwable {
		IPOl.Click_in_the_IPO_From_Date_field();
	}
	@Then ("^Click in the IPO To Date field$")
	public void Click_in_the_IPO_To_Date_field() throws Throwable {
		IPOl.Click_in_the_IPO_To_Date_field();
	}
	@Then ("^Click in the Buyer field$")
	public void Click_in_the_Buyer_field() {
		IPOl.Click_in_the_Buyer_field();
	}
	@And ("^Select a Buyer from the dropdown list$")
	public void Select_a_Buyer_from_the_dropdown_list() throws Throwable {
		IPOl.Select_a_Buyer_from_the_dropdown_list();
	}
	@Then ("^Click in the PD Merchant field$")
	public void Click_in_the_PD_Merchant_field() {
		IPOl.Click_in_the_PD_Merchant_field();
	}
	@And ("^Enter a first two letters of a PD Merchant name$")
	public void Enter_a_first_two_letters_of_a_PD_Merchant_name() throws Throwable {
		IPOl.Enter_a_first_two_letters_of_a_PD_Merchant_name();
	}
	@Then ("^Select the PD Merchant from the dropdown$")
	public void Select_the_PD_Merchant_from_the_dropdown() throws Throwable {
		IPOl.Select_the_PD_Merchant_from_the_dropdown();
	}
	@Then ("^Click in the Merchant field$")
	public void Click_in_the_Merchant_field() throws Throwable {
		IPOl.Click_in_the_Merchant_field();
	}
	@And ("^Select a Merchant from the dropdown list$")
	public void Select_a_Merchant_from_the_dropdown_list() {
		IPOl.Select_a_Merchant_from_the_dropdown_list();
	}
	@Then ("^Click in the Assigned Month and year field$")
	public void Click_in_the_Assigned_Month_and_year_field() {
		IPOl.Click_in_the_Assigned_Month_and_year_field();
	}
	@And ("^Select a Month or Year from the dropdown list$")
	public void Select_a_Month_or_Year_from_the_dropdown_list() throws Throwable {
		IPOl.Select_a_Month_or_Year_from_the_dropdown_list();
	}
	@Then ("^Click in the Search IPO and Enter an IPO$")
	public void Click_in_the_Search_IPO_and_Enter_an_IPO() {
		IPOl.Click_in_the_Search_IPO_and_Enter_an_IPO();
	}
	@And ("^Enter IPO Name in the Search IPO field$")
	public void Enter_IPO_Name_in_the_Search_IPO_field() throws Throwable {
		IPOl.Enter_IPO_Name_in_the_Search_IPO_field();
	}
	@Then ("^Click on the Reset button$")
	public void Click_on_the_Reset_button() throws Throwable {
		IPOl.Click_on_the_Reset_button();
	}
	@Then ("^Click on the Apply button$")
	public void Click_on_the_Apply_button() throws Throwable {
		IPOl.Click_on_the_Apply_button();
	}
	@Then ("^Click on Generate Excel Sheet button$")
	public void Click_on_Generate_Excel_Sheet_button() {
		IPOl.Click_on_Generate_Excel_Sheet_button();
	}
	@When ("^Clicked on Add IPO button$")
	public void Clicked_on_Add_IPO_button() {
		IPOl.Clicked_on_Add_IPO_button();
	}


}
