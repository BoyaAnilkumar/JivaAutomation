package Stepdefinition1;

import Page.SW_Merch_T_And_A_Dues_Calender;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Sw_Merchant_T_and_A_Dues_Calender_steps {
	
	SW_Merch_T_And_A_Dues_Calender   SW_Merch_T_And_A_Dues_Cal  = new SW_Merch_T_And_A_Dues_Calender();
	
	
	@And ("^Click on the T and A dues Calender under the T and A dropdown$")
	public void Click_on_the_T_and_A_dues_Calender_under_the_T_and_A_dropdown() throws Throwable {
		SW_Merch_T_And_A_Dues_Cal.Click_on_the_T_and_A_dues_Calender_under_the_T_and_A_dropdown();
	}
	@Then ("^the Merchandising T and A Dues Calender Screen is displayed or not$")
	public void the_Merchandising_T_and_A_Dues_Calender_Screen_is_displayed_or_not() throws Throwable {
		SW_Merch_T_And_A_Dues_Cal.the_Merchandising_T_and_A_Dues_Calender_Screen_is_displayed_or_not();
	}
}
