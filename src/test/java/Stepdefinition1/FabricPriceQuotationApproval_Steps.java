package Stepdefinition1;

import Page.FabricPriceQuotationApproval_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FabricPriceQuotationApproval_Steps {

	FabricPriceQuotationApproval_Pages FPQA = new FabricPriceQuotationApproval_Pages();
	
	
	@Then ("^Navigate to the Fabric Price Quotation Approval screen$")
	public void Navigate_to_the_Fabric_Price_Quotation_Approval_screen() throws Throwable {
		FPQA.Navigate_to_the_Fabric_Price_Quotation_Approval_screen();
	}
	@And ("^Select an IPO from the Menu list in Approval screen$")
	public void Select_an_IPO_from_the_Menu_list_in_Approval_screen() throws Throwable {
		FPQA.Select_an_IPO_from_the_Menu_list_in_Approval_screen();
	}
	@Then ("^Click on the Approval button$")
	public void Click_on_the_Approval_button() throws Throwable {
		FPQA.Click_on_the_Approval_button();
	}
	@Then ("^Print the Approved msg$")
	public void Print_the_Approved_msg() throws Throwable {
		FPQA.Print_the_Approved_msg();
	}
	@Then ("^Update any of the value of the Submitted Record$")
	public void Update_any_of_the_value_of_the_Submitted_Record() throws Throwable {
		FPQA.Update_any_of_the_value_of_the_Submitted_Record();
	}
	@Then ("^Verify and Print the updated value$")
	public void Verify_and_Print_the_updated_value() throws Throwable {
		FPQA.Verify_and_Print_the_updated_value();
	}
	
	
}
