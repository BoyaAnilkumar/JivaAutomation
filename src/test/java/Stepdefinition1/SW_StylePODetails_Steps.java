package Stepdefinition1;

import Page.SW_StylePODetails_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SW_StylePODetails_Steps {

	SW_StylePODetails_Pages SWStylePO = new SW_StylePODetails_Pages();
	
	
	
	@And("^Click on the Style PO Details$")
	public void Click_on_the_Style_PO_Details() throws Throwable {
		SWStylePO.Click_on_the_Style_PO_Details();
	}
	@And ("^Click on the Add New PO button in the Style PO Details Screen$")
	public void Click_on_the_Add_New_PO_button_in_the_Style_PO_Details_Screen() throws Throwable {
		SWStylePO.Click_on_the_Add_New_PO_button_in_the_Style_PO_Details_Screen();
	}
	@When ("User enter the data in the {string} field in the PO details section")
	public void User_enter_the_data_in_the_field_in_the_PO_details_section(String PO) throws Throwable {
		SWStylePO.User_enter_the_data_in_the_field_in_the_PO_details_section(PO);
	}
	
	@And ("^Select the PO Details$")
	public void Select_the_PO_Details() throws Throwable {
		SWStylePO.Select_the_PO_Details();
	}
	@And ("Enter the {string} in the PO Qty field")
	public void Enter_the_in_the_PO_Qty_field(String POQty) throws Throwable {
		SWStylePO.Enter_the_in_the_PO_Qty_field(POQty);
	}
	
	@When ("Enter the data in the {string} Allowed field")
	public void Enter_the_data_in_the_Allowed_field(String Shortage) throws Throwable {
		SWStylePO.Enter_the_data_in_the_Allowed_field(Shortage);
	}
	@And ("Enter the data in the {string} field")
	public void Enter_the_data_in_the_field(String Addl_Shippment) throws Throwable {
		SWStylePO.Enter_the_data_in_the_field(Addl_Shippment);
	}
	@And ("Enter the data in the Shippment Priority {string} field")
	public void Enter_the_data_in_the_Shippment_Priority_field(String Priority) throws Throwable {
		SWStylePO.Enter_the_data_in_the_Shippment_Priority_field(Priority);
	}
	@And ("^Select the Garments in the Garment Size Type Selection field$")
	public void Select_the_Garments_in_the_Garment_Size_Type_Selection_field() throws Throwable {
		SWStylePO.Select_the_Garments_in_the_Garment_Size_Type_Selection_field();
	}
	@And ("Enter the data {string} Kept In Hand field")
	public void Enter_the_data_Kept_In_Hand_field(String Days) throws Throwable {
		SWStylePO.Enter_the_data_Kept_In_Hand_field(Days);
	}
	@And ("^Check the Ex Factory For Production field data is preopulated or not$")
	public void Check_the_Ex_Factory_For_Production_field_data_is_preopulated_or_not() throws Throwable {
		SWStylePO.Check_the_Ex_Factory_For_Production_field_data_is_preopulated_or_not();
	}
	@And ("Select the Requested Ex {string} field")
	public void Select_the_Requested_Ex_field(String Factory) throws Throwable {
		SWStylePO.Select_the_Requested_Ex_field(Factory);
	}
	@Then ("^Select the Handover Date in handover details section$")
	public void Select_the_Handover_Date_in_handover_details_section() throws Throwable {
		SWStylePO.Select_the_Handover_Date_in_handover_details_section();
	}
	@And ("Select the {string} in Handover details section")
	public void Select_the_in_Handover_details_section(String Mode) throws Throwable {
		SWStylePO.Select_the_in_Handover_details_section(Mode);
	}
	@Given ("Enter the data {string} in the Comments section")
	public void Enter_the_data_in_the_Comments_section(String Comments) throws Throwable {
		SWStylePO.Enter_the_data_in_the_Comments_section(Comments);
	}
	@And ("^Check the Size wise Details PO Qty fields data is preppopulated or not$")
	public void Check_the_Size_wise_Details_PO_Qty_fields_data_is_preppopulated_or_not() throws Throwable {
		SWStylePO.Check_the_Size_wise_Details_PO_Qty_fields_data_is_preppopulated_or_not();
	}
	@And ("^Enter the PO Size wise details$")
	public void Enter_the_PO_Size_wise_details() throws Throwable {
		SWStylePO.Enter_the_PO_Size_wise_details();
	}
	@And ("^Select the Combos in the Applicable Combos field in the Combos Section$")
	public void Select_the_Combos_in_the_Applicable_Combos_field_in_the_Combos_Section() throws Throwable {
		SWStylePO.Select_the_Combos_in_the_Applicable_Combos_field_in_the_Combos_Section();
	}
	@And ("^The User Click on the Submit button in the Style PO Details Screen$")
	public void The_User_Click_on_the_Submit_button_in_the_Style_PO_Details_Screen() throws Throwable {
		SWStylePO.The_User_Click_on_the_Submit_button_in_the_Style_PO_Details_Screen();
	}
	@And ("^Verify the Selected IPO Combinations and Garment size types are displayed or not$")
	public void Verify_the_Selected_IPO_Combinations_and_Garment_size_types_are_displayed_or_not() throws Throwable {
		SWStylePO.Verify_the_Selected_IPO_Combinations_and_Garment_size_types_are_displayed_or_not();
	}
	@And ("^Verify the Added PO Summary are displayed in the PO Summary grid$")
	public void Verify_the_Added_PO_Summary_are_displayed_in_the_PO_Summary_grid() throws Throwable {
		SWStylePO.Verify_the_Added_PO_Summary_are_displayed_in_the_PO_Summary_grid();
	}
	@And ("^Verify the PO Size wise details are displayed in the PO Size wise details Grid$")
	public void Verify_the_PO_Size_wise_details_are_displayed_in_the_PO_Size_wise_details_Grid() throws Throwable {
		SWStylePO.Verify_the_PO_Size_wise_details_are_displayed_in_the_PO_Size_wise_details_Grid();
	}
	@And ("^Click on the Delete Icon in Actions Column$")
	public void Click_on_the_Delete_Icon_in_Actions_Column() throws Throwable {
		SWStylePO.Click_on_the_Delete_Icon_in_Actions_Column();
	}
	@And ("^User Click on the Edit Icon in the Actions Column and the update form is displayed or not$")
	public void User_Click_on_the_Edit_Icon_in_the_Actions_Column_and_the_update_form_is_displayed_or_not() throws Throwable {
		SWStylePO.User_Click_on_the_Edit_Icon_in_the_Actions_Column_and_the_update_form_is_displayed_or_not();
	}
	@Then ("^Click on the View Icon the Comments Popup page is displayed or not$")
	public void Click_on_the_View_Icon_the_Comments_Popup_page_is_displayed_or_not() throws Throwable {
		SWStylePO.Click_on_the_View_Icon_the_Comments_Popup_page_is_displayed_or_not();
	}
	@And ("^Check the Comments Data is displayed or not and Click on the Close button$")
	public void Check_the_Comments_Data_is_displayed_or_not_and_Click_on_the_Close_button() throws Throwable {
		SWStylePO.Check_the_Comments_Data_is_displayed_or_not_and_Click_on_the_Close_button();
	}
	@And ("^Verify the on Submit the Validation msg is displaying or not$")
	public void Verify_the_on_Submit_the_Validation_msg_is_displaying_or_not() throws Throwable {
		SWStylePO.Verify_the_on_Submit_the_Validation_msg_is_displaying_or_not();
	}
	@And ("^Verify On Submit in Update form the update Validation msg is displaying or not$")
	public void Verify_On_Submit_in_Update_form_the_update_Validation_msg_is_displaying_or_not() throws Throwable {
		SWStylePO.Verify_On_Submit_in_Update_form_the_update_Validation_msg_is_displaying_or_not();
	}
	@Then ("^Without enter the data and click on the Submit button the toaster message is displayed$")
	public void Without_enter_the_data_and_click_on_the_Submit_button_the_toaster_message_is_displayed() throws Throwable {
		SWStylePO.Without_enter_the_data_and_click_on_the_Submit_button_the_toaster_message_is_displayed();
	}
	
	@And ("Enter the PO Size wise details Should not be more than the{string}")
	public void Enter_the_PO_Size_wise_details_Should_not_be_more_than_the(String POSizeQty) throws Throwable {
		SWStylePO.Enter_the_PO_Size_wise_details_Should_not_be_more_than_the(POSizeQty);
	}
	@And ("^Verify the PO Qty field Validation msg is displaying or not$")
	public void Verify_the_PO_Qty_field_Validation_msg_is_displaying_or_not() throws Throwable {
		SWStylePO.Verify_the_PO_Qty_field_Validation_msg_is_displaying_or_not();
	}
	@And ("^Verify the garment Size breakups Qty and PO Qty field Validation msg is displaying or not$")
	public void Verify_the_garment_Size_breakups_Qty_and_PO_Qty_field_Validation_msg_is_displaying_or_not() throws Throwable {
		SWStylePO.Verify_the_garment_Size_breakups_Qty_and_PO_Qty_field_Validation_msg_is_displaying_or_not();
	}
}
