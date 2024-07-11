package Stepdefinition1;

import Page.TrimPOMasterSheet_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrimPOMasterSheet_Steps {
	
	TrimPOMasterSheet_Pages TPOMS = new TrimPOMasterSheet_Pages();

	
	@Then ("^Navigate to Trim PO Master Sheet screen$")
	public void Navigate_to_Trim_PO_Master_Sheet_screen() throws Throwable {
		TPOMS.Navigate_to_Trim_PO_Master_Sheet_screen();
	}
	@When ("^Click on filter expansion$")
	public void Click_on_filter_expansion() throws Throwable {
		TPOMS.Click_on_filter_expansion();
	}
	@When ("Click on Merchant dropdown field and select merchant{string}")
	public void Click_on_Merchant_dropdown_field_and_select_merchant(String Merchant) throws Throwable {
		TPOMS.Click_on_Merchant_dropdown_field_and_select_merchant(Merchant);
	}
	@When ("Click in the Buyer field and select a Buyer {string}")
	public void Click_in_the_Buyer_field_and_select_a_Buyer(String Buyer) throws Throwable {
		TPOMS.Click_in_the_Buyer_field_and_select_a_Buyer(Buyer);
	}
	@When ("Click in the Supplier field and select a Supplier {string}")
	public void Click_in_the_Supplier_field_and_select_a_Supplier(String Supplier) throws Throwable {
		TPOMS.Click_in_the_Supplier_field_and_select_a_Supplier(Supplier);
	}
	@When ("Click in the Item Name field and select a Item Name {string}")
	public void Click_in_the_Items_field_and_select_a_Item_Name(String Items) throws Throwable {
		TPOMS.Click_in_the_Items_field_and_select_a_Item_Name(Items);
	}
	@When ("Click in the Month field and select a Month {string}")
	public void Click_in_the_Month_field_and_select_a_Month(String Month) throws Throwable {
		TPOMS.Click_in_the_Month_field_and_select_a_Month(Month);
	}
	@When ("Click in the IPO field and select a IPO {string}")
	public void Click_in_the_IPO_field_and_select_a_IPO(String IPO) throws Throwable {
		TPOMS.Click_in_the_IPO_field_and_select_a_IPO(IPO);
	}
	@And ("^Click on Filter Apply button$")
	public void Click_on_Filter_Apply_button() throws Throwable {
		TPOMS.Click_on_Filter_Apply_button();
	}
	@Given ("Search with IPO in search keyword textbox {string}")
	public void Search_with_IPO_in_search_keyword_textbox(String IPO) throws Throwable {
		TPOMS.Search_with_IPO_in_search_keyword_textbox(IPO);
	}
	@When ("Select the Category value in the filter{string}")
	public void Select_the_Category_value_in_the_filter(String Category) throws Throwable {
		TPOMS.Select_the_Category_value_in_the_filter(Category);
	}
	@When ("Select the Process value in the filters{string}")
	public void Select_the_Process_value_in_the_filters(String Process) throws Throwable {
		TPOMS.Select_the_Process_value_in_the_filters(Process);
	}
    
    @And ("^Click on Generate PO icon$")
    public void Click_on_Generate_PO_icon() throws Throwable {
    	TPOMS.Click_on_Generate_PO_icon();
    }
    @Then ("^Verify whether navigated to the Create PO for Trims screen$")
    public void Verify_whether_navigated_to_the_Create_PO_for_Trims_screen() throws Throwable {
    	TPOMS.Verify_whether_navigated_to_the_Create_PO_for_Trims_screen();
    }
    @And ("^Verify the PO Details are displaying$")
    public void Verify_the_PO_Details_are_displaying() throws Throwable {
    	TPOMS.Verify_the_PO_Details_are_displaying();
    }
    @When ("Enter Deliver Details and select from the suggestions{string}")
    public void Enter_Deliver_Details_and_select_from_the_suggestions_(String DeliverTo) throws Throwable {
    	TPOMS.Enter_Deliver_Details_and_select_from_the_suggestions_(DeliverTo);
    }
    @When ("^Verify and print the Delivery Address displayed for the selected Delivery To$")
    public void Verify_and_print_the_Delivery_Address_displayed_for_the_selected_Delivery_To() throws Throwable {
    	TPOMS.Verify_and_print_the_Delivery_Address_displayed_for_the_selected_Delivery_To();
    }
    @When ("^Verify and print the GSTIN number displayed for the selected Delivery To$")
    public void Verify_and_print_the_GSTIN_number_displayed_for_the_selected_Delivery_To() throws Throwable {
    	TPOMS.Verify_and_print_the_GSTIN_number_displayed_for_the_selected_Delivery_To();
    }
    @Then ("Enter supplier name and select from the suggestions{string}")
    public void Enter_supplier_name_and_select_from_the_suggestions(String Supplier) throws Throwable {
    	TPOMS.Enter_supplier_name_and_select_from_the_suggestions(Supplier);
    }
    @And ("^Verify and print the Supplier Address displayed for the selected Supplier$")
    public void Verify_and_print_the_Supplier_Address_displayed_for_the_selected_Supplier() throws Throwable {
    	TPOMS.Verify_and_print_the_Supplier_Address_displayed_for_the_selected_Supplier();
    }
    @And ("^Verify and print the GSTIN number displayed for the selected Supplier$")
    public void Verify_and_print_the_GSTIN_number_displayed_for_the_selected_Supplier() throws Throwable {
    	TPOMS.Verify_and_print_the_GSTIN_number_displayed_for_the_selected_Supplier();
    }
    @And ("^Verify and print the Payment Terms value for the selected Supplier$")
    public void Verify_and_print_the_Payment_Terms_value_for_the_selected_Supplier() throws Throwable {
    	TPOMS.Verify_and_print_the_Payment_Terms_value_for_the_selected_Supplier();
    }
    @And ("^Verify and print the Delivery Terms value for the selected Supplier$")
    public void Verify_and_print_the_Delivery_Terms_value_for_the_selected_Supplier() throws Throwable {
    	TPOMS.Verify_and_print_the_Delivery_Terms_value_for_the_selected_Supplier();
    }
    @And ("Enter Lead Time in Days{string}")
    public void Enter_Lead_Time_in_Days(String LeadTime) throws Throwable {
    	TPOMS.Enter_Lead_Time_in_Days(LeadTime);
    }
    @When ("^Verify and Print the Category name displayed in the Category field$")
    public void Verify_and_Print_the_Category_name_displayed_in_the_Category_field() throws Throwable {
    	TPOMS.Verify_and_Print_the_Category_name_displayed_in_the_Category_field();
    }
    @When ("^Verify and Print the Item name displayed in the Item field$")
    public void Verify_and_Print_the_Item_name_displayed_in_the_Item_field() throws Throwable {
    	TPOMS.Verify_and_Print_the_Item_name_displayed_in_the_Item_field();
    }
    @When ("^Verify and Print the Process name displayed in the Process field$")
    public void Verify_and_Print_the_Process_name_displayed_in_the_Process_field() throws Throwable {
    	TPOMS.Verify_and_Print_the_Process_name_displayed_in_the_Process_field();
    }
    @When ("^Verify and Print the Color name displayed in the Color field$")
    public void Verify_and_Print_the_Color_name_displayed_in_the_Color_field() throws Throwable {
    	TPOMS.Verify_and_Print_the_Color_name_displayed_in_the_Color_field();
    }
    @And ("^Verify and Print the Qty Required field value$")
    public void Verify_and_Print_the_Qty_Required_field_value() throws Throwable {
    	TPOMS.Verify_and_Print_the_Qty_Required_field_value();
    }
    @And ("^Verify and Print the Qty Available In Stock field value$")
    public void Verify_and_Print_the_Qty_Available_In_Stock_field_value() throws Throwable {
    	TPOMS.Verify_and_Print_the_Qty_Available_In_Stock_field_value();
    }
    @And ("^Verify and Print the Qty Allowed field value$")
    public void Verify_and_Print_the_Qty_Allowed_field_value() throws Throwable {
    	TPOMS.Verify_and_Print_the_Qty_Allowed_field_value();
    }
    @And ("^Verify and Print the Currency name displayed$")
    public void Verify_and_Print_the_Currency_name_displayed() throws Throwable {
    	TPOMS.Verify_and_Print_the_Currency_name_displayed();
    }
    @Given ("Enter Rate value{string}")
    public void Enter_Rate_value(String Rate) throws Throwable {
    	TPOMS.Enter_Rate_value(Rate);
    }
	@And ("^Verify and Print the UOM value displayed$")
	public void Verify_and_Print_the_UOM_value_displayed() throws Throwable {
		TPOMS.Verify_and_Print_the_UOM_value_displayed();
	}
	@Given ("Enter L-Short If Any{string}")
	public void Enter_L_Short_If_Any(String LShort) throws Throwable {
		TPOMS.Enter_L_Short_If_Any(LShort);
	}
	@Given ("Enter Addl. Information 1{string}")
	public void Enter_Addl_Information_(String AddInfo1) throws Throwable {
		TPOMS.Enter_Addl_Information_1(AddInfo1);
	}
	@Given ("Enter Addl. Information 2{string}")
	public void Enter_Addl_Information_2(String AddInfo2) throws Throwable {
		TPOMS.Enter_Addl_Information_2(AddInfo2);
	}
    @And ("^Click on Add IPO button$")
    public void Click_on_Add_IPO_button() throws Throwable {
    	TPOMS.Click_on_Add_IPO_button();
    }
    @And ("^Delete  the added IPO record$")
    public void Delete_the_added_IPO_record() throws Throwable {
    	TPOMS.Delete_the_added_IPO_record();
    }
    @Then ("^Verify and print the IPO details under the IPO Details section$")
    public void Verify_and_print_the_IPO_details_under_the_IPO_Details_section() throws Throwable {
    	TPOMS.Verify_and_print_the_IPO_details_under_the_IPO_Details_section();
    }
    @Then ("^Click on Save button to Generate PO$")
    public void Click_on_Save_button_to_Generate_PO() throws Throwable {
    	TPOMS.Click_on_Save_button_to_Generate_PO();
    }
    @And ("^Verify whether the user is navigated to Print form$")
    public void Verify_whether_the_user_is_navigated_to_Print_form() throws Throwable {
    	TPOMS.Verify_whether_the_user_is_navigated_to_Print_form();
    }
    @And ("^Click on Cancel button in Print Form$")
    public void Click_on_Cancel_button_in_Print_Form() throws Throwable {
    	TPOMS.Click_on_Cancel_button_in_Print_Form();
    }
    @Then ("^Verify whether navigate back to Create PO For Trim screen$")
    public void Verify_whether_navigate_back_to_Create_PO_For_Trim_screen() throws Throwable {
    	TPOMS.Verify_whether_navigate_back_to_Create_PO_For_Trim_screen();
    }
    @When ("^Verify the Reset button functionality on clicking$")
    public void Verify_the_Reset_button_functionality_on_clicking() throws Throwable {
    	TPOMS.Verify_the_Reset_button_functionality_on_clicking();
    }
    @And ("^Click on the Status sort icon$")
    public void Click_on_the_Status_sort_icon() throws Throwable {
    	TPOMS.Click_on_the_Status_sort_icon();
    }
    @Then ("^Verify and Print the validation msg$")
    public void Verify_and_Print_the_validation_msg() throws Throwable {
    	TPOMS.Verify_and_Print_the_validation_msg();
    }
    @And ("^Verify the Rate validation msg$")
    public void Verify_the_Rate_validation_msg() {
    	TPOMS.Verify_the_Rate_validation_msg();
    }
    @Then ("^Verify the validation msg on selecting the same IPO$")
    public void Verify_the_validation_msg_on_selecting_the_same_IPO() throws Throwable {
    	TPOMS.Verify_the_validation_msg_on_selecting_the_same_IPO();
    }
    @Given ("Search with PO in search keyword textbox {string}")
    public void Search_with_PO_in_search_keyword_textbox_(String PO) throws Throwable {
    	TPOMS.Search_with_PO_in_search_keyword_textbox_(PO);
    }
    @And ("^Click on Revised PO icon$")
    public void Click_on_Revised_PO_icon() throws Throwable {
    	TPOMS.Click_on_Revised_PO_icon();
    }
    
    @Then ("^Verify whether navigated to the Revise PO for Trims screen$")
    public void Verify_whether_navigated_to_the_Revise_PO_for_Trims_screen() throws Throwable {
    	TPOMS.Verify_whether_navigated_to_the_Revise_PO_for_Trims_screen();
    }
    @And ("user update the revised po for ipo and {string}{string}")
    public void user_update_the_revised_po_for_ipo_and_(String QtyAllowed, String Rate) throws Throwable {
    	TPOMS.user_update_the_revised_po_for_ipo_and_(QtyAllowed, Rate);
    }
    @And ("^Print view Revised PO for IPO details$")
    public void Print_view_Revised_PO_for_IPO_details() throws Throwable {
    	TPOMS.Print_view_Revised_PO_for_IPO_details();
    }
    @And ("^Click on Print icon for a PO$")
    public void Click_on_Print_icon_for_a_PO() throws Throwable {
    	TPOMS.Click_on_Print_icon_for_a_PO();
    }
    @And ("^Click on Cancel icon in grid$")
    public void Click_on_Cancel_icon_in_grid() throws Throwable {
    	TPOMS.Click_on_Cancel_icon_in_grid();
    }
    @Then ("^Verify the Cancel popup$")
    public void Verify_the_Cancel_popup() throws Throwable {
    	TPOMS.Verify_the_Cancel_popup();
    }
    @Then ("^Click on the No option in the Cancel popup$")
    public void Click_on_the_No_option_in_the_Cancel_popup() throws Throwable {
    	TPOMS.Click_on_the_No_option_in_the_Cancel_popup();
    }
    @Then ("^Click on the Yes option in the Cancel popup$")
    public void Click_on_the_Yes_option_in_the_Cancel_popup() throws Throwable {
    	TPOMS.Click_on_the_Yes_option_in_the_Cancel_popup();
    }
    @And ("^Verify the Cancel validation msg$")
    public void Verify_the_Cancel_validation_msg() {
    	TPOMS.Verify_the_Cancel_validation_msg();
    }
    @When ("^Verifying the Sorting functionality of grid headers$")
    public void Verifying_the_Sorting_functionality_of_grid_headers() throws Throwable {
    	TPOMS.Verifying_the_Sorting_functionality_of_grid_headers();
    }


}