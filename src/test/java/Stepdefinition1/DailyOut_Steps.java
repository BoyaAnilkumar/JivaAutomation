package Stepdefinition1;

import Page.DailyOut_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DailyOut_Steps {
	
	DailyOut_page DO = new DailyOut_page();
	
	
	@Then ("^Navigate to the Daily Out Data Entry screen$")
	public void Navigate_to_the_Daily_Out_Data_Entry_screen() throws Throwable {
		DO.Navigate_to_the_Daily_Out_Data_Entry_screen();
	}
	@And ("^Verify whether the page is navigated to the Add Daily Out Data Entry form$")
	public void Verify_whether_the_page_is_navigated_to_the_Add_Daily_Out_Data_Entry_form() throws Throwable {
		DO.Verify_whether_the_page_is_navigated_to_the_Add_Daily_Out_Data_Entry_form();
	}
	@And ("^Verify whether the page is navigated to the Daily Out Data Entry screen$")
	public void Verify_whether_the_page_is_navigated_to_the_Daily_Out_Data_Entry_screen() throws Throwable {
		DO.Verify_whether_the_page_is_navigated_to_the_Daily_Out_Data_Entry_screen();
	}
	@Then ("^Verify and print the mandatory validation msg$")
	public void Verify_and_print_the_mandatory_validation_msg() throws Throwable {
		DO.Verify_and_print_the_mandatory_validation_msg();
	}
	@Then ("^Click on Cancel button in Add form$")
	public void Click_on_Cancel_button_in_Add_form() throws Throwable {
		DO.Click_on_Cancel_button_in_Add_form();
	}
	@And ("^Click on the Save button in the Add form$")
	public void Click_on_the_Save_button_in_the_Add_form() throws Throwable {
		DO.Click_on_the_Save_button_in_the_Add_form();
	}
	@Given ("^Enter the data in all the field in the Add Daily Out form$")
	public void Enter_the_data_in_all_the_field_in_the_Add_Daily_Out_form() throws Throwable {
		DO.Enter_the_data_in_all_the_field_in_the_Add_Daily_Out_form();
	}
	@Then ("^Click on the Save button in the Add Daily Out form$")
	public void Click_on_the_Save_button_in_the_Add_Daily_Out_form() throws Throwable {
		DO.Click_on_the_Save_button_in_the_Add_Daily_Out_form();
	}
	@Then ("^Verify the successful save msg$")
	public void Verify_the_successful_save_msg() throws Throwable {
		DO.Verify_the_successful_save_msg();
	}
	 @And ("^Verify whether the Date field is holding previous date bydefault$")
	 public void Verify_whether_the_Date_field_is_holding_previous_date_bydefault() throws Throwable {
		 DO.Verify_whether_the_Date_field_is_holding_previous_date_bydefault();
	 }
	 @And ("^Check the date in the Date field$")
	 public void Check_the_date_in_the_Date_field() throws Throwable {
		 DO.Check_the_date_in_the_Date_field();
	 }
	 @Given ("^Enter the Challan no$")
	 public void Enter_the_Challan_no() throws Throwable {
		 DO.Enter_the_Challan_no();
	 }
	 @When ("^Select the Supplier Party name$")
	 public void Select_the_Supplier_Party_name() throws Throwable {
		 DO.Select_the_Supplier_Party_name();
	 }
	 @Then ("^Verify whether the fields enabled status$")
	 public void Verify_whether_the_fields_enabled_status() throws Throwable {
		 DO.Verify_whether_the_fields_enabled_status();
	 }
	 @Given ("^Enter the PO no and select a PO$")
	 public void Enter_the_PO_no_and_select_a_PO() throws Throwable {
		 DO.Enter_the_PO_no_and_select_a_PO();
	 }
	 @Then ("^Verify whether the data is prepoulating in the fields$")
	 public void Verify_whether_the_data_is_prepoulating_in_the_fields() throws Throwable {
		 DO.Verify_whether_the_data_is_prepoulating_in_the_fields();
	 }
	 @When ("^Select a Factory in the From Location and verify Thaan Wise Information data is displayed$")
	 public void Select_a_Factory_in_the_From_Location_and_verify_Thaan_Wise_Information_data_is_displayed() throws Throwable {
		 DO.Select_a_Factory_in_the_From_Location_and_verify_Thaan_Wise_Information_data_is_displayed();
	 }
	 @Then ("^Select the Thaans and Qty in the Thaan Wise Information grid$")
	 public void Select_the_Thaans_and_Qty_in_the_Thaan_Wise_Information_grid() throws Throwable {
		 DO.Select_the_Thaans_and_Qty_in_the_Thaan_Wise_Information_grid();
	 }
	 @Then ("^Check the No of Thaans and Qty field values$")
	 public void Check_the_No_of_Thaans_and_Qty_field_values() {
		 DO.Check_the_No_of_Thaans_and_Qty_field_values();
	 }
	 @When ("^Click on Edit Data Entry button$")
	 public void Click_on_Edit_Data_Entry_button() throws Throwable {
		 DO.Click_on_Edit_Data_Entry_button();
	 }
	 @Then ("^Verify whether the page is navigated to the Updated Daily Out form$")
	 public void Verify_whether_the_page_is_navigated_to_the_Updated_Daily_Out_form() throws Throwable {
		 DO.Verify_whether_the_page_is_navigated_to_the_Updated_Daily_Out_form();
	 }
	 @Then ("^Verify whether the data is displaying correctly in all the fields$")
	 public void Verify_whether_the_data_is_displaying_correctly_in_all_the_fields() throws Throwable {
		 DO.Verify_whether_the_data_is_displaying_correctly_in_all_the_fields();
	 }
	 @Given ("^Click on the Add button in the Thaan Wise Information grid$")
	 public void Click_on_the_Add_button_in_the_Thaan_Wise_Information_grid() throws Throwable {
		 DO.Click_on_the_Add_button_in_the_Thaan_Wise_Information_grid();
	 }
	 @Given ("^Enter the Custom Qty value$")
	 public void Enter_the_Custom_Qty_value() throws Throwable {
		 DO.Enter_the_Custom_Qty_value();
	 }
	 @Then ("^Verify the successful Update msg$")
	 public void Verify_the_successful_Update_msg() throws Throwable {
		 DO.Verify_the_successful_Update_msg();
	 }
	 @Then ("^Click on the Update button in the Update Daily Out form$")
	 public void Click_on_the_Update_button_in_the_Update_Daily_Out_form() throws Throwable {
		 DO.Click_on_the_Update_button_in_the_Update_Daily_Out_form();
	 }
	 @Then ("^Click on the Delete button in the Thaan Wise Info grid$")
	 public void Click_on_the_Delete_button_in_the_Thaan_Wise_Info_grid() throws Throwable {
		 DO.Click_on_the_Delete_button_in_the_Thaan_Wise_Info_grid();
	 }
	 @Then ("^Print a msg on deleting the Added sub thaan$")
	 public void Print_a_msg_on_deleting_the_Added_sub_thaan() {
		 DO.Print_a_msg_on_deleting_the_Added_sub_thaan();
	 }
	 @Then ("^Click on the Delete button in the Daily Out screen$")
	 public void Click_on_the_Delete_button_in_the_Daily_Out_screen() throws Throwable {
		 DO.Click_on_the_Delete_button_in_the_Daily_Out_screen();
	 }
	 @Then ("^Print the Succesful Delete message in Daily Out$")
	 public void Print_the_Succesful_Delete_message_in_Daily_Out() throws Throwable {
		 DO.Print_the_Succesful_Delete_message_in_Daily_Out();
	 }
	 @Then ("^Click on the Approve button for a record$")
	 public void Click_on_the_Approve_button_for_a_record() throws Throwable {
		 DO.Click_on_the_Approve_button_for_a_record();
	 }
	 @Then ("^Verify whether the Approved popup window is displayed$")
	 public void Verify_whether_the_Approved_popup_window_is_displayed() throws Throwable {
		 DO.Verify_whether_the_Approved_popup_window_is_displayed();
	 }
	 @Then ("^Click on the No option in the Approved msg$")
	 public void Click_on_the_No_option_in_the_Approved_msg() throws Throwable {
		 DO.Click_on_the_No_option_in_the_Approved_msg();
	 }
	 @Then ("^Click on the Yes option in the Approved msg$")
	 public void Click_on_the_Yes_option_in_the_Approved_msg() throws Throwable {
		 DO.Click_on_the_Yes_option_in_the_Approved_msg();
	 }
	 @Then ("^Verify the Gate Entry Number popup msg$")
	 public void Verify_the_Gate_Entry_Number_popup_msg() {
		 DO.Verify_the_Gate_Entry_Number_popup_msg();
	 }
	 @When ("^Click on the Save button in the Gate Entry Number popup msg$")
	 public void Click_on_the_Save_button_in_the_Gate_Entry_Number_popup_msg() throws Throwable {
		 DO.Click_on_the_Save_button_in_the_Gate_Entry_Number_popup_msg();
	 }
	 @Then ("^Verify the mandatory validation msg$")
	 public void Verify_the_mandatory_validation_msg() throws Throwable {
		 DO.Verify_the_mandatory_validation_msg() ;
	 }
	@Given ("^Enter the Gate Entry Number$")
	public void Enter_the_Gate_Entry_Number() throws Throwable {
		DO.Enter_the_Gate_Entry_Number();
	}
	@Then ("^Print the Succesful Approve msg$")
	public void Print_the_Succesful_Approve_msg() throws Throwable {
		DO.Print_the_Succesful_Approve_msg();
	}
	@Then ("^Click on the Close button in the Gate entry window$")
	public void Click_on_the_Close_button_in_the_Gate_entry_window() throws Throwable {
		DO.Click_on_the_Close_button_in_the_Gate_entry_window();
	}
	@Then ("^Click on Print button$")
	public void Click_on_Print_button() throws Throwable {
		DO.Click_on_Print_button();
	}
	@Then ("^Verify whether the page is navigated to the Print form$")
	public void Verify_whether_the_page_is_navigated_to_the_Print_form() throws Throwable {
		DO.Verify_whether_the_page_is_navigated_to_the_Print_form();
	}
	@Then ("^Verify and print the data displayed in the Print form$")
	public void Verify_and_print_the_data_displayed_in_the_Print_form() throws Throwable {
		DO.Verify_and_print_the_data_displayed_in_the_Print_form();
	}
	@Then ("^Click on the Close button in the Print form$")
	public void Click_on_the_Close_button_in_the_Print_form() throws Throwable {
		DO.Click_on_the_Close_button_in_the_Print_form();
	}
	@When ("^Select the Assigned Stock as Party name$")
	public void Select_the_Assigned_Stock_as_Party_name() throws Throwable {
		DO.Select_the_Assigned_Stock_as_Party_name();
	}
	@Then ("^Select an Applicable IPO$")
	public void Select_an_Applicable_IPO() throws Throwable {
		DO.Select_an_Applicable_IPO();
	}
	@Then ("^Select a Fabric for the selected IPO$")
	public void Select_a_Fabric_for_the_selected_IPO() throws Throwable {
		DO.Select_a_Fabric_for_the_selected_IPO();
	}
	@Then ("^Select a Color for the selected IPO$")
	public void Select_a_Color_for_the_selected_IPO() throws Throwable {
		DO.Select_a_Color_for_the_selected_IPO();
	}
	@Then ("^Select a Process Name for the selected IPO$")
	public void Select_a_Process_Name_for_the_selected_IPO() throws Throwable {
		DO.Select_a_Process_Name_for_the_selected_IPO();
	}
	@And ("^Print the Content for the selected Fabric$")
	public void Print_the_Content_for_the_selected_Fabric() throws Throwable {
		DO.Print_the_Content_for_the_selected_Fabric();
	}
	@And ("^Print the Count Construction for the selected Fabric$")
	public void Print_the_Count_Construction_for_the_selected_Fabric() throws Throwable {
		DO.Print_the_Count_Construction_for_the_selected_Fabric();
		
	}
	@And ("^Print the GSM for the selected Fabric$")
	public void Print_the_GSM_for_the_selected_Fabric() throws Throwable {
		DO.Print_the_GSM_for_the_selected_Fabric();
	}
	@And ("^Print the Cuttable Width for the selected Fabric$")
	public void Print_the_Cuttable_Width_for_the_selected_Fabric() throws Throwable {
		DO.Print_the_Cuttable_Width_for_the_selected_Fabric();
	}
	@Then ("^Select UOM value for the selected Fabric$")
	public void Select_UOM_value_for_the_selected_Fabric() throws Throwable {
		DO.Select_UOM_value_for_the_selected_Fabric();
	}
	@Given ("^Enter Rate for the selected Fabric$")
	public void Enter_Rate_for_the_selected_Fabric() throws Throwable {
		DO.Enter_Rate_for_the_selected_Fabric();
	}
	@Then ("^Select a From Location and print for the selected party$")
	public void Select_a_From_Location_and_print_for_the_selected_party() throws Throwable {
		DO.Select_a_From_Location_and_print_for_the_selected_party();
	}
	@Then ("^Select a To Location and print for the selected party$")
	public void Select_a_To_Location_and_print_for_the_selected_party() throws Throwable {
		DO.Select_a_To_Location_and_print_for_the_selected_party();
	}
	@Given ("^Enter Remarks for the selected party$")
	public void Enter_Remarks_for_the_selected_party() throws Throwable {
		DO.Enter_Remarks_for_the_selected_party();
	}
	@Then ("^Select the Thaans in the Thaan Wise Information grid for the selected party$")
	public void Select_the_Thaans_in_the_Thaan_Wise_Information_grid_for_the_selected_party() throws Throwable {
		DO.Select_the_Thaans_in_the_Thaan_Wise_Information_grid_for_the_selected_party();
	}
	@Then ("^Verify whether the Thaan are displayed for the selected factory$")
	public void Verify_whether_the_Thaan_are_displayed_for_the_selected_factory() throws Throwable {
		DO.Verify_whether_the_Thaan_are_displayed_for_the_selected_factory();
	}
	

}
