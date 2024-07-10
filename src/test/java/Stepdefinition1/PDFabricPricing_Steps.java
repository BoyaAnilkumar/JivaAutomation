package Stepdefinition1;

import Pages.FabricPricing_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PDFabricPricing_Steps {
		
	FabricPricing_Pages FabricPricing_Pages = new FabricPricing_Pages();
	
	@Given("^User Enters the username and password$")
	public void User_enters_the_username_and_password() throws Throwable {
		FabricPricing_Pages.User_enters_the_username_and_password();
	
    }
	
	@Then ("^Click on Fabric Sourcing module$")
	 public void Click_on_Fabric_Sourcing_module() throws Throwable{
		FabricPricing_Pages.Click_on_Fabric_Sourcing_module();
}
	
	@And("^click on PD Fabric Pricing$")
	public void click_on_PD_Fabric_Pricing() throws Throwable {
		FabricPricing_Pages.click_on_PD_Fabric_Pricing();
	}

	 @And ("^Click on the Filter icon$")
	 public void Click_on_the_Filter_icon() throws Throwable{
	 FabricPricing_Pages.Click_on_the_Filter_icon();
  }
	 @And ("^Click on the Season field$")
	   public void Click_on_the_Season_field() throws Throwable{
		FabricPricing_Pages.Click_on_the_Season_field();
	   }
	 @And ("^Search The Style$")
	   public void Search_The_Style() throws Throwable{
		FabricPricing_Pages.Search_The_Style();
	   }
	 @And ("^Select the Style$")
	  public void Select_the_Style() throws Throwable{
	  FabricPricing_Pages.Select_the_Style();
	 }
	 @And ("^Verify the Style name is displayed or not$")
	  public void Verify_the_Style_name_is_displayed_or_not() throws Throwable{
	  FabricPricing_Pages.Verify_the_Style_name_is_displayed_or_not();
	 }
	 @And ("^Verify the Buyer name is displayed or not$")
	  public void Verify_the_Buyer_name_is_displayed_or_not() throws Throwable{
	  FabricPricing_Pages.Verify_the_Buyer_name_is_displayed_or_not();
	 }
	 @And ("^Verify the Season name is displayed or not$")
	  public void Verify_the_Season_name_is_displayed_or_not() throws Throwable{
	  FabricPricing_Pages.Verify_the_Season_name_is_displayed_or_not();
	 }
	 @And ("^Verify the Qty value is displayed or not$")
	  public void Verify_the_Qty_value_is_displayed_or_not() throws Throwable{
	  FabricPricing_Pages.Verify_the_Qty_value_is_displayed_or_not();
	 }
	 @And ("^Verify the Order date is displayed or not$")
	  public void Verify_the_Order_date_is_displayed_or_not() throws Throwable{
	  FabricPricing_Pages.Verify_the_Order_date_is_displayed_or_not();
	 }
	 @And ("^click on the Fabric cancel icon$")
	  public void click_on_the_Fabric_cancel_icon() throws Throwable{
	  FabricPricing_Pages.click_on_the_Fabric_cancel_icon();
	 }
	 @And ("^Verify whether the Fabric Quality field data is prepopulated or not$")
	 public void Verify_whether_the_Fabric_Quality_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_Fabric_Quality_field_data_is_prepopulated_or_not();
		 }
	 
	 
	 @And ("^Verify whether the Content field data is prepopulated or not$")
	 public void Verify_whether_the_Content_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_Content_field_data_is_prepopulated_or_not();
		 }
	 
	 
	 @And ("^Verify whether the color field data is prepopulated or not$")
	 public void Verify_whether_the_color_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_color_field_data_is_prepopulated_or_not();
	}
	 
	 
	 @And ("^Verify wether the Count Construction field data is prepopulated or not$")
	 public void Verify_wether_the_Count_Construction_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_wether_the_Count_Construction_field_data_is_prepopulated_or_not();
	}
	 
	 
	 @And ("^Verify whether the GSM field data is prepopulated or not$")
	 public void Verify_whether_the_GSM_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_GSM_field_data_is_prepopulated_or_not();
	}
	 @And ("^Verify whether the Finish field data is prepopulated or not$")
	 public void Verify_whether_the_Finish_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_Finish_field_data_is_prepopulated_or_not();
	}
	 
	 @And ("^Verify whether the Specific Requirements field data is prepopulated or not$")
	 public void Verify_whether_the_Specific_Requirements_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_Specific_Requirements_field_data_is_prepopulated_or_not();
	}
	 
	 
	 @And ("^Verify whether the Fabric Quantity field data is prepopulated or not$")
	 public void Verify_whether_the_Fabric_Quantity_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_Fabric_Quantity_field_data_is_prepopulated_or_not();
	}
	 
	 
	 @And ("^Verify whether the Full Width field data is prepopulated or not$")
	 public void Verify_whether_the_Full_Width_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_Full_Width_field_data_is_prepopulated_or_not();
	}
	 
	 
	 @And ("^Verify wether the Cuttable Width field data is prepopulated or not$")
	 public void Verify_wether_the_Cuttable_Width_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_wether_the_Cuttable_Width_field_data_is_prepopulated_or_not();
	}
	 
	 
	 @And ("^Verify whether the Use field data is prepopulated or not$")
	 public void Verify_whether_the_Use_field_data_is_prepopulated_or_not() throws Throwable{
		  FabricPricing_Pages.Verify_whether_the_Use_field_data_is_prepopulated_or_not();
	}
	 
	 @And ("^Click on the Add Pricing button$")
	  public void Click_on_the_Add_Pricing_button() throws Throwable{
	  FabricPricing_Pages.Click_on_the_Add_Pricing_button();
	 }
	 @And ("^Select the Process$")
	  public void Select_the_Process() throws Throwable{
	  FabricPricing_Pages.Select_the_Process();
	 } 
	 @Given ("^Enter the Price$")
	  public void Enter_the_Price() throws Throwable{
	  FabricPricing_Pages.Enter_the_Price();
	 }
	 @And ("^Select the Fabric Supplier$")
	  public void Select_the_Fabric_Supplier() throws Throwable{
	  FabricPricing_Pages.Select_the_Fabric_Supplier();
	 }
	 @And ("^Enter the Remarks Field$")
	  public void Enter_the_Remarks_Field() throws Throwable{
	  FabricPricing_Pages.Enter_the_Remarks_Field();
	 } 
	 @And ("^Click on the delete icon$")
	  public void Click_on_the_delete_icon() throws Throwable{
	  FabricPricing_Pages.Click_on_the_delete_icon();
	 } 
	 @And ("^Enter the data in Total Price Field$")
	  public void Enter_the_data_in_Total_Price_Field() throws Throwable{
	  FabricPricing_Pages.Enter_the_data_in_Total_Price_Field();
	 } 
	 @And ("^Enter the data in Total Fabric Lead Time$")
	  public void Enter_the_data_in_Total_Fabric_Lead_Time() throws Throwable{
	  FabricPricing_Pages.Enter_the_data_in_Total_Fabric_Lead_Time();
	 } 
	 @And ("^Enter the data in Price Valid For Days$")
	  public void Enter_the_data_in_Price_Valid_For_Days() throws Throwable{
	  FabricPricing_Pages.Enter_the_data_in_Price_Valid_For_Days();
	 } 
	 @Given ("^Enter the data in Residual Shrinkage field$")
	 public void Enter_the_data_in_Residual_Shrinkage_field() throws Throwable{
		 FabricPricing_Pages.Enter_the_data_in_Residual_Shrinkage_field();	 
	 }
	 @And ("^Enter the data in boing field$")
	 public void Enter_the_data_in_boing_field() throws Throwable{
		 FabricPricing_Pages.Enter_the_data_in_boing_field();	 
	 }
	 @And ("^Enter the data in CS field$")
	 public void Enter_the_data_in_CS_field() throws Throwable{
		 FabricPricing_Pages.Enter_the_data_in_CS_field();	 
	 }
	 @And ("^Enter the data in Color Fastness field$")
	 public void Enter_the_data_in_Color_Fastness_field() throws Throwable{
		 FabricPricing_Pages.Enter_the_data_in_Color_Fastness_field();	 
	 }
	 @And ("^Enter the data in GSM Variation$")
	 public void Enter_the_data_in_GSM_Variation() throws Throwable{
		 FabricPricing_Pages.Enter_the_data_in_GSM_Variation();	 
	 }
	 @And ("^Enter the data in Crinkle Variation field$")
	 public void Enter_the_data_in_Crinkle_Variation_field() throws Throwable{
		 FabricPricing_Pages.Enter_the_data_in_Crinkle_Variation_field();	 
	 }
	 @And ("^Enter the data in Any Other Remarks field$")
	 public void Enter_the_data_in_Any_Other_Remarks_field() throws Throwable{
		 FabricPricing_Pages.Enter_the_data_in_Any_Other_Remarks_field();	 
	 }
	 @And ("^CLick on the View For Print button$")
	 public void CLick_on_the_View_For_Print_button() throws Throwable{
		 FabricPricing_Pages.CLick_on_the_View_For_Print_button();	 
	 }
	 @And ("^Click on the Reset Button$")
	 public void Click_on_the_Reset_Button()throws Throwable{
		 FabricPricing_Pages.Click_on_the_Reset_Button();	 
	 }
	 @And ("^CLick on the Save Button$")
	 public void CLick_on_the_Save_Button() throws Throwable{
		 FabricPricing_Pages.CLick_on_the_Save_Button();	 
	 }
	 @And ("^Click on the Submit to Po Merchant Team button$")
	 public void Click_on_the_Submit_to_Po_Merchant_Team_button() throws Throwable{
		 FabricPricing_Pages.Click_on_the_Submit_to_Po_Merchant_Team_button();	 
	 }
	 @And ("^Verify whether the View for print page is displaying or not$")
	 public void Verify_whether_the_View_for_print_page_is_displaying_or_not() throws Throwable{
		 FabricPricing_Pages.Verify_whether_the_View_for_print_page_is_displaying_or_not();	 
	 }
	 
	 @And ("^Click on the cancel Button$")
	 public void Click_on_the_cancel_Button() throws Throwable{
		 FabricPricing_Pages.Click_on_the_cancel_Button();	 
	 }
	 @And ("^click on the Print button$")
	 public void click_on_the_Print_button() throws Throwable{
		FabricPricing_Pages.click_on_the_Print_button();	 
	 }
	 @And ("^Click on the Fabric name tab$")
	 public void Click_on_the_Fabric_name_tab() throws Throwable{
		 FabricPricing_Pages.Click_on_the_Fabric_name_tab();	 
	 }
	 @And ("^Click on the download icon$")
	 public void Click_on_the_download_icon() throws Throwable{
		FabricPricing_Pages.Click_on_the_download_icon();	 
	 }
	 
}