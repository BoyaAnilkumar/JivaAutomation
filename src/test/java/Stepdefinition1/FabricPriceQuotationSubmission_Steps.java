package Stepdefinition1;

import Pages.FabricPriceQuotationSubmission_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FabricPriceQuotationSubmission_Steps {
	
	FabricPriceQuotationSubmission_Pages FPQS = new FabricPriceQuotationSubmission_Pages();
	
	@Then ("^Navigate to the Fabric Price Quotation Submission screen$")
	public void Navigate_to_the_Fabric_Price_Quotation_Submission_screen() throws Throwable {
		FPQS.Navigate_to_the_Fabric_Price_Quotation_Submission_screen();
	}
	@And ("^Select an IPO from the Menu list in Submission$")
	public void Select_an_IPO_from_the_Menu_list_in_Submission() throws Throwable {
		FPQS.Select_an_IPO_from_the_Menu_list_in_Submission();
	}
	@Then ("^Click on the Add Pricing button in the Fabric Price Quotation Submission screen$")
	public void Click_on_the_Add_Pricing_button_in_the_Fabric_Price_Quotation_Submission_screen() throws Throwable {
		FPQS.Click_on_the_Add_Pricing_button_in_the_Fabric_Price_Quotation_Submission_screen();
	}
	@Then ("^Click on the Submit button in the Fabric Price Quotation Submission$")
	public void Click_on_the_Submit_button_in_the_Fabric_Price_Quotation_Submission() throws Throwable {
		FPQS.Click_on_the_Submit_button_in_the_Fabric_Price_Quotation_Submission();
	}
	@Then ("^Click in the Process field$")
	public void Click_in_the_Process_field() throws Throwable {
		FPQS.Click_in_the_Process_field();
	}
	@And ("^Select a Process Name$") 
	public void Select_a_Process_Name() throws Throwable {
		FPQS.Select_a_Process_Name();
	}
	@Given ("^Enter Supplier Name$")
	public void Enter_Supplier_Name() throws Throwable {
		FPQS.Enter_Supplier_Name();
	}
	@Given ("^Enter Ex Mill Price value$")
	public void Enter_Ex_Mill_Price_value() throws Throwable {
		FPQS.Enter_Ex_Mill_Price_value(); 
	}
	@Given ("^Enter the Lead Time$")
	public void Enter_the_Lead_Time() throws Throwable {
		FPQS.Enter_the_Lead_Time();
	}
	@Given ("^Enter Payment Terms mode$")
	public void Enter_Payment_Terms_mode() throws Throwable {
		FPQS.Enter_Payment_Terms_mode();
	}
	@Given ("^Enter Remarks for the added Price records$")
	public void Enter_Remarks_for_the_added_Price_records() throws Throwable {
		FPQS.Enter_Remarks_for_the_added_Price_records();
	}
	@Given ("^Enter data in the Call Outs field$")
	public void Enter_data_in_the_Call_Outs_field() throws Throwable {
		FPQS.Enter_data_in_the_Call_Outs_field();
	}
	@When ("^Click on the Delete button for the added pricing record$")
	public void Click_on_the_Delete_button_for_the_added_pricing_record() throws Throwable {
		FPQS.Click_on_the_Delete_button_for_the_added_pricing_record();
	}
	

}
