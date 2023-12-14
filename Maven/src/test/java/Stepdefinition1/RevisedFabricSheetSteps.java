package Stepdefinition1;

import Page.RevisedFabricSheetPages;
import io.cucumber.java.en.And;
//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RevisedFabricSheetSteps {
	RevisedFabricSheetPages RFSP= new RevisedFabricSheetPages(); 

	@When("^user navigates to Login page$")
	public void user_navigates_to_Login_page() throws Throwable {
		RFSP.user_navigates_to_Login_page();
	}

	@Given("^Login with Production Manager$")
	public void Login_with_Production_Manager() {
		RFSP.Login_with_Production_Manager();
	}
	@And ("^Click on the SignIn button$")
	public void Click_on_the_SignIn_button() throws Throwable {
		RFSP.Click_on_the_SignIn_button();
	}

	@When("^user navigates to Revised Fabric Sheet$")
	public void user_navigates_to_Revised_Fabric_Sheet() throws Throwable {
		RFSP.user_navigates_to_Revised_Fabric_Sheet();
	}
	@And("^click on Styles expansion$")
	public void click_on_Styles_expansion() throws Throwable {
		RFSP.click_on_Styles_expansion();
	}

	
	@And ("^Verify whether user is able to Select an IPO from the Menu list$")
	public void Verify_whether_user_is_able_to_Select_an_IPO_from_the_Menu_list() throws Throwable {
		RFSP.Verify_whether_user_is_able_to_Select_an_IPO_from_the_Menu_list();
	}

	@And("^click on clear filter icon$")
	public void click_on_clear_filter_icon() throws Throwable {
		RFSP.click_on_clear_filter_icon();
	}

	@And("^Click on buyer1 dropdown$")
	public void Click_on_buyer1_dropdown() throws Throwable {
		RFSP.Click_on_buyer1_dropdown();
	}

	@Then("^Select Buyer from dropdown list$")
	public void Select_Buyer_from_dropdown_lists() throws Throwable {
		RFSP.Select_Buyer_from_dropdown_lists();
	}
	@And ("^Click on buyer dropdown$")
	public void Click_on_buyer_dropdown() throws Throwable {
		RFSP.Click_on_buyer_dropdown();
	}
	@Given ("^Enter Buyer in search box$")
	public void Enter_Buyer_in_search_box() throws Throwable {
		RFSP.Enter_Buyer_in_search_box();
	}
	@Then ("^Click on the Seasons dropdown field$")
	public void Click_on_the_Seasons_dropdown_field() throws Throwable {
		RFSP.Click_on_the_Seasons_dropdown_field();
	}
	@And ("^Select a Season$")
	public void Select_a_Season() throws Throwable {
		RFSP.Select_a_Season();
	}
	@Then ("^Click in the Status dropdown field$")
	public void Click_in_the_Status_dropdown_field() throws Throwable {
		RFSP.Click_in_the_Status_dropdown_field();
	}
	@And ("^Select a Status$")
	public void Select_a_Status() throws Throwable {
		RFSP.Select_a_Status();
	}
	@Then ("^Enter an IPO name in the Search by Buyer Style or IPO textbox field$")
	public void Enter_an_IPO_name_in_the_Search_by_Buyer_Style_or_IPO_textbox_field() throws Throwable {
		RFSP.Enter_an_IPO_name_in_the_Search_by_Buyer_Style_or_IPO_textbox_field();
	}
	@And ("^Click on the Filt_Apply button$")
	public void Click_on_the_Filt_Apply_button() throws Throwable {
		RFSP.Click_on_the_Filt_Apply_button();
	}
	@Then ("^Click on Filter button$")
	public void Click_on_Filter_button() throws Throwable {
		RFSP.Click_on_Filter_button();
	}
	@Then ("^Verify whether data is getting cleared or not on OnClick the Reset button$")
	public void Verify_whether_data_is_getting_cleared_or_not_on_OnClick_the_Reset_button() throws Throwable {
		RFSP.Verify_whether_data_is_getting_cleared_or_not_on_OnClick_the_Reset_button();
	}
	@And ("^Verify whether the user is able to Select an IPO from the Menu list$")
	public void Verify_whether_the_user_is_able_to_Select_an_IPO_from_the_Menu_list() throws Throwable {
		RFSP.Verify_whether_the_user_is_able_to_Select_an_IPO_from_the_Menu_list();
	}
	@Then ("^Click on the Style ShowHide button for closing the menu list$")
	public void Click_on_the_Style_ShowHide_button_for_closing_the_menu_list() throws Throwable {
		RFSP.Click_on_the_Style_ShowHide_button_for_closing_the_menu_list();
	}
	@Then ("^Verify the count of the Fabric records under the Fabric Details grid$")
	public void Verify_the_count_of_the_Fabric_records_under_the_Fabric_Details_grid() throws Throwable {
		RFSP.Verify_the_count_of_the_Fabric_records_under_the_Fabric_Details_grid();
	}
	@And("^click on Add data button$")
	public void click_on_Add_data_button() throws Throwable {
		RFSP.click_on_Add_data_button();
	}
	@Then ("^Click on the Is Nominated textbox field$")
	public void Click_on_the_Is_Nominated_textbox_field() throws Throwable {
		RFSP.Click_on_the_Is_Nominated_textbox_field();
	}
	@And ("^Verify whether the Supplier Name field is changed to enbaled state or not$")
	public void Verify_whether_the_Supplier_Name_field_is_changed_to_enbaled_state_or_not() throws Throwable {
		RFSP.Verify_whether_the_Supplier_Name_field_is_changed_to_enbaled_state_or_not();
	}
	@Then ("^Click in the Supplier Name dropdown field$")
	public void Click_in_the_Supplier_Name_dropdown_field() throws Throwable {
		RFSP.Click_in_the_Supplier_Name_dropdown_field();
	}
	@Then ("^Select a Supplier from the dropdown field$")
	public void Select_a_Supplier_from_the_dropdown_field() throws Throwable {
		RFSP.Select_a_Supplier_from_the_dropdown_field();
	}
	@Then ("^Verify whether the user is able to select the Fabric Quality from the dropdown list in the Fabric Quality field$")
	public void Verify_whether_the_user_is_able_to_select_the_Fabric_Quality_from_the_dropdown_list_in_the_Fabric_Quality_field() throws Throwable {
		RFSP.Verify_whether_the_user_is_able_to_select_the_Fabric_Quality_from_the_dropdown_list_in_the_Fabric_Quality_field();
	}
	@And ("^Verify whether the Contetnt value is selected or not for the selected fabric$")
	public void Verify_whether_the_Contetnt_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_Contetnt_value_is_selected_or_not_for_the_selected_fabric();
	}
	@And ("^Verify whether the Count Construction value is selected or not for the selected fabric$")
	public void Verify_whether_the_Count_Construction_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_Count_Construction_value_is_selected_or_not_for_the_selected_fabric();
	}
	@And ("^Verify whether the GSM value is selected or not for the selected fabric$")
	public void Verify_whether_the_GSM_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_GSM_value_is_selected_or_not_for_the_selected_fabric();
	}
	@And ("^Verify whether the Cuttable Width value is selected or not for the selected fabric$")
	public void Verify_whether_the_Cuttable_Width_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_Cuttable_Width_value_is_selected_or_not_for_the_selected_fabric();
	}
	@And ("^Verify whether the Use value is selected or not for the selected fabric$")
	public void Verify_whether_the_Use_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_Use_value_is_selected_or_not_for_the_selected_fabric();
	}
	@And ("^Verify whether the Supplier Internal Code value is selected or not for the selected fabric$")
	public void Verify_whether_the_Supplier_Internal_Code_value_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_Supplier_Internal_Code_value_is_selected_or_not_for_the_selected_fabric();
	}
	@Given ("^Enter the data in the Finish Special Requirements textbox field$")
	public void Enter_the_data_in_the_Finish_Special_Requirements_textbox_field() throws Throwable {
		RFSP.Enter_the_data_in_the_Finish_Special_Requirements_textbox_field();
	}
	@And ("^Verify whether the Color is selected or not for the selected fabric$")
	public void Verify_whether_the_Color_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_Color_is_selected_or_not_for_the_selected_fabric();
	}
	@And ("^Verify whether the Applicable Combo is selected or not for the selected fabric$")
	public void Verify_whether_the_Applicable_Combo_is_selected_or_not_for_the_selected_fabric() throws Throwable {
		RFSP.Verify_whether_the_Applicable_Combo_is_selected_or_not_for_the_selected_fabric();
	}
	@Given ("^Enter the data in the Additional Information textbox field$")
	public void Enter_the_data_in_the_Additional_Information_textbox_field() throws Throwable {
		RFSP.Enter_the_data_in_the_Additional_Information_textbox_field();
	}
	@Given ("^Enter the data in the Additional percentage textbox field$")
	public void Enter_the_data_in_the_Additional_percentage_textbox_field() throws Throwable {
		RFSP.Enter_the_data_in_the_Additional_percentage_textbox_field();
	}
	@Given ("^Enter the data in the Missy Garment Avg textbox field$")
	public void Enter_the_data_in_the_Missy_Garment_Avg_textbox_field() throws Throwable {
		RFSP.Enter_the_data_in_the_Missy_Garment_Avg_textbox_field();
	}
	@Given ("^Enter the data in the Petite Garment Avg textbox field$")
	public void Enter_the_data_in_the_Petite_Garment_Avg_textbox_field() throws Throwable {
		RFSP.Enter_the_data_in_the_Petite_Garment_Avg_textbox_field();
	}
	@And ("^Verifying the Garment Average UOM dropdown field default value$")
	public void Verifying_the_Garment_Average_UOM_dropdown_field_default_value() throws Throwable {
		RFSP.Verifying_the_Garment_Average_UOM_dropdown_field_default_value();
	}
	@And ("^Verifying the Required UOM dropdown field default value$")
	public void Verifying_the_Required_UOM_dropdown_field_default_value() throws Throwable {
		RFSP.Verifying_the_Required_UOM_dropdown_field_default_value();
	}
	@And ("^Verifying the Cutting Wastage textbox field default value$")
	public void Verifying_the_Cutting_Wastage_textbox_field_default_value() throws Throwable {
		RFSP.Verifying_the_Cutting_Wastage_textbox_field_default_value();
	}
	@And ("^Verifying the Fabric Required For Cutting value$")
	public void Verifying_the_Fabric_Required_For_Cutting_value() throws Throwable {
		RFSP.Verifying_the_Fabric_Required_For_Cutting_value();
	}
	@Given ("^Enter the value in the Fabric Required For Sampling textbox field$")
	public void Enter_the_value_in_the_Fabric_Required_For_Sampling_textbox_field() throws Throwable {
		RFSP.Enter_the_value_in_the_Fabric_Required_For_Sampling_textbox_field();
	}
	@And ("^Verifying the Fabric Total Fabric Required value$")
	public void Verifying_the_Fabric_Total_Fabric_Required_value() throws Throwable {
		RFSP.Verifying_the_Fabric_Total_Fabric_Required_value();
	}
	@Then ("^Click on Submit button$")
	public void Click_on_Submit_button() throws Throwable {
		RFSP.Click_on_Submit_button();
	}
	@Then ("^Verify whether the page is navigated to the Revised Fabric Sheet$")
	public void Verify_whether_the_page_is_navigated_to_the_Revised_Fabric_Sheet() throws Throwable {
		RFSP.Verify_whether_the_page_is_navigated_to_the_Revised_Fabric_Sheet();
	}
	@Then ("^Click on Cancel button$")
	public void Click_on_Cancel_button() throws Throwable {
		RFSP.Click_on_Cancel_button();
	}
	@Then ("^Click on the Delete button for a Quality$")
	public void Click_on_the_Delete_button_for_a_Quality() throws Throwable {
		RFSP.Click_on_the_Delete_button_for_a_Quality();
	}
	@Then ("^Verify whether the Delete prompt msg is displayed or not$")
	public void Verify_whether_the_Delete_prompt_msg_is_displayed_or_not() throws Throwable {
		RFSP.Verify_whether_the_Delete_prompt_msg_is_displayed_or_not();
	}
	@Then ("^Click on the No option in the delete prompt$")
	public void Click_on_the_No_option_in_the_delete_prompt() throws Throwable {
		RFSP.Click_on_the_No_option_in_the_delete_prompt();
	}
	@Then ("^Verify whether the respective added Fabric record is deleted or not on clicking the Yes option$")
	public void Verify_whether_the_respective_added_Fabric_record_is_deleted_or_not_on_clicking_the_Yes_option() throws Throwable {
		RFSP.Verify_whether_the_respective_added_Fabric_record_is_deleted_or_not_on_clicking_the_Yes_option();
	}
	@When ("^Verify whether the page is navigating to the Updated page or not on clicking the Edit button$")
	public void Verify_whether_the_page_is_navigating_to_the_Updated_page_or_not_on_clicking_the_Edit_button() throws Throwable {
		RFSP.Verify_whether_the_page_is_navigating_to_the_Updated_page_or_not_on_clicking_the_Edit_button();
	}
	
	@Then ("^Click on the Submit to Fabric Team$")
	public void Click_on_the_Submit_to_Fabric_Team() throws Throwable {
		RFSP.Click_on_the_Submit_to_Fabric_Team();
	}
	@And ("^Verify whether the Upcharge Amount popup window is opened or not$")
	public void Verify_whether_the_Upcharge_Amount_popup_window_is_opened_or_not() throws Throwable {
		RFSP.Verify_whether_the_Upcharge_Amount_popup_window_is_opened_or_not();
	}
	@Then ("^Verify whether the validation msg is displayed when click on Submit with Null values$")
	public void Verify_whether_the_validation_msg_is_displayed_when_click_on_Submit_with_Null_values() throws Throwable {
		RFSP.Verify_whether_the_validation_msg_is_displayed_when_click_on_Submit_with_Null_values();
	}
	@Given ("^Enter the value in the Amount field$")
	public void Enter_the_value_in_the_Amount_field() throws Throwable {
		RFSP.Enter_the_value_in_the_Amount_field();
	}
	@Given ("^Enter the Remarks$")
	public void Enter_the_Remarks() throws Throwable {
		RFSP.Enter_the_Remarks();
	}
	@And ("^Click on the Submit button in the Upcharge window$")
	public void Click_on_the_Submit_button_in_the_Upcharge_window() throws Throwable {
		RFSP.Click_on_the_Submit_button_in_the_Upcharge_window();
	}
	@And ("^Verify and Update the Field values displayed in the fields$")
	public void Verify_and_Update_the_Field_values_displayed_in_the_fields() throws Throwable {
		RFSP.Verify_and_Update_the_Field_values_displayed_in_the_fields();
	}
	@And ("^Verify and Update the field value displayed in the Content field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Content_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Content_field();
	}
	@And ("^Verify and Update the field value displayed in the Count field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Count_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Count_field();
	}
	@And ("^Verify and Update the field value displayed in the GSM field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_GSM_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_GSM_field();
	}
	@And ("^Verify and Update the field value displayed in the Cuttable Width field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Cuttable_Width_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Cuttable_Width_field();
	}
	@And ("^Verify and Update the field value displayed in the Use field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Use_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Use_field();
	}
	@And ("^Verify and Update the field value displayed in the Color field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Color_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Color_field();
	}
	@And ("^Verify and Update the field value displayed in the Combo field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Combo_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Combo_field();
	}
	@And ("^Verify and Update the field value displayed in the Additional field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Additional_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Additional_field();
	}
	@And ("^Verify and Update the field value displayed in the Garment Avg field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Garment_Avg_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Garment_Avg_field();
	}
	@And ("^Verify and Update the field value displayed in the Fabric Required For Sampling field$")
	public void Verify_and_Update_the_field_value_displayed_in_the_Fabric_Required_For_Sampling_field() throws Throwable {
		RFSP.Verify_and_Update_the_field_value_displayed_in_the_Fabric_Required_For_Sampling_field();
	}
	@Then ("^Click on the Update button in the Update Fabric Sheet form$")
	public void Click_on_the_Update_button_in_the_Update_Fabric_Sheet_form() throws Throwable {
		RFSP.Click_on_the_Update_button_in_the_Update_Fabric_Sheet_form();
	}
	@Then ("^Verify whether the Import popup window is opened when clicked on the Import Fabric Details button$")
	public void Verify_whether_the_Import_popup_window_is_opened_when_clicked_on_the_Import_Fabric_Details_button() throws Throwable {
		RFSP.Verify_whether_the_Import_popup_window_is_opened_when_clicked_on_the_Import_Fabric_Details_button();
	}
	@And ("^Click on Close button in the Import popup window$")
	public void Click_on_Close_button_in_the_Import_popup_window() throws Throwable {
		RFSP.Click_on_Close_button_in_the_Import_popup_window();
	}

	@Then ("^Select the WithInIPO option in the Import window$")
	public void Select_the_WithInIPO_option_in_the_Import_window() throws Throwable {
		RFSP.Select_the_WithInIPO_option_in_the_Import_window();
	}
	@And ("^Verify whether Mandatory validation msg is displayed or not on Onclick the Import button without selecting any values$")
	public void Verify_whether_Mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_values() throws Throwable {
		RFSP.Verify_whether_Mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_values();
	}
	@Then ("^Verify whether the user is able to add the selected fabric on Importing$")
	public void Verify_whether_the_user_is_able_to_add_the_selected_fabric_on_Importing() throws Throwable {
		RFSP.Verify_whether_the_user_is_able_to_add_the_selected_fabric_on_Importing();
	}

	@Then ("^Select the OtherIPO option in the Import window$")
	public void Select_the_OtherIPO_option_in_the_Import_window() throws Throwable {
		RFSP.Select_the_OtherIPO_option_in_the_Import_window();
	}
	@And ("^Verify whether Mandatory validation msg is displayed or not on Onclick the Import button without selecting any value$")
	public void Verify_whether_Mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_value() throws Throwable {
		RFSP.Verify_whether_Mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_value();
	}
	@Then ("^Verify whether the user is able to select an IPO in the dropdown or not$")
	public void Verify_whether_the_user_is_able_to_select_an_IPO_in_the_dropdown_or_not() throws Throwable {
		RFSP.Verify_whether_the_user_is_able_to_select_an_IPO_in_the_dropdown_or_not();
	}
	@Then ("^Verify whether the Select Fabric field is displayed or not$")
	public void Verify_whether_the_Select_Fabric_field_is_displayed_or_not() throws Throwable {
		RFSP.Verify_whether_the_Select_Fabric_field_is_displayed_or_not();
	}
	@Then ("^Verify whether the user is able to add the selected fabric on Importing or not$")
	public void Verify_whether_the_user_is_able_to_add_the_selected_fabric_on_Importing_or_not() throws Throwable {
		RFSP.Verify_whether_the_user_is_able_to_add_the_selected_fabric_on_Importing_or_not();
	}

	@Then ("^Select the PDFDS option in the Import window$")
	public void Select_the_PDFDS_option_in_the_Import_window() throws Throwable {
		RFSP.Select_the_PDFDS_option_in_the_Import_window();
	}
	@And ("^Verify whether mandatory validation msg is displayed or not on Onclick the Import button without selecting any values$")
	public void Verify_whether_mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_values() throws Throwable {
		RFSP.Verify_whether_mandatory_validation_msg_is_displayed_or_not_on_Onclick_the_Import_button_without_selecting_any_values();
	}
	@Then ("^Verify whether the user is able to add the Selected Fabric on Importing$")
	public void Verify_whether_the_user_is_able_to_add_the_Selected_Fabric_on_Importing() throws Throwable {
		RFSP.Verify_whether_the_user_is_able_to_add_the_Selected_Fabric_on_Importing();
	}
	@Then ("^Verify whether the imported fabric is able to Submit to the Fabric Team or not$")
	public void Verify_whether_the_imported_fabric_is_able_to_Submit_to_the_Fabric_Team_or_not() throws Throwable {
		RFSP.Verify_whether_the_imported_fabric_is_able_to_Submit_to_the_Fabric_Team_or_not();
	}




}
