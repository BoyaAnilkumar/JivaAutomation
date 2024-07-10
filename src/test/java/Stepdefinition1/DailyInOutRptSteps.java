package Stepdefinition1;


import Pages.DailyInOutReportPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DailyInOutRptSteps {
	
	DailyInOutReportPages DIORt = new DailyInOutReportPages();
	
	@Then ("^Navigate to Daily In Out Report screen$")
	public void Navigate_to_Daily_In_Out_Report_screen() throws Throwable {
		DIORt.Navigate_to_Daily_In_Out_Report_screen();
	}
    @Given ("Enter the date for searching the records {string}")
    public void Enter_the_date_for_searching_the_records(String Date) throws Throwable{
    	DIORt.Enter_the_date_for_searching_the_records(Date);
    }
    @Then ("^Click on the Search button$")
    public void Click_on_the_Search_button() throws Throwable {
    	DIORt.Click_on_the_Search_button();
    }
    @Then ("^Verify and print the respective Date Daily In records under the Daily In House grid$")
    public void Verify_and_print_the_respective_Date_Daily_In_records_under_the_Daily_In_House_grid() {
    	DIORt.Verify_and_print_the_respective_Date_Daily_In_records_under_the_Daily_In_House_grid();
    }
    @Then ("^Verify and print the respective Date Daily In records under the Issued to Cutting grid$")
    public void Verify_and_print_the_respective_Date_Daily_In_records_under_the_Issued_to_Cutting_grid() {
    	DIORt.Verify_and_print_the_respective_Date_Daily_In_records_under_the_Issued_to_Cutting_grid();
    }
    @Then ("^Verify and print the respective Date Daily In records under the Sent or Return to Supplier grid$")
    public void Verify_and_print_the_respective_Date_Daily_In_records_under_the_Sent_or_Return_to_Supplier_grid() {
    	DIORt.Verify_and_print_the_respective_Date_Daily_In_records_under_the_Sent_or_Return_to_Supplier_grid();
    }

}
