package Stepdefinition1;

import Page.SW_POMasterSheet_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SW_POMasterSheet_Steps {
	
	SW_POMasterSheet_Pages SWPO = new SW_POMasterSheet_Pages();
	
	@Given("Search with IPO in search keyword textbox {string}")
	public void Search_with_IPO_in_search_keyword_textbox(String ipo) throws Throwable {
		SWPO.Search_with_IPO_in_search_keyword_textbox(ipo);
	}
	
	@When("Enter Deliver To details and select from the suggestions{string}")
	public void Enter_Deliver_To_details_and_select_from_the_suggestions(String DeliverTo) throws Throwable {
		SWPO.Enter_Deliver_To_details_and_select_from_the_suggestions(DeliverTo);
	}
	
	@And("^verify the payment terms by selecting the supplier$")
	public void verify_the_payment_terms_by_selecting_the_supplier() throws Throwable {
		SWPO.verify_the_payment_terms_by_selecting_the_supplier();
	}
	
	@When("^verify the Yarn Details are prepopulating or not$")
	public void verify_the_Yarn_Details_are_prepopulating_or_not() throws Throwable {
		SWPO.verify_the_Yarn_Details_are_prepopulating_or_not();
	}
	
	@Then("Enter supplier name and select from the suggestions{string}")
	public void Enter_supplier_name_and_select_from_the_suggestions(String supplier) throws Throwable {
		SWPO.Enter_supplier_name_and_select_from_the_suggestions(supplier);
	}
	
	@Given("Search with PO in search keyword textbox {string}")
	public void Search_with_PO_in_search_keyword_textbox(String po) throws Throwable {
		SWPO.Search_with_PO_in_search_keyword_textbox(po);
	}
	
	@And("^click on Revised Po icon$")
	public void click_on_Revised_Po_icon() throws Throwable {
		SWPO.click_on_Revised_Po_icon();
	}
	
	@And("^Print view Revised PO for IPO details$")
	public void Print_view_Revised_PO_for_IPO_details() throws Throwable {
		SWPO.Print_view_Revised_PO_for_IPO_details();
	}
	
	@And("user update the revised po for ipo{string}and {string}")
	public void user_update_the_revised_po_for_ipo(String qtyallowed ,  String rate) throws Throwable {
		SWPO.user_update_the_revised_po_for_ipo(qtyallowed,rate);
	}
	
	@And("^Click on Print icon for the po$")
	public void Click_on_Print_icon_for_the_po() throws Throwable {
		SWPO.Click_on_Print_icon_for_the_po();
	}
	
	@And("^Click on Cancel icon in grid$")
	public void Click_on_Cancel_icon_in_grid() throws Throwable {
		SWPO.Click_on_Cancel_icon_in_grid();
	}
	
	@When("^user clicks on filter expansion$")
	public void user_clicks_on_filter_expansion() throws Throwable {
		SWPO.user_clicks_on_filter_expansion();	
	}
	
	@And("Click on Merchant dropdown field and select merchant{string},{string}")
	public void Click_on_Merchant_dropdown_field_and_select_merchant(String merchant ,String buyer) throws Throwable {
		SWPO.Click_on_Merchant_dropdown_field_and_select_merchant(merchant,buyer);
	}
	@And ("Select the Supplier in the {string} field")
	public void Select_the_Supplier_in_the_field(String Supplier)throws Throwable {
		SWPO.Select_the_Supplier_in_the_field(Supplier);
	}
	@Then ("User select the {string} in the filter page")
	public void User_select_the_in_the_filter_page(String Yarn_Quality)throws Throwable {
		SWPO.User_select_the_in_the_filter_page(Yarn_Quality);
    }
	@And ("Select the Month in the {string} field")
	public void Select_the_Month_in_the_field(String Month)throws Throwable {
		SWPO.Select_the_Month_in_the_field(Month);
	}
	@And ("Select the {string} in the Search by IPO field")
	public void Select_the_in_the_Search_by_IPO_field(String IPO)throws Throwable {
		SWPO.Select_the_in_the_Search_by_IPO_field(IPO);
	}
	
	@When("^user clicks on sorting icon in grid headers$")
	public void user_clicks_on_sorting_icon_in_grid_headers() throws Throwable {
		SWPO.user_clicks_on_sorting_icon_in_grid_headers();
	}
}
