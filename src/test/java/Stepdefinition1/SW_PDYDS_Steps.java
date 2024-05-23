package Stepdefinition1;

import Page.SW_PDYDS_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_PDYDS_Steps {

	SW_PDYDS_Pages SW_PDYDS = new SW_PDYDS_Pages();
	
	@And("^Click on PD YDS screen$")
	public void Click_on_PD_YDS_screen() throws Throwable {
		SW_PDYDS.Click_on_PD_YDS_screen();
	}
	
	@And("^Select the Style in the list in yarn pd$")
	public void Select_the_Style_in_the_list_in_yarn_pd() throws Throwable {
		SW_PDYDS.Select_the_Style_in_the_list_in_yarn_pd();
	}
	
	@Then("^Click on Add New yarn in Yarn details sheet$")
	public void Click_on_Add_New_yarn_in_Yarn_details_sheet() throws Throwable {
		SW_PDYDS.Click_on_Add_New_yarn_in_Yarn_details_sheet();
	}
	@Then("^Click on Yarn Quality and Select the yarn quality$")
	public void Click_on_Yarn_Quality_and_Select_the_yarn_quality() throws Throwable {
		SW_PDYDS.Click_on_Yarn_Quality_and_Select_the_yarn_quality();
	}
	
	@Then("Click on Spin Type and Select the {string}")
	public void Click_on_Spin_Type_and_Select_the(String spintype) throws Throwable {
		SW_PDYDS.Click_on_Spin_Type_and_Select_the(spintype);
	}
	
	@Then("^Click on Color and Select the color$")
	public void Click_on_Color_and_Select_the_color() throws Throwable {
		SW_PDYDS.Click_on_Color_and_Select_the_color();
	}
	
	@Then("click on count and select the {string}")
	public void click_on_count_and_select_the(String count) throws Throwable {
		SW_PDYDS.click_on_count_and_select_the(count);
	}
	
	@Then("Enter the Finish data text field{string}")
	public void Enter_the_Finish_data_text_field(String finish) throws Throwable {
		SW_PDYDS.Enter_the_Finish_data_text_field(finish);
	}
	
	@Then("Enter Specific Requirements{string}")
	public void Enter_Specific_Requirements(String sreq) throws Throwable {
		SW_PDYDS.Enter_Specific_Requirements(sreq);
	}
	
	@Then("Enter Yarn Quantity{string}")
	public void Enter_Yarn_Quantity(String yarnqty) throws Throwable {
		SW_PDYDS.Enter_Yarn_Quantity(yarnqty);
	}
	
	@Then("Select the Use from dropdown{string}")
	public void Select_the_Use_from_dropdown(String use) throws Throwable {
		SW_PDYDS.Select_the_Use_from_dropdown(use);
	}
	
	@And("^Select Is Nominated checkbox$")
	public void Select_Is_Nominated_checkbox() throws Throwable{
		SW_PDYDS.Select_Is_Nominated_checkbox();
	}
}
