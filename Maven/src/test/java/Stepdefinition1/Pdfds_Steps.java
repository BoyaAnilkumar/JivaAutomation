package Stepdefinition1;

import Page.Pdfds_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pdfds_Steps {
		
		Pdfds_page page = new Pdfds_page();
		
		@Given("^Navigate to the Login Page$")
		public void Navigate_to_the_Login_Page() throws Throwable {
			page.Navigate_to_the_Login_Page();
		}
		
		@When("^User Enter Valid username and password$")
		public void user_Enter_invalid_username_and_valid_password() throws Throwable {
			page.user_Enter_invalid_username_and_valid_password();
		}
		@Then("^Click on SignIn button$")
		public void Click_on_SignIn_button() throws Throwable {
			page.Click_on_SignIn_button();
		}
		@And ("^Navigated to Dashboard screen or not$")
		public void Navigated_to_Dashboard_screen_or_not() {
			page.Navigated_to_Dashboard_screen_or_not();
		}
		@And("^Click on Wovenknit module$")
		public void Click_on_Wovenknit_module() throws Throwable{
			page.Click_on_Wovenknit_module();
		}
		@Then("^Click on PD module$")
		public void Click_on_PD_module() throws Throwable {
			page.Click_on_PD_module();
			
		}
		@And("^click on pd fds$")
		public void click_on_pd_fds() throws Throwable {
			page.click_on_pd_fds();
		}
		@And("^Click on Style expansion$")
		public void Click_on_Style_expansion() throws Throwable {
			page.Click_on_Style_expansion();
		}
		@And("^Select the IPO$")
		public void Select_the_IPO() throws Throwable {
			page.Select_the_IPO();
		}
		@When("^I mouse hover on tool tip$")
		public void I_mouse_hover_on_tool_tip() throws Throwable {
			page.I_mouse_hover_on_tool_tip();
		}
		@Then("^Click on Add New Fabric button$")
		public void Click_on_Add_New_Fabric_button() throws Throwable {
			page.Click_on_Add_New_Fabric_button();
		}
		@And ("^Click on Fabric Quality$")
		public void Click_on_Fabric_Quality() throws Throwable {
			page.Click_on_Fabric_Quality();
			
		}
		@And("^Select Fabric Quality$")
		public void Select_Fabric_Quality() throws Throwable {
			page.Select_Fabric_Quality();
		}
		@Then("^Click on Content$")
		public void Click_on_Content() throws Throwable {
			page.Click_on_Content();
		}
		@And("^Click on Color$")
		public void Click_on_Color() throws Throwable {
			page.Click_on_Color();
		}  
		@And("^Select CountConstruction$")
		public void Select_CountConstruction() throws Throwable {
			page.Select_CountConstruction();
		}
		@Then ("^Enter Finish value$")
		public void Enter_Finish_value() throws Throwable {
			page.Enter_Finish_value();
		}
		@And ("^Enter specific requirements$")
		public void Enter_specific_requirements() throws Throwable {
			page.Enter_specific_requirements();
		}
		@And ("^Enter Fabric Quantity$")
		public void Enter_Fabric_Quantity() throws Throwable {
			page.Enter_Fabric_Quantity();
		}
		@And ("^Enter Full width$")
		public void Enter_Full_width() throws Throwable {
			page.Enter_Full_width();
		}
		@And ("^Select use$")
		public void Select_use() throws Throwable {
			page.Select_use();
		}
		@Then ("^Click on Reset button$")
		public void Click_on_Reset_button() throws Throwable {
			page.Click_on_Reset_button();
		}
		@Then ("^Click on Save button$")
		public void Click_on_Save_button() throws Throwable {
			page.Click_on_Save_button();
		}
		@And ("^Verify the Toaster text is displaying or not$")
		public void Verify_the_Toaster_text_is_displaying_or_not() throws Throwable {
			page.Verify_the_Toaster_text_is_displaying_or_not();
		}
		@And ("^Click on Nomination checkbox$")
		public void Click_on_Nomination_Checkbox() throws Throwable {
			page.Click_on_Nomination_Checkbox();
		}
		
		@And("^click on User Account$")
		public void click_on_User_Account() throws Throwable {
			page.click_on_User_Account();
		}
		
		@Then("^Click on Logout button$")
		public void Click_on_Logout_button() throws Throwable {
			page.Click_on_Logout_button();
		}
		
		@And ("^Navigate to PD Fabric Pricing screen$")
		public void Navigate_to_PD_Fabric_Pricing_screen() throws Throwable {
			page.Navigate_to_PD_Fabric_Pricing_screen();
		}
	}

