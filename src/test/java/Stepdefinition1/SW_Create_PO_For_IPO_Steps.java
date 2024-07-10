package Stepdefinition1;

import Page.SW_Create_PO_For_IPO_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SW_Create_PO_For_IPO_Steps {
	SW_Create_PO_For_IPO_Page Sw_Create_Po = new SW_Create_PO_For_IPO_Page();
	
	
	@And ("^Click on the Generate PO dropdown$")
	public void Click_on_the_Generate_PO_dropdown() throws Throwable {
		Sw_Create_Po.Click_on_the_Generate_PO_dropdown();
	}
	@And ("^Click on the Create PO For IPO Screen$") 
	public void Click_on_the_Create_PO_For_IPO_Screen() throws Throwable {
		Sw_Create_Po.Click_on_the_Create_PO_For_IPO_Screen();
	}
	@And ("^The Create PO For IPO Screen is displayed or not$")
	public void The_Create_PO_For_IPO_Screen_is_displayed_or_not() throws Throwable {
		Sw_Create_Po.The_Create_PO_For_IPO_Screen_is_displayed_or_not();
	}
	@And ("^Click on the Yarn Sourcing Data Entry dropdown$")
	public void Click_on_the_Yarn_Sourcing_Data_Entry_dropdown() throws Throwable {
		Sw_Create_Po.Click_on_the_Yarn_Sourcing_Data_Entry_dropdown();
	}
	@And ("Select the {string} of Order")
	public void Select_the_of_Order(String Type) throws Throwable {
		Sw_Create_Po.Select_the_of_Order(Type);
	}
	@And ("^Check the Current date is displayed in the PO Date field or not$")
	public void Check_the_Current_date_is_displayed_in_the_PO_Date_field_or_not() throws Throwable {
		Sw_Create_Po.Check_the_Current_date_is_displayed_in_the_PO_Date_field_or_not();
	}
	@And ("^The PO number is prepopulated or not$")
	public void The_PO_number_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_PO_number_is_prepopulated_or_not();
	}
	@And ("Search the {string} and Select the Deliver in dropdown list")
	public void Search_the_and_Select_the_Deliver_in_dropdown_list(String Deliver) throws Throwable {
		Sw_Create_Po.Search_the_and_Select_the_Deliver_in_dropdown_list(Deliver);
	}
	@And ("^The Deliver Address is prepopulated or not$")
	public void The_Deliver_Address_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Deliver_Address_is_prepopulated_or_not();
	}
	@Then ("^The Deliver GSTIN number is prepopulated or not$")
	public void The_Deliver_GSTIN_number_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Deliver_GSTIN_number_is_prepopulated_or_not();
	}
	@And ("Search the {string} and Select the Supplier in dropdown list")
	public void Search_the_Select_the_Supplier_in_dropdown_list(String Supplier) throws Throwable {
		Sw_Create_Po.Search_the_Select_the_Supplier_in_dropdown_list(Supplier);
	}
	@And ("^The Supplier Address is prepopulated or not$")
	public void The_Supplier_Address_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Supplier_Address_is_prepopulated_or_not();
	}
	@Then ("^The Supplier GSTIN number is prepopulated or not$")
	public void The_Supplier_GSTIN_number_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Supplier_GSTIN_number_is_prepopulated_or_not();
	}
	@And ("^Payment Terms are prepopulated or not$")
	public void Payment_Terms_are_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.Payment_Terms_are_prepopulated_or_not();
	}
	@And ("^The Delivery Terms are prepopulated or not$")
	public void The_Delivery_Terms_are_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Delivery_Terms_are_prepopulated_or_not();
	}
	@Given ("Enter the data in the Lead Time{string} field")
	public void Enter_the_data_in_the_Lead_Time_field(String Days) throws Throwable {
		Sw_Create_Po.Enter_the_data_in_the_Lead_Time_field(Days);
	}
	@And ("Select the Yarn{string}")
	public void Select_the_Yarn(String Process) throws Throwable {
		Sw_Create_Po.Select_the_Yarn(Process);
	}
	@And ("Select the {string} in the Yarn details section")
	public void Select_the_in_the_Yarn_details_section(String Color) throws Throwable {
		Sw_Create_Po.Select_the_in_the_Yarn_details_section(Color);
	}
	@And ("^Enter the data in Qty Allowed field$")
	public void Enter_the_data_in_Qty_Allowed_field() throws Throwable {
		Sw_Create_Po.Enter_the_data_in_Qty_Allowed_field();
	}
	@Given ("^Enter the data in the Rate field$")
	public void Enter_the_data_in_the_Rate_field() throws Throwable {
		Sw_Create_Po.Enter_the_data_in_the_Rate_field();
	}
	@When ("^Enter the data in the L Short If Any$")
	public void Enter_the_data_in_the_L_Short_If_Any() throws Throwable {
		Sw_Create_Po.Enter_the_data_in_the_L_Short_If_Any();
	}
	@And ("^Enter the data in the Addl Information 1$")
	public void Enter_the_data_in_the_Addl_Information_1() throws Throwable {
		Sw_Create_Po.Enter_the_data_in_the_Addl_Information_1();
	}
	@And ("^Enter the data in the Addl Information 2$")
	public void Enter_the_data_in_the_Addl_Information_2() throws Throwable {
		Sw_Create_Po.Enter_the_data_in_the_Addl_Information_2();
	}
	@And ("^Select the Due on Date$")
	public void Select_the_Due_on_Date() throws Throwable {
		Sw_Create_Po.Select_the_Due_on_Date();
	}
	@And ("^The Quantity field data is prepopulated or not$")
	public void The_Quantity_field_data_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Quantity_field_data_is_prepopulated_or_not();
	}
	@And ("^The Qty Use From Stock field data is prepopulated or not$")
	public void The_Qty_Use_From_Stock_field_data_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Qty_Use_From_Stock_field_data_is_prepopulated_or_not();
	}
	@And ("^The Qty To Be Bought field data is prepopulated or not$")
	public void The_Qty_To_Be_Bought_field_data_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Qty_To_Be_Bought_field_data_is_prepopulated_or_not();
	}
	@And ("^the Rate Column data is displayed or not$")
	public void the_Rate_Column_data_is_displayed_or_not() throws Throwable {
		Sw_Create_Po.the_Rate_Column_data_is_displayed_or_not();
	}
	@And ("^The Amount is displayed or not$")
	public void The_Amount_is_displayed_or_not() throws Throwable {
		Sw_Create_Po.The_Amount_is_displayed_or_not();
	}
	@When ("^Select the Qty Required is prepopulated or not$")
	public void Select_the_Qty_Required_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.Select_the_Qty_Required_is_prepopulated_or_not();
	}
	@And ("^the Qty Available In Stock field data is displayed or not$")
	public void the_Qty_Available_In_Stock_field_data_is_displayed_or_not() throws Throwable {
		Sw_Create_Po.the_Qty_Available_In_Stock_field_data_is_displayed_or_not();
	}
	@And ("^The Residual Shrinkage is prepopulated or not$")
	public void The_Residual_Shrinkage_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Residual_Shrinkage_is_prepopulated_or_not();
	}
	@And ("^The Process Loss is prepopulated or not$")
	public void The_Process_Loss_is_prepopulated_or_not() throws Throwable {
		Sw_Create_Po.The_Process_Loss_is_prepopulated_or_not();
	}
	@And ("^User Select the Currency type$")
	public void User_Select_the_Currency_type() throws Throwable {
		Sw_Create_Po.User_Select_the_Currency_type();
	}
	@And ("^Select the IPO in the IPO column$")
	public void Select_the_IPO_in_the_IPO_column() throws Throwable {
		Sw_Create_Po.Select_the_IPO_in_the_IPO_column();
	}
	@And ("^Click on the Save Button$")
	public void Click_on_the_Save_Button() throws Throwable {
		Sw_Create_Po.Click_on_the_Save_Button();
	}
	@Then ("^Select the Count$")
	public void Select_the_Count() throws Throwable {
		Sw_Create_Po.Select_the_Count();
	}
	@And ("^Select the UOM in the yarn PO$")
	public void Select_the_UOM_in_the_yarn_PO() throws Throwable {
		Sw_Create_Po.Select_the_UOM_in_the_yarn_PO();
	}
	@And ("^Click on the Add IPO button$")
	public void Click_on_the_Add_IPO_button() throws Throwable {
		Sw_Create_Po.Click_on_the_Add_IPO_button();
	}
	@Then ("^Select the IPO in the IPO Column$")
	public void Select_the_IPO_in_the_IPO_Column() throws Throwable {
		Sw_Create_Po.Select_the_IPO_in_the_IPO_Column();
	}
}
