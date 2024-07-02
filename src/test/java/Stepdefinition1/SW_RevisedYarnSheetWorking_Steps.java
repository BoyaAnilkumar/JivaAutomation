package Stepdefinition1;

import Page.SW_RevisedYarnSheetWorking_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SW_RevisedYarnSheetWorking_Steps {
	
	SW_RevisedYarnSheetWorking_Pages SRYW = new SW_RevisedYarnSheetWorking_Pages();
	

	@Then("^Click on the Revised yarn sheet working$")
	public void Click_on_the_Revised_yarn_sheet_working() throws Throwable {
		SRYW.Click_on_the_Revised_yarn_sheet_working();
	}
	
	@And("^Click on style expansion in Revised yarn sheet working$")
	public void Click_on_style_expansion_in_Revised_yarn_sheet_working() throws Throwable {
		SRYW.Click_on_style_expansion_in_Revised_yarn_sheet_working();
	}
}
