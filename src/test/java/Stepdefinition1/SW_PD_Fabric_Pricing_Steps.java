package Stepdefinition1;

import Page.SW_PD_Fabric_Pricing_Pages;
import io.cucumber.java.en.And;

public class SW_PD_Fabric_Pricing_Steps {
	SW_PD_Fabric_Pricing_Pages SwPD_Fabric_Pricing = new SW_PD_Fabric_Pricing_Pages();

	
	@And ("^Click on the PD Fabric Pricing Screen$")
	public void Click_on_the_PD_Fabric_Pricing_Screen() throws Throwable {
		SwPD_Fabric_Pricing.Click_on_the_PD_Fabric_Pricing_Screen();
	}
	@And ("^Verify the On Saving validation is displayed or not$")
	public void Verify_the_On_Saving_validation_is_displayed_or_not() throws Throwable {
		SwPD_Fabric_Pricing.Verify_the_On_Saving_validation_is_displayed_or_not();
	}
	@And ("^Click on the Submit to Po Merchant Team button the validation msg is displayed or not$")
	public void Click_on_the_Submit_to_Po_Merchant_Team_button_the_validation_msg_is_displayed_or_not() throws Throwable {
		SwPD_Fabric_Pricing.Click_on_the_Submit_to_Po_Merchant_Team_button_the_validation_msg_is_displayed_or_not();
	}
	@And ("Enter the data in the {string} total fabric Price field")
	public void Enter_the_data_in_the_total_fabric_Price_field(String TotalPrice) throws Throwable {
		SwPD_Fabric_Pricing.Enter_the_data_in_the_total_fabric_Price_field(TotalPrice);
	}
	
}
