package Stepdefinition1;

import Page.SW_StyleMaster_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_StyleMaster_Steps {
	
	SW_StyleMaster_page SW_Style_Master = new SW_StyleMaster_page();
	
	
	@Then("^click on Style master screen in sweater module$")
	public void click_on_Style_master_screen_in_sweater_module() throws Throwable {
		SW_Style_Master.click_on_Style_master_screen_in_sweater_module();
	}
	
	@Then("^Click on Add Style button$")
	public void Click_on_Add_Style_button() throws Throwable {
		SW_Style_Master.Click_on_Add_Style_button();
	}
	
	@And("^Enter PD Merchant Name and Select$")
	public void Enter_PD_Merchant_Name_and_Select() throws Throwable {
		SW_Style_Master.Enter_PD_Merchant_Name_and_Select();
	}
	
	@Then("Enter Buyer Style name {string}")
	public void Enter_Buyer_Style_name(String buyerstyle) throws Throwable {
		SW_Style_Master.Enter_Buyer_Style_name(buyerstyle);
	}
	
	@Then("Select Buyer from the dropdown list {string}")
	public void Select_Buyer_from_the_dropdown_list(String buyer) throws Throwable {
		SW_Style_Master.Select_Buyer_from_the_dropdown_list(buyer);
	}
	
	@Then("Select Season from dropddown list {string}")
	public void Select_Season_from_dropddown_list(String season) throws Throwable {
		SW_Style_Master.Select_Season_from_dropddown_list(season);
	}
	
	@Then("Select Garment Type from dropdown list {string}")
	public void Select_Garment_Type_from_dropdown_list(String garmenttype) throws Throwable {
		SW_Style_Master.Select_Garment_Type_from_dropdown_list(garmenttype);
	}
	
	@Then("Select Garment Process from dropdown list {string}")
	public void Select_Garment_Process_from_dropdown_list(String garmentprocess) throws Throwable {
		SW_Style_Master.Select_Garment_Process_from_dropdown_list(garmentprocess);
	}
	
	@Then("Enter the Garment Gauge {string}")
	public void Enter_the_Garment_Gauge(String garmentgauge) throws Throwable {
		SW_Style_Master.Enter_the_Garment_Gauge(garmentgauge);
	}
	
	@And("^Click on Save button to create style$")
	public void Click_on_Save_button_to_create_style() throws Throwable {
		SW_Style_Master.Click_on_Save_button_to_create_style();
	}
	
	@And("^Click on Filter button in style master$")
	public void Click_on_Filter_button_in_style_master() throws Throwable {
		SW_Style_Master.Click_on_Filter_button_in_style_master();
	}
	
	@Then("Enter the Style name in Search By Style{string}")
	public void Enter_the_Style_name_in_Search_By_Style(String search) throws Throwable {
		SW_Style_Master.Enter_the_Style_name_in_Search_By_Style(search);
	}
	
	@And("^Click on style name$")
	public void Click_on_style_name() throws Throwable {
		SW_Style_Master.Click_on_style_name();
	}
}
