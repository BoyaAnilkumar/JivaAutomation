package Stepdefinition1;

import Page.CreatePOForStockPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePOForStockSteps {
	
	
	CreatePOForStockPage CPOFS = new CreatePOForStockPage();
	
	@Then ("^Navigate to Create PO For Stock screen$")
	public void Navigate_to_Create_PO_For_Stock_screen() throws Throwable {
		CPOFS.Navigate_to_Create_PO_For_Stock_screen();
	}
	
	@Then ("^Click and Select Order Type$")
	public void Click_and_Select_Order_Type() throws Throwable {
		CPOFS.Click_and_Select_Order_Type();
	}
	@Then ("^Verify whether current PO Date is displayed or not$")
	public void Verify_whether_current_PO_Date_is_displayed_or_not() throws Throwable {
		CPOFS.Verify_whether_current_PO_Date_is_displayed_or_not();
	}
	@Then ("^Verify whether the PO Number field value$")
	public void Verify_whether_the_PO_Number_field_value() throws Throwable {
		CPOFS.Verify_whether_the_PO_Number_field_value();
	}
	@And ("^Select a Buyer$")
	public void Select_a_Buyer() throws Throwable {
		CPOFS.Select_a_Buyer();
	}
	@Given ("^Enter the Style$")
	public void Enter_the_Style() throws Throwable {
		CPOFS.Enter_the_Style();
	}
	@When ("^Select a Delivery To factory name$")
	public void Select_a_Delivery_To_factory_name() throws Throwable {
		CPOFS.Select_a_Delivery_To_factory_name();
	}
	@Then ("^Verify whether the Delivery Factory Address is displayed or not$")
	public void Verify_whether_the_Delivery_Factory_Address_is_displayed_or_not() throws Throwable {
		CPOFS.Verify_whether_the_Delivery_Factory_Address_is_displayed_or_not();
	}
	@Then ("^Verify whether the Delivery Factory GST number is displayed or not$")
	public void Verify_whether_the_Delivery_Factory_GST_number_is_displayed_or_not() throws Throwable {
		CPOFS.Verify_whether_the_Delivery_Factory_GST_number_is_displayed_or_not();
	}
	@When ("^Select a Supplier name$")
	public void Select_a_Supplier_name() throws Throwable {
		CPOFS.Select_a_Supplier_name();
	}
	@Then ("^Verify whether the Supplier Address is displayed or not$")
	public void Verify_whether_the_Supplier_Address_is_displayed_or_not() throws Throwable {
		CPOFS.Verify_whether_the_Supplier_Address_is_displayed_or_not();
	}
	@Then ("^Verify whether the Supplier GST number is displayed or not$")
	public void Verify_whether_the_Supplier_GST_number_is_displayed_or_not() throws Throwable {
		CPOFS.Verify_whether_the_Supplier_GST_number_is_displayed_or_not();
	}
	@Then ("^Verify whether the Supplier Payment Terms are prepopulated or not$")
	public void Verify_whether_the_Supplier_Payment_Terms_are_prepopulated_or_not() throws Throwable {
		CPOFS.Verify_whether_the_Supplier_Payment_Terms_are_prepopulated_or_not();
	}
	@Then ("^Verify whether the user is able to edit the Payment Terms$")
	public void Verify_whether_the_user_is_able_to_edit_the_Payment_Terms() throws Throwable {
		CPOFS.Verify_whether_the_user_is_able_to_edit_the_Payment_Terms();
	}
	@Then ("^Verify whether the Supplier Delivery Terms are prepopulated or not$")
	public void Verify_whether_the_Supplier_Delivery_Terms_are_prepopulated_or_not() throws Throwable {
		CPOFS.Verify_whether_the_Supplier_Delivery_Terms_are_prepopulated_or_not();
	}
	@Then ("^Verify whether the user is able to edit the Delivery Terms$")
	public void Verify_whether_the_user_is_able_to_edit_the_Delivery_Terms() throws Throwable {
		CPOFS.Verify_whether_the_user_is_able_to_edit_the_Delivery_Terms();
	}
	@Given ("^Enter Lead Time value$")
	public void Enter_Lead_Time_value() throws Throwable {
		CPOFS.Enter_Lead_Time_value();
	}
	@Then ("^Select a Process for the selected Order Type$")
	public void Select_a_Process_for_the_selected_Order_Type() throws Throwable {
		CPOFS.Select_a_Process_for_the_selected_Order_Type();
	}
	@Then ("^Select a Fabric Type$")
	public void Select_a_Fabric_Type() throws Throwable {
		CPOFS.Select_a_Fabric_Type();
	}
	@Then ("^Select a Fabric Name$")
	public void Select_a_Fabric_Name() throws Throwable {
		CPOFS.Select_a_Fabric_Name();
	}
	@Then ("^Select a Content$")
	public void Select_a_Content() throws Throwable {
		CPOFS.Select_a_Content();
	}
	@Then ("^Select a Count_Counstruction$")
	public void Select_a_Count_Counstruction() throws Throwable {
		CPOFS.Select_a_Count_Counstruction();
	}
	@Then ("^Select a GSM$")
	public void Select_a_GSM() throws Throwable {
		CPOFS.Select_a_GSM();
	}
	@Then ("^Select a Cuttable Width$")
	public void Select_a_Cuttable_Width() throws Throwable {
		CPOFS.Select_a_Cuttable_Width();
	}
	@Then ("^Select a Color$")
	public void Select_a_Color() throws Throwable {
		CPOFS.Select_a_Color();
	}
	@When ("^Verify whether the Qty Required field is displaying 0 by default$")
	public void Verify_whether_the_Qty_Required_field_is_displaying_0_by_default() throws Throwable {
		CPOFS.Verify_whether_the_Qty_Required_field_is_displaying_0_by_default();
	}
	@Then ("^Verify whether the Qty Required field is displaying the entered qty or not$")
	public void Verify_whether_the_Qty_Required_field_is_displaying_the_entered_qty_or_not() throws Throwable {
		CPOFS.Verify_whether_the_Qty_Required_field_is_displaying_the_entered_qty_or_not();
	}
	@Given ("^Enter Residual Shrinkage value$")
	public void Enter_Residual_Shrinkage_value() throws Throwable {
		CPOFS.Enter_Residual_Shrinkage_value();
	}
	@Given ("^Enter Process Loss value$")
	public void Enter_Process_Loss_value() throws Throwable {
		CPOFS.Enter_Process_Loss_value();
	}
	@And ("^Verify whether by default 3 is displayed in the Qty Allowed field$")
	public void Verify_whether_by_default_3_is_displayed_in_the_Qty_Allowed_field() throws Throwable {
		CPOFS.Verify_whether_by_default_3_is_displayed_in_the_Qty_Allowed_field();
	}
	@Given ("^Verify whether the user is able to change the value$")
	public void Verify_whether_the_user_is_able_to_change_the_value() throws Throwable {
		CPOFS.Verify_whether_the_user_is_able_to_change_the_value();
	}
	@Then ("^Select a Currency$")
	public void Select_a_Currency() throws Throwable {
		CPOFS.Select_a_Currency();
	}
	@Given ("^Enter Rate value$")
	public void Enter_Rate_value() throws Throwable {
		CPOFS.Enter_Rate_value();
	}
	@Then ("^Select an UOM$")
	public void Select_an_UOM() throws Throwable {
		CPOFS.Select_an_UOM();
	}
	@Given ("^Enter remarks in the L - Short If Any field$")
	public void Enter_remarks_in_the_L_Short_If_Any_field() throws Throwable {
		CPOFS.Enter_remarks_in_the_L_Short_If_Any_field();
	}
	@Given ("^Enter remarks in the Addl. Information 1 field$")
	public void Enter_remarks_in_the_Addl_Information_1_field() throws Throwable {
		CPOFS.Enter_remarks_in_the_Addl_Information_1_field();
	}
	@Given ("^Enter remarks in the Addl. Information 2 field$")
	public void Enter_remarks_in_the_Addl_Information_2_field() throws Throwable {
		CPOFS.Enter_remarks_in_the_Addl_Information_2_field();
	}
	@Then ("^Verify the DueOn Date value$")
	public void Verify_the_DueOn_Date_value() throws Throwable {
		CPOFS.Verify_the_DueOn_Date_value();
	}
	@Given ("^Enter the Quantity of the Fabric$")
	public void Enter_the_Quantity_of_the_Fabric() throws Throwable {
		CPOFS.Enter_the_Quantity_of_the_Fabric();
	}
	@Then ("^Click on the Reset button in the Create PO For Stock screen$")
	public void Click_on_Reset_button_in_the_Create_PO_For_Stock_screen() throws Throwable {
		CPOFS.Click_on_Reset_button_in_the_Create_PO_For_Stock_screen();
	}
	@Then ("^Click on Save button in the Create PO For Stock screen$")
	public void Click_on_Save_button_in_the_Create_PO_For_Stock_screen() throws Throwable {
		CPOFS.Click_on_Save_button_in_the_Create_PO_For_Stock_screen();
	}
	

}
