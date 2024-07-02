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

	
	@Then("^verify the IPO details after selecting the IPO$")
	public void verify_the_IPO_details_after_selecting_the_IPO() throws Throwable {
		GP.verify_the_IPO_details_after_selecting_the_IPO();
	}
	
	@And("^click on Block department to enable the toggle button$")
	public void click_on_Block_department_to_enable_the_toggle_button() throws Throwable {
		GP.click_on_Block_department_to_enable_the_toggle_button();
	}
	
	@And("^click on Half Stitch to enable the toggle button$")
	public void click_on_Half_Stitch_to_enable_the_toggle_button() throws Throwable {
		GP.click_on_Half_Stitch_to_enable_the_toggle_button();
	}
	
	@And("^click on Washing department and select the washing process$")
	public void click_on_Washing_department_and_select_the_washing_process() throws Throwable {
		GP.click_on_Washing_department_and_select_the_washing_process();
	}
	
	@And("^click on the Embroidery department and select the process$")
	public void click_on_the_Embroidery_department_and_select_the_process() throws Throwable {
		GP.click_on_the_Embroidery_department_and_select_the_process();
	}
	
	@And("^Click on Submit button to save the Garment Process$")
	public void Click_on_Submit_button_to_save_the_Garment_Process() throws Throwable {
		GP.Click_on_Submit_button_to_save_the_Garment_Process();
	}

}
