package Stepdefinition1;

import Page.Newfabricsheet_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Newfabricsheet_Steps {

	Newfabricsheet_Pages Newfabricsheet_Pages = new Newfabricsheet_Pages();




	
//	         @When("^User navigates to Login page$")
//		     public void User_navigates_to_Login_page() throws Throwable {
//			 Newfabricsheet_Pages.User_navigates_to_Login_page();
//			}
			
//			@Then("^User enters the username and password$")
//			public void User_enters_the_username_and_password() throws Throwable {
//				Newfabricsheet_Pages.User_enters_the_username_and_password();
//
//		    }

//			@And("^User click on the signIn$")
//			public void User_click_on_the_signIn() throws Throwable {
//				Newfabricsheet_Pages.User_click_on_the_signIn();
//
//		   }


			 @And ("^Click on the Woven Module$")
			   public void Click_on_the_Woven_Module() throws Throwable{
				 Newfabricsheet_Pages.Click_on_the_Woven_Module();
			 }
			  @Then ("^click on the Merchandising Module$")
			   public void click_on_the_Merchandising_Module() throws Throwable{
				  Newfabricsheet_Pages.click_on_the_Merchandising_Module();
			   }
			  @And ("^Click on the Generate Fabric Sheet Module$")
			   public void Click_on_the_Generate_Fabric_Sheet_Module() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Generate_Fabric_Sheet_Module();
			   }
			  
			   @And ("^Click on the New Fabric Sheet Screen$")
			   public void Click_on_the_New_Fabric_Sheet_Screen() throws Throwable{
				   Newfabricsheet_Pages.Click_on_the_New_Fabric_Sheet_Screen();
			   }
			   @And ("^Verify whether the New fabric sheet screen is displaying or not$")
			   public void Verify_whether_the_New_fabric_sheet_screen_is_displaying_or_not() throws Throwable{
				   Newfabricsheet_Pages.Verify_whether_the_New_fabric_sheet_screen_is_displaying_or_not();
			   }
			  
			   @And ("^Select the IPO and Style$")
			   public void Select_the_IPO_and_Style() throws Throwable{
				   Newfabricsheet_Pages.Select_the_IPO_and_Style();
			   }
			   @Given ("^Enter the data in Bulk Fabric Deadline field$")
			   public void Enter_the_data_in_Bulk_Fabric_Deadline_field() throws Throwable{
				   Newfabricsheet_Pages.Enter_the_data_in_Bulk_Fabric_Deadline_field();
			   }
			   @And ("^Click on the Fabric Manager Field$")
			   public void Click_on_the_Fabric_Manager_Field() throws Throwable{
				   Newfabricsheet_Pages.Click_on_the_Fabric_Manager_Field(); 
			   }
			   @And ("^Select the Fabric Manager Assistants$")
			   public void Select_the_Fabric_Manager_Assistants() throws Throwable{
				   Newfabricsheet_Pages.Select_the_Fabric_Manager_Assistants();
			   }
			   @And ("^Click on the Add New Fabric button$")
			   public void Click_on_the_Add_New_Fabric_button() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Add_New_Fabric_button();
			   }
			   @And ("^Select the Is Nominated Check box$")
			   public void Select_the_Is_Nominated_Check_box() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Is_Nominated_Check_box();
			   }
			   @When ("^User select the Supplier name$")
			   public void User_select_the_Supplier_name() throws Throwable{
				  Newfabricsheet_Pages.User_select_the_Supplier_name();
			   }
			   @And ("^Click on the Fabric Quality field$")
			   public void Click_on_the_Fabric_Quality_field() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Fabric_Quality_field();
			   }
			   @And ("^Select the Fabric Quality$")
			   public void Select_the_Fabric_Quality() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Fabric_Quality();
			   }
			   @Then ("^Click on the Content$")
			   public void Click_on_the_Content() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Content();
			   }
			   @Then ("^Click on the Count Construction$")
			   public void Click_on_the_Count_Construction () throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Count_Construction();
			   }
			   @And ("^Click on the Required GSM$")
			   public void Click_on_the_Required_GSM() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Required_GSM();
			   }
			   @And ("^Click on the Cuttable Width$")
			   public void Click_on_the_Cuttable_Width() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Cuttable_Width();
			   }
			   @And ("^Select the Fabric Use$")
			   public void Select_the_Fabric_Use() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Fabric_Use();
			   }
			   @When ("^Select the Colour$")
			   public void Select_the_Colour() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Colour();
			   }
			   @And ("^Select the Applicable Combos$")
			   public void Select_the_Applicable_Combos() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Applicable_Combos();
			   }
			   @And ("^Enter the data in Addl Information field$")
			   public void Enter_the_data_in_Addl_Information_field() throws Throwable{
				  Newfabricsheet_Pages.Enter_the_data_in_Addl_Information_field();
			   }
			   @And ("^Enter the data in Additional field$")
			   public void Enter_the_data_in_Additional_field() throws Throwable{
				  Newfabricsheet_Pages.Enter_the_data_in_Additional_field();
			   }
			   @Given ("^Enter the data in garment average field$")
			   public void Enter_the_data_in_garment_average_field() throws Throwable{
				  Newfabricsheet_Pages.Enter_the_data_in_garment_average_field();
			   }
			   @And ("^Select the Garment Average UOM$")
			   public void Select_the_Garment_Average_UOM() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Garment_Average_UOM();
			   }
			   @And ("^Select the Required UOM$")
			   public void Select_the_Required_UOM() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Required_UOM();
			   }
			   @Given ("^Enter the data in Cutting wastage field$")
			   public void Enter_the_data_in_Cutting_wastage_field() throws Throwable{
				  Newfabricsheet_Pages.Enter_the_data_in_Cutting_wastage_field();
			   }
			   @And ("^Check the Fabric Required For Cutting field value is calculated or not$")
			   public void Check_the_Fabric_Required_For_Cutting_field_value_is_calculated_or_not() throws Throwable{
				  Newfabricsheet_Pages.Check_the_Fabric_Required_For_Cutting_field_value_is_calculated_or_not();
			   }
			   @And ("^Enter the data in Fabric Required For Sampling$")
			   public void Enter_the_data_in_Fabric_Required_For_Sampling() throws Throwable{
				  Newfabricsheet_Pages.Enter_the_data_in_Fabric_Required_For_Sampling();
			   }
			   @And ("^Check the Total Fabric Required field value is calculated or not$")
			   public void Check_the_Total_Fabric_Required_field_value_is_calculated_or_not() throws Throwable{
				  Newfabricsheet_Pages.Check_the_Total_Fabric_Required_field_value_is_calculated_or_not();
			   }
