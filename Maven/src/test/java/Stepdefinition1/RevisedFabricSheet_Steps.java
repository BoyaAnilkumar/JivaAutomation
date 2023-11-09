package Stepdefinition1;

import Page.RevisedFabricSheet_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RevisedFabricSheet_Steps {

		
		RevisedFabricSheet_page RevisedFabricSheet_page = new RevisedFabricSheet_page();
		
		@When("^user navigates to Login page$")
		public void user_navigates_to_Login_page() throws Throwable {
			RevisedFabricSheet_page.user_navigates_to_Login_page();
		}
		
		@Given("^Login with Production Manager$")
		public void Login_with_Production_Manager() {
			RevisedFabricSheet_page.Login_with_Production_Manager();
		}
		
		@When("^user navigates to dashboard$")
		public void user_navigates_to_dashboard() {
			RevisedFabricSheet_page.user_navigates_to_dashboard();
		}
		
		@Then("^click on Wovenknit module$")
		public void click_on_Wovenknit_module() {
			RevisedFabricSheet_page.click_on_Wovenknit_module();
		}
		
		@And("^click on Generate Fabric sheet$")
		public void click_on_Generate_Fabric_sheet() {
			RevisedFabricSheet_page.click_on_Generate_Fabric_sheet();
		}
		
		@Then("^click on Revised Fabric sheet$")
		public void click_on_Revised_Fabric_sheet() {
			RevisedFabricSheet_page.click_on_Revised_Fabric_sheet();
		}
		
		@And("^click on Styles expansion$")
		public void click_on_Styles_expansion() {
			RevisedFabricSheet_page.click_on_Styles_expansion();
		}
		
		@And("^verify the Ipos are displaying or not$")
		public void verify_the_Ipos_are_displaying_or_not() {
			RevisedFabricSheet_page.verify_the_Ipos_are_displaying_or_not();
		}
		
		@And("^click on clear filter icon$")
		public void click_on_clear_filter_icon() {
			RevisedFabricSheet_page.click_on_clear_filter_icon();
		}
		
		@Then("^click on filter icon$")
		public void click_on_filter_icon() {
			RevisedFabricSheet_page.click_on_filter_icon();
		}
		
		@And("^Click on buyer dropdown$")
		public void Click_on_buyer_dropdown() {
			RevisedFabricSheet_page.Click_on_buyer_dropdown();
		}
		
		@Given("^Enter Buyer in search box$")
		public void Enter_Buyer_in_search_box() {
			RevisedFabricSheet_page.Enter_Buyer_in_search_box();
		}
		
		@Then("^Select Buyer from dropdown list$")
		public void Select_Buyer_from_dropdown_lists() {
			RevisedFabricSheet_page.Select_Buyer_from_dropdown_lists();
		}
		
		@And("^Click on Apply button$")
		public void Click_on_Apply_button() {
			RevisedFabricSheet_page.Click_on_Apply_button();
		}
		
		@Then("^Select the IPO in styles expansion$")
		public void Select_the_IPO_in_styles_expansion() {
			RevisedFabricSheet_page.Select_the_IPO_in_styles_expansion();
		}
		
		@And("^click on Add data button$")
		public void click_on_Add_data_button() {
			RevisedFabricSheet_page.click_on_Add_data_button();
		}
	}
	


