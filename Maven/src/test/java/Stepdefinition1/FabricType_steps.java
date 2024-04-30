package Stepdefinition1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Page.FabricType_page;

public class FabricType_steps {

	FabricType_page Fabrictype =new FabricType_page();
	
	@When("^User navigates to the Login page and enter credentials and signin$")
	public void User_navigates_to_the_Login_page_and_enter_credentials_and_signin() throws Throwable {
		Fabrictype.User_navigates_to_the_Login_page_and_enter_credentials_and_signin();
	}
	
	@And("^Select the Fabric type screen$")
	public void Select_the_Fabric_type_screen() throws Throwable {
		Fabrictype.Select_the_Fabric_type_screen();
	}
	
	@Then("^click on the fabric type add button$")
	public void click_on_the_fabric_type_add_button() throws Throwable {
		Fabrictype.click_on_the_fabric_type_add_button();
	}
	
	@And("^click on save button to submit the Fabric Type$")
	public void click_on_save_button_to_submit_the_Fabric_Type() throws Throwable {
		Fabrictype.click_on_save_button_to_submit_the_Fabric_Type();
		
	}
	
	@When("^Select category dropdown$")
	public void Select_category_dropdown() throws Throwable {
		Fabrictype.Select_category_dropdown();
	}
	
	@When("^user enter the Fabric Name$")
	public void user_enter_the_Fabric_Name() throws Throwable {
		Fabrictype.user_enter_the_Fabric_Name();
	}
	
	@When("^User enter the content$")
	public void User_enter_the_content() throws Throwable {
		Fabrictype.User_enter_the_content();
	}
	
	@When("^User enter the supplier or internal code$")
	public void User_enter_the_supplier_or_internal_code() throws Throwable {
		Fabrictype.User_enter_the_supplier_or_internal_code();
	}
	
	@When("^User enter the GSM1$")
	public void User_enter_the_GSM1() throws Throwable {
		Fabrictype.User_enter_the_GSM1();
	}
	
	@When("^User enter the Count and construction1$")
	public void User_enter_the_Count_and_construction1() throws Throwable {
		Fabrictype.User_enter_the_Count_and_construction1();
	}
	
	@When("^User enter the width in inches$")
	public void User_enter_the_width_in_inches() throws Throwable {
		Fabrictype.User_enter_the_width_in_inches();
	}
	
	@When("^User enter the GSM2$")
	public void User_enter_the_GSM2() throws Throwable {
		Fabrictype.User_enter_the_GSM2();
	}
	
	@When("^User enter the count and construction2$")
	public void User_enter_the_count_and_construction2() throws Throwable {
		Fabrictype.User_enter_the_count_and_construction2();
	}
	
	@When("^User enter the cuttable width in inches$")
	public void User_enter_the_cuttable_width_in_inches() throws Throwable {
		Fabrictype.User_enter_the_cuttable_width_in_inches();
	}
	
	@When("^User enter the approx lead time$")
	public void User_enter_the_approx_lead_time() throws Throwable {
		Fabrictype.User_enter_the_approx_lead_time();
	}
	
	@Then("^User able to select the is nominated$")
	public void User_able_to_select_the_is_nominated() throws Throwable {
		Fabrictype.User_able_to_select_the_is_nominated();
	}
	
	@When("^User enter the Fabric price$")
	public void User_enter_the_Fabric_price() throws Throwable {
		Fabrictype.User_enter_the_Fabric_price();
	}
	
	@When("^User selects the Currency$")
	public void User_selects_the_Currency() throws Throwable {
		Fabrictype.User_selects_the_Currency();
	}
	
	@When("^User selects the UOM$")
	public void User_selects_the_UOM() throws Throwable {
		Fabrictype.User_selects_the_UOM();
	}
	
	@When("^User verify the Price$")
	public void User_verify_the_Price() throws Throwable {
		Fabrictype.User_verify_the_Price();
	}
	
	@When("User upload the file")
	public void User_upload_the_file() throws Throwable {
		Fabrictype.User_upload_the_file();
	}
	
	@And("^User try to submit by clicks on the save button$")
	public void User_try_to_submit_by_clicks_on_the_save_button() throws Throwable {
		Fabrictype.User_try_to_submit_by_clicks_on_the_save_button();
	}
	
	@And("^User clicks on the cancel button$")
	public void User_clicks_on_the_cancel_button() throws Throwable {
		Fabrictype.User_clicks_on_the_cancel_button();
	}
	
	@Then("^User able to search the data by using search box funtionality$")
	public void User_able_to_search_the_data_by_using_search_box_funtionality() throws Throwable {
		Fabrictype.User_able_to_search_the_data_by_using_search_box_funtionality();
	}
	
	@When("^User able to update the details by selecting edit icon$")
	public void User_able_to_update_the_details_by_selecting_edit_icon() throws Throwable {
		Fabrictype.User_able_to_update_the_details_by_selecting_edit_icon();
	}
	
	@Then("^Check the sorting functionality$")
	public void Check_the_sorting_functionality() throws Throwable {
		Fabrictype.Check_the_sorting_functionality();
	}
}