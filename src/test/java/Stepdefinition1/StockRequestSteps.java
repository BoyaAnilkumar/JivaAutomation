package Stepdefinition1;

import Pages.StockRequestpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StockRequestSteps {
	
	StockRequestpage SR = new  StockRequestpage();
	
	
	@When ("^Click on Filters showhide button$")
	public void Click_on_Filters_showhide_button() throws Throwable {
		SR.Click_on_Filters_showhide_button();
	}
	
	@Then ("^Navigate to the Fabric Stock Request screen$")
	public void Navigate_to_the_Fabric_Stock_Request_screen() throws Throwable {
		SR.Navigate_to_the_Fabric_Stock_Request_screen();
	}
	@Then ("^Verify whether the Assign Stock To IPO and Cancel buttons are displayed under the Action column$")
	public void Verify_whether_the_Assign_Stock_To_IPO_and_Cancel_buttons_are_displayed_under_the_Action_column() throws Throwable {
		SR.Verify_whether_the_Assign_Stock_To_IPO_and_Cancel_buttons_are_displayed_under_the_Action_column();
	}
	@Then ("^Verify whethe the Assign Stock to IPO button is clickable$")
	public void Verify_whethe_the_Assign_Stock_to_IPO_button_is_clickable() throws Throwable {
		SR.Verify_whethe_the_Assign_Stock_to_IPO_button_is_clickable();
	}
	@Then ("^Verify whether the page is navigated to the Assign Stock to IPO form$")
	public void Verify_whether_the_page_is_navigated_to_the_Assign_Stock_to_IPO_form() throws Throwable {
		SR.Verify_whether_the_page_is_navigated_to_the_Assign_Stock_to_IPO_form();
	}
	@Then ("^Click on the Cancel button in the Assign Stock to IPO form$")
	public void Click_on_the_Cancel_button_in_the_Assign_Stock_to_IPO_form() throws Throwable {
		SR.Click_on_the_Cancel_button_in_the_Assign_Stock_to_IPO_form();
	}
	@Then ("^Verify whether the page is navigated to the Fabric Stock Request screen$")
	public void Verify_whether_the_page_is_navigated_to_the_Fabric_Stock_Request_screen() throws Throwable {
		SR.Verify_whether_the_page_is_navigated_to_the_Fabric_Stock_Request_screen();
	}
	@Then ("^Click on the Save button in the Assign Stock to IPO form$")
	public void Click_on_the_Save_button_in_the_Assign_Stock_to_IPO_form() throws Throwable {
		SR.Click_on_the_Save_button_in_the_Assign_Stock_to_IPO_form();
	}
	@Then ("^Verify whether the mandatory validation msg is displayed or not$")
	public void Verify_whether_the_mandatory_validation_msg_is_displayed_or_not() throws Throwable {
		SR.Verify_whether_the_mandatory_validation_msg_is_displayed_or_not();
	}
	@Then ("^Verify the Stock Req No field properties$")
	public void Verify_the_Stock_Req_No_field_properties() throws Throwable {
		SR.Verify_the_Stock_Req_No_field_properties();
	}
	@Then ("^Verify the IPO field data and print$")
	public void Verify_the_IPO_field_data_and_print() throws Throwable {
		SR.Verify_the_IPO_field_data_and_print();
	}
	@Then ("^Verify the Fabric Name field data and print$")
	public void Verify_the_Fabric_Name_field_data_and_print() throws Throwable {
		SR.Verify_the_Fabric_Name_field_data_and_print();
	}
	@Then ("^Verify the Color field data and print$")
	public void Verify_the_Color_field_data_and_print() throws Throwable {
		SR.Verify_the_Color_field_data_and_print();
	}
	@Then ("^Verify the Process field data and print$")
	public void Verify_the_Process_field_data_and_print() throws Throwable {
		SR.Verify_the_Process_field_data_and_print();
	}
	@Then ("^Verify the Requested Qty field data and print$")
	public void Verify_the_Requested_Qty_field_data_and_print() throws Throwable {
		SR.Verify_the_Requested_Qty_field_data_and_print();
	}
	@Then ("^Verify whether the Total Stock Available and Qty Assign fields are displayed or not after selecting the Factory$")
	public void Verify_whether_the_Total_Stock_Available_and_Qty_Assign_fields_are_displayed_or_not_after_selecting_the_Factory() {
		SR.Verify_whether_the_Total_Stock_Available_and_Qty_Assign_fields_are_displayed_or_not_after_selecting_the_Factory();
	}
	@Then ("^Verify the Total Stock Available field data and print$")
	public void Verify_the_Total_Stock_Available_field_data_and_print() throws Throwable {
		SR.Verify_the_Total_Stock_Available_field_data_and_print();
	}
	@Then ("^Verify the Qty Assign field data and print$")
	public void Verify_the_Qty_Assign_field_data_and_print() throws Throwable {
		SR.Verify_the_Qty_Assign_field_data_and_print();
	}
	@Then ("^Verify whether the user is able to select a Factory name in the Factory field$")
	public void Verify_whether_the_user_is_able_to_select_a_Factory_name_in_the_Factory_field() throws Throwable {
		SR.Verify_whether_the_user_is_able_to_select_a_Factory_name_in_the_Factory_field();
	}
	@Then ("^Verify whether the user is able to Delete the added factory$")
	public void Verify_whether_the_user_is_able_to_Delete_the_added_factory() {
		SR.Verify_whether_the_user_is_able_to_Delete_the_added_factory();
	}
	@Then ("^Verify whether the user is able to select multiple Factory names in the Factory field$")
	public void Verify_whether_the_user_is_able_to_select_multiple_Factory_names_in_the_Factory_field() {
		SR.Verify_whether_the_user_is_able_to_select_multiple_Factory_names_in_the_Factory_field();
	}
	@Then ("^Verify whether the user is able to delete all the added factories at a time$")
	public void Verify_whether_the_user_is_able_to_delete_all_the_added_factories_at_a_time() {
		SR.Verify_whether_the_user_is_able_to_delete_all_the_added_factories_at_a_time();
	}
	@Then ("^Verify whether Thaan Wise Information grid is displayed after selecting a Factory$")
	public void Verify_whether_Thaan_Wise_Information_grid_is_displayed_after_selecting_a_Factory() throws Throwable {
		SR.Verify_whether_Thaan_Wise_Information_grid_is_displayed_after_selecting_a_Factory();
	}
	@Then ("^Select the Complete Thaan checkbox field and check the Qty Assign field value$")
	public void Select_the_Complete_Thaan_checkbox_field_and_check_the_Qty_Assign_field_value() throws Throwable {
		SR.Select_the_Complete_Thaan_checkbox_field_and_check_the_Qty_Assign_field_value();
	}
	@Then ("^Select the Partial Thaan checkbox field and check whether the Thaan Name and Partial Qty field are displayed or not$")
	public void Select_the_Partial_Thaan_checkbox_field_and_check_whether_the_Thaan_Name_and_Partial_Qty_field_are_displayed_or_not() throws Throwable {
		SR.Select_the_Partial_Thaan_checkbox_field_and_check_whether_the_Thaan_Name_and_Partial_Qty_field_are_displayed_or_not();
	}
	@Given ("^Enter the Partial Thaan name$")
	public void Enter_the_Partial_Thaan_name() throws Throwable {
		SR.Enter_the_Partial_Thaan_name();
	}
	@Given ("^Enter the Partial Qty value more than the Actual Qty$")
	public void Enter_the_Partial_Qty_value_more_than_the_Actual_Qty() throws Throwable {
		SR.Enter_the_Partial_Qty_value_more_than_the_Actual_Qty();
	}
//	@Then "^Click on the Save button in the Assign Stock to IPO form$")
//	public void Click_on_the_Save_button_in_the_Assign_Stock_to_IPO_form() {
//		SR.Click_on_the_Save_button_in_the_Assign_Stock_to_IPO_form();
//	}
	@Then ("^Verify whether Partial Qty validationmsg is displayed when the user enters more qty than the Actual Qty$")
	public void Verify_whether_Partial_Qty_validationmsg_is_displayed_when_the_user_enters_more_qty_than_the_Actual_Qty() throws Throwable {
		SR.Verify_whether_Partial_Qty_validationmsg_is_displayed_when_the_user_enters_more_qty_than_the_Actual_Qty();
	}
	@Then ("^Verify whether the sum of all the selected thaans are displayed in the Qty Assign field or not$")
	public void Verify_whether_the_sum_of_all_the_selected_thaans_are_displayed_in_the_Qty_Assign_field_or_not() throws Throwable {
		SR.Verify_whether_the_sum_of_all_the_selected_thaans_are_displayed_in_the_Qty_Assign_field_or_not();
	}
	@Given ("^Select the Assign Qty more than the Requested Qty$")
	public void Select_the_Assign_Qty_more_than_the_Requested_Qty() throws Throwable {
		SR.Select_the_Assign_Qty_more_than_the_Requested_Qty(); 
	}
		
	@Then ("^Verify whether the Qty Assigned and the Requested Qty validation msg is displayed or not when the Qtys are not equal$")
	public void Verify_whether_the_Qty_Assigned_and_the_Requested_Qty_validation_msg_is_displayed_or_not_when_the_Qtys_are_not_equal() throws Throwable {
		SR.Verify_whether_the_Qty_Assigned_and_the_Requested_Qty_validation_msg_is_displayed_or_not_when_the_Qtys_are_not_equal();
	}
	@Given ("^Select the Assign Qty less than the Requested Qty$")
	public void Select_the_Assign_Qty_less_than_the_Requested_Qty() throws Throwable {
		SR.Select_the_Assign_Qty_less_than_the_Requested_Qty();
	}
	
//	@Then ("^Verify whether the Qty Assigned and the Requested Qty validation msg is displayed or not when the Qtys are not equal$")
//	public void Verify_whether_the_Qty_Assigned_and_the_Requested_Qty_validation_msg_is_displayed_or_not_when_the_Qtys_are_not_equal() {
//		SR.Verify_whether_the_Qty_Assigned_and_the_Requested_Qty_validation_msg_is_displayed_or_not_when_the_Qtys_are_not_equal();
//	}
	@Given ("^Select the Assign Qty equal to the Requested Qty and enter valid data in all the mandatory fields$")
	public void Select_the_Assign_Qty_equal_to_the_Requested_Qty_and_enter_valid_data_in_all_the_mandatory_fields() throws Throwable {
		SR.Select_the_Assign_Qty_equal_to_the_Requested_Qty_and_enter_valid_data_in_all_the_mandatory_fields();
	}
//	@Then ("^Click on the Save button in the Assign Stock to IPO form$")
//	public void Click_on_the_Save_button_in_the_Assign_Stock_to_IPO_form() {
//		SR.Click_on_the_Save_button_in_the_Assign_Stock_to_IPO_form();
//	}
	@Then ("^Verify the successful toaster msg$")
	public void Verify_the_successful_toaster_msg() throws Throwable {
		SR.Verify_the_successful_toaster_msg();
	}
	@Then ("^Verify the expansion button display$")
	public void Verify_the_expansion_button_display() throws Throwable {
		SR.Verify_the_expansion_button_display();
	}
	@Then ("^Verify the expansion grid values$")
	public void Verify_the_expansion_grid_values() {
		SR.Verify_the_expansion_grid_values();
	}
	@When ("^Click on the Cancel button for a Stock record$")
	public void Click_on_the_Cancel_button_for_a_Stock_record() throws Throwable {
		SR.Click_on_the_Cancel_button_for_a_Stock_record();
	}
	@Then ("^Verify whether the Cancel popup window is displayed$")
	public void Verify_whether_the_Cancel_popup_window_is_displayed() throws Throwable {
		SR.Verify_whether_the_Cancel_popup_window_is_displayed();
	}
	@Then ("^Click on the No option in the Delete msg$")
	public void Click_on_the_No_option_in_the_Delete_msg() throws Throwable {
		SR.Click_on_the_No_option_in_the_Delete_msg();
	}
//	@Then ("^Click on the Yes option in the Delete msg$")
//	public void Click_on_the_Yes_option_in_the_Delete_msg() throws Throwable {
//		SR.Click_on_the_Yes_option_in_the_Delete_msg();
//	}
	@Then ("^Verify the Successful Cancelled msg$")
	public void Verify_the_Successful_Cancelled_msg() {
		SR.Verify_the_Successful_Cancelled_msg();
	}
	  
	  

}
