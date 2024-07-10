package Stepdefinition1;

<<<<<<< HEAD
import Pages.POForStockPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POForStockSteps {
	
	POForStockPages POS = new POForStockPages();
	
	
	@Then ("^Navigate to PO For Stock screen$")
	public void Navigate_to_PO_For_Stock_screen() throws Throwable {
		POS.Navigate_to_PO_For_Stock_screen();
	}
	@Then ("^Click on the Filter showhide button$")
	public void Click_on_the_Filter_showhide_button() throws Throwable {
		POS.Click_on_the_Filter_showhide_button();
	}
	
	@Given ("^Enter the Style name in Search By Style field$")
	public void Enter_the_Style_name_in_Search_By_Style_field() throws Throwable {
		POS.Enter_the_Style_name_in_Search_By_Style_field();
	}
	@When ("^Click on the Add Data Entry button$")
	public void Click_on_the_Add_Data_Entry_button() throws Throwable {
		POS.Click_on_the_Add_Data_Entry_button();
	}
	@Then ("^Verify whether the page is navigated to the Create PO For Stock or not$")
	public void Verify_whether_the_page_is_navigated_to_the_Create_PO_For_Stock_or_not() throws Throwable {
		POS.Verify_whether_the_page_is_navigated_to_the_Create_PO_For_Stock_or_not();
	}
	@Then ("^Verify the count of the PO Records in the PO grid before adding the PO record$")
	public void Verify_the_count_of_the_PO_Records_in_the_PO_grid_before_adding_the_PO_record() throws Throwable {
		POS.Verify_the_count_of_the_PO_Records_in_the_PO_grid_before_adding_the_PO_record();
	}
	@Then ("^Click on the Cancel button in the Print Preview form$")
	public void Click_on_the_Cancel_button_in_the_Print_Preview_form() throws Throwable {
		POS.Click_on_the_Cancel_button_in_the_Print_Preview_form();
	}
	@Then ("^Verify whether the page is navigated to the PO For Stock or not$")
	public void Verify_whether_the_page_is_navigated_to_the_PO_For_Stock_or_not() throws Throwable {
		POS.Verify_whether_the_page_is_navigated_to_the_PO_For_Stock_or_not();
	}
	@Then ("^Verify the count of the PO Records in the PO grid after adding the PO record$")
	public void Verify_the_count_of_the_PO_Records_in_the_PO_grid_after_adding_the_PO_record() throws Throwable {
		POS.Verify_the_count_of_the_PO_Records_in_the_PO_grid_after_adding_the_PO_record();
	}
	@Then ("^Verify whether the added PO record is added to the grid$")
	public void Verify_whether_the_added_PO_record_is_added_to_the_grid() throws Throwable {
		POS.Verify_whether_the_added_PO_record_is_added_to_the_grid();
	}
	@When ("^Click on the Cancel button for a combination stock record$")
	public void Click_on_the_Cancel_button_for_a_combination_stock_record() throws Throwable {
		POS.Click_on_the_Cancel_button_for_a_combination_stock_record();
	}
	@Then ("^Verify whether the Cancel toaster msg is displayed$")
	public void Verify_whether_the_Cancel_toaster_msg_is_displayed() throws Throwable {
		POS.Verify_whether_the_Cancel_toaster_msg_is_displayed();
	}
	@Then ("^Verify whether the respective record is not Cancelled on clicking the NO option$")
	public void Verify_whether_the_respective_record_is_not_Cancelled_on_clicking_the_NO_option() throws Throwable {
		POS.Verify_whether_the_respective_record_is_not_Cancelled_on_clicking_the_NO_option();
	}
	@When ("^Click on Yes option in the cancel toaster msg$")
	public void Click_on_Yes_option_in_the_cancel_toaster_msg() throws Throwable {
		POS.Click_on_Yes_option_in_the_cancel_toaster_msg();
	}
	@Then ("^Verify whether the Successfull msg is displayed or not$")
	public void Verify_whether_the_Successfull_msg_is_displayed_or_not() throws Throwable {
		POS.Verify_whether_the_Successfull_msg_is_displayed_or_not();
	}
	@And ("^Verify whether the Status is changed to Cancelled state under Status column$")
	public void Verify_whether_the_Status_is_changed_to_Cancelled_state_under_Status_column() throws Throwable {
		POS.Verify_whether_the_Status_is_changed_to_Cancelled_state_under_Status_column();
	}
	@When ("^Click on the Revise PO button$")
	public void Click_on_the_Revise_PO_button() throws Throwable {
		POS.Click_on_the_Revise_PO_button();
	}
	@And ("^Verify whether the page is navigated to Revised PO For Stock form$")
	public void Verify_whether_the_page_is_navigated_to_Revised_PO_For_Stock_form() throws Throwable {
		POS.Verify_whether_the_page_is_navigated_to_Revised_PO_For_Stock_form();
	}
	@Given ("^Update the Residual Shrinkage value$")
	public void Update_the_Residual_Shrinkage_value() throws Throwable {
		POS.Update_the_Residual_Shrinkage_value();
	}
	@Given ("^Update the Quantity value$")
	public void Update_the_Quantity_value() throws Throwable {
		POS.Update_the_Quantity_value();
	}
	@Then ("^Click on the Save button in the Revised PO For Stock form$")
	public void Click_on_the_Save_button_in_the_Revised_PO_For_Stock_form() throws Throwable {
		POS.Click_on_the_Save_button_in_the_Revised_PO_For_Stock_form();
	}
	@And ("^Verify whether page is navigated to PO For Stock screen$")
	public void Verify_whether_page_is_navigated_to_PO_For_Stock_screen() throws Throwable {
		POS.Verify_whether_page_is_navigated_to_PO_For_Stock_screen();
	}
	@Then ("^Print the PO Details section values$")
	public void Print_the_PO_Details_section_values() throws Throwable {
		POS.Print_the_PO_Details_section_values();
	}
	@When ("^Update the Delevery To field value$")
	public void Update_the_Delevery_To_field_value() throws Throwable {
		POS.Update_the_Delevery_To_field_value();
	}
	@Then ("^Print the Address and GSTIn field values$")
	public void Print_the_Address_and_GSTIn_field_values() throws Throwable {
		POS.Print_the_Address_and_GSTIn_field_values();
	}
	@Then ("^Print Supplier Details section values$")
	public void Print_Supplier_Details_section_values() throws Throwable {
		POS.Print_Supplier_Details_section_values();
	}
	@Then ("^Print the Process name$")
	public void Print_the_Process_name() throws Throwable {
		POS.Print_the_Process_name();
	}
	@Then ("^Print the Fabric Type and Name$")
	public void Print_the_Fabric_Type_and_Name() throws Throwable {
		POS.Print_the_Fabric_Type_and_Name();
	}
	@Then ("^Print Content, Count, GSM, Cuttable Width and Color field values$")
	public void Print_Content_Count_GSM_Cuttable_Width_and_Color_field_values() throws Throwable {
		POS.Print_Content_Count_GSM_Cuttable_Width_and_Color_field_values();
	}
	@Then ("^Print Original and Revised Qtys under the Quantity Details section$")
	public void Print_Original_and_Revised_Qtys_under_the_Quantity_Details_section() throws Throwable {
		POS.Print_Original_and_Revised_Qtys_under_the_Quantity_Details_section();
	}
	@Then ("^Verify the Process Loss, Qty Allowed, Currency, Rate and UOM field values$")
	public void Verify_the_Process_Loss_Qty_Allowed_Currency_Rate_and_UOM_field_values() throws Throwable {
		POS.Verify_the_Process_Loss_Qty_Allowed_Currency_Rate_and_UOM_field_values();
	}
	@Then ("^Click on the Sample field under the Stock Details grid$")
	public void Click_on_the_Sample_field_under_the_Stock_Details_grid() throws Throwable {
		POS.Click_on_the_Sample_field_under_the_Stock_Details_grid();
=======
import Page.POForStockPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POForStockSteps {
	
	POForStockPages POS = new POForStockPages();
	
	
	@Then ("^Navigate to PO For Stock screen$")
	public void Navigate_to_PO_For_Stock_screen() throws Throwable {
		POS.Navigate_to_PO_For_Stock_screen();
	}
	@Then ("^Click on the Filter showhide button$")
	public void Click_on_the_Filter_showhide_button() throws Throwable {
		POS.Click_on_the_Filter_showhide_button();
	}
	
	@Given ("^Enter the Style name in Search By Style field$")
	public void Enter_the_Style_name_in_Search_By_Style_field() throws Throwable {
		POS.Enter_the_Style_name_in_Search_By_Style_field();
	}
	@When ("^Click on the Add Data Entry button$")
	public void Click_on_the_Add_Data_Entry_button() throws Throwable {
		POS.Click_on_the_Add_Data_Entry_button();
	}
	@Then ("^Verify whether the page is navigated to the Create PO For Stock or not$")
	public void Verify_whether_the_page_is_navigated_to_the_Create_PO_For_Stock_or_not() throws Throwable {
		POS.Verify_whether_the_page_is_navigated_to_the_Create_PO_For_Stock_or_not();
	}
	@Then ("^Verify the count of the PO Records in the PO grid before adding the PO record$")
	public void Verify_the_count_of_the_PO_Records_in_the_PO_grid_before_adding_the_PO_record() throws Throwable {
		POS.Verify_the_count_of_the_PO_Records_in_the_PO_grid_before_adding_the_PO_record();
	}
	@Then ("^Click on the Cancel button in the Print Preview form$")
	public void Click_on_the_Cancel_button_in_the_Print_Preview_form() throws Throwable {
		POS.Click_on_the_Cancel_button_in_the_Print_Preview_form();
	}
	@Then ("^Verify whether the page is navigated to the PO For Stock or not$")
	public void Verify_whether_the_page_is_navigated_to_the_PO_For_Stock_or_not() throws Throwable {
		POS.Verify_whether_the_page_is_navigated_to_the_PO_For_Stock_or_not();
	}
	@Then ("^Verify the count of the PO Records in the PO grid after adding the PO record$")
	public void Verify_the_count_of_the_PO_Records_in_the_PO_grid_after_adding_the_PO_record() throws Throwable {
		POS.Verify_the_count_of_the_PO_Records_in_the_PO_grid_after_adding_the_PO_record();
	}
	@Then ("^Verify whether the added PO record is added to the grid$")
	public void Verify_whether_the_added_PO_record_is_added_to_the_grid() throws Throwable {
		POS.Verify_whether_the_added_PO_record_is_added_to_the_grid();
	}
	@When ("^Click on the Cancel button for a combination stock record$")
	public void Click_on_the_Cancel_button_for_a_combination_stock_record() throws Throwable {
		POS.Click_on_the_Cancel_button_for_a_combination_stock_record();
	}
	@Then ("^Verify whether the Cancel toaster msg is displayed$")
	public void Verify_whether_the_Cancel_toaster_msg_is_displayed() throws Throwable {
		POS.Verify_whether_the_Cancel_toaster_msg_is_displayed();
	}
	@Then ("^Verify whether the respective record is not Cancelled on clicking the NO option$")
	public void Verify_whether_the_respective_record_is_not_Cancelled_on_clicking_the_NO_option() throws Throwable {
		POS.Verify_whether_the_respective_record_is_not_Cancelled_on_clicking_the_NO_option();
	}
	@When ("^Click on Yes option in the cancel toaster msg$")
	public void Click_on_Yes_option_in_the_cancel_toaster_msg() throws Throwable {
		POS.Click_on_Yes_option_in_the_cancel_toaster_msg();
	}
	@Then ("^Verify whether the Successfull msg is displayed or not$")
	public void Verify_whether_the_Successfull_msg_is_displayed_or_not() throws Throwable {
		POS.Verify_whether_the_Successfull_msg_is_displayed_or_not();
	}
	@And ("^Verify whether the Status is changed to Cancelled state under Status column$")
	public void Verify_whether_the_Status_is_changed_to_Cancelled_state_under_Status_column() throws Throwable {
		POS.Verify_whether_the_Status_is_changed_to_Cancelled_state_under_Status_column();
	}
	@When ("^Click on the Revise PO button$")
	public void Click_on_the_Revise_PO_button() throws Throwable {
		POS.Click_on_the_Revise_PO_button();
	}
	@And ("^Verify whether the page is navigated to Revised PO For Stock form$")
	public void Verify_whether_the_page_is_navigated_to_Revised_PO_For_Stock_form() throws Throwable {
		POS.Verify_whether_the_page_is_navigated_to_Revised_PO_For_Stock_form();
>>>>>>> branch 'master' of https://github.com/BoyaAnilkumar/JivaAutomation.git
	}

}
