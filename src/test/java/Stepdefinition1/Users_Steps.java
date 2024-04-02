package Stepdefinition1;

import Page.Users_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Users_Steps {
	Users_page userspage = new Users_page();
	
	@When("^I click on security module$")
	public void I_click_on_security_module() throws Throwable {
		userspage.I_click_on_security_module();
	}
	
	@Then("^Display Users and Roles in menu$")
	public void Display_Users_and_Roles_in_menu() throws Throwable {
		userspage.Display_Users_and_Roles_in_menu();
	}
	
	@When("^I click on Users in menu$")
	public void I_click_on_Users_in_menu() throws Throwable {
		userspage.I_click_on_Users_in_menu();
	}
	
	@Then("^Navigates to Users screen$")
	public void Navigates_to_Users_screen() throws Throwable {
		userspage.Navigates_to_Users_screen();
	}
	
	@When("^I click on Add button$")
	public void I_click_on_Add_button() throws Throwable {
		userspage.I_click_on_Add_button();
	}
	
	@Then("^Navigates to Create User screen$")
	public void Navigates_to_Create_User_screen() throws Throwable {
		userspage.Navigates_to_Create_User_screen();
	}
	
	@Given("^I Want to enter UserName$")
	public void I_Want_to_enter_UserName() throws Throwable{
		userspage.I_Want_to_enter_UserName();
	}
	
	@Given("^I Want to enter FirstName$")
	public void I_Want_to_enter_FirstName() throws Throwable{
		userspage.I_Want_to_enter_FirstName();
	}
	
	@Given("^I Want to enter LastName$")
	public void I_Want_to_enter_LastName() throws Throwable{
		userspage.I_Want_to_enter_LastName();
	}
	
	@Given("^I Want to enter Email$")
	public void I_Want_to_enter_Email() throws Throwable{
		userspage.I_Want_to_enter_Email();
	}
	
	@Given("^I Want to enter MobileNumber$")
	public void I_Want_to_enter_MobileNumber() throws Throwable{
		userspage.I_Want_to_enter_MobileNumber();
	}
	
	@Given("^I Want to enter AlternateMobileNumber$")
	public void I_Want_to_enter_AlternateMobileNumber() throws Throwable{
		userspage.I_Want_to_enter_AlternateMobileNumber();
	}
	
	@Given("^I Want to enter NewPassword$")
	public void I_Want_to_enter_NewPassword() throws Throwable{
		userspage.I_Want_to_enter_NewPassword();
	}
	
	@Given("^I Want to enter ConfirmPassword$")
	public void I_Want_to_enter_ConfirmPassword() throws Throwable{
		userspage.I_Want_to_enter_ConfirmPassword();
	}
	
	@Given("^I Want to enter Roles$")
	public void I_Want_to_enter_Roles() throws Throwable{
		userspage.I_Want_to_enter_Roles();
	}
	
	@Given("^I want to select Reporting Manager$")
	public void I_want_to_select_Reporting_Manager() throws Throwable {
		userspage.I_want_to_select_Reporting_Manager();
	}
	
	@Given("^I want to select the department$")
	public void I_want_to_select_the_department() throws Throwable {
		userspage.I_want_to_select_the_department();
	}
	
	@And("^I want to select the Factory$")
	public void I_want_to_select_the_Factory() throws Throwable {
		userspage.I_want_to_select_the_Factory();
	}
	
	@And("^Click on save button$")
	public void Click_on_save_button() throws Throwable {
		userspage.Click_on_save_button();
	}
	
	
	@And("^Enter the data in mandatory fields$")
	public void Enter_the_data_in_mandatory_fields() throws Throwable {
		userspage.Enter_the_data_in_mandatory_fields();
	}
	
	@Then("^verify that created user is displaying in grid with valid data$")
	public void verify_that_created_user_is_displaying_in_grid_with_valid_data() throws Throwable {
		userspage.verify_that_created_user_is_displaying_in_grid_with_valid_data();
	}
	
	@When("^click on Filter icon and filter with the username$")
	public void click_on_Filter_icon_and_filter_with_the_username() throws Throwable {
		userspage.click_on_Filter_icon_and_filter_with_the_username();
		
	}
	
	@And("^Click on Delete icon and delete the user$")
	public void Click_on_Delete_icon_and_delete_the_user() throws Throwable {
		userspage.Click_on_Delete_icon_and_delete_the_user();
	}
	
	@And("^Click on edit icon to update the data$")
	public void Click_on_edit_icon_to_update_the_data() throws Throwable {
		userspage.Click_on_edit_icon_to_update_the_data();
	}
	
	@And("^check the sorting functionality of grid$")
	public void check_the_sorting_functionality_of_grid() throws Throwable {
		userspage.check_the_sorting_functionality_of_grid();
	}
	
}
