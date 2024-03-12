package Stepdefinition1;

import Page.ViewFabricSheetPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewFabricSheetSteps {
	ViewFabricSheetPages VFSP = new ViewFabricSheetPages();
		
	@Given ("^Navigate to the Login page$")
	public void Navigate_to_the_Login_page() {
		VFSP.Navigate_to_the_Login_page();
	}
	@Then ("^Enter valid Username and Password$")
	public void Enter_valid_Username_and_Password() {
		VFSP.Enter_valid_Username_and_Password();
	}
	@And ("^Click on SignIn in the login page$")
	public void Click_on_SignIn_in_the_login_page() {
		VFSP.Click_on_SignIn_in_the_login_page();
	}
	@Then ("^Click on Woven Module$")
	public void Click_on_Woven_Module() throws Throwable {
		VFSP.Click_on_Woven_Module();
	}
	@Then ("^Click on Merchandising module$")
	public void Click_on_Merchandising_module() throws Throwable {
		VFSP.Click_on_Merchandising_module();
	}
	@Then ("^Click on the Reports under Merchandising module$")
	public void Click_on_the_Reports_under_Merchandising_module() throws Throwable {
		VFSP.Click_on_the_Reports_under_Merchandising_module();
	}
	@Then ("^Click on View Fabric Sheet module$")
	public void Click_on_View_Fabric_Sheet_module() throws Throwable {
		VFSP.Click_on_View_Fabric_Sheet_module();
	}
	@Then ("^Click on Style show/hide button$")
	public void Click_on_Style_showhide_button() throws Throwable {
		VFSP.Click_on_Style_showhide_button();
	}
	@Then ("^Click on Filter button in the Menu list$")
	public void Click_on_Filter_button_in_the_Menu_list() throws Throwable {
		VFSP.Click_on_Filter_button_in_the_Menu_list();
	}
	@And ("^Verifying the Buyer field for selecting a Buyer$")
	public void Verifying_the_Buyer_field_for_selecting_a_Buyer() throws Throwable {
		VFSP.Verifying_the_Buyer_field_for_selecting_a_Buyer();
	}
	@And ("^Verify whether the user is able to select a Season in the season field$")
	public void Verify_whether_the_user_is_able_to_select_a_Season_in_the_season_field() throws Throwable {
		VFSP.Verify_whether_the_user_is_able_to_select_a_Season_in_the_season_field();
	}
	@And ("^Enter the IPO or Buyer in the Search by Buyer Style or IPO field$")
	public void Enter_the_IPO_or_Buyer_in_the_Search_by_Buyer_Style_or_IPO_field() throws Throwable {
		VFSP.Enter_the_IPO_or_Buyer_in_the_Search_by_Buyer_Style_or_IPO_field();
	}
	@Then ("^Click on Apply button$")
	public void Click_on_Apply_button() throws Throwable {
		VFSP.Click_on_Apply_button();
	}
	@When ("^Check whether the respective IPO is displayed or not in the Menu List$")
	public void Check_whether_the_respective_IPO_is_displayed_or_not_in_the_Menu_List() throws Throwable {
		VFSP.Check_whether_the_respective_IPO_is_displayed_or_not_in_the_Menu_List();
	}
	@Then ("^Select the IPO in the Menu List$")
	public void Select_the_IPO_in_the_Menu_List() throws Throwable {
		VFSP.Select_the_IPO_in_the_Menu_List();
	}
	@Then ("^Check whether the page is navigated to the View Fabric Sheet$")
	public void Check_whether_the_page_is_navigated_to_the_View_Fabric_Sheet() throws Throwable {
		VFSP.Check_whether_the_page_is_navigated_to_the_View_Fabric_Sheet();
	}
	@When ("^Click on the History button$")
	public void Click_on_the_History_button() throws Throwable {
		VFSP.Click_on_the_History_button();
	}
	@Then ("^Check whether page is navigated to the History page or not$")
	public void Check_whether_page_is_navigated_to_the_History_page_or_not() throws Throwable {
		VFSP.Check_whether_page_is_navigated_to_the_History_page_or_not();
	}
	@Then ("^Verify whether the history records are there or not$")
	public void Verify_whether_the_history_records_are_there_or_not() throws Throwable {
		VFSP.Verify_whether_the_history_records_are_there_or_not();
	}
	@And ("^Verify whether the Open button is clickable for the history record$")
	public void Verify_whether_the_Open_button_is_clickable_for_the_history_record() {
		VFSP.Verify_whether_the_Open_button_is_clickable_for_the_history_record();
	}
	@Then ("^Verify whether the page is navigated to the PDF form or not$")
	public void Verify_whether_the_page_is_navigated_to_the_PDF_form_or_not() throws Throwable {
		VFSP.Verify_whether_the_page_is_navigated_to_the_PDF_form_or_not();
	}
	@Then ("^Verify whether the Back button is clickable$")
	public void Verify_whether_the_Back_button_is_clickable() throws Throwable {
		VFSP.Verify_whether_the_Back_button_is_clickable();
	}
	@And ("^Check whether page is navigated to the View Fabric Sheet or not$")
	public void Check_whether_page_is_navigated_to_the_View_Fabric_Sheet_or_not() throws Throwable {
		VFSP.Check_whether_page_is_navigated_to_the_View_Fabric_Sheet_or_not();
	}
	@Then ("^Verify whether the added fabrics are displayed or not on clicking the Fabric Details link$")
	public void Verify_whether_the_added_fabrics_are_displayed_or_not_on_clicking_the_Fabric_Details_link() {
		VFSP.Verify_whether_the_added_fabrics_are_displayed_or_not_on_clicking_the_Fabric_Details_link();
	}
	@Then ("^Verify whether the added fabrics Garment Average records are displayed or not on clicking the Garment Average link$")
	public void Verify_whether_the_added_fabrics_Garment_Average_records_are_displayedornot_on_clicking_the_Garment_Average_link() throws Throwable {
		VFSP.Verify_whether_the_added_fabrics_Garment_Average_records_are_displayedornot_on_clicking_the_Garment_Average_link();
	}
	@Then ("^Verify whether the added fabrics Quantity Requirment records are displayed or not on clicking the Quantity Requirment link$")
	public void Verify_whether_the_added_fabrics_Quantity_Requirment_records_are_displayed_or_not_on_clicking_the_Quantity_Requirment_link() throws Throwable {
		VFSP.Verify_whether_the_added_fabrics_Quantity_Requirment_records_are_displayed_or_not_on_clicking_the_Quantity_Requirment_link();
	}
	  
	@When ("^Verify whether page is navigating to the Print form on clicking the View For Print By Combo Name button with Print and Cancel buttons$")
	public void Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Combo_Name_button_with_Print_and_Cancel_buttons() throws Throwable {
		VFSP.Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Combo_Name_button_with_Print_and_Cancel_buttons();
	}
	@Then ("^Verify whether the Print button is clickable$")
	public void Verify_whether_the_Print_button_is_clickable() throws Throwable {
		VFSP.Verify_whether_the_Print_button_is_clickable();
	}
	@And ("^Verify whether the page is navigating to the Print screen with the Print and Cancel buttons$")
	public void Verify_whether_the_page_is_navigating_to_the_Print_screen_with_the_Print_and_Cancel_buttons() throws Throwable {
		VFSP.Verify_whether_the_page_is_navigating_to_the_Print_screen_with_the_Print_and_Cancel_buttons();
	}
	
	@Then ("^Verify whether the page is navigating to the View Fabric Sheet on OnClick the Cancel button in the Print Form$")
	public void Verify_whether_the_page_is_navigating_to_the_View_Fabric_Sheet_on_OnClick_the_Cancel_button_in_the_Print_Form() throws Throwable {
		VFSP.Verify_whether_the_page_is_navigating_to_the_View_Fabric_Sheet_on_OnClick_the_Cancel_button_in_the_Print_Form();
	}
	@When ("^Verify whether page is navigating to the Print form on clicking the View For Print By Fabric Quality button$")
	public void Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Fabric_Quality_button() throws Throwable {
		VFSP.Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Fabric_Quality_button();
	}
	@When ("^Verify whether page is navigating to the Print form on clicking the View For Print By Fabric Sheet button$")
	public void Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Fabric_Sheet_button() throws Throwable {
		VFSP.Verify_whether_page_is_navigating_to_the_Print_form_on_clicking_the_View_For_Print_By_Fabric_Sheet_button();
		
	}
	  

}
