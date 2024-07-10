package Stepdefinition1;

import Page.Roles_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Roles_Steps {
	Roles_Page Roles = new Roles_Page();
	
	
	@When ("^User clicks on Roles in menu$")
	public void User_clicks_on_Roles_in_menu()throws Throwable {
		Roles.User_clicks_on_Roles_in_menu();
	}
	@Then ("^Navigates to Roles screen$")
	public void Navigates_to_Roles_screen()throws Throwable {
		Roles.Navigates_to_Roles_screen();
	}
	@Then ("^Verify the Add Role form is displayed or not$")
	public void Verify_the_Add_Role_form_is_displayed_or_not()throws Throwable {
		Roles.Verify_the_Add_Role_form_is_displayed_or_not();
	}
	@And ("Enter the data in the Role {string} field")
	public void Navigates_to_Roles_screen(String Name)throws Throwable {
		Roles.Navigates_to_Roles_screen(Name);
	}
	@And ("Select the Reporting {string}")
	public void Select_the_Reporting_Role(String Role)throws Throwable {
		Roles.Select_the_Reporting_Role(Role);
	}
	@Then ("^Enter the data in the Description field$")
	public void Enter_the_data_in_the_Description_field()throws Throwable {
		Roles.Enter_the_data_in_the_Description_field();
	}
	@And ("^Verify the Permissions section is displayed or not$")
	public void Verify_the_Permissions_section_is_displayed_or_not()throws Throwable {
		Roles.Verify_the_Permissions_section_is_displayed_or_not();
	}
	@And ("^Click on the Save button in the Add Role form$")
	public void Click_on_the_Save_button_in_the_Add_Role_form()throws Throwable {
		Roles.Click_on_the_Save_button_in_the_Add_Role_form();
	}
	@And ("^Verify without enter the data in mandatory field and click on the save button toaster message is displayed or not$")
	public void Verify_without_enter_the_data_in_mandatory_field_and_click_on_the_save_button_toaster_message_is_displayed_or_not()throws Throwable {
		Roles.Verify_without_enter_the_data_in_mandatory_field_and_click_on_the_save_button_toaster_message_is_displayed_or_not();
	}
	@When ("^without select any permission click on save button toaster message is displayed or not$")
	public void without_select_any_permission_click_on_save_button_toaster_message_is_displayed_or_not()throws Throwable {
		Roles.without_select_any_permission_click_on_save_button_toaster_message_is_displayed_or_not();
	}
	@And ("^I select All Permissions for the Admin$")
	public void I_select_All_Permissions_for_the_Admin()throws Throwable {
		Roles.I_select_All_Permissions_for_the_Admin();
	}
	
}
