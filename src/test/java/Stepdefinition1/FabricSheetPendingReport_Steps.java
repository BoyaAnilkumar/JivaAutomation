package Stepdefinition1;

import Page.FabricSheetPendingReport_pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FabricSheetPendingReport_Steps {
	
	FabricSheetPendingReport_pages FabricSheetPendingReport_pages = new FabricSheetPendingReport_pages();
	
	@Then("^Click on Fabric Sheet Pending Report screen$")
	public void Click_on_Fabric_Sheet_Pending_Report_screen() throws Throwable {
		FabricSheetPendingReport_pages.Click_on_Fabric_Sheet_Pending_Report_screen();
	}
	
	@And("^Click on Filter expansion in FSPR$")
	public void Click_on_Filter_expansion_in_FSPR() throws Throwable {
		FabricSheetPendingReport_pages.Click_on_Filter_expansion_in_FSPR();
	}
	
	@And("^Click on Buyer filter and select the buyer$")
	public void Click_on_Buyer_filter_and_select_the_buyer() throws Throwable {
		FabricSheetPendingReport_pages.Click_on_Buyer_filter_and_select_the_buyer();
	}
	
	@And("^Click on Merchant filter and select the merchant$")
	public void Click_on_Merchant_filter_and_select_the_merchant() throws Throwable {
		FabricSheetPendingReport_pages.Click_on_Merchant_filter_and_select_the_merchant();
	}
	
	@And("^Click on Status filter and select the status$")
	public void Click_on_Status_filter_and_select_the_status() throws Throwable {
		FabricSheetPendingReport_pages.Click_on_Status_filter_and_select_the_status();
	}
	
	@Then("^verify the data is displaying in the grid$")
	public void verify_the_data_is_displaying_in_the_grid() throws Throwable {
		FabricSheetPendingReport_pages.verify_the_data_is_displaying_in_the_grid();
	}
	
	@And("^click on filter expansion and click on reset filter$")
	public void click_on_filter_expansion_and_click_on_reset_filter() throws Throwable {
		FabricSheetPendingReport_pages.click_on_filter_expansion_and_click_on_reset_filter();
	}
	
	@And("^verify the filter functionality on grid column$")
	public void verify_the_filter_functionality_on_grid_column() throws Throwable {
		FabricSheetPendingReport_pages.verify_the_filter_functionality_on_grid_column();
	}
	
	@Then("^click on export button to download the fabric sheet report$")
	public void click_on_export_button_to_download_the_fabric_sheet_report() throws Throwable {
		FabricSheetPendingReport_pages.click_on_export_button_to_download_the_fabric_sheet_report();
	}
	
	@And("^Verify the Sorting functionality in grid$")
	public void Verify_the_Sorting_functionality_in_grid() throws Throwable {
		FabricSheetPendingReport_pages.Verify_the_Sorting_functionality_in_grid();
	}
}
