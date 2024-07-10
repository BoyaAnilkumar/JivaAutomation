package Stepdefinition1;

import Page.FabricApprovalBalancePages;
import io.cucumber.java.en.Then;

public class FabricApprovalBalanceSteps {
	
	FabricApprovalBalancePages FAB = new FabricApprovalBalancePages();
	
	
	
	@Then ("^Navigate to Fabric Approval Balance screen$")
	public void Navigate_to_Fabric_Approval_Balance_screen() throws Throwable {
		FAB.Navigate_to_Fabric_Approval_Balance_screen();
	}
	@Then ("Click and select the Buyer in Buyer field {string}")
	public void Click_and_select_the_Buyer_in_Buyer_field(String BuyerName) throws Throwable {
		FAB.Click_and_select_the_Buyer_in_Buyer_field(BuyerName);
	}
	@Then ("Click in the Fabric Quality field {string}")
	public void Click_in_the_Fabric_Quality_field(String FabricQuality) throws Throwable {
		FAB.Click_in_the_Fabric_Quality_field(FabricQuality);
	}
	@Then ("Click in the Month field {string}")
	public void Click_in_the_Month_field(String month) throws Throwable {
		FAB.Click_in_the_Month_field(month);
	}
	@Then ("Click in the IPO field {string}")
	public void Click_in_the_IPO_field(String IPO) throws Throwable {
		FAB.Click_in_the_IPO_field(IPO);
	}
	@Then ("^Verify the Display Only Final Fabric checkbox field status bydefault$")
	public void Verify_the_Display_Only_Final_Fabric_checkbox_field_status_bydefault() throws Throwable {
		FAB.Verify_the_Display_Only_Final_Fabric_checkbox_field_status_bydefault();
	}

}
