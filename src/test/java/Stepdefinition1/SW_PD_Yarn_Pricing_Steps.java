package Stepdefinition1;

import Page.SW_PD_Yarn_Pricing_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SW_PD_Yarn_Pricing {
	SW_PD_Yarn_Pricing_Pages SwPD_Yarn_Pricing = new SW_PD_Yarn_Pricing_Pages();
	
	@Then ("^Click on the Yarn Sourcing Module$")
	public void Click_on_the_Yarn_Sourcing_Module() throws Throwable {
		SwPD_Yarn_Pricing.Click_on_the_Yarn_Sourcing_Module();
	}
	@And ("^Click on the Sourcing Data Entry dropdown$")
	public void Click_on_the_Sourcing_Data_Entry_dropdown() throws Throwable {
		SwPD_Yarn_Pricing.Click_on_the_Sourcing_Data_Entry_dropdown();
	}
	@And ("^Click on the PD Yarn Pricing Screen$")
	public void Click_on_the_PD_Yarn_Pricing_Screen() throws Throwable {
		SwPD_Yarn_Pricing.Click_on_the_PD_Yarn_Pricing_Screen();
	}
	
	@Then ("Select the season {string} in the Filter option page")
	public void Select_the_season_in_the_Filter_option_page(String Season) throws Throwable {
		SwPD_Yarn_Pricing.Select_the_season_in_the_Filter_option_page(Season);
	}
	@And ("Select the Status {string} in filter Option page")
	public void Select_the_Status_in_filter_Option_page(String Status) throws Throwable {
		SwPD_Yarn_Pricing.Select_the_Status_in_filter_Option_page(Status);
	}
	@And ("Enter the Buyer {string} in Search By Style")
	public void Enter_the_Buyer_in_Search_By_Style(String Style) throws Throwable {
		SwPD_Yarn_Pricing.Enter_the_Buyer_in_Search_By_Style(Style);
	}
	@And ("^Verify the Selected Style Details are displayed or not$")
	public void Verify_the_Selected_Style_Details_are_displayed_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Selected_Style_Details_are_displayed_or_not();
	}
	@And ("^Verify whether the Yarn Quality field data is prepopulated or not$")
	public void Verify_whether_the_Yarn_Quality_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_whether_the_Yarn_Quality_field_data_is_prepopulated_or_not();
	}
	@And ("^Verify the Content field data is prepopulated or not$")
	public void Verify_the_Content_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Content_field_data_is_prepopulated_or_not();
	}
	@And ("^Verify the Spin Type field data is prepopulated or not$")
	public void Verify_the_Spin_Type_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Spin_Type_field_data_is_prepopulated_or_not();
	}
	@And ("^Verify the color field data is prepopulated or not$")
	public void Verify_the_color_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_color_field_data_is_prepopulated_or_not();
	}
	@And ("^Verify the Count Construction field data is prepopulated or not$")
	public void Verify_the_Count_Construction_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Count_Construction_field_data_is_prepopulated_or_not();
	}
	
	@And ("^Verify the Finish field data is prepopulated or not$")
	public void Verify_the_Finish_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Finish_field_data_is_prepopulated_or_not();
	}
	
	@And ("^Verify the Specific Requirements field data is prepopulated or not$")
	public void Verify_the_Specific_Requirements_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Specific_Requirements_field_data_is_prepopulated_or_not();
	}
	@And ("^Verify the Yarn Quantity field data is prepopulated or not$")
	public void Verify_the_Yarn_Quantity_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Yarn_Quantity_field_data_is_prepopulated_or_not();
	}
	@And ("^Verify the Use field data is prepopulated or not$")
	public void Verify_the_Use_field_data_is_prepopulated_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Use_field_data_is_prepopulated_or_not();
	}
	@And ("^Verify the first Process is not selected and CLick on the Add Pricing button$")
	public void Verify_the_first_Process_is_not_selected_and_CLick_on_the_Add_Pricing_button() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_first_Process_is_not_selected_and_CLick_on_the_Add_Pricing_button();
	}
	@And ("Select the {string} in the Pricing Grid")
	public void Select_the_in_the_Pricing_Grid(String Process) throws Throwable {
		SwPD_Yarn_Pricing.Select_the_in_the_Pricing_Grid(Process);
	}
	@Given ("Enter data in the {string} field the Pricing Grid")
	public void Enter_data_in_the_field_the_Pricing_Grid(String Price) throws Throwable {
		SwPD_Yarn_Pricing.Enter_data_in_the_field_the_Pricing_Grid(Price);
	}
	@And ("^Select the Yarn Supplier$")
	public void Select_the_Yarn_Supplier() throws Throwable {
		SwPD_Yarn_Pricing.Select_the_Yarn_Supplier();
	}
	
	@When ("^Enter the data in the Process Remarks field$")
	public void Enter_the_data_in_the_Process_Remarks_field() throws Throwable {
		SwPD_Yarn_Pricing.Enter_the_data_in_the_Process_Remarks_field();
	}
	@And ("Enter the data in the {string} total Price field")
	public void Enter_the_data_in_the_total_Price_field(String TotalPrice) throws Throwable {
		SwPD_Yarn_Pricing.Enter_the_data_in_the_total_Price_field(TotalPrice);
	}
	
	@And ("^Enter the data in the Remarks field$")
	public void Enter_the_data_in_the_Remarks_field() throws Throwable {
		SwPD_Yarn_Pricing.Enter_the_data_in_the_Remarks_field();
	}
	@And ("^enter the data in the Total Yarn Lead Time$")
	public void enter_the_data_in_the_Total_Yarn_Lead_Time() throws Throwable {
		SwPD_Yarn_Pricing.enter_the_data_in_the_Total_Yarn_Lead_Time();
	}
	@And ("^Enter the data in the Price Valid For Days$")
	public void Enter_the_data_in_the_Price_Valid_For_Days() throws Throwable {
		SwPD_Yarn_Pricing.Enter_the_data_in_the_Price_Valid_For_Days();
	}
	@And ("^Enter the Yarn call outs Remarks$")
	public void Enter_the_Yarn_call_outs_Remarks() throws Throwable {
		SwPD_Yarn_Pricing.Enter_the_Yarn_call_outs_Remarks();
	}
	@And ("^Verify the without adding the data click on the Delete icon the validation is displayed or not$")
	public void Verify_the_without_adding_the_data_click_on_the_Delete_icon_the_validation_is_displayed_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_without_adding_the_data_click_on_the_Delete_icon_the_validation_is_displayed_or_not();
	}
	@And ("^Click on the Save button in the PD Yarn Pricing$")
	public void Click_on_the_Save_button_in_the_PD_Yarn_Pricing() throws Throwable {
		SwPD_Yarn_Pricing.Click_on_the_Save_button_in_the_PD_Yarn_Pricing();
	}
	@And ("^Click on the Filter Icon in Pricing Style Expansion$")
	public void Click_on_the_Filter_Icon_in_Pricing_Style_Expansion() throws Throwable {
		SwPD_Yarn_Pricing.Click_on_the_Filter_Icon_in_Pricing_Style_Expansion();
	}
	@And ("^Select the Style in the Styles List$")
	public void Select_the_Style_in_the_Styles_List() throws Throwable {
		SwPD_Yarn_Pricing.Select_the_Style_in_the_Styles_List();
	}
	@And ("^Click on the View for Print button$")
	public void Click_on_the_View_for_Print_button() throws Throwable {
		SwPD_Yarn_Pricing.Click_on_the_View_for_Print_button();
	}
	@And("^Verify the Select Style Details are displayed or not$")
	public void Verify_the_Select_Style_Details_are_displayed_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_Select_Style_Details_are_displayed_or_not();
	}
	@And ("^CLick on the Print button$")
	public void CLick_on_the_Print_button() throws Throwable {
		SwPD_Yarn_Pricing.CLick_on_the_Print_button();
	}
	@And ("^Click on the Submit to Po Merchant team the validation msg is displayed or not$")
	public void Click_on_the_Submit_to_Po_Merchant_team_the_validation_msg_is_displayed_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Click_on_the_Submit_to_Po_Merchant_team_the_validation_msg_is_displayed_or_not();
	}
	@And ("^Verify the On Save validation is displayed or not$")
	public void Verify_the_On_Save_validation_is_displayed_or_not() throws Throwable {
		SwPD_Yarn_Pricing.Verify_the_On_Save_validation_is_displayed_or_not();
	}
}
