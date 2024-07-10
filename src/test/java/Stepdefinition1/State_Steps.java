package Stepdefinition1;

<<<<<<< HEAD
import Pages.Statepage;
=======
import Page.Statepage;
>>>>>>> branch 'master' of https://github.com/BoyaAnilkumar/JivaAutomation.git
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class State_Steps {

	Statepage State = new Statepage();
	
	@Then("^Click on the State screen$")
	public void Click_on_the_State_screen() throws Throwable {
		  State.Click_on_the_State_screen();
	  }
	
	@And("^To verify whether Search is holding the placeholder or not$")
	public void To_verify_whether_Search_is_holding_the_placeholder_or_not() throws Throwable {
		State.To_verify_whether_Search_is_holding_the_placeholder_or_not();
	}
	
	@And("^To verify whether Search is displaying the records or not when the user enters Invalid data$")
	public void To_verify_whether_Search_is_displaying_the_records_or_not_when_the_user_enters_Invalid_data() throws Throwable {
		State.To_verify_whether_Search_is_displaying_the_records_or_not_when_the_user_enters_Invalid_data();
	}
	
	@And("^To verify whether it is displaying the records or not by entering with the State name Search criteria$")
	public void To_verify_whether_it_is_displaying_the_records_or_not_by_entering_with_the_State_name_Search_criteria() throws Throwable {
		State.To_verify_whether_it_is_displaying_the_records_or_not_by_entering_with_the_State_name_Search_criteria();
	}
	
	@Then("^To verify whether the State Code Country IGST SGST CGST Active and Action columns are to be displayed or not$")
	public void To_verify_whether_the_State_Code_Country_IGST_SGST_CGST_Active_and_Action_columns_are_to_be_displayed_or_not() throws Throwable {
		State.To_verify_whether_the_State_Code_Country_IGST_SGST_CGST_Active_and_Action_columns_are_to_be_displayed_or_not();
	}
	
	@Then("^To verify whether the user able to view the add button or not$")
	public void To_verify_whether_the_user_able_to_view_the_add_button_or_not() throws Throwable {
		State.To_verify_whether_the_user_able_to_view_the_add_button_or_not();
	}
	
	@And("^To verify whether the add button is enable state or not$")
	public void To_verify_whether_the_add_button_is_enable_state_or_not() throws Throwable {
		State.To_verify_whether_the_add_button_is_enable_state_or_not();
	}
	
	@And("^To verify whether the add button is clickable or not$")
	public void To_verify_whether_the_add_button_is_clickable_or_not() throws Throwable {
		State.To_verify_whether_the_add_button_is_clickable_or_not();
	}
	
	@Then("^To verify when the user click on the add button the create State form is displaying or not$")
	public void To_verify_when_the_user_click_on_the_add_button_the_create_State_form_is_displaying_or_not() throws Throwable {
		State.To_verify_when_the_user_click_on_the_add_button_the_create_State_form_is_displaying_or_not();
	}
	
	@And("^To verify whether the State name State code Country code IGST SGST CGST active checkbox cancel and Save buttons$")
	public void To_verify_whether_the_State_name_State_code_Country_code_IGST_SGST_CGST_active_checkbox_cancel_and_Save_buttons() throws Throwable {
		State.To_verify_whether_the_State_name_State_code_Country_code_IGST_SGST_CGST_active_checkbox_cancel_and_Save_buttons();
	}
	
	@Then("^To verify whether the user able to view the State name field or not$")
	public void To_verify_whether_the_user_able_to_view_the_State_name_field_or_not() throws Throwable {
		State.To_verify_whether_the_user_able_to_view_the_State_name_field_or_not();
	}
	
	@And("^To verify whether the entered data is properly displayed or not$")
	public void To_verify_whether_the_entered_data_is_properly_displayed_or_not() throws Throwable {
		State.To_verify_whether_the_entered_data_is_properly_displayed_or_not();
	}
	
	@And("^To verify whether the user able to view the State Code field or not$")
	public void To_verify_whether_the_user_able_to_view_the_State_Code_field_or_not() throws Throwable {
		State.To_verify_whether_the_user_able_to_view_the_State_Code_field_or_not();
	}
	
	@And("^To verify whether the user able to enter the data in state code text field or not$")
	public void To_verify_whether_the_user_able_to_enter_the_data_in_state_code_text_field_or_not() throws Throwable {
		State.To_verify_whether_the_user_able_to_enter_the_data_in_state_code_text_field_or_not();
	}
	
	@Then("^To verify whether the user able to view the Country name field or not$")
	public void To_verify_whether_the_user_able_to_view_the_Country_name_field_or_not() throws Throwable {
		State.To_verify_whether_the_user_able_to_view_the_Country_name_field_or_not();
	}
	
	@And("^To verify whether the Country names are retrieved from the Country name screen or not$")
	public void To_verify_whether_the_Country_names_are_retrieved_from_the_Country_name_screen_or_not() throws Throwable {
		State.To_verify_whether_the_Country_names_are_retrieved_from_the_Country_name_screen_or_not();
	}
	
	@Then("^To verify whether the user able to view the IGST field or not$")
	public void To_verify_whether_the_user_able_to_view_the_IGST_field_or_not() throws Throwable {
		State.To_verify_whether_the_user_able_to_view_the_IGST_field_or_not();
	}
	
	@And("^To verify whether the IGST field is enable state or not$")
	public void To_verify_whether_the_IGST_field_is_enable_state_or_not() throws Throwable {
		State.To_verify_whether_the_IGST_field_is_enable_state_or_not();
	}
	
	@And("^To verify whether the IGST field is text box field or not$")
	public void To_verify_whether_the_IGST_field_is_text_box_field_or_not() throws Throwable{
		State.To_verify_whether_the_IGST_field_is_text_box_field_or_not();
	}
	
	@And("^To verify whether the entered data is properly displayed in IGST or not$")
	public void To_verify_whether_the_entered_data_is_properly_displayed_in_IGST_or_not() throws Throwable{
		State.To_verify_whether_the_entered_data_is_properly_displayed_in_IGST_or_not();
	}
	
	@Then("^To verify whether the user able to view the SGST field or not$")
	public void To_verify_whether_the_user_able_to_view_the_SGST_field_or_not() throws Throwable{
		State.To_verify_whether_the_user_able_to_view_the_SGST_field_or_not();
	}
	
	@And("^To verify whether the SGST field is enable state or not$")
	public void To_verify_whether_the_SGST_field_is_enable_state_or_not() throws Throwable{
		State.To_verify_whether_the_SGST_field_is_enable_state_or_not();
	}
	
	@And("^To verify whether the SGST field is text box field or not$")
	public void To_verify_whether_the_SGST_field_is_text_box_field_or_not() throws Throwable{
		State.To_verify_whether_the_SGST_field_is_text_box_field_or_not();
	}
	
	@And("^To verify whether the entered data is properly displayed in SGST or not$")
	public void To_verify_whether_the_entered_data_is_properly_displayed_in_SGST_or_not() throws Throwable{
		State.To_verify_whether_the_entered_data_is_properly_displayed_in_SGST_or_not();
	}
	
	@Then("^To verify whether the user able to view the CGST field or not$")
	public void To_verify_whether_the_user_able_to_view_the_CGST_field_or_not() throws Throwable{
		State.To_verify_whether_the_user_able_to_view_the_CGST_field_or_not();
	}
	
	@And("^To verify whether the CGST field is enable state or not$")
	public void To_verify_whether_the_CGST_field_is_enable_state_or_not() throws Throwable{
		State.To_verify_whether_the_CGST_field_is_enable_state_or_not();
	}
	
	@And("^To verify whether the CGST field is text box field or not$")
	public void To_verify_whether_the_CGST_field_is_text_box_field_or_not()throws Throwable {
		State.To_verify_whether_the_CGST_field_is_text_box_field_or_not();
	}
	
	@And("^To verify whether the CGST field is mandatory field or not$")
	public void To_verify_whether_the_CGST_field_is_mandatory_field_or_not()throws Throwable {
		State.To_verify_whether_the_CGST_field_is_mandatory_field_or_not();
	}
	
	@And("^To verify whether the entered data is properly displayed in CGST or not$")
	public void To_verify_whether_the_entered_data_is_properly_displayed_in_CGST_or_not()throws Throwable {
		State.To_verify_whether_the_entered_data_is_properly_displayed_in_CGST_or_not();
	}
	
	
	@Then("^To verify whether the user able to view the save button or not$")
	public void To_verify_whether_the_user_able_to_view_the_save_button_or_not() throws Throwable{
		State.To_verify_whether_the_user_able_to_view_the_save_button_or_not();
	}
	
	@And("^To verify whether the save button is enable state or not$")
	public void To_verify_whether_the_save_button_is_enable_state_or_not() throws Throwable{
		State.To_verify_whether_the_save_button_is_enable_state_or_not();
	}
	
	@And("^To verify when the user click on the save button the State saved successfully msg is displaying or not$")
	public void To_verify_when_the_user_click_on_the_save_button_the_State_saved_successfully_msg_is_displaying_or_not() throws Throwable {
		State.To_verify_when_the_user_click_on_the_save_button_the_State_saved_successfully_msg_is_displaying_or_not();
	}
	
	@And("^Verify that user able to view the Save Record in grid$")
	public void Verify_that_user_able_to_view_the_Save_Record_in_grid() {
		State.Verify_that_user_able_to_view_the_Save_Record_in_grid();
	}
	
	
}