//			   @And ("^Click on the cancel button$")
//			   public void Click_on_the_cancel_button() throws Throwable{
//				  Newfabricsheet_Pages.Click_on_the_cancel_button();
//			   }
			   @And ("^Click on the Save button$")
			   public void Click_on_the_Save_button() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Save_button();
			   }
			   @And ("^After click on the Save button the validation msg is displaying or not$")
			   public void After_click_on_the_Save_button_the_validation_msg_is_displaying_or_not() throws Throwable{
				  Newfabricsheet_Pages.After_click_on_the_Save_button_the_validation_msg_is_displaying_or_not();
			   }
			   @And ("^Click on the Delete Icon$")
			   public void Click_on_the_Delete_Icon() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Delete_Icon();
			   }
			   @And ("^Click on the Edit Icon$")
			   public void Click_on_the_Edit_Icon() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Edit_Icon();
			   }
			   @When ("^Click on the Import Fabric details button$")
			   public void Click_on_the_Import_Fabric_details_button() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Import_Fabric_details_button();
			   }
			   @And ("^Select the Other Radio button$")
			   public void Select_the_Other_Radio_button() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Other_Radio_button();
			   }
			   @And ("^Select the Fabric name$")
			   public void Select_the_Fabric_name() throws Throwable{
				  Newfabricsheet_Pages.Select_the_Fabric_name();
			   }
			   @And ("^Select the IPO name$")
			   public void Select_the_IPO_name() throws Throwable{
				  Newfabricsheet_Pages.Select_the_IPO_name();
			   }
			   @And ("^Click on the Close button$")
			   public void Click_on_the_Close_button() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Close_button();
			   }
			   @And ("^Click on the Import button$")
			   public void Click_on_the_Import_button() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Import_button();
			   }
			   @When ("^Enter the data after import the fabric details$")
			   public void Enter_the_data_after_import_the_fabric_details() throws Throwable{
				  Newfabricsheet_Pages.Enter_the_data_after_import_the_fabric_details();
			   }
			   @And ("^Select the WithIn IPO Radio button$")
			   public void Select_the_WithIn_IPO_Radio_button() throws Throwable{
				  Newfabricsheet_Pages.Select_the_WithIn_IPO_Radio_button();
			   }
			   @And ("^Select the PD FDS Radio button$")
			   public void Select_the_PD_FDS_Radio_button() throws Throwable{
				  Newfabricsheet_Pages.Select_the_PD_FDS_Radio_button();
			   }
			   @And ("^Click on the Close Icon in Import Fabric details page$")
			   public void Click_on_the_Close_Icon_in_Import_Fabric_details_page() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Close_Icon_in_Import_Fabric_details_page();
			   }
			   @And ("^Click on the Submit to Fabric Team button$")
			   public void Click_on_the_Submit_to_Fabric_Team_button() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Submit_to_Fabric_Team_button();
			   }
			   @And ("^Update the Supplier Information$")
			   public void Update_the_Supplier_Information() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Supplier_Information();
			   }
			   @And ("^Update the Fabric Quality$")
			   public void Update_the_Fabric_Quality() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Fabric_Quality();
			   }
			   @And ("^Update the Content$")
			   public void Update_the_Content() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Content();
			   }
			   @And ("^Update the Count construction$")
			   public void Update_the_Count_construction() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Count_construction();
			   }
			   @And ("^Update the Required GSM$")
			   public void Update_the_Required_GSM() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Required_GSM();
			   }
			   @And ("^Update the Cuttable Width$")
			   public void Update_the_Cuttable_Width() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Cuttable_Width();
			   } 
			   @And ("^Update the Fabric Use$")
			   public void Update_the_Fabric_Use() throws Throwable{
			   } 
			  
			   @And ("^Update the Colour$")
			   public void Update_the_Colour() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Colour();
			   }
			   @And ("^Update the Applicable Combos$")
			   public void Update_the_Applicable_Combos() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Applicable_Combos();
			   }
			   @And ("^Update the Garment Average Details$")
			   public void Update_the_Garment_Average_Details() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Garment_Average_Details();
			   }
			   @And ("^Update the Quantity Requirment details$")
			   public void Update_the_Quantity_Requirment_details() throws Throwable{
				  Newfabricsheet_Pages.Update_the_Quantity_Requirment_details();
			   }
//			   @And ("^Click on the Cancel button$")
//			   public void Click_on_the_Cancel_button() throws Throwable{
//				  Newfabricsheet_Pages.Click_on_the_Cancel_button();
//			   }
			   @And ("^Click on the Submit button $")
			   public void Click_on_the_Submit_button() throws Throwable{
				  Newfabricsheet_Pages.Click_on_the_Submit_button();
			   }

			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
}