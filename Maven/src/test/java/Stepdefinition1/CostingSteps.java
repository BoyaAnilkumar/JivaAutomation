
package Stepdefinition1;

import Page.Costingpages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostingSteps {
	Costingpages cos = new Costingpages();
//	
//	@Given("^Navigates to the Login page$")
//	public void Navigate_to_the_Login_page() {
//		cos.Navigates_to_the_Login_page();
//	}
//	
//	 @Then("^Enter valid Username and password$")
//	 public void Enter_valid_Username_and_password() throws Throwable {
//		 cos.Enter_valid_Username_and_password();
//	 }
//	 
//	  @And("^Click on SignIn$")
//	  public void Click_on_SignIn() throws Throwable{
//		  cos. Click_on_SignIn();
//	  }
//	  
//	  @Then ("^Click on the Woven Modules$") 
//	  public void Click_on_the_Woven_Modules() throws Throwable {
//		  cos.Click_on_the_Woven_Modules();
//	  }
//	  
	  @Then("^Click on the PD Module$")
	  public void Click_on_the_PD_Module() throws Throwable {
		  cos.Click_on_the_PD_Module();
	  }
	  
	  @Then ("^Click on the Costing Module$")
	  public void Click_on_the_Costing_Module() throws Throwable {
		  cos.Click_on_the_Costing_Module();
	  }
	  
	  @Then ("^Click on the Style button$")
	  public void Click_on_the_Style_button() throws Throwable {
		  cos.Click_on_the_Style_button();
		  
	  }
	  
	  @Then ("^Select an IPO in the Menu List$")
	  public void Select_an_IPO_in_the_Menu_List() throws Throwable {
		  cos.Select_an_IPO_in_the_Menu_List();
	  }
	  
	  @Then ("^Click on Style Button$")
	  public void Click_on_Style_Button() throws Throwable {
		  cos.Click_on_Style_Button();
	  }
	  @Then ("^Click on the Submit1 button$")
	  public void Click_on_the_Submit1_button() throws Throwable {
		  cos.Click_on_the_Submit1_button();
	  }
	  
	  @Given ("^Enter Version Name$")
	  public void Enter_Version_Name() throws Throwable {
		  cos.Enter_Version_Name();
	  }
	  
	  @Given ("^Enter Remarks$")
	  public void Enter_Remarks() throws Throwable {
		  cos.Enter_Remarks();
	  }
//	  
	  @Then ("^Click on Add Combo button$")
	  public void Click_on_Add_Combo_button() throws Throwable {
		  cos.Click_on_Add_Combo_button();
	  }
	  
	  @Given ("^Enter Combo Name$")
	  public void Enter_Combo_Name() throws Throwable {
		  cos.Enter_Combo_Name();
	  }
	  @Given ("^Enter Combo Qty$")
	  public void Enter_Combo_Qty() throws Throwable {
		  cos.Enter_Combo_Qty();
	  }
	  @When ("^Click in the App_Combo1$")
	  public void Click_in_the_App_Combo1() throws Throwable {
		  cos.Click_in_the_App_Combo1();
	  }
	  @When ("^Select an App_combo1$")
	  public void Select_an_App_combo1() throws Throwable {
		  cos.Select_an_App_combo1();
	  }
	  @When ("^Enter Garment Average1$")
	  public void Enter_Garment_Average1() throws Throwable {
		  cos.Enter_Garment_Average1();
	  }
	  @When ("^Enter Wastage1$")
	  public void Enter_Wastage1() throws Throwable {
		  cos.Enter_Wastage1();
	  }
	  @When ("^Enter Rate1$")
	  public void Enter_Rate1() throws Throwable {
		  cos.Enter_Rate1();
	  }
	  @When ("^Enter Conversion Rate1$")
	  public void Conversion_Rate1() throws Throwable {
		  cos.Conversion_Rate1();
	  }
	  
	  
	  @When ("^Click in the App_Combo2$")
	  public void Click_in_the_App_Combo2() throws Throwable {
		  cos.Click_in_the_App_Combo2();
	  }
	  @When ("^Select an App_combo2$")
	  public void Select_an_App_combo2() throws Throwable {
		  cos.Select_an_App_combo2();
	  }
	  @When ("^Enter Garment Average2$")
	  public void Enter_Garment_Average2() throws Throwable {
		  cos.Enter_Garment_Average2();
	  }
	  @When ("^Enter Wastage2$")
	  public void Enter_Wastage2() throws Throwable {
		  cos.Enter_Wastage2();
	  }
	  @When ("^Enter Rate2$")
	  public void Enter_Rate2() throws Throwable {
		  cos.Enter_Rate2();
	  }
	  @When ("^Enter Conversion Rate2$")
	  public void Conversion_Rate2() throws Throwable {
		  cos.Conversion_Rate2();
	  }
	  
	  @Given ("^Enter Additional Sampling Cost$")
	  public void Enter_Additional_Sampling_Cost() throws Throwable {
		  cos.Enter_Additional_Sampling_Cost();
	  }
	  @Given ("^Enter Per pc Freight Cost$")
	  public void Enter_Per_pc_Freight_Cost() throws Throwable {
		  cos.Enter_Per_pc_Freight_Cost();
	  }
	  
	  @And ("^Click on Add Trims button$")
	  public void Click_on_Add_Trims_button()  throws Throwable {
		  cos.Click_on_Add_Trims_button();
	  }
	  @Then ("^Click on the Category1 dropdown field$")
	  public void Click_on_the_Category1_dropdown_field() throws Throwable {
		  cos.Click_on_the_Category1_dropdown_field();
	  }
	  @Then ("^Select a Category1 from the dropdown$")
	  public void Select_a_Category1_from_the_dropdown() throws Throwable {
		  cos.Select_a_Category1_from_the_dropdown();
	  }
	  @Then ("^Click on the Item1 dropdown field$")
	  public void Click_on_the_Item1_dropdown_field() throws Throwable {
		  cos.Click_on_the_Item1_dropdown_field();
	  }
	  @Then ("^Select an Item1 from the dropdown$")
	  public void Select_an_Item1_from_the_dropdown() throws Throwable {
		  cos.Select_an_Item1_from_the_dropdown();
	  }
	  @And ("^Enter Avg of an Item1 value$")
	  public void Enter_Avg_of_an_Item1_value() throws Throwable {
		  cos.Enter_Avg_of_an_Item1_value();
	  }
	  @And ("^Enter Wastage of the selected Trim Accessories1$")
	  public void Enter_Wastage_of_the_selected_Trim_Accessories1() throws Throwable {
		  cos.Enter_Wastage_of_the_selected_Trim_Accessories1();
	  }
	  @And ("^Enter Rate of the selected Trim Accessories1$")
	  public void Enter_Rate_of_the_selected_Trim_Accessories1() throws Throwable {
		  cos.Enter_Rate_of_the_selected_Trim_Accessories1();
	  }
	  
	  @And ("^Click on the Add Accessories button$")
	  public void Click_on_the_Add_Accessories_button() throws Throwable {
			  cos.Click_on_the_Add_Accessories_button();
	  }
	  @Then ("^Click on the Category dropdown field under the TrimAccessoriesII grid$")
	  public void Click_on_the_Category_dropdown_field_under_the_TrimAccessoriesII_grid() throws Throwable {
		  cos.Click_on_the_Category_dropdown_field_under_the_TrimAccessoriesII_grid();
	  }
	  @Then ("^Select a Category from the dropdown under the TrimAccessoriesII grid$")
	  public void Select_a_Category_from_the_dropdown_under_the_TrimAccessoriesII_grid() throws Throwable {
		  cos.Select_a_Category_from_the_dropdown_under_the_TrimAccessoriesII_grid();
	  }
	  @Then ("^Click on the Item dropdown field under the TrimAccessoriesII grid$")
	  public void Click_on_the_Item_dropdown_field_under_the_TrimAccessoriesII_grid() throws Throwable {
		  cos.Click_on_the_Item_dropdown_field_under_the_TrimAccessoriesII_grid();
	  }
	  @Then ("^Select a Item from the dropdown under the TrimAccessoriesII grid$")
	  public void Select_a_Item_from_the_dropdown_under_the_TrimAccessoriesII_grid() throws Throwable {
		  cos.Select_a_Item_from_the_dropdown_under_the_TrimAccessoriesII_grid();
	  }
	  @Then ("^Enter the Cost$")
	  public void Enter_the_Cost() throws Throwable {
		  cos.Enter_the_Cost();
	  }
	  
	  @Given ("^To check whether the Overhead Cost is displaying a value or not$")
	  public void To_check_whether_the_Overhead_Cost_is_displaying_a_value_or_not() throws Throwable {
		  cos.To_check_whether_the_Overhead_Cost_is_displaying_a_value_or_not();
	  }
	  @Given ("^Enter Overhead Cost value$")
	  public void Enter_Overhead_Cost_value() throws Throwable {
		  cos.Enter_Overhead_Cost_value();
	  }
	  @Given ("^To check whether the Garment Cutting Cost is displaying a value or not$")
	  public void To_check_whether_the_Garment_Cutting_Cost_is_displaying_a_value_or_not() throws Throwable {
		  cos.To_check_whether_the_Garment_Cutting_Cost_is_displaying_a_value_or_not();
	  }
	  @Given ("^Enter Garment Cutting Cost value$")
	  public void Enter_Garment_Cutting_Cost_value() throws Throwable {
		  cos.Enter_Garment_Cutting_Cost_value();
	  }
	  
//	  Computer Embriodiery
	  @Given ("^Enter No of Stiches$")
	  public void Enter_No_of_Stiches() throws Throwable {
		  cos.Enter_No_of_Stiches();
	  }
	  @Given ("^Enter Rate$")
	  public void Enter_Rate() throws Throwable {
		  cos.Enter_Rate();
	  }
	  @Given ("^Enter Overhead$")
	  public void Enter_Overhead() throws Throwable {
		  cos.Enter_Overhead();
	  }
	  @Given ("^Enter Addl Charges$")
	  public void Enter_Addl_Charges() throws Throwable {
		  cos.Enter_Addl_Charges();
	  }
//	  Adda Embriodiery
	  @Given ("^Enter Adda Hours$")
	  public void Enter_Adda_Hours() throws Throwable {
		  cos.Enter_Adda_Hours();
	  }
	  @Given ("^Enter Adda Rate$")
	  public void Enter_Adda_Rate() throws Throwable {
		  cos.Enter_Adda_Rate();
	  }
	  @Given ("^Enter Adda Overhead$")
	  public void Enter_Adda_Overhead() throws Throwable {
		  cos.Enter_Adda_Overhead();
	  }
//	  #Manual Embriodiery
	  @Given ("^Enter Manual Hours$")
	  public void Enter_Manual_Hours() throws Throwable {
		  cos.Enter_Manual_Hours();
	  }
	  @Given ("^Enter Manual Rate$")
	  public void Enter_Manual_Rate() throws Throwable {
		  cos.Enter_Manual_Rate();
	  }
	  @Given ("^Enter Manual Overhead$")
	  public void Enter_Manual_Overhead() throws Throwable {
		  cos.Enter_Manual_Overhead();
	  }
//	  #Stitching
	  @When ("^To verify on clicking the Add Process button under Stitching$")
	  public void To_verify_on_clicking_the_Add_Process_button_under_Stitching() throws Throwable {
		  cos.To_verify_on_clicking_the_Add_Process_button_under_Stitching();
	  }

	  @Given ("^Enter a value in OB1$")
	  public void Enter_a_value_in_OB1() throws Throwable {
		  cos.Enter_a_value_in_OB1();
	  }
	  @Given ("^Enter a value in OB2$")
	  public void Enter_a_value_in_OB2() throws Throwable {
		  cos.Enter_a_value_in_OB2();
	  }
	  @Given ("^Enter a value in OB3$")
	  public void Enter_a_value_in_OB3() throws Throwable {
		  cos.Enter_a_value_in_OB3();
	  }
	  @Given ("^Enter a value in Cost1$")
	  public void Enter_a_value_in_Cost1() throws Throwable {
		  cos.Enter_a_value_in_Cost1();
	  }
	  @Given ("^Enter a value in Cost2$")
	  public void Enter_a_value_in_Cost2() throws Throwable {
		  cos.Enter_a_value_in_Cost2();
	  }
	  @Given ("^Enter a value in Cost3$")
	  public void Enter_a_value_in_Cost3() throws Throwable {
		  cos.Enter_a_value_in_Cost3();
	  }
	  @Then ("^Select an option in Booked field$")
	  public void Select_an_option_in_Booked_field() throws Throwable {
		  cos.Select_an_option_in_Booked_field();
		  
	  }
	  @Given ("^Enter a value in Smocking$")
	  public void Enter_a_value_in_Smocking() throws Throwable {
		  cos.Enter_a_value_in_Smocking();
	  }
	  @Given ("^Enter a value in Rate$")
	  public void Enter_a_value_in_Rate() throws Throwable {
		  cos.Enter_a_value_in_Rate();
	  }
	  @When ("^To verify whether the user is able to click the Description dropdown field or not$")
	  public void To_verify_whether_the_user_is_able_to_click_the_Description_dropdown_field_or_not() throws Throwable {
		  cos.To_verify_whether_the_user_is_able_to_click_the_Description_dropdown_field_or_not();
	  }
	  @Then ("^Select a value from the dropdown field$")
	  public void Select_a_value_from_the_dropdown_field() throws Throwable {
		  cos.Select_a_value_from_the_dropdown_field();
	  }
	  @Given ("^Enter the Stitching Cost value$")
	  public void Enter_the_Stitching_Cost_value() throws Throwable {
		  cos.Enter_the_Stitching_Cost_value();
	  }
	    
	  @Then ("^Click on the Add Process button under Finising and Packing grid$")
	  public void Click_on_the_Add_Process_button_under_Finising_and_Packing_grid() throws Throwable {
		  cos.Click_on_the_Add_Process_button_under_Finising_and_Packing_grid();
	  }
	  @Then ("^Select a Finishing and Packing process1$")
	  public void Select_a_Finishing_and_Packing_process1() throws Throwable {
		  cos.Select_a_Finishing_and_Packing_process1();
	  }
	  @Given ("^Enter the Finishing and Packing cost1$")
	  public void Enter_the_Finishing_and_Packing_cost1() throws Throwable {
		  cos.Enter_the_Finishing_and_Packing_cost1();
	  }
//	  #Washing / GArment process
	  @Then ("^Check the Yes or No toggle button status$")
	  public void Check_the_Yes_or_No_toggle_button_status() throws Throwable {
		  cos.Check_the_Yes_or_No_toggle_button_status();
	  }
	  @Then ("^Click on the Add Process button when the toggle button is in enabled state$")
	  public void Click_on_the_Add_Process_button_when_the_toggle_button_is_in_enabled_state() throws Throwable {
		  cos.Click_on_the_Add_Process_button_when_the_toggle_button_is_in_enabled_state();
	  }
	  @Then ("^Select a Washing Process1$")
	  public void Select_a_Washing_Process1() throws Throwable {
		  cos.Select_a_Washing_Process1();
	  }
	  @Given ("^Enter the Washing Cost1$")
	  public void Enter_the_Washing_Cost1() throws Throwable {
		  cos.Enter_the_Washing_Cost1();
	  }
	  @Given ("^Enter the value in the FPT GPT Total Cost field$")
	  public void Enter_the_value_in_the_FPT_GPT_Total_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_FPT_GPT_Total_Cost_field();
	  }
	  @Given ("^Enter the value in the FPT GPT Cost field$")
	  public void Enter_the_value_in_the_FPT_GPT_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_FPT_GPT_Cost_field();
	  }
	  @Given ("^Enter the value in the Addl Tests Total Cost field$")
	  public void Enter_the_value_in_the_Addl_Tests_Total_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Addl_Tests_Total_Cost_field();
	  }
	  @Given ("^Enter the value in the Addl Tests Cost field$")
	  public void Enter_the_value_in_the_Addl_Tests_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Addl_Tests_Cost_field();
	  }
	  @Given ("^Enter the value in the Inspection Charges Total Cost field$")
	  public void Enter_the_value_in_the_Inspection_Charges_Total_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Inspection_Charges_Total_Cost_field();
	  }
	  @Given ("^Enter the value in the Inspection Charges Cost field$")
	  public void Enter_the_value_in_the_Inspection_Charges_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Inspection_Charges_Cost_field();
	  }
	  @Given ("^Enter the value in the NO of PO by Sea field$")
	  public void Enter_the_value_in_the_NO_of_PO_by_Sea_field() throws Throwable {
		  cos.Enter_the_value_in_the_NO_of_PO_by_Sea_field();
	  }
	  @Given ("^Enter the value in the NO of PO by Air field$")
	  public void Enter_the_value_in_the_NO_of_PO_by_Air_field() throws Throwable {
		  cos.Enter_the_value_in_the_NO_of_PO_by_Air_field();
	  }
	  @Given ("^Enter the value in the Custom Clearance Total Cost field$")
	  public void Enter_the_value_in_the_Custom_Clearance_Total_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Custom_Clearance_Total_Cost_field();
	  }
	  @Given ("^Enter the value in the Custom Clearance Cost field$")
	  public void Enter_the_value_in_the_Custom_Clearance_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Custom_Clearance_Cost_field();
	  }
	  @Given ("^Enter the value in the Cartage Total Cost field$")
	  public void Enter_the_value_in_the_Cartage_Total_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Cartage_Total_Cost_field();
	  }
	  @Given ("^Enter the value in the Cartage Cost field$")
	  public void Enter_the_value_in_the_Cartage_Cost_field() throws Throwable {
		  cos.Enter_the_value_in_the_Cartage_Cost_field();
	  }
	  @Given ("^Enter the value in the Additional Buffer field$")
	  public void Enter_the_value_in_the_Additional_Buffer_field() throws Throwable {
		  cos.Enter_the_value_in_the_Additional_Buffer_field();
	  }
	  @Given ("^Enter the value in the Rejection field$")
	  public void Enter_the_value_in_the_Rejection_field() throws Throwable {
		  cos.Enter_the_value_in_the_Rejection_field();
	  }
	  @Given ("^Enter the value in the OverHead field$")
	  public void Enter_the_value_in_the_OverHead_field() throws Throwable {
		  cos.Enter_the_value_in_the_OverHead_field();
	  }
	  @Given ("^Enter the value in the Profit MarkUp field$")
	  public void Enter_the_value_in_the_Profit_MarkUp_field() throws Throwable {
		  cos.Enter_the_value_in_the_Profit_MarkUp_field();
	  }
	  @Given ("^Enter the value in the Commission field$")
	  public void Enter_the_value_in_the_Commission_field() throws Throwable {
		  cos.Enter_the_value_in_the_Commission_field();
	  }
	  @Given ("^Enter the value in the Currency field$")
	  public void Enter_the_value_in_the_Currency_field() throws Throwable {
		  cos.Enter_the_value_in_the_Currency_field();
	  }
	  @Given ("^Enter the value in the Price Quoted To Buyer field$")
	  public void Enter_the_value_in_the_Price_Quoted_To_Buyer_field() throws Throwable {
		  cos.Enter_the_value_in_the_Price_Quoted_To_Buyer_field();
	  }
	  @Then ("^Click on the PSave button$")
	  public void Click_on_the_PSave_button() throws Throwable {
		  cos.Click_on_the_PSave_button();
	  }
//	  @Then ("^Click on the Submit button$")
//	  public void Click_on_the_Submit_button() throws Throwable {
//		  cos.Click_on_the_Submit_button();
//	  }
	  @Then ("^Click on the View For Print button$")
	  public void Click_on_the_View_For_Print_button() throws Throwable {
		  cos.Click_on_the_View_For_Print_button();
	  }
	  @Then ("^Click on the Cancel in the Print form$")
	  public void Click_on_the_Cancel_in_the_Print_form() throws Throwable {
		  cos.Click_on_the_Cancel_in_the_Print_form();
	  }
	  @Then ("^Click on the Download As Excel button$")
	  public void Click_on_the_Download_As_Excel_button() throws Throwable {
		  cos.Click_on_the_Download_As_Excel_button();
	  }
	  @Then ("^Click on Import button$")
	  public void Click_on_Import_button() throws Throwable {
		  cos.Click_on_Import_button();
	  }
	  @When ("^Check wether the Import Version Details Version popup window opened or not$")
	  public void Check_wether_the_Import_Version_Details_Version_popup_window_opened_or_not() throws Throwable {
		  cos.Check_wether_the_Import_Version_Details_Version_popup_window_opened_or_not();
	  }
	  @Then ("^Click Versions dropdown field$")
	  public void Click_Versions_dropdown_field() throws Throwable {
		  cos.Click_Versions_dropdown_field();
	  }
	  @Then ("^Select a value from the dropdown$")
	  public void Select_a_value_from_the_dropdown() {
		  cos.Select_a_value_from_the_dropdown();
	  }
//	  @Then ("^Click on the Close button$")
//	  public void Click_on_the_Close_button() throws Throwable {
//		  cos.Click_on_the_Close_button();
//	  }
	  @Then ("^Click on the Import buttton$")
	  public void Click_on_the_Import_buttton() throws Throwable {
		  cos.Click_on_the_Import_buttton();
	  }
	  @Then ("^Click on Close icon$")
	  public void Click_on_Close_icon() throws Throwable {
		  cos.Click_on_Close_icon();
	  }
	    
	    

	

}

