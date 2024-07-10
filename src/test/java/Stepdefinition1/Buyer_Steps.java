package Stepdefinition1;

import Pages.Buyer_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Buyer_Steps {

	Pages.Buyer_page Buyer = new Pages.Buyer_page();

	

	@And("^Click on the master module$")
	public void Click_on_the_master_module() throws Throwable {
		Buyer.Click_on_the_master_module();
	}

	@And("^Click on the buyer screen$")
	public void Click_on_the_buyer_screen() throws Throwable {
		Buyer.Click_on_the_buyer_screen();
	}

	@Then("^Click on the Add button above the grid$")
	public void Click_on_the_Add_button_above_the_grid() throws Throwable {
		Buyer.Click_on_the_Add_button_above_the_grid();
	}

	@And("^Click on the save button$")
	public void Click_on_the_save_button() throws Throwable {
		Buyer.Click_on_the_save_button();
	}

	@And("^Check validation msg Placeholder and enter Buyer name$")
	public void Check_validation_msg_Placeholder_and_enter_Buyer_name() throws Throwable {
		Buyer.Check_validation_msg_Placeholder_and_enter_Buyer_name();
	}
	
	@And("^Check validation message placeholder and select the country name$")
	public void Check_validation_message_placeholder_and_select_the_country_name() throws Throwable {
		Buyer.Check_validation_message_placeholder_and_select_the_country_name();
	}
	
	@And("^Select the Buying house name$")
	public void Select_the_Buying_house_name() throws Throwable {
		Buyer.Select_the_Buying_house_name();
	}
	
	@And("^Select commission type$")
	public void Select_commission_type() throws Throwable {
		Buyer.Select_commission_type();
	}
	
	@And("Enter the commission$")
	public void Enter_the_commission() throws Throwable {
		Buyer.Enter_the_commission();
	}
	
	@Then("Click on the save")
	public void Click_on_the_save() throws Throwable {
		Buyer.Click_on_the_save();
	}
	
	@Then("Update the buyer record by clicking on the edit icon")
	public void Update_the_buyer_record_by_clicking_on_the_edit_icon() throws Throwable {
		Buyer.Update_the_buyer_record_by_clicking_on_the_edit_icon();
	}
	
	@Then("Search result by using search box functionality")
	public void Search_result_by_using_search_box_functionality() throws Throwable {
		Buyer.Search_result_by_using_search_box_functionality();
	}
	
	@And("check the sorting functionality of the table grid")
	public void check_the_sorting_functionality_of_the_table_grid() throws Throwable {
		Buyer.check_the_sorting_functionality_of_the_table_grid();
	}
	
	@Then("Buyer Name filter search$")
	public void Buyer_Name_filter_search() throws Throwable {
		Buyer.Buyer_Name_filter_search();
	}
	
	@Then("Buying House Name filter search")
	public void Buying_House_Name_filter_search() throws Throwable {
		Buyer.Buying_House_Name_filter_search();
	}
	
	@Then("Country filter search")
	public void Country_filter_search() throws Throwable {
		Buyer.Country_filter_search();
	}
	
	@Then("Commission Type filter search")
	public void Commission_Type_filter_search() throws Throwable {
		Buyer.Commission_Type_filter_search();
	}
}