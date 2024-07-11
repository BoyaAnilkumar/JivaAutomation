package Stepdefinition1;

import Page.POWiseInOutRptPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class POWiseInOutRptSteps {
	
	POWiseInOutRptPages PIOR = new POWiseInOutRptPages();
	
	@Then ("^Navigate to PO Wise In Out Report$")
	public void Navigate_to_PO_Wise_In_Out_Report() throws Throwable {
		PIOR.Navigate_to_PO_Wise_In_Out_Report();
	}
	@Given ("Enter the PO number in the Search by PO field {string}")
	public void Enter_the_PO_number_in_the_Search_by_PO_field(String POname) throws Throwable {
		PIOR.Enter_the_PO_number_in_the_Search_by_PO_field(POname);
	}
	@Then ("^Print the PO Date date for the selected PO$")
	public void Print_the_PO_Date_date_for_the_selected_PO() throws Throwable {
		PIOR.Print_the_PO_Date_date_for_the_selected_PO();
	}
    @Then ("^Print the PO name for the selected PO$")
    public void Print_the_PO_name_for_the_selected_PO() throws Throwable {
    	PIOR.Print_the_PO_name_for_the_selected_PO();
    }
    @Then ("^Print the Supplier name for the selected PO$")
    public void Print_the_Supplier_name_for_the_selected_PO() throws Throwable {
    	PIOR.Print_the_Supplier_name_for_the_selected_PO();
    }
    @Then ("^Print the PO Qty for the selected PO$")
    public void Print_the_PO_Qty_for_the_selected_PO() throws Throwable {
    	PIOR.Print_the_PO_Qty_for_the_selected_PO();
    }
    @Then ("^Print the In House Qty for the selected PO$")
    public void Print_the_In_House_Qty_for_the_selected_PO() throws Throwable {
    	PIOR.Print_the_In_House_Qty_for_the_selected_PO();
    }
    @Then ("^Print the Fabric In grid data in PO Wise In Out Report$")
    public void Print_the_Fabric_In_grid_data_in_PO_Wise_In_Out_Report() {
    	PIOR.Print_the_Fabric_In_grid_data_in_PO_Wise_In_Out_Report();
    }
    @Then ("^Print the Fabric Returned to Vendor grid data in PO Wise In Out Report$")
    public void Print_the_Fabric_Returned_to_Vendor_grid_data_in_PO_Wise_In_Out_Report() {
    	PIOR.Print_the_Fabric_Returned_to_Vendor_grid_data_in_PO_Wise_In_Out_Report();
    }

}
