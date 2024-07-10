package Stepdefinition1;

import Page.FabricLiabilityInfo_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FabricLiabilityInfo_Steps {
	FabricLiabilityInfo_Pages FLI = new FabricLiabilityInfo_Pages();
	
	@And("^Click on Report in Fabric Store module$")
	public void Click_on_Report_in_Fabric_Store_module() throws Throwable {
		FLI.Click_on_Report_in_Fabric_Store_module();
	}
	@Then("^Click on Fabric Liability Info$")
	public void Click_on_Fabric_Liability_Info() throws Throwable {
		FLI.Click_on_Fabric_Liability_Info();
	}
	
	@When("^Click on Select IPO Number dropdown field$")
	public void Click_on_Select_IPO_Number_dropdown_field() throws Throwable {
		FLI.Click_on_Select_IPO_Number_dropdown_field();
	}
	
	@And("^Click on Select buyer dropdown field and select buyer$")
	public void Click_on_Select_buyer_dropdown_field_and_select_buyer() throws Throwable {
		FLI.Click_on_Select_buyer_dropdown_field_and_select_buyer();
	}
	
	@Then("^click on Search button$")
	public void click_on_Search_button() throws Throwable {
		FLI.click_on_Search_button();
		
	}
	
	@And("^Verify the data is displaying in grid after filter search$")
	public void Verify_the_data_is_displaying_in_grid_after_filter_search() throws Throwable {
		FLI.Verify_the_data_is_displaying_in_grid_after_filter_search();
	}
}
