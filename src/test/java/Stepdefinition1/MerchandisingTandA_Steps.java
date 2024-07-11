package Stepdefinition1;



import Page.MerchandisingTandA_Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MerchandisingTandA_Steps {

		MerchandisingTandA_Pages MerchandisingTandA_Pages = new MerchandisingTandA_Pages();



		 @And ("^Click on the Merchandising T&A Data Entry Screen$")
		 public void Click_on_the_Merchandising_T_and_A_Data_Entry_Screen() throws Throwable{
		  MerchandisingTandA_Pages.Click_on_the_Merchandising_T_and_A_Data_Entry_Screen();
		 }
		
		 @And ("^Select the Month$")
		 public void Select_the_Month() throws Throwable{
		  MerchandisingTandA_Pages.Select_the_Month();
		}	 
		 @And ("^Search The IPO and Style$")
		 public void Search_The_IPO_and_Style() throws Throwable{
		  MerchandisingTandA_Pages.Search_The_IPO_and_Style();
		}	
		 @And ("^Verify the Buying house name is displaying or not$")
		 public void Verify_the_Buying_house_name_is_displaying_or_not() throws Throwable{
		  MerchandisingTandA_Pages.Verify_the_Buying_house_name_is_displaying_or_not();
		}	
		 @And ("^Verify the IPO Qty Value is displaying or not$")
		 public void Verify_the_IPO_Qty_Value_is_displaying_or_not() throws Throwable{
		  MerchandisingTandA_Pages.Verify_the_IPO_Qty_Value_is_displaying_or_not();
		}
		 @And ("^Click on the Add button$")
		 public void Click_on_the_Add_button() throws Throwable{
	     MerchandisingTandA_Pages.Click_on_the_Add_button();
}
		 @Given ("^Enter the data in proto commends received field$")
		 public void Enter_the_data_in_proto_commends_received_field() throws Throwable{
	     MerchandisingTandA_Pages.Enter_the_data_in_proto_commends_received_field();
}
		
		 @Given ("^Enter the data in Fit submittion field$")
		 public void Enter_the_data_in_Fit_submittion_field() throws Throwable{
	     MerchandisingTandA_Pages.Enter_the_data_in_Fit_submittion_field();
}
		 @Given ("^Enter the data in Fit submittion and Approval fields$")
		 public void Enter_the_data_in_Fit_submittion_and_Approval_fields() throws Throwable{
		     MerchandisingTandA_Pages.Enter_the_data_in_Fit_submittion_and_Approval_fields();
	}
		 @And ("^Enter the data in Fit Remarks Field$")
		 public void Enter_the_data_in_Fit_Remarks_Field() throws Throwable{
		     MerchandisingTandA_Pages.Enter_the_data_in_Fit_Remarks_Field();
		 }
		 @And ("^Verify whether the Fabric Initial In House date is prepopulated in the field or not$")
		 public void Verify_whether_the_Fabric_Initial_In_House_date_is_prepopulated_in_the_field_or_not() throws Throwable{
		     MerchandisingTandA_Pages.Verify_whether_the_Fabric_Initial_In_House_date_is_prepopulated_in_the_field_or_not();
		 }
		 @And ("^Click on the Fabric Initial In House Date View button$")
		 public void Click_on_the_Fabric_Initial_In_House_Date_View_button() throws Throwable{
		     MerchandisingTandA_Pages.Click_on_the_Fabric_Initial_In_House_Date_View_button();
		 }
		 @And ("^Click on the Fabric Initial In House Date View Close button$")
		 public void Click_on_the_Fabric_Initial_In_House_Date_View_Close_button() throws Throwable{
		     MerchandisingTandA_Pages.Click_on_the_Fabric_Initial_In_House_Date_View_Close_button();
		 }
		 @And ("^Click on the PP Add button$")
		 public void Click_on_the_PP_Add_button() throws Throwable{
		     MerchandisingTandA_Pages.Click_on_the_PP_Add_button();
		 }
		 
		 @And ("^Enter the data in PP Submission and Approval$")
		 public void Enter_the_data_in_PP_Submission_and_Approval() throws Throwable{
		     MerchandisingTandA_Pages.Enter_the_data_in_PP_Submission_and_Approval();
		 }
		
		 @And("^Click on the Testing GPT1 Add button$")
		 public void Click_on_the_Testing_GPT1_Add_button() {
			 MerchandisingTandA_Pages.Click_on_the_Testing_GPT1_Add_button();
		 }
		 
		 @Given("^Enter the data in Testing GPT1 submission and Approval$")
		 public void Enter_the_data_in_Testing_GPT1_submission_and_Approval() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_Testing_GPT1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in GPT1 Remarks Field$")
		 public void Enter_the_data_in_GPT1_Remarks_Field() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_GPT1_Remarks_Field();
		 }
		 
		 @And("^Click on the Testing GPT1 Delete Icon$")
		 public void Click_on_the_Testing_GPT1_Delete_Icon() {
			 MerchandisingTandA_Pages.Click_on_the_Testing_GPT1_Delete_Icon();
		 }
		 
		 
		 @And("^Click on the Testing FPT1 Add button$")
		 public void Click_on_the_Testing_FPT1_Add_button() {
			 MerchandisingTandA_Pages.Click_on_the_Testing_FPT1_Add_button();
		 }
		 
		 @Given("^Enter the data in Testing FPT1 submission and Approval$")
		 public void Enter_the_data_in_Testing_FPT1_submission_and_Approval() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_Testing_FPT1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in FPT1 Remarks Field$")
		 public void Enter_the_data_in_FPT1_Remarks_Field() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_FPT1_Remarks_Field();
		 }
		 
		 @And("^Click on the Testing FPT1 Delete Icon$")
		 public void Click_on_the_Testing_FPT1_Delete_Icon() {
			 MerchandisingTandA_Pages.Click_on_the_Testing_FPT1_Delete_Icon();
		 }
		 
		 @And("^Click on the Testing Photoshoot1 Add button$")
		 public void Click_on_the_Testing_Photoshoot1_Add_button() {
			 MerchandisingTandA_Pages.Click_on_the_Testing_Photoshoot1_Add_button();
		 }
		 
		 @Given("^Enter the data in Testing Photoshoot1 submission and Approval$")
		 public void Enter_the_data_in_Testing_Photoshoot1_submission_and_Approval() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_Testing_Photoshoot1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in Photoshoot1 Remarks Field$")
		 public void Enter_the_data_in_Photoshoot1_Remarks_Field() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_Photoshoot1_Remarks_Field();
		 }
		 
		 @And("^Click on the Testing Photoshoot1 Delete Icon$")
		 public void Click_on_the_Testing_Photoshoot1_Delete_Icon() {
			 MerchandisingTandA_Pages.Click_on_the_Testing_Photoshoot1_Delete_Icon();
		 }
		 
		 @And("^Click on the TOP Sample1 Add button$")
		 public void Click_on_the_TOP_Sample1_Add_button() {
			 MerchandisingTandA_Pages.Click_on_the_TOP_Sample1_Add_button();
		 }
		 
		 @Given("^Enter the data in TOP Sample1 submission and Approval$")
		 public void Enter_the_data_in_TOP_Sample1_submission_and_Approval() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_TOP_Sample1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in TOP Sample1 Remarks Field$")
		 public void Enter_the_data_in_TOP_Sample1_Remarks_Field() throws Throwable {
			 MerchandisingTandA_Pages.Enter_the_data_in_TOP_Sample1_Remarks_Field();
		 }
		 
		 @And("^Click on the TOP Sample1 Delete Icon$")
		 public void Click_on_the_TOP_Sample1_Delete_Icon() {
			 MerchandisingTandA_Pages.Click_on_the_TOP_Sample1_Delete_Icon();
		 }
		 
		 @And ("^Select the value in File Handover field$")
		 public void Select_the_value_in_File_Handover_field() throws Throwable{
		     MerchandisingTandA_Pages.Select_the_value_in_File_Handover_field();
		 }
		 @Given ("^Enter the data in File handover date field$")
		 public void Enter_the_data_in_File_handover_date_field() throws Throwable{
		     MerchandisingTandA_Pages.Enter_the_data_in_File_handover_date_field();
		 }
		 @When ("^Enter the data in File handover Remarks field$")
		 public void Enter_the_data_in_File_handover_Remarks_field() throws Throwable{
		     MerchandisingTandA_Pages.Enter_the_data_in_File_handover_Remarks_field();
		 }
		 @And ("^Select the value in Size set field$")
		 public void Select_the_value_in_Size_set_field() throws Throwable{
		     MerchandisingTandA_Pages.Select_the_value_in_Size_set_field();
		 }

		 
		 @Given ("^Enter the data in Size set date field$")
		 public void Enter_the_data_in_Size_set_date_field() throws Throwable{
		     MerchandisingTandA_Pages.Enter_the_data_in_Size_set_date_field();
		 }

		 
		 @When ("^Enter the data in Size set Remarks field$")
		 public void Enter_the_data_in_Size_set_Remarks_field()throws Throwable{
		     MerchandisingTandA_Pages.Enter_the_data_in_Size_set_Remarks_field();
		 }

		 
		 @And ("^Select the value in PPM field$")
	     public void Select_the_value_in_PPM_field() throws Throwable{
		 MerchandisingTandA_Pages.Select_the_value_in_PPM_field();
	}
		@Given ("^Enter the data in PPM date field$")
		public void Enter_the_data_in_PPM_date_field() throws Throwable{
			 MerchandisingTandA_Pages.Enter_the_data_in_PPM_date_field();
		}
		 @When ("^Enter the data in PPM Remarks field$")
		 public void Enter_the_data_in_PPM_Remarks_field() throws Throwable{
			 MerchandisingTandA_Pages.Enter_the_data_in_PPM_Remarks_field();
		}
		 @And ("^Verify whether the Bulk Fabric Flow date is prepopulated in the field or not$")
		 public void Verify_whether_the_Bulk_Fabric_Flow_date_is_prepopulated_in_the_field_or_not() throws Throwable{
			 MerchandisingTandA_Pages.Verify_whether_the_Bulk_Fabric_Flow_date_is_prepopulated_in_the_field_or_not();
		}
		@And ("^Click on the Bulk Fabric Flow View button$")
		public void Click_on_the_Bulk_Fabric_Flow_View_button() throws Throwable{
			 MerchandisingTandA_Pages.Click_on_the_Bulk_Fabric_Flow_View_button();
		}
		@And ("^Click on the Bulk Fabric Flow View Close button$")
		public void Click_on_the_Bulk_Fabric_Flow_View_Close_button() throws Throwable{
			 MerchandisingTandA_Pages.Click_on_the_Bulk_Fabric_Flow_View_Close_button();
		}
		 @And ("^Select the value in PCD Field$")
		 public void Select_the_value_in_PCD_Field() throws Throwable{
			 MerchandisingTandA_Pages.Select_the_value_in_PCD_Field();
		}
		 @Then ("^Enter the date in PCD Field$")
		 public void Enter_the_date_in_PCD_Field() throws Throwable{
			 MerchandisingTandA_Pages.Enter_the_date_in_PCD_Field();
		}
		 @And ("^Verify the Ex factory field date is prepopulated or not$")
		 public void Verify_the_Ex_factory_field_date_is_prepopulated_or_not() throws Throwable{
			 MerchandisingTandA_Pages.Verify_the_Ex_factory_field_date_is_prepopulated_or_not();
		}
		 @And ("^Verify the DTP field data is prepopulated or not$")
		 public void Verify_the_DTP_field_data_is_prepopulated_or_not() throws Throwable{
			 MerchandisingTandA_Pages.Verify_the_DTP_field_data_is_prepopulated_or_not();
		}
		 @And ("^Click on the Save button in T and A Input$")
		 public void Click_on_the_Save_button_in_T_and_A_Input() throws Throwable{
			 MerchandisingTandA_Pages.Click_on_the_Save_button_in_T_and_A_Input();
		}
		 @And ("^Click on the Cancel button in T and A Input$")
		 public void Click_on_the_Cancel_button_in_T_and_A_Input() throws Throwable{
			 MerchandisingTandA_Pages.Click_on_the_Cancel_button_in_T_and_A_Input();
		}
		 
		 
		 
		 
}