package Stepdefinition1;

import Page.POMasterSheetpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMasterSheet_Steps {

	POMasterSheetpage pomastersheetpage = new POMasterSheetpage();
	
	@And("^click on PO Master Sheet$")
	public void click_on_PO_Master_Sheet() throws Throwable {
		pomastersheetpage.click_on_PO_Master_Sheet();
	}
	
	@And("^click on filter expansion$")
	public void click_on_filter_expansion() throws Throwable {
		pomastersheetpage.click_on_filter_expansion();
	}
	
	@And("^click on merchant dropdown to select the merchant$")
	public void click_on_merchant_dropdown_to_select_the_merchant() throws Throwable {
		pomastersheetpage.click_on_merchant_dropdown_to_select_the_merchant();
	}
	
	@And("^click on buyer dropdown to select the buyer$")
	public void click_on_buyer_dropdown_to_select_the_buyer() throws Throwable {
		pomastersheetpage.click_on_buyer_dropdown_to_select_the_buyer();
	}
	
	@And("^click on supplier dropdown to select the supplier$")
	public void click_on_supplier_dropdown_to_select_the_supplier() throws Throwable {
		pomastersheetpage.click_on_supplier_dropdown_to_select_the_supplier();
	}
	
	@And("^click on Fabric Quality dropdown to select the Fabric$")
	public void click_on_Fabric_Quality_dropdown_to_select_the_Fabric() throws Throwable {
		pomastersheetpage.click_on_Fabric_Quality_dropdown_to_select_the_Fabric();
	}
	
	@And("^click on Month dropdown to select the month$")
	public void click_on_Month_dropdown_to_select_the_month() throws Throwable {
		pomastersheetpage.click_on_Month_dropdown_to_select_the_month();
	}
	
	@And("^click on Search By IPO dropdown to select the IPO$")
	public void click_on_Search_By_IPO_dropdown_to_select_the_IPO() throws Throwable {
		pomastersheetpage.click_on_Search_By_IPO_dropdown_to_select_the_IPO();
	}
	
	@And("^click on Reset and Apply button$")
	public void click_on_Reset_and_Apply_button() throws Throwable {
		pomastersheetpage.click_on_Reset_and_Apply_button();
	}
	
	
	@Then("^Select all the Fields in the filter and apply filter$")
	public void Select_all_the_Fields_in_the_filter_and_apply_filters() throws Throwable {
		pomastersheetpage.Select_all_the_Fields_in_the_filter_and_apply_filters();
	}
	
	@Given("^Search with IPO in search keyword textbox$")
	public void Search_with_IPO_in_search_keyword_textbox() throws Throwable {
		pomastersheetpage.Search_with_IPO_in_search_keyword_textbox();
	}
	
	@And("^click on generate po icon$")
	public void click_on_generate_po_icon() throws Throwable {
		pomastersheetpage.click_on_generate_po_icon();
	}
	
	@And("^Verify the PO details are displaying$")
	public void Verify_the_PO_details_are_displaying() throws Throwable {
		pomastersheetpage.Verify_the_PO_details_are_displaying();
	}
	
	@When("^verify the Fabric Details are prepopulating or not$")
	public void verify_the_Fabric_Details_are_prepopulating_or_not() throws Throwable {
		pomastersheetpage.verify_the_Fabric_Details_are_prepopulating_or_not();
	}
	
	@When("^verify the Quantity Details are displaying or not$")
	public void verify_the_Quantity_Details_are_displaying_or_not() throws Throwable {
		pomastersheetpage.verify_the_Quantity_Details_are_displaying_or_not();
	}
	
	@When("^verify the IPO Details are prepopulating or not$")
	public void verify_the_IPO_Details_are_prepopulating_or_not() throws Throwable {
		pomastersheetpage.verify_the_IPO_Details_are_prepopulating_or_not();
	}
	
	@And("^click on Add IPO button whether button is working or not$")
	public void click_on_Add_IPO_button_whether_button_is_working_or_not() {
		pomastersheetpage.click_on_Add_IPO_button_whether_button_is_working_or_not();
	}
	
	@And("^Delete the record in IPO table$")
	public void Delete_the_record_in_IPO_table() {
		pomastersheetpage.Delete_the_record_in_IPO_table();
	}
	
	@Then("^Click on save button to generate po$")
	public void Click_on_save_button_to_generate_po() throws Throwable {
		pomastersheetpage.Click_on_save_button_to_generate_po();
	}
	
	@And("^verify whether the user is navigated to Print form$")
	public void verify_whether_the_user_is_navigated_to_Print_form() throws Throwable {
		pomastersheetpage.verify_whether_the_user_is_navigated_to_Print_form();
	}
	
	@And("^Click on cancel to navigate back to po master sheet screen$")
	public void Click_on_cancel_to_navigate_back_to_po_master_sheet_screen() throws Throwable {
		pomastersheetpage.Click_on_cancel_to_navigate_back_to_po_master_sheet_screen();
	}
	
	@When("^click on filter icon on grid and search with the process name$")
	public void click_on_filter_icon_on_grid_and_search_with_the_process_name() throws Throwable {
		pomastersheetpage.click_on_filter_icon_on_grid_and_search_with_the_process_name();
	}
	
	@And("^click on revise po icon$")
	public void click_on_revise_po_icon() throws Throwable {
		pomastersheetpage.click_on_revise_po_icon();
	}
	
	@And("^navigated to revise po screen and displaying the update form or not$")
	public void navigated_to_revise_po_screen_and_displaying_the_update_form_or_not() throws Throwable {
		pomastersheetpage.navigated_to_revise_po_screen_and_displaying_the_update_form_or_not();
	}
	
	@Then("^update the data and submit the revise po$")
	public void update_the_data_and_submit_the_revise_po() {
		pomastersheetpage.update_the_data_and_submit_the_revise_po();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
