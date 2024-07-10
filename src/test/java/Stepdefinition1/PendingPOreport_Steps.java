package Stepdefinition1;

import Page.PendingPOreport_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PendingPOreport_Steps {

	PendingPOreport_pages poreport = new PendingPOreport_pages();
	
	@Then("^click on pending po reports$")
	public void click_on_pending_po_reports() throws Throwable {
		poreport.click_on_pending_po_reports();
	}
	
	@And("^click on Filter expansion and apply filters to get the data$")
	public void click_on_Filter_expansion_and_apply_filters_to_get_the_data() throws Throwable {
		poreport.click_on_Filter_expansion_and_apply_filters_to_get_the_data();
	}
	
	@Then("^click on export button to download the data into excel sheet$")
	public void click_on_export_button_to_download_the_data_into_excel_sheet() throws Throwable {
		poreport.click_on_export_button_to_download_the_data_into_excel_sheet();
	}
	
	@And("^click on page numbers and page size$")
	public void click_on_page_numbers_and_page_size() throws Throwable {
		poreport.click_on_page_numbers_and_page_size();
	}
	
	@And("^Click on sorting icon to test the functionality$")
	public void Click_on_sorting_icon_to_test_the_functionality() throws Throwable {
		poreport.Click_on_sorting_icon_to_test_the_functionality();
	}
	
	
}
