package Stepdefinition1;

import Page.Emaillist;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EmailList_Steps {

	Emaillist emaillist = new Emaillist();
	
	@And("^Click on Email list screen$")
	public void Click_on_Email_list_screen() throws Throwable {
		emaillist.Click_on_Email_list_screen();
	}
	
	@And("^Click on Add button in Email list$")
	public void Click_on_Add_button_in_Email_list() throws Throwable {
		emaillist.Click_on_Add_button_in_Email_list();
	}
	
	@And("^Select the Type of PO$")
	public void Select_the_Type_of_PO() throws Throwable {
		emaillist.Select_the_Type_of_PO();
	}
	
	@And("^Enter the Email address$")
	public void Enter_the_Email_address() throws Throwable {
		emaillist.Enter_the_Email_address();
	}
	
	@And("^click on save button in email list$")
	public void click_on_save_button_in_email_list() throws Throwable {
		emaillist.click_on_save_button_in_email_list();
	}
	
	@Then("^Click on Filter icon for Email$")
	public void Click_on_Filter_icon_for_Email() throws Throwable {
		emaillist.Click_on_Filter_icon_for_Email();
	}
	
	@And("^Click on Edit email list icon$")
	public void Click_on_Edit_email_list_icon() throws Throwable {
		emaillist.Click_on_Edit_email_list_icon();
	}
	
	@And("^click on Type of po and select another po$")
	public void click_on_Type_of_po_and_select_another_po() throws Throwable {
		emaillist.click_on_Type_of_po_and_select_another_po();
	}
	
	@And("^unselect the active checkbox$")
	public void unselect_the_active_checkbox() throws Throwable {
		emaillist.unselect_the_active_checkbox();
	}
	
	@And("^click on update button$")
	public void click_on_update_button() throws Throwable {
		emaillist.click_on_update_button();
	}
}
