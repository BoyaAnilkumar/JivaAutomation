package Stepdefinition1;

import Page.SW_Merchndising_T_and_A_data_Entry_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_Merchndising_T_and_A_data_Entry_steps {
	
	SW_Merchndising_T_and_A_data_Entry_Page    SW_Merchndising_T_and_A_data_Entry  = new SW_Merchndising_T_and_A_data_Entry_Page();
	
	@And ("^Click on the T and A Data entry under the Data Entry dropdown$")
	public void Click_on_the_T_and_A_Data_entry_under_the_Data_Entry_dropdown() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.Click_on_the_T_and_A_Data_entry_under_the_Data_Entry_dropdown();
	}
	
	@Then ("^The Merchandising T and A Data Entry Screen is displayed or not$")
	public void The_Merchandising_T_and_A_Data_Entry_Screen_is_displayed_or_not() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.The_Merchandising_T_and_A_Data_Entry_Screen_is_displayed_or_not();
	}
	@And ("Select the {string} in the month field")
	public void Select_the_in_the_month_field(String Month) throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.Select_the_in_the_month_field(Month);
	}
	@And ("^the Buying house data should be displayed$")
	public void the_Buying_house_data_should_be_displayed() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.the_Buying_house_data_should_be_displayed();
	}
	@And ("^the Buyer Style should be displayed correctly$")
	 public void the_Buyer_Style_should_be_displayed_correctly() throws Throwable{
		SW_Merchndising_T_and_A_data_Entry.the_Buyer_Style_should_be_displayed_correctly();
	 }
	@And ("^Click on the Missy Add button in the T and A data Entry$")
	public void Click_on_the_Missy_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.Click_on_the_Missy_Add_button_in_the_T_and_A_data_Entry();
	}
	@And ("^Click on the Petite Add button in the T and A data Entry$")
	public void Click_on_the_Petite_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.Click_on_the_Petite_Add_button_in_the_T_and_A_data_Entry();
	}
	@And ("^Click on the Tall Add button in the T and A data Entry$")
	public void Click_on_the_Tall_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.Click_on_the_Tall_Add_button_in_the_T_and_A_data_Entry();
	}
	@And ("^Click on the Women Add button in the T and A data Entry$")
	public void Click_on_the_Women_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.Click_on_the_Women_Add_button_in_the_T_and_A_data_Entry();
	}
	@And ("^Enter the data in the Submission date fields and Approval Date fields$")
	public void Enter_the_data_in_the_Submission_date_fields_and_Approval_Date_fields() throws Throwable {
		SW_Merchndising_T_and_A_data_Entry.Enter_the_data_in_the_Submission_date_fields_and_Approval_Date_fields();
	}
	
}
