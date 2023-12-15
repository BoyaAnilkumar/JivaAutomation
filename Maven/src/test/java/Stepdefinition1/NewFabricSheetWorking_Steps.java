package Stepdefinition1;

import Page.NewFabricSheetWorking_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewFabricSheetWorking_Steps {

	NewFabricSheetWorking_page NewFabricSheetWorkingpage = new NewFabricSheetWorking_page();
	
	@And("^navigate to New Fabric Sheet working screen$")
	public void navigate_to_New_Fabric_Sheet_working_screen() throws Throwable {
		NewFabricSheetWorkingpage.navigate_to_New_Fabric_Sheet_working_screen();
	}
	
	@And("^Click on styles expansion$")
	public void Click_on_styles_expansion() throws Throwable {
		NewFabricSheetWorkingpage.Click_on_styles_expansion();
	}
	
	@And("^click on IPO in the styles expansion$")
	public void click_on_IPO_in_the_styles_expansion() throws Throwable {
		NewFabricSheetWorkingpage.click_on_IPO_in_the_styles_expansion();
	}
	
	@And("^Close the styles expansion$")
	public void Close_the_styles_expansion() throws Throwable {
		NewFabricSheetWorkingpage.Close_the_styles_expansion();
	}
	
	@And("^click on filter icon$")
	public void click_on_filter_icon() throws Throwable {
		NewFabricSheetWorkingpage.click_on_filter_icon();
	}
	
	@And("^click on buyer dropdown$")
	public void click_on_buyer_dropdown() throws Throwable {
		NewFabricSheetWorkingpage.click_on_buyer_dropdown();
	}
	
	@And("^Enter the buyer and select buyer$")
	public void Enter_the_buyer_and_select_buyer() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_buyer_and_select_buyer();
	}
	
	@And("^Click on Season dropdown and select form dropdown list$")
	public void Click_on_Season_dropdown_and_select_form_dropdown_list() throws Throwable {
		NewFabricSheetWorkingpage.Click_on_Season_dropdown_and_select_form_dropdown_list();
	}
	
	@And("^Click on Status dropdown and select the status from dropdown list$")
	public void Click_on_Status_dropdown_and_select_the_status_from_dropdown_list() throws Throwable {
		NewFabricSheetWorkingpage.Click_on_Status_dropdown_and_select_the_status_from_dropdown_list();
	}
	
	@And("^Enter the IPO no in search By IPO entry field$")
	public void Enter_the_IPO_no_in_search_By_IPO_entry_field() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_IPO_no_in_search_By_IPO_entry_field();
	}
	
	@And("^click on Apply button and Reset button$")
	public void click_on_Apply_button_and_Reset_button() throws Throwable {
		NewFabricSheetWorkingpage.click_on_Apply_button_and_Reset_button();
	}
	
	@And("^Verify that data is displaying in grids after selecting the IPO$")
	public void Verify_that_data_is_displaying_in_grids_after_selecting_the_IPO() throws Throwable {
		NewFabricSheetWorkingpage.Verify_that_data_is_displaying_in_grids_after_selecting_the_IPO();
		}
	
	@And("^Click on Edit icon in MU Working grid$")
	public void Click_on_Edit_icon_in_MU_Working_grid() throws Throwable {
		NewFabricSheetWorkingpage.Click_on_Edit_icon_in_MU_Working_grid();
	}
	
	@And("^Verify the Fabric Required is displaying the value or not$")
	public void Verify_the_Fabric_Required_is_displaying_the_value_or_not() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_Fabric_Required_is_displaying_the_value_or_not();
	}
	
	@And("^Enter the value in Residual shrinkage$")
	public void Enter_the_value_in_Residual_shrinkage() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_value_in_Residual_shrinkage();
	}
	
	@Then("^select the process1 by clicking on process1 dropdown list$")
	public void select_the_process1_by_clicking_on_process1_dropdown_list() throws Throwable {
		NewFabricSheetWorkingpage.select_the_process1_by_clicking_on_process1_dropdown_list();
	}
	
	@Then("^select the process2 by clicking on process2 dropdown list$")
	public void select_the_process2_by_clicking_on_process2_dropdown_list() throws Throwable {
		NewFabricSheetWorkingpage.select_the_process2_by_clicking_on_process2_dropdown_list();
	}
	
	@Then("^verify the qty in greige field whether value is displaying or not$")
	public void verify_the_qty_in_greige_field_whether_value_is_displaying_or_not() throws Throwable {
		NewFabricSheetWorkingpage.verify_the_qty_in_greige_field_whether_value_is_displaying_or_not();
	}
	
	@And("^Enter value in MU for Process1 entry field$")
	public void Enter_value_in_MU_for_Process1_entry_field() throws Throwable {
		NewFabricSheetWorkingpage.Enter_value_in_MU_for_Process1_entry_field();
	}
	
	@Then("^Verify the process1 value in qty field$")
	public void Verify_the_process1_value_in_qty_field() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_process1_value_in_qty_field();
	}
	
	@And("^Enter the text in Print Type entry field$")
	public void Enter_the_text_in_Print_Type_entry_field() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_text_in_Print_Type_entry_field();
	}
	
	@And("^Enter value in MU for process2 entry field$")
	public void Enter_value_in_MU_for_process2_entry_field() throws Throwable {
		NewFabricSheetWorkingpage.Enter_value_in_MU_for_process2_entry_field();
	}
	
	@Then("^verify the process2 value in qty field$")
	public void verify_the_process2_value_in_qty_field() throws Throwable {
		NewFabricSheetWorkingpage.verify_the_process2_value_in_qty_field();
	}
	
	@And("^Verify the Fabric Budget section is displaying the budget details of Greige Dyeing and Printing processes or not$")
	public void Verify_the_Fabric_Budget_section_is_displaying_the_budget_details_of_Greige_Dyeing_and_Printing_processes_or_not() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_Fabric_Budget_section_is_displaying_the_budget_details_of_Greige_Dyeing_and_Printing_processes_or_not();
	}
	
	@And("^Verify the quantity is displaying for Greige Base Knitting qty field$")
	public void Verify_the_quantity_is_displaying_for_Greige_Base_Knitting_qty_field() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_quantity_is_displaying_for_Greige_Base_Knitting_qty_field();
	}
	
	@And("^Enter the Rate for griege process$")
	public void Enter_the_Rate_for_griege_process() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_Rate_for_griege_process();
	}
	
	@And("^verify the conversion rate is autopopulate and allows to change the value or not for griege process$")
	public void verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_griege_process() throws Throwable {
		NewFabricSheetWorkingpage.verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_griege_process();
	}
	
	@And("^Verify the cost is displaying or not for griege process$")
	public void Verify_the_cost_is_displaying_or_not_for_griege_process() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_cost_is_displaying_or_not_for_griege_process();
	}
	
	@And("^Select the Fabric Manager from the dropdown list of Fabric Manager field for griege process$")
	public void Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_griege_process() throws Throwable {
		NewFabricSheetWorkingpage.Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_griege_process();
	}
	
	@And("^Fabric manager assistants should display based on the selection of Fabric Manager for griege process$")
	public void Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_griege_process() throws Throwable {
		NewFabricSheetWorkingpage.Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_griege_process();
	}
	
	@And("^Select Fabric Executive from the dropdown list for griege process$")
	public void Select_Fabric_Executive_from_the_dropdown_list_for_griege_process() throws Throwable {
		NewFabricSheetWorkingpage.Select_Fabric_Executive_from_the_dropdown_list_for_griege_process();
	}
	
	@Then("^Verify the quantity is displaying for Dyeing qty$")
	public void Verify_the_quantity_is_displaying_for_Dyeing_qty() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_quantity_is_displaying_for_Dyeing_qty();
	}
	
	@And("^Enter the Rate for Dyeing process$")
	public void Enter_the_Rate_for_Dyeing_process() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_Rate_for_Dyeing_process();
	}
	
	@And("^verify the conversion rate is autopopulate and allows to change the value or not for Dyeing process$")
	public void verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_Dyeing_process() throws Throwable {
		NewFabricSheetWorkingpage.verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_Dyeing_process();
	}
	
	@And("^Verify the cost is displaying or not for Dyeing process$")
	public void Verify_the_cost_is_displaying_or_not_for_Dyeing_process() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_cost_is_displaying_or_not_for_Dyeing_process();
	}
	
	@And("^Select the Fabric Manager from the dropdown list of Fabric Manager field for Dyeing process$")
	public void Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_Dyeing_process() throws Throwable {
		NewFabricSheetWorkingpage.Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_Dyeing_process();
	}
	
	@And("^Fabric manager assistants should display based on the selection of Fabric Manager for Dyeing process$")
	public void Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_Dyeing_process() throws Throwable {
		NewFabricSheetWorkingpage.Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_Dyeing_process();
	}
	
	@And("^Select Fabric Executive from the dropdown list for Dyeing process$")
	public void Select_Fabric_Executive_from_the_dropdown_list_for_Dyeing_process() throws Throwable {
		NewFabricSheetWorkingpage.Select_Fabric_Executive_from_the_dropdown_list_for_Dyeing_process();
	}
	
	@Then("^Verify the quantity is displaying for printing qty$")
	public void Verify_the_quantity_is_displaying_for_printing_qty() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_quantity_is_displaying_for_printing_qty();
	}
	
	@And("^Enter the Rate for printing process$")
	public void Enter_the_Rate_for_printing_process() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_Rate_for_printing_process();
	}
	
	@And("^verify the conversion rate is autopopulate and allows to change the value or not for printing process$")
	public void verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_printing_process() throws Throwable {
		NewFabricSheetWorkingpage.verify_the_conversion_rate_is_autopopulate_and_allows_to_change_the_value_or_not_for_printing_process();
	}
	
	@And("^Verify the cost is displaying or not for printing process$")
	public void Verify_the_cost_is_displaying_or_not_for_printing_process() throws Throwable {
		NewFabricSheetWorkingpage.Verify_the_cost_is_displaying_or_not_for_printing_process();
	}
	
	@And("^Select the Fabric Manager from the dropdown list of Fabric Manager field for printing process$")
	public void Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_printing_process() throws Throwable {
		NewFabricSheetWorkingpage.Select_the_Fabric_Manager_from_the_dropdown_list_of_Fabric_Manager_field_for_printing_process();
	}
	
	@And("^Fabric manager assistants should display based on the selection of Fabric Manager for printing process$")
	public void Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_printing_process() throws Throwable {
		NewFabricSheetWorkingpage.Fabric_manager_assistants_should_display_based_on_the_selection_of_Fabric_Manager_for_printing_process();
	}
	
	@And("^Select Fabric Executive from the dropdown list for printing process$")
	public void Select_Fabric_Executive_from_the_dropdown_list_for_printing_process() throws Throwable {
		NewFabricSheetWorkingpage.Select_Fabric_Executive_from_the_dropdown_list_for_printing_process();
	}
	
	@When("^Verify the Freight budget details section is displaying or not$")
	public void Verify_the_Freight_budget_details_section_is_displaying_or_not() {
		NewFabricSheetWorkingpage.Verify_the_Freight_budget_details_section_is_displaying_or_not();
	}
	
	@And("^Verify the quantity is displaying for greige dyeing and printing process or not$")
	public void Verify_the_quantity_is_displaying_for_greige_dyeing_and_printing_process_or_not() {
		NewFabricSheetWorkingpage.Verify_the_quantity_is_displaying_for_greige_dyeing_and_printing_process_or_not();
	}
	
	@And("^verify the rate is displaying as zero for greige dyeing and printing process or not$")
	public void verify_the_rate_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not() {
		NewFabricSheetWorkingpage.verify_the_rate_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not();
	}
	
	@And("^verify the conversion rate is displaying as zero for greige dyeing and printing process or not$")
	public void verify_the_conversion_rate_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not() {
		NewFabricSheetWorkingpage.verify_the_conversion_rate_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not();
	}
	
	@And("^verify the cost is displaying as zero for greige dyeing and printing process or not$")
	public void verify_the_cost_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not() {
		NewFabricSheetWorkingpage.verify_the_cost_is_displaying_as_zero_for_greige_dyeing_and_printing_process_or_not();
	}
	
	@And("^Click on submit button to save the mu working$")
	public void Click_on_submit_button_to_save_the_mu_working() throws Throwable {
		NewFabricSheetWorkingpage.Click_on_submit_button_to_save_the_mu_working();
	}
	
	
	@And("^Enter the data in Shiffly process section fields$")
	public void Enter_the_data_in_Shiffly_process_section_fields() throws Throwable {
		NewFabricSheetWorkingpage.Enter_the_data_in_Shiffly_process_section_fields();
	}
	
	@And("^select the process1 as Shiffly process$")
	public void select_the_process1_as_Shiffly_process() {
		NewFabricSheetWorkingpage.select_the_process1_as_Shiffly_process();
	}
	
	@And("^select the process2 as NA$")
	public void select_the_process2_as_NA(){
		NewFabricSheetWorkingpage.select_the_process2_as_NA();
	}
	
	@Then("^Enter Fabric Budget details for greige process$")
	public void Enter_Fabric_Budget_details_for_greige_process() {
		NewFabricSheetWorkingpage.Enter_Fabric_Budget_details_for_greige_process();
	}

	@And("^Enter Fabric Budget details for Shiffly process$")
	public void Enter_Fabric_Budget_details_for_Shiffly_process() {
		NewFabricSheetWorkingpage.Enter_Fabric_Budget_details_for_Shiffly_process();
	}
	
	}











