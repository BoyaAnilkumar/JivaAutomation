package Stepdefinition1;


import Page.MerchandisingTandA_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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
		 public void Enter_the_data_in_Testing_GPT1_submission_and_Approval() {
			 MerchandisingTandA_Pages.Enter_the_data_in_Testing_GPT1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in GPT1 Remarks Field$")
		 public void Enter_the_data_in_GPT1_Remarks_Field() {
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
		 public void Enter_the_data_in_Testing_FPT1_submission_and_Approval() {
			 MerchandisingTandA_Pages.Enter_the_data_in_Testing_FPT1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in FPT1 Remarks Field$")
		 public void Enter_the_data_in_FPT1_Remarks_Field() {
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
		 public void Enter_the_data_in_Testing_Photoshoot1_submission_and_Approval() {
			 MerchandisingTandA_Pages.Enter_the_data_in_Testing_Photoshoot1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in Photoshoot1 Remarks Field$")
		 public void Enter_the_data_in_Photoshoot1_Remarks_Field() {
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
		 public void Enter_the_data_in_TOP_Sample1_submission_and_Approval() {
			 MerchandisingTandA_Pages.Enter_the_data_in_TOP_Sample1_submission_and_Approval();
		 }
		 
		 @And("^Enter the data in TOP Sample1 Remarks Field$")
		 public void Enter_the_data_in_TOP_Sample1_Remarks_Field() {
			 MerchandisingTandA_Pages.Enter_the_data_in_TOP_Sample1_Remarks_Field();
		 }
		 
		 @And("^Click on Add button of TOP Sample1$")
		 public void Click_on_Add_button_of_TOP_Sample1() {
			 MerchandisingTandA_Pages.Click_on_Add_button_of_TOP_Sample1();
		 }
		 
		 
		 @And("^Click on the TOP Sample1 Delete Icon$")
		 public void Click_on_the_TOP_Sample1_Delete_Icon() {
			 MerchandisingTandA_Pages.Click_on_the_TOP_Sample1_Delete_Icon();
		 }
		 
		 @Given("^Enter the data in File Handover$")
		 public void Enter_the_data_in_File_Handover() {
			 MerchandisingTandA_Pages.Enter_the_data_in_File_Handover();
		 }
		 
		 @Given("^Enter the data in Size set$")
		 public void Enter_the_data_in_Size_set() {
			 MerchandisingTandA_Pages.Enter_the_data_in_Size_set();
		 }
		 
		 @Given("^Enter the data in PPM$")
		 public void Enter_the_data_in_PPM() {
			 MerchandisingTandA_Pages.Enter_the_data_in_PPM();
		 }
		 
		 @And("^Verify the Bulk Fabric Flow date is displaying or not$")
		 public void Verify_the_Bulk_Fabric_Flow_date_is_displaying_or_not() {
			 MerchandisingTandA_Pages.Verify_the_Bulk_Fabric_Flow_date_is_displaying_or_not();
		 }
		 
		 @And("^Click on View icon for Bulk Fabric Flow$")
		 public void Click_on_View_icon_for_Bulk_Fabric_Flow() {
			 MerchandisingTandA_Pages.Click_on_View_icon_for_Bulk_Fabric_Flow();
		 }
		 
		 @And("^Verify the EMB PCD is clickable or not$")
		 public void Verify_the_EMB_PCD_is_clickable_or_not() {
			 MerchandisingTandA_Pages.Verify_the_EMB_PCD_is_clickable_or_not();
		 }
		 
		 @And("^Verify that data is displaying for the EMB PCD or not$")
		 public void Verify_that_data_is_displaying_for_the_EMB_PCD_or_not() {
			 MerchandisingTandA_Pages.Verify_that_data_is_displaying_for_the_EMB_PCD_or_not();
		 }
		 
		 @Given("^Enter the date in PCD Field$")
		 public void Enter_the_date_in_PCD_Field() {
			 MerchandisingTandA_Pages.Enter_the_date_in_PCD_Field();
		 }
		 
		 @And("^click on dropdown to change the PCD Test$")
		 public void click_on_dropdown_to_change_the_PCD_Test() {
			 MerchandisingTandA_Pages.click_on_dropdown_to_change_the_PCD_Test();
		 }
		 
		 @And("^Verify that ExFactory date is displaying or not$")
		 public void Verify_that_ExFactory_date_is_displaying_or_not() {
			 MerchandisingTandA_Pages.Verify_that_ExFactory_date_is_displaying_or_not();
		 }
		 
		 @Then("^Verify that DTP days are displaying after inserting the date in PCD Test$")
		 public void Verify_that_DTP_days_are_displaying_after_inserting_the_date_in_PCD_Test() {
			 MerchandisingTandA_Pages.Verify_that_DTP_days_are_displaying_after_inserting_the_date_in_PCD_Test();
		 }
		 
		 
		 
		 
		 
		 
}