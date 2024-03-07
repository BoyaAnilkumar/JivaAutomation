package Stepdefinition1;

import Page.Stylepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stylesteps {
	Stylepage Stylepage = new Stylepage(); 
		
		
		   @Then ("^click on the PD Module$")
		   public void click_on_the_PD_Module() throws Throwable{
			   Stylepage.click_on_the_PD_Module();
		   }
		   
		   @And("^Click on Data Entry in PD Module$")
		   public void Click_on_Data_Entry_in_PD_Module() throws Throwable {
			   Stylepage.Click_on_Data_Entry_in_PD_Module();
		   }
		   
		   
		   @And ("^click on the Style Master screen$")
		   public void click_on_the_Style_Master_screen() throws Throwable{
			   Stylepage.click_on_the_Style_Master_screen();

		}
		   @Then ("^click on the Filter Icon$")
		   public void click_on_the_Filter_Icon() throws Throwable{
			   Stylepage.click_on_the_Filter_Icon();
		   }
		  
		   @And ("^Click on the Buyer filed$")
		   public void Click_on_the_Buyer_filed() throws Throwable{
			   Stylepage.Click_on_the_Buyer_filed();
		   
		   } 
		   @When ("^User select the Buyer in buyer dropdown field")
		   public void User_select_the_Buyer_in_buyer_dropdown_field() throws Throwable{
			   Stylepage.User_select_the_Buyer_in_buyer_dropdown_field();
		   
		   } 
		   @And ("^Click on the season field$")
		   public void Click_on_the_season_field() throws Throwable{
			   Stylepage.Click_on_the_season_field();
		   
		   } 
		   @When ("^User Select the Season in season dropdown field")
		   public void User_select_the_Season_in_buyer_dropdown_field() throws Throwable{
			   Stylepage.User_select_the_Season_in_buyer_dropdown_field();
		   
		   } 
//		   @And ("^Click on the Status field$")
//		   public void Click_on_the_Status_field() throws Throwable{
//			   Stylepage.Click_on_the_Status_field();
//		   
//		   } 
//		   @When ("^User select the Status")
//		   public void User_select_the_Status() throws Throwable{
//			   Stylepage.User_select_the_Status();
//		   
//		   } 
		   @And ("^Enter the data in Search By Style field$")
		   public void Enter_the_data_in_Search_By_Style_field() throws Throwable{
			   Stylepage.Enter_the_data_in_Search_By_Style_field();
		   
		   } 
		   @And ("^Click on the Filter Apply button$")
		   public void Click_on_the_Filter_Apply_button() throws Throwable{
			   Stylepage.Click_on_the_Filter_Apply_button();
		   
		   } 
//		   @And ("^Click on the Filter Reset button$")
//		   public void Click_on_the_Filter_Reset_button() throws Throwable{
//			   Stylepage.Click_on_the_Filter_Reset_button();
//		   
//		   } 
//		   
//		   
//		   
		   @Then ("^Click on the Add New style button$")
		   public void Click_on_the_Add_New_style_button() throws Throwable{
			   Stylepage.Click_on_the_Add_New_style_button();

	     }
   
		   @And ("^Click on the PD Merchant name field$")
		   public void Click_on_the_PD_Merchant_name_field() throws Throwable{
		 Stylepage.Click_on_the_PD_Merchant_name_field();
		   
		   }   
		   @When ("^User select the PD merchant name$")
		   public void User_select_the_PD_merchant_name() throws Throwable{
		 Stylepage.User_select_the_PD_merchant_name();
		   
		   
         }
		   @And ("^Enter the data in BuyerStyle field$")
		   public void Enter_the_data_in_BuyerStyle_field() throws Throwable{
			   Stylepage.Enter_the_data_in_BuyerStyle_field();

}
		   @And ("^Click on the Buyer field$")
		   public void Click_on_the_Buyer_field() throws Throwable{
			   Stylepage.Click_on_the_Buyer_field();

		   }

		   @When ("^User select the Buyer$")
		   public void User_select_the_Buyer() throws Throwable{
			   Stylepage.User_select_the_Buyer();

		   }	
		   @And ("^Click on the Season field in Add form$")
		   public void Click_on_the_Season_field_in_Add_form() throws Throwable{
			   Stylepage.Click_on_the_Season_field_in_Add_form();

		   }

		   @And ("^Click on the Garment Type field$")
		   public void Click_on_the_Garment_Type_field() throws Throwable{
			   Stylepage.Click_on_the_Garment_Type_field();

		   }
		   @Then ("^Select the Garment type$")
		   public void Select_the_Garment_type() throws Throwable{
			   Stylepage.Select_the_Garment_type();

		   }
		   @And ("^Click on the Garment process field$")
		   public void Click_on_the_Garment_process_field() throws Throwable{
			   Stylepage.Click_on_the_Garment_process_field();

		   }
		   @When ("^The user select the Garment Process$")
		   public void The_user_select_the_Garment_Process() throws Throwable{
			   Stylepage.The_user_select_the_Garment_Process();

		   }	
		   @And ("^Click on the Save button in create style master$")
		   public void Click_on_the_Save_button_in_create_style_master() throws Throwable{
			   Stylepage.Click_on_the_Save_button_in_create_style_master();

		   }
		   @And ("^I am on the homepage$")
		   public void I_am_on_the_homepage() throws Throwable{
			   Stylepage.I_am_on_the_homepage();

		   } 
		   @And ("^print the displayed header message$")
		   public void print_the_displayed_header_message() throws Throwable{
			   Stylepage.print_the_displayed_header_message();

		   }
	
		   
		   @Then ("^User enter the the Tech Pack Name$")
		   public void User_enter_the_the_Tech_Pack_Name() throws Throwable{
			   Stylepage.User_enter_the_the_Tech_Pack_Name();

		   }
		   @And("^Enter the data in Teck pack desc field$")
		   public void Enter_the_data_in_Teck_pack_desc_field() throws Throwable{
			   Stylepage.Enter_the_data_in_Teck_pack_desc_field();

		   }
		   @Then ("^User select the data in Teck received date field$")
		   public void User_select_the_data_in_Teck_received_date_field() throws Throwable{
			   Stylepage.User_select_the_data_in_Teck_received_date_field();

		   }
		   @And ("^User click on the sampling type field$")
		   public void User_click_on_the_sampling_type_field() throws Throwable{
			   Stylepage.User_click_on_the_sampling_type_field();

		   }
		   @When ("^The user select the sampling type in dropdown list$")
		   public void The_user_select_the_sampling_type_in_dropdown_list() throws Throwable{
			   Stylepage.The_user_select_the_sampling_type_in_dropdown_list();

		   }
		   @And ("^User select the Expected Submission Date$")
		   public void User_select_the_Expected_Submission_Date() throws Throwable{
			   Stylepage.User_select_the_Expected_Submission_Date();

		   }
		   @And ("^Enter the data in expected order qty field$")
		   public void Enter_the_data_in_expected_order_qty_field() throws Throwable{
			   Stylepage.Enter_the_data_in_expected_order_qty_field();

		   }
		   @Then ("^User select the expected order date field$")
		   public void User_select_the_expected_order_date_field() throws Throwable{
			   Stylepage.User_select_the_expected_order_date_field();

		   }
		   @When ("^The user select the PD Assistants$")
		   public void The_user_select_the_PD_Assistants() throws Throwable{
			   Stylepage.The_user_select_the_PD_Assistants();

		   }
		   @And("^select PD Assistants$")
		   public void select_PD_Assistants() throws Throwable {
			   Stylepage.select_PD_Assistants();
			   
		   }
//		   @And ("^Click on the Cancel button$")
//		   public void Click_on_the_Cancel_button() throws Throwable{
//			   Stylepage.Click_on_the_Cancel_button();
//
//		   }
		   @And ("^Click on the created style$")
		   public void Click_on_the_created_style() throws Throwable{
			   Stylepage.Click_on_the_created_style();

		   }
		   @And ("^Click on the Back button$")
		   public void Click_on_the_Back_button() throws Throwable{
			   Stylepage.Click_on_the_Back_button();

		   }
		   
		   @When ("^User click on the add revise estimates button$")
		   public void User_click_on_the_add_revise_estimates_button() throws Throwable{
			   Stylepage.User_click_on_the_add_revise_estimates_button();

		   }
		   @And ("^Select the Order Type$")
		   public void Select_the_Order_Type() throws Throwable{
			   Stylepage.Select_the_Order_Type();

		   }
		   @And ("^Select the Order date$")
		   public void Select_the_Order_date() throws Throwable{
			   Stylepage.Select_the_Order_date();

		   }
		   @And ("^Select the Exfactory date$")
		   public void Select_the_Exfactory_date() throws Throwable{
			   Stylepage.Select_the_Exfactory_date();

		   }
		   @Given ("^User enter the Order qty$")
		   public void User_enter_the_Order_qty() throws Throwable{
			   Stylepage.User_enter_the_Order_qty();

		   }
		   @And ("^Select the Costing Version$")
		   public void Select_the_Costing_Version() throws Throwable{
			   Stylepage.Select_the_Costing_Version();

		   }
	       @And ("^click on the Save button in create style master$")
	       public void click_on_the_Save_button_in_create_style_master() throws Throwable{
		   Stylepage.click_on_the_Save_button_in_create_style_master();

	   }
		   @And ("^Click on the cancel button in create style master$")
		   public void Click_on_the_cancel_button_in_create_style_master() throws Throwable{
			   Stylepage.Click_on_the_cancel_button_in_create_style_master();

		   }
		   @And ("^Click on the Generate new order radio button$")
		   public void Click_on_the_Generate_new_order_radio_button() throws Throwable{
			   Stylepage.Click_on_the_Generate_new_order_radio_button();

		   }
		   @And ("^Click on the Add new tech pack button$")
		   public void Click_on_the_Add_new_tech_pack_button() throws Throwable{
			   Stylepage.Click_on_the_Add_new_tech_pack_button();

		   }
		   @When ("^The User enter the data in tech pack name field$")
		   public void The_User_enter_the_data_in_tech_pack_name_field() throws Throwable{
			   Stylepage.The_User_enter_the_data_in_tech_pack_name_field();

		   }
		   @And ("^Enter the data in tech pack desc field$")
		   public void Enter_the_data_in_tech_pack_desc_field() throws Throwable{
			   Stylepage.Enter_the_data_in_tech_pack_desc_field();

		   }
		   @Then ("^User select the Tech Pack Received Date$")
		   public void User_select_the_Tech_Pack_Received_Date() throws Throwable{
			   Stylepage.User_select_the_Tech_Pack_Received_Date();

		   }
		   @And ("^Click on the tech pack details Save button$")
		   public void Click_on_the_tech_pack_details_Save_button() throws Throwable{
			   Stylepage.Click_on_the_tech_pack_details_Save_button();

		   }
		   @And ("^Click on the tech pack details Cancel button$")
		   public void Click_on_the_tech_pack_details_Cancel_button() throws Throwable {
			   Stylepage.Click_on_the_tech_pack_details_Cancel_button();

		   }
		   @And ("^Click on the Tech pack cancel Icon$")
		   public void Click_on_the_Tech_pack_cancel_Icon() throws Throwable{
			   Stylepage.Click_on_the_Tech_pack_cancel_Icon();

		   }
		   
		   @And ("^Click on the Add sampling details button$")
		   public void Click_on_the_Add_sampling_details_button() throws Throwable{
		   Stylepage.Click_on_the_Add_sampling_details_button();
          }
		   @And ("^Select the sampling status$")
		   public void Select_the_sampling_status() throws Throwable{
		   Stylepage.Select_the_sampling_status();
		   }
		   @Given ("^User Click the Sampling type$")
		   public void User_Click_the_Sampling_type() throws Throwable{
		   Stylepage.User_Click_the_Sampling_type();
		   }
		   @And ("^User Select the Sampling type$")
		   public void User_Select_the_Sampling_type() throws Throwable{
		   Stylepage.User_select_the_Sampling_type();
		   }
		   @And ("^Select the Submission date$")
		   public void Select_the_Submission_date() throws Throwable{
		   Stylepage.Select_the_Submission_date();
		   }
		   
		   @And("^Click on the sampling Save button$")
		   public void Click_on_the_sampling_Save_button() throws Throwable{
		   Stylepage.Click_on_the_sampling_Save_button();
		   
           } 
		   @And ("^Click on the Cancel Icon in create style master$")
		   public void Click_on_the_Cancel_Icon_in_create_style_master() throws Throwable{
		   Stylepage.Click_on_the_Cancel_Icon_in_create_style_master();
		   }
		   @And ("^User Click on the Link to PD FDS button$")
		   public void User_Click_on_the_Link_to_PD_FDS_button() throws Throwable{
		   Stylepage.User_Click_on_the_Link_to_PD_FDS_button();
		   }
		   @And ("^Click on the Link button$")
		   public void Click_on_the_Link_button() throws Throwable{
		   Stylepage.Click_on_the_Link_button();
		   }
		   @And ("^Click on the View Icon$")
		   public void Click_on_the_View_Icon() throws Throwable{
		   Stylepage.Click_on_the_View_Icon();
		   }
		   @Then("^Click on the View Cancel Icon$")
		   public void Click_on_the_View_Cancel_Icon() throws Throwable{
		   Stylepage.Click_on_the_View_Cancel_Icon();
		   }
		   @And ("^Click on the View Close button$")
		   public void Click_on_the_View_Close_button() throws Throwable{
		   Stylepage.Click_on_the_View_Close_button();
		   }
		   @And ("^Click on the Manage Images Icon$")
		   public void Click_on_the_Manage_Images_Icon() throws Throwable{
		   Stylepage.Click_on_the_Manage_Images_Icon();
		   }
		   @And ("^Click on the Manage images Save button$")
		   public void Click_on_the_Manage_images_Save_button() throws Throwable{
		   Stylepage.Click_on_the_Manage_images_Save_button();
		   }
		   @And ("^Click on the Manage Close button$")
		   public void Click_on_the_Manage_Close_button() throws Throwable{
		   Stylepage.Click_on_the_Manage_Close_button();
		   }
		   @And ("^Click on the Manage Images cancel Icon$")
		   public void Click_on_the_Manage_Images_cancel_Icon() throws Throwable{
		   Stylepage.Click_on_the_Manage_Images_cancel_Icon();
		   }
		   
		   @And ("^Click on the Edit Icon in style master grid$")
		   public void Click_on_the_Edit_Icon_in_style_master_grid() throws Throwable{
		   Stylepage.Click_on_the_Edit_Icon_in_style_master_grid();
		   }
		   @Given ("^the user is on the edit form page$")
		   public void the_user_is_on_the_edit_form_page() throws Throwable{
		   Stylepage.the_user_is_on_the_edit_form_page();
		   }
		   @When ("^the user updates the Buyer style$")
		   public void the_user_updates_the_Buyer_style() throws Throwable{
		   Stylepage.the_user_updates_the_Buyer_style();
		   }
		   @And ("^The User Updates the Buyer name$")
		   public void The_User_Updates_the_Buyer_name() throws Throwable{
		   Stylepage.The_User_Updates_the_Buyer_name();
		   }
		   @And ("^the user updates the season$")
		   public void the_user_updates_the_season() throws Throwable{
		   Stylepage.the_user_updates_the_season();
		   }
		   @And ("^The User Updates the Garment Type$")
		   public void the_user_updates_the_garment_Type() throws Throwable{
		   Stylepage.The_user_updates_the_Garment_Type();
		   }
		   @When ("^The User Updates the Garment Process$")
		   public void the_user_updates_the_Garment_Process() throws Throwable{
		   Stylepage.The_user_updates_the_Garment_Process();
		   }
		   @And ("^CLick on the Edit Close icon$")
		   public void CLick_on_the_Edit_Close_icon() throws Throwable{
		   Stylepage.CLick_on_the_Edit_Close_icon();
		   }
		   @And ("^Click on the Edit Close button$")
		   public void Click_on_the_Edit_Close_button() throws Throwable{
		   Stylepage.Click_on_the_Edit_Close_button();
		   }
		   @And ("^Click on the Update button$")
		   public void Click_on_the_Update_button() throws Throwable{
		   Stylepage.Click_on_the_Update_button();
		   }
		   @And ("^Click on the Delete Icon in style master grid$")
		   public void Click_on_the_Delete_Icon_in_style_master_grid() throws Throwable{
		   Stylepage.Click_on_the_Delete_Icon_in_style_master_grid();
		   }
		   @And ("^Click on the Yes button$")
		   public void Click_on_the_Yes_button() throws Throwable{
		   Stylepage.Click_on_the_Yes_button();
		   }
		   @And ("^Click on the No button$")
		   public void Click_on_the_No_button() throws Throwable{
		   Stylepage.Click_on_the_No_button();
		   }
      
		   @And ("^Verify whether the delete is working or not$")
		   public void Verify_whether_the_delete_is_working_or_not () throws Throwable {
			   Stylepage.Verify_whether_the_delete_is_working_or_not();   
		   }
		   }
		   


