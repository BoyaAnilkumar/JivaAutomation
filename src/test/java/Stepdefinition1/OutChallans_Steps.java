package Stepdefinition1;

import Page.OutChallans_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OutChallans_Steps {

	OutChallans_Page OTCP = new OutChallans_Page();
	
	@Then("^Click on Challans sub module$")
	public void Click_on_Challans_sub_module() throws Throwable {
		OTCP.Click_on_Challans_sub_module();
	}
	
	@And("^Click on Out Challans in menu$")
	public void Click_on_Out_Challans_in_menu() throws Throwable {
		OTCP.Click_on_Out_Challans_in_menu();
	}
	
	@Then("^User has navigated to Out Challans screen$")
	public void User_has_navigated_to_Out_Challans_screen() throws Throwable {
		OTCP.User_has_navigated_to_Out_Challans_screen();
	}
	
	@Then("^user clicked on Add button$")
	public void user_clicked_on_Add_button() throws Throwable {
		OTCP.user_clicked_on_Add_button();
	}
	
	@And("^verify that source is selected$")
	public void verify_that_source_is_selected() throws Throwable {
		OTCP.verify_that_source_is_selected();
	}
	
	@And("Select the Buying House Name{string}")
	public void Select_the_Buying_House_Name(String buyinghousename) throws Throwable {
		OTCP.Select_the_Buying_House_Name(buyinghousename);
	}
	
	@And("^Select the date from datepicker$")
	public void Select_the_date_from_datepicker() throws Throwable {
		OTCP.Select_the_date_from_datepicker();
	}
	@Then("Select the Challan type{string}")
	public void Select_the_Challan_type(String type) throws Throwable {
		OTCP.Select_the_Challan_type(type);
	}

	@And("Enter the data in item textfield{string}")
	public void Enter_the_data_in_item_textfield(String item) throws Throwable {
		OTCP.Enter_the_data_in_item_textfield(item);
	}
	
	@And("Enter quantity{string}")
	public void Enter_quantity(String qty) throws Throwable {
		OTCP.Enter_quantity(qty);
	}
	
	@And("Enter data in Description textfield{string}")
	public void Enter_data_in_Description_textfield(String description) throws Throwable {
		OTCP.Enter_data_in_Description_textfield(description);
	}
	
	@Then("^user clicked on save button$")
	public void user_clicked_on_save_button() throws Throwable {
		OTCP.user_clicked_on_save_button();
	}
	
	@And("Select the IPO{string}")
	public void Select_the_IPO(String ipo) throws Throwable {
		OTCP.Select_the_IPO(ipo);
	}
	
	@Then("^Click on Print icon in grid$")
	public void Click_on_Print_icon_in_grid() throws Throwable {
		OTCP.Click_on_Print_icon_in_grid();
	}
	
	@And("^verify that user navigated to print screen$")
	public void verify_that_user_navigated_to_print_screen() throws Throwable {
		OTCP.verify_that_user_navigated_to_print_screen();
	}
	
	@And("^Click on print button to view system print$")
	public void Click_on_print_button_to_view_system_print() throws Throwable {
		OTCP.Click_on_print_button_to_view_system_print();
	}
	
	@And("^Click on Approve icon and approve the out challan$")
	public void Click_on_Approve_icon_and_approve_the_out_challan() throws Throwable {
		OTCP.Click_on_Approve_icon_and_approve_the_out_challan();
	}
	
	@And("^Select the source as supplier$")
	public void Select_the_source_as_supplier() throws Throwable {
		OTCP.Select_the_source_as_supplier();
	}
	
	@And("Select the Supplier Name{string}")
	public void Select_the_Supplier_Name(String Suppliername) throws Throwable {
		OTCP.Select_the_Supplier_Name(Suppliername);
	}
}
