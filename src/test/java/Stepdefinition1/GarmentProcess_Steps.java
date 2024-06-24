package Stepdefinition1;

import Page.GarmentProcess_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GarmentProcess_Steps {
	GarmentProcess_Pages GP = new GarmentProcess_Pages();
	
	@And("^Click on Production module$")
	public void Click_on_Production_module() throws Throwable {
		GP.Click_on_Production_module();
	}
	
	@Then("^click on Data Entry in production$")
	public void click_on_Data_Entry_in_production() throws Throwable {
		GP.click_on_Data_Entry_in_production();
	}
	
	@And("^Click on Garment Process$")
	public void Click_on_Garment_Process() throws Throwable {
		GP.Click_on_Garment_Process();
	}
	
	@Then("^Verify the Select IPO text is displaying in garment process screen$")
	public void Verify_the_Select_IPO_text_is_displaying_in_garment_process_screen() throws Throwable {
		GP.Verify_the_Select_IPO_text_is_displaying_in_garment_process_screen();
	}
	
	@And("^Click on Style Expansion$")
	public void Click_on_Style_Expansion() throws Throwable {
		GP.Click_on_Style_Expansion();
	}
	
	@When("^Clicked on Filter icon and apply filters$")
	public void Clicked_on_Filter_icon_and_apply_filters() throws Throwable {
		GP.Clicked_on_Filter_icon_and_apply_filters();
	}
	
	@And("^Click on the IPO in expansion$")
	public void Click_on_the_IPO_in_expansion() throws Throwable {
		GP.Click_on_the_IPO_in_expansion();
	}
}
