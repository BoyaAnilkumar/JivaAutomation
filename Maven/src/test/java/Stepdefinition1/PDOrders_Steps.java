package Stepdefinition1;

import Page.PDOrders_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PDOrders_Steps {

	PDOrders_page PDOrderspage = new PDOrders_page();
	
	@Given("^Login with Senior PD merchant credentials in Login page$")
	public void Login_with_Senior_PD_merchant_credentials_in_Login_page() throws Throwable {
		PDOrderspage.Login_with_Senior_PD_merchant_credentials_in_Login_page();
	}
	
	@Then("^Click on Woven$")
	public void Click_on_woven() throws Throwable {
		PDOrderspage.Click_on_woven();
	}
	
	@And("^Click on PD Module to view the menu in PD Module$")
	public void Click_on_PD_Module_to_view_the_menu_in_PD_Module() throws Throwable {
		PDOrderspage.Click_on_PD_Module_to_view_the_menu_in_PD_Module();
	}
	
	@Then("^Select the PD Orders from the menu of PD Module$")
	public void Select_the_PD_Orders_from_the_menu_of_PD_Module() throws Throwable {
		PDOrderspage.Select_the_PD_Orders_from_the_menu_of_PD_Module();
	}
	
	@And("^Click on Add button$")
	public void Click_on_Add_button() throws Throwable {
		PDOrderspage.Click_on_Add_button();
	}
	
	@And("^Enter Sr PD Merchant$")
	public void Enter_Sr_PD_Merchant() throws Throwable {
		PDOrderspage.Enter_Sr_PD_Merchant();
	}
	
	@And("^Select Buyer from the dropdown list$")
	public void Select_Buyer_from_the_dropdown_list() throws Throwable {
		PDOrderspage.Select_Buyer_from_the_dropdown_list();
	}
	
	@And("^Select Month and Year from calendar$")
	public void Select_Month_and_Year_from_calendar() throws Throwable{
		PDOrderspage.Select_Month_and_Year_from_calendar();
	}
	
	@And("^Enter Expected Order Qty$")
	public void Enter_Expected_Order_Qty() throws Throwable {
		PDOrderspage.Enter_Expected_Order_Qty();
	}
	
	
	
	
	
	
	
	
	
	
	
}
