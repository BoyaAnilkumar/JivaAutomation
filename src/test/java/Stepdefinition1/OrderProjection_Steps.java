package Stepdefinition1;

import Page.OrderProjection_pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderProjection_Steps {
	
	OrderProjection_pages OP = new OrderProjection_pages();

	@Given ("^Login with the Senior PD Merchant$")
	public void Login_with_the_Senior_PD_Merchant() throws Throwable {
		OP.Login_with_the_Senior_PD_Merchant();
	}
	@Then ("^Navigate to the Order Projection screen$")
	public void Navigate_to_the_Order_Projection_screen() throws Throwable {
		OP.Navigate_to_the_Order_Projection_screen();
	}
	@When ("^Click on the Add button in the Order Projection screen$")
	public void Click_on_the_Add_button_in_the_Order_Projection_screen() throws Throwable {
		OP.Click_on_the_Add_button_in_the_Order_Projection_screen();
	}
	@Then ("^Verify whether page is navigated to the Create Order Projection form$")
	public void Verify_whether_page_is_navigated_to_the_Create_Order_Projection_form() throws Throwable {
		OP.Verify_whether_page_is_navigated_to_the_Create_Order_Projection_form();
	}
	@When ("^Click on the Cancel button in the Create Order Projection form$")
	public void Click_on_the_Cancel_button_in_the_Create_Order_Projection_form() throws Throwable {
		OP.Click_on_the_Cancel_button_in_the_Create_Order_Projection_form();
	}
	@Then ("^Verify whether the page is navigated to the Order Projection screen$")
	public void Verify_whether_the_page_is_navigated_to_the_Order_Projection_screen() throws Throwable {
		OP.Verify_whether_the_page_is_navigated_to_the_Order_Projection_screen();
	}
	@Then ("^Verify whether the Exp Order Qty value is updated in the grid for the respective record$")
	public void Verify_whether_the_Exp_Order_Qty_value_is_updated_in_the_grid_for_the_respective_record() {
		OP.Verify_whether_the_Exp_Order_Qty_value_is_updated_in_the_grid_for_the_respective_record();
	}
	@Then ("^Click on Save button in the Create Order Projection form$")
	public void Click_on_Save_button_in_the_Create_Order_Projection_form() throws Throwable {
		OP.Click_on_Save_button_in_the_Create_Order_Projection_form();
	}
	@Then ("^Verify the Mandatory validation msg$")
	public void Verify_the_Mandatory_validation_msg() throws Throwable {
		OP.Verify_the_Mandatory_validation_msg();
	}
	@Given ("^Enter the first 2 letters of the Senior PD Merchant name$")
	public void Enter_the_first_2_letters_of_the_Senior_PD_Merchant_name() throws Throwable {
		OP.Enter_the_first_2_letters_of_the_Senior_PD_Merchant_name();
	}
//	@Then ("^Select the PD merchant from the dropdown list$")
//	public void Select_the_PD_merchant_from_the_dropdown_list() throws Throwable {
//		OP.Select_the_PD_merchant_from_the_dropdown_list();
//	}
	@When ("^Click in the Buyer field in Order Project form$")
	public void Click_in_the_Buyer_field() throws Throwable {
		OP.Click_in_the_Buyer_field();
	}
	@Then ("^Select a value from the dropdown list$")
	public void Select_a_value_from_the_dropdown_list() throws Throwable {
		OP.Select_a_value_from_the_dropdown_list();
	}
	@When ("^Click in the Month & Year field$")
	public void Click_in_the_Month_Year_field() throws Throwable {
		OP.Click_in_the_Month_Year_field();
	}
	@Then ("^Select a value from the calendar$")
	public void Select_a_value_from_the_calendar() throws Throwable {
		OP.Select_a_value_from_the_calendar();
	}
	@Given ("^Enter Expected Order Qty value$")
	public void Enter_Expected_Order_Qty_value() throws Throwable {
		OP.Enter_Expected_Order_Qty_value();
	}
	@Given ("^Enter Appr. Per Pcs Cost value$")
	public void Enter_Appr_Per_Pcs_Cost_value() throws Throwable {
		OP.Enter_Appr_Per_Pcs_Cost_value();
	}
	@Given ("^Enter Exchange Rate value$")
	public void Enter_Exchange_Rate_value() throws Throwable {
		OP.Enter_Exchange_Rate_value();
	}
	@Then ("^Print Total Cost In INR field value$")
	public void Print_Total_Cost_In_INR_field_value() throws Throwable {
		OP.Print_Total_Cost_In_INR_field_value();
	}
	@Then ("^Print Total Cost In Currency value$")
	public void Print_Total_Cost_In_Currency_value() throws Throwable {
		OP.Print_Total_Cost_In_Currency_value();
	}
	@Then ("^Click on the Save button in the Create Order Projection form$")
	public void Click_on_the_Save_button_in_the_Create_Order_Projection_form() throws Throwable {
		OP.Click_on_the_Save_button_in_the_Create_Order_Projection_form();
	}
	@Then ("^Verify the Successful toaster msg and print$")
	public void Verify_the_Successful_toaster_msg_and_print() throws Throwable {
		OP.Verify_the_Successful_toaster_msg_and_print();
	}
	@When ("^Click on the Edit button for a record in the Order Projection screen$")
	public void Click_on_the_Edit_button_for_a_record_in_the_Order_Projection_screen() throws Throwable {
		OP.Click_on_the_Edit_button_for_a_record_in_the_Order_Projection_screen();
	}
	@Then ("^Verify whether page is navigated to the Update Order Projection form$")
	public void Verify_whether_page_is_navigated_to_the_Update_Order_Projection_form() throws Throwable {
		OP.Verify_whether_page_is_navigated_to_the_Update_Order_Projection_form();
	}
	@Then ("^Verify whether all the values are displayed in the respective fields$")
	public void Verify_whether_all_the_values_are_displayed_in_the_respective_fields() throws Throwable {
		OP.Verify_whether_all_the_values_are_displayed_in_the_respective_fields();
	}
	@When ("^Update the Expected Order Qty value$")
	public void Update_the_Expected_Order_Qty_value() throws Throwable {
		OP.Update_the_Expected_Order_Qty_value();
	}
	@Then ("^Click on the Save button in the Update Order Projection form$")
	public void Click_on_the_Save_button_in_the_Update_Order_Projection_form() throws Throwable {
		OP.Click_on_the_Save_button_in_the_Update_Order_Projection_form();
	}
	@Then ("^Verify the Update Successful toaster msg$")
	public void Verify_the_Update_Successful_toaster_msg() throws Throwable {
		OP.Verify_the_Update_Successful_toaster_msg();
	}
	@When ("^Click on the Delete button for a record in the Order Projection screen$")
	public void Click_on_the_Delete_button_for_a_record_in_the_Order_Projection_screen() throws Throwable {
		OP.Click_on_the_Delete_button_for_a_record_in_the_Order_Projection_screen();
	}
	@Then ("^Verify whether the Delete popup window is displayed$")
	public void Verify_whether_the_Delete_popup_window_is_displayed() throws Throwable {
		OP.Verify_whether_the_Delete_popup_window_is_displayed();
	}
	@Then ("^Verify whether the Delete button status$")
	public void Verify_whether_the_Delete_button_status() throws Throwable {
		OP.Verify_whether_the_Delete_button_status();
	}
	@Then ("^Print the Succesful Delete message$")
	public void Print_the_Succesful_Delete_message() throws Throwable {
		OP.Print_the_Succesful_Delete_message();
	}
	@Then ("^Click on the Yes option in the Delete msg$")
	public void Click_on_the_Yes_option_in_the_Delete_msg() throws Throwable {
		OP.Click_on_the_Yes_option_in_the_Delete_msg();
	}
	
}
