package Stepdefinition1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StylePODetails {

	Page.StylePO_Pages StylePO_Pages = new Page.StylePO_Pages();
	
	
	   @And ("^Click on the Style Po Details Screen$")
	   public void Click_on_the_Style_Po_Details_Screen() throws Throwable{
		   StylePO_Pages.Click_on_the_Style_Po_Details_Screen();
	   }
	   @And ("^Verify whether the Style Po details screen is displaying or not$")
	   public void Verify_whether_the_Style_Po_details_screen_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_whether_the_Style_Po_details_screen_is_displaying_or_not();
	   }
	   @And ("^Verify the IPO name is displaying or not$")
	   public void Verify_the_IPO_name_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_IPO_name_is_displaying_or_not();
	   }
	   @And ("^Verify the Style name is displaying or not$")
	   public void Verify_the_Style_name_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_Style_name_is_displaying_or_not();
	   } 
	   @And ("^Verify the Buyer name is displaying or not$")
	   public void Verify_the_Buyer_name_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_Buyer_name_is_displaying_or_not();
	   }
	   @And ("^Verify the Season name is displaying or not$")
	   public void Verify_the_Season_name_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_Season_name_is_displaying_or_not();
	   }
	   @And ("^Verify the PO Qty Value is displaying or not$")
	   public void Verify_the_PO_Qty_Value_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_PO_Qty_Value_is_displaying_or_not();
	   }
	   @And ("^Verify the Combination names are displaying or not$")
	   public void Verify_the_Combination_names_are_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_Combination_names_are_displaying_or_not();
	   }
	   @And ("^Verify the Garment Size Type names are displaying or not$")
	   public void Verify_the_Garment_Size_Type_names_are_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_Garment_Size_Type_names_are_displaying_or_not();
	   }
	   
	   @And ("^Click on the Add New PO button$")
	   public void Click_on_the_Add_New_PO_button() throws Throwable{
		   StylePO_Pages.Click_on_the_Add_New_PO_button();
	   }
	   @Given ("^Enter the data in PO field$")
	   public void Enter_the_data_in_PO_field() throws Throwable{
		   StylePO_Pages.Enter_the_data_in_PO_field();
	   }
	   @Then ("^Select the PO details$")
	   public void Select_the_PO_details() throws Throwable{
		   StylePO_Pages.Select_the_PO_details();
	   }
	   @And ("^Enter the data in PO Qty field$")
	   public void Enter_the_data_in_PO_Qty_field() throws Throwable{
		   StylePO_Pages.Enter_the_data_in_PO_Qty_field();
	   }
	   @And ("^Enter the data in Shortage Allowed$")
	   public void Enter_the_data_in_Shortage_Allowed() throws Throwable{
		   StylePO_Pages.Enter_the_data_in_Shortage_Allowed();
	   }
	   @And ("^Enter the data in Addl Shipment Allowed field$")
	   public void Enter_the_data_in_Addl_Shipment_Allowed_field() throws Throwable{
		   StylePO_Pages.Enter_the_data_in_Addl_Shipment_Allowed_field();
	   }
	   @And("^The User enter the data in Shipment Priority field$")
	   public void The_User_enter_the_data_in_Shipment_Priority_field() throws Throwable{
		   StylePO_Pages.The_User_enter_the_data_in_Shipment_Priority_field();
	   }
	   @And ("^Select the Combination$")
	   public void Select_the_Combination() throws Throwable{
		   StylePO_Pages.Select_the_Combination();
	   }
	   @And ("^Select the Garment size type$")
	   public void Select_the_Garment_size_type() throws Throwable{
		   StylePO_Pages.Select_the_Garment_size_type();
	   }
	   @And ("^Select the Ex factory date$")
	   public void Select_the_Ex_factory_date() throws Throwable{
		   StylePO_Pages.Select_the_Ex_factory_date();
	   }
	   @And ("^Verify the data is displaying in the Days Kept In Hand field or not$")
	   public void Verify_the_data_is_displaying_in_the_Days_Kept_In_Hand_field_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_data_is_displaying_in_the_Days_Kept_In_Hand_field_or_not();
	   }
	   @And ("^Verify the data is prepopulated in the Ex Factory For Production field or not$")
	   public void Verify_the_data_is_prepopulated_in_the_Ex_Factory_For_Production_field_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_data_is_prepopulated_in_the_Ex_Factory_For_Production_field_or_not();
	   }
	   @And ("^Select the Requested Ex Factory field$")
	   public void Select_the_Requested_Ex_Factory_field() throws Throwable{
		   StylePO_Pages.Select_the_Requested_Ex_Factory_field();
	   }
	   @And ("^Select the Handover Date$")
	   public void Select_the_Handover_Date() throws Throwable{
		   StylePO_Pages.Select_the_Handover_Date();
	   }
	   @And ("^Select the Mode Data$")
	   public void Select_the_Mode_Data() throws Throwable{
		   StylePO_Pages.Select_the_Mode_Data();
	   }
	   @And ("^User Enter the data in data in Comments field$")
	   public void User_Enter_the_data_in_data_in_Comments_field() throws Throwable{
		   StylePO_Pages.User_Enter_the_data_in_data_in_Comments_field();
	   }
	   
	   @And ("^Enter Size breakups Qty$")
	   public void Enter_Size_breakups_Qty() throws Throwable{
		   StylePO_Pages.Enter_Size_breakups_Qty();
	   }
	   @And ("^Click on the Cancel Button$")
	   public void Click_on_the_Cancel_Button() throws Throwable{
		   StylePO_Pages.Click_on_the_Cancel_Button();
	   }
	   @And ("^Click on the Submit Button$")
	   public void Click_on_the_Submit_Button() throws Throwable{
		   StylePO_Pages.Click_on_the_Submit_Button();
	   }
	   @And ("^Verify whether the Validation msg is displaying or not$")
	   public void Verify_whether_the_Validation_msg_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_whether_the_Validation_msg_is_displaying_or_not();
	   }
	   @And ("^Click on the Edit icon$")
	   public void Click_on_the_Edit_icon() throws Throwable{
		   StylePO_Pages.Click_on_the_Edit_icon();
	   }
	   @And ("^Verify the Update PO Form is displaying or not$")
	   public void Verify_the_Update_PO_Form_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_Update_PO_Form_is_displaying_or_not();
	   }
	   @And ("^Update the PO details$")
	   public void Update_the_PO_details() throws Throwable{
		   StylePO_Pages.Update_the_PO_details();
	   }
	   @And ("^Update the Combo and Garment Size details$")
	   public void Update_the_Combo_and_Garment_Size_details() throws Throwable{
		   StylePO_Pages.Update_the_Combo_and_Garment_Size_details();
	   }
	   @And ("^Update the Exfactory details$")
	   public void Update_the_Exfactory_details() throws Throwable{
		   StylePO_Pages.Update_the_Exfactory_details();
	   }
	   @And ("^Update the Handover details$")
	   public void Update_the_Handover_details() throws Throwable{
		   StylePO_Pages.Update_the_Handover_details();
	   }
	   @And ("^Update the PO Size wise details$")
	   public void Update_the_PO_Size_wise_details() throws Throwable{
		   StylePO_Pages.Update_the_PO_Size_wise_details();
	   }
	     
	   @And ("^Click on the Update form Cancel Button$")
	   public void Click_on_the_Update_form_Cancel_Button() throws Throwable{
		   StylePO_Pages.Click_on_the_Update_form_Cancel_Button();
	   }
	   @And ("^Click on the Update form Submit button$")
	   public void Click_on_the_Update_form_Submit_button() throws Throwable{
		   StylePO_Pages.Click_on_the_Update_form_Submit_button();
	   }
	   @And ("^Verify whether the update Validation msg is displaying or not$")
	   public void Verify_whether_the_update_Validation_msg_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_whether_the_update_Validation_msg_is_displaying_or_not();
	   }
	   
	   @And ("^Click on the Delete icon$")
	   public void Click_on_the_Delete_icon() throws Throwable{
		   StylePO_Pages.Click_on_the_Delete_icon();
	   }
	   @And ("^Click on the View Comments Icon$")
	   public void Click_on_the_View_Comments_Icon() throws Throwable{
		   StylePO_Pages.Click_on_the_View_Comments_Icon();
	   }
	   @And ("^Verify the Entered Comments are displaying or not$")
	   public void Verify_the_Entered_Comments_are_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_Entered_Comments_are_displaying_or_not();
	   }
	   @And ("^Click on the Comments Close button$")
	   public void Click_on_the_Comments_Close_button() throws Throwable{
		   StylePO_Pages.Click_on_the_Comments_Close_button();
	   }
	   @And ("^Check the PO Summary grid is displaying or not$")
	   public void Check_the_PO_Summary_grid_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Check_the_PO_Summary_grid_is_displaying_or_not();
	   } 
	   @And ("^Verify the PO Summary grid header section columnn names are displaying or not$")
	   public void Verify_the_PO_Summary_grid_header_section_columnn_names_are_displaying_or_not() throws Throwable{
		   StylePO_Pages.Verify_the_PO_Summary_grid_header_section_columnn_names_are_displaying_or_not();
	   }
	   @And ("^Check the PO Size wise details Grid is displaying or not$")
	   public void Check_the_PO_Size_wise_details_Grid_is_displaying_or_not() throws Throwable{
		   StylePO_Pages.Check_the_PO_Size_wise_details_Grid_is_displaying_or_not();
	   }
	   
}