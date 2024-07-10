package Stepdefinition1;

import Page.Yarn_Quality_Input_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Yarn_Quality_Input_steps {
	Yarn_Quality_Input_Page   Yarn_Quality_Input = new Yarn_Quality_Input_Page();

	
	@Then ("^Click on the Yarn Store Module$")
	public void Click_on_the_Yarn_Store_Module() throws Throwable {
		Yarn_Quality_Input.Click_on_the_Yarn_Store_Module();
	}

	@And ("^Click on the Yarn Quality Input under the Data Entry dropdown$")
	public void Click_on_the_Yarn_Quality_Input_under_the_Data_Entry_dropdown() throws Throwable {
		Yarn_Quality_Input.Click_on_the_Yarn_Quality_Input_under_the_Data_Entry_dropdown();
	}
	
	@Then ("^The Yarn Quality Input Screen is displayed or not$")
	public void The_Yarn_Quality_Input_Screen_is_displayed_or_not() throws Throwable {
		Yarn_Quality_Input.The_Yarn_Quality_Input_Screen_is_displayed_or_not();
	}
	@And ("^Click on the Add Icon in the Actions Column$")
	public void Click_on_the_Add_Icon_in_the_Actions_Column() throws Throwable {
		Yarn_Quality_Input.Click_on_the_Add_Icon_in_the_Actions_Column();
	}
	
	@Then ("^Verify the IPO, Date of initial recd, PO Number, and Net Weight Assigned data is displayed or not$")
	public void Verify_the_IPO_Date_of_initial_recd_PO_Number_and_Net_Weight_Assigned_data_is_displayed_or_not() throws Throwable {
		Yarn_Quality_Input.Verify_the_IPO_Date_of_initial_recd_PO_Number_and_Net_Weight_Assigned_data_is_displayed_or_not();
	}
	@And ("^The Yarn Details are displayed or not$")
	public void The_Yarn_Details_are_displayed_or_not() throws Throwable {
		Yarn_Quality_Input.The_Yarn_Details_are_displayed_or_not();
	}
	@And ("^Select the Checker name$")
	public void Select_the_Checker_name() throws Throwable {
		Yarn_Quality_Input.Select_the_Checker_name();
	}
	@Given ("^Enter the Checking Related Issues$")
	public void Enter_the_Checking_Related_Issues() throws Throwable {
		Yarn_Quality_Input.Enter_the_Checking_Related_Issues();
	}
	@Then ("^The Shrinkage section is displayed or not$")
	public void The_Shrinkage_section_is_displayed_or_not() throws Throwable {
		Yarn_Quality_Input.The_Shrinkage_section_is_displayed_or_not();
	}
	@And ("^Select the Box name$")
	public void Select_the_Box_name() throws Throwable {
		Yarn_Quality_Input.Select_the_Box_name();
	}
	@And ("^Enter the data in the L Shrinkage field$")
	public void Enter_the_data_in_the_L_Shrinkage_field() throws Throwable {
		Yarn_Quality_Input.Enter_the_data_in_the_L_Shrinkage_field();
	}
	@And ("^Enter the data in the W Shrinkage field$")
	public void Enter_the_data_in_the_W_Shrinkage_field() throws Throwable {
		Yarn_Quality_Input.Enter_the_data_in_the_W_Shrinkage_field();
	}
	@And ("^Click on the Add button in the Shrikage section$")
	public void Click_on_the_Add_button_in_the_Shrikage_section() throws Throwable {
		Yarn_Quality_Input.Click_on_the_Add_button_in_the_Shrikage_section();
	}
	@Then ("^without enter the data in the all fieds and click on the save button validation msg is displayed or not$")
	public void without_enter_the_data_in_the_all_fieds_and_click_on_the_save_button_validation_msg_is_displayed_or_not() throws Throwable {
		Yarn_Quality_Input.without_enter_the_data_in_the_all_fieds_and_click_on_the_save_button_validation_msg_is_displayed_or_not();
	}
	@And ("^Click on the Save button in the Shrinkage section$")
	public void Click_on_the_Save_button_in_the_Shrinkage_section() throws Throwable {
		Yarn_Quality_Input.Click_on_the_Save_button_in_the_Shrinkage_section();
	}
	@And ("^Click on the Expansion icon the expansion grid data is displayed or not$")
	public void Click_on_the_Expansion_icon_the_expansion_grid_data_is_displayed_or_not() throws Throwable {
		Yarn_Quality_Input.Click_on_the_Expansion_icon_the_expansion_grid_data_is_displayed_or_not();
	}
}
