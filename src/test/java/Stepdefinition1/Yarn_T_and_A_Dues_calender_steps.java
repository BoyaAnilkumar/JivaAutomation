package Stepdefinition1;

import Page.Yarn_T_and_A_Dues_calender_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Yarn_T_and_A_Dues_calender_steps {

	Yarn_T_and_A_Dues_calender_Page Yarn_T_and_A_Dues_Cal= new Yarn_T_and_A_Dues_calender_Page();
	
	@And ("^Click on the T and A dues Calender under the T&A dropdown$")
	public void Click_on_the_T_and_A_dues_Calender_under_the_T_A_dropdown()throws Throwable {
		Yarn_T_and_A_Dues_Cal.Click_on_the_T_and_A_dues_Calender_under_the_T_A_dropdown();
	}
	@Then ("^the Yarn T and A Dues Calender Screen is displayed or not$")
	public void the_Yarn_T_and_A_Dues_Calender_Screen_is_displayed_or_not()throws Throwable {
		Yarn_T_and_A_Dues_Cal.the_Yarn_T_and_A_Dues_Calender_Screen_is_displayed_or_not();
	}
	@And ("Select the Sr Merchant {string}")
	public void Select_the_Sr_Merchant_(String Merchant)throws Throwable {
		Yarn_T_and_A_Dues_Cal.Select_the_Sr_Merchant_(Merchant);
	}
	@And ("User Select the Supplier name in the {string} field")
	public void User_Select_the_Supplier_name_in_the_field(String Supplier)throws Throwable {
		Yarn_T_and_A_Dues_Cal.User_Select_the_Supplier_name_in_the_field(Supplier);
	}
	@When ("^I enter the From date and To Date$")
	public void I_enter_the_From_date_and_To_Date()throws Throwable {
		Yarn_T_and_A_Dues_Cal.I_enter_the_From_date_and_To_Date();
	}
	@And ("^Click on the Download button$")
	public void Click_on_the_Download_button()throws Throwable {
		Yarn_T_and_A_Dues_Cal.Click_on_the_Download_button();
	}
}
