package Stepdefinition1;

import Page.PODataReportPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PODataReportSteps {
	
	PODataReportPages PODR = new PODataReportPages();
	
	@Given ("^Login with the Production Manager$")
	public void Login_with_the_Production_Manager() {
		PODR.Login_with_the_Production_Manager();
	}
	@Then ("^Navigate to PO Data Report screen$")
	public void Navigate_to_PO_Data_Report_screen() throws Throwable {
		PODR.Navigate_to_PO_Data_Report_screen();
	}
	@Then ("^Print the PO Data records$")
	public void Print_the_PO_Data_records() throws Throwable {
		PODR.Print_the_PO_Data_records();
	}
	@Then ("^Click on the Excel sheet and download$")
	public void Click_on_the_Excel_sheet_and_download() throws Throwable {
		PODR.Click_on_the_Excel_sheet_and_download();
	}

}
