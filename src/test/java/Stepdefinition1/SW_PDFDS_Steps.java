package Stepdefinition1;

import Page.Pdfds_page;
import Page.SW_PDFDS_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SW_PDFDS_Steps {

	
	SW_PDFDS_page page = new SW_PDFDS_page();
	
	@And ("^Navigated to Dashboard screen$")
	public void Navigated_to_Dashboard_screen() throws Throwable {
		page.Navigated_to_Dashboard_screen();
	}
	@And("^Click on Sweater module$")
	public void Click_on_Sweater_module() throws Throwable{
		page.Click_on_Sweater_module();
	}
	@Then("^Click on PD module in sw module$")
	public void Click_on_PD_module_in_sw_module() throws Throwable {
		page.Click_on_PD_module_in_sw_module();
		
	}
	@And("^click on PDFDS in sweater$")
	public void click_on_PDFDS_in_sweater() throws Throwable {
		page.click_on_PDFDS_in_sweater();
	}
	@And("^Click on Style expansion in sweater$")
	public void Click_on_Style_expansion_in_sweater() throws Throwable {
		page.Click_on_Style_expansion_in_sweater();
	}
	@And("^Select the IPO in the list$")
	public void Select_the_IPO_in_the_list() throws Throwable {
		page.Select_the_IPO_in_the_list();
	}
	@When("^I mouse hover on tool tip in sweater$")
	public void I_mouse_hover_on_tool_tip_in_sweater() throws Throwable {
		page.I_mouse_hover_on_tool_tip_in_sweater();
	}
	@And ("^Verify the Toaster text is displaying in sweater$")
	public void Verify_the_Toaster_text_is_displaying_in_sweater() throws Throwable {
		page.Verify_the_Toaster_text_is_displaying_in_sweater();
	}
	@Then("^Click on Add New Fabric button in sweater$")
	public void Click_on_Add_New_Fabric_button_in_sweater() throws Throwable {
		page.Click_on_Add_New_Fabric_button_in_sweater();
	}
	@And ("^Click on Fabric Quality in sweater$")
	public void Click_on_Fabric_Quality_in_sweater() throws Throwable {
		page.Click_on_Fabric_Quality_in_sweater();
		
	}
	@And("^Select Fabric Quality in sweater$")
	public void Select_Fabric_Quality_in_sweater() throws Throwable {
		page.Select_Fabric_Quality_in_sweater();
	}
	@Then("^Click on Content in sweater$")
	public void Click_on_Content_in_sweater() throws Throwable {
		page.Click_on_Content_in_sweater();
	}
	@And("^Click on Color in sweater$")
	public void Click_on_Color_in_sweater() throws Throwable {
		page.Click_on_Color_in_sweater();
	}  
	@And("^Select CountConstruction in sweater$")
	public void Select_CountConstruction_in_sweater() throws Throwable {
		page.Select_CountConstruction_in_sweater();
	}
	@Then ("^Enter Finish value in sweater$")
	public void Enter_Finish_value_in_sweater() throws Throwable {
		page.Enter_Finish_value_in_sweater();
	}
	@And ("^Enter specific requirements in sweater$")
	public void Enter_specific_requirements_in_sweater() throws Throwable {
		page.Enter_specific_requirements_in_sweater();
	}
	@And ("^Enter Fabric Quantity in sweater$")
	public void Enter_Fabric_Quantity_in_sweater() throws Throwable {
		page.Enter_Fabric_Quantity_in_sweater();
	}
	@And ("^Enter Full width in sweater$")
	public void Enter_Full_width_in_sweater() throws Throwable {
		page.Enter_Full_width_in_sweater();
	}
	@And ("^Select use in sweater$")
	public void Select_use_in_sweater() throws Throwable {
		page.Select_use_in_sweater();
	}
	@Then ("^Click on Reset button in sweater$")
	public void Click_on_Reset_button_in_sweater() throws Throwable {
		page.Click_on_Reset_button_in_sweater();
	}
	@Then ("^Click on Save button in sweater$")
	public void Click_on_Save_button_in_sweater() throws Throwable {
		page.Click_on_Save_button_in_sweater();
	}

	@And ("^Click on Fabric Manager in sweater$")
	public void Click_on_Fabric_Manager_in_sweater() throws Throwable {
		page.Click_on_Fabric_Manager_in_sweater();
	}
	
	@And("^click on User Account in sweater$")
	public void click_on_User_Account_in_sweater() throws Throwable {
		page.click_on_User_Account_in_sweater();
	}
	
	@And ("^Navigate to PD Fabric Pricing screen in sweater$")
	public void Navigate_to_PD_Fabric_Pricing_screen_in_sweater() throws Throwable {
		page.Navigate_to_PD_Fabric_Pricing_screen_in_sweater();
	}


}
