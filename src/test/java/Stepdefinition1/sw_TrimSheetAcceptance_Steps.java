package Stepdefinition1;

import Page.sw_TrimSheetAcceptance_Pages;
import io.cucumber.java.en.Then;

public class sw_TrimSheetAcceptance_Steps {
	
	sw_TrimSheetAcceptance_Pages swTSA = new sw_TrimSheetAcceptance_Pages();
	
	@Then ("^Navigate to sw Trim Sheet Acceptance screen$")
	public void Navigate_to_sw_Trim_Sheet_Acceptance_screen() throws Throwable {
		swTSA.Navigate_to_sw_Trim_Sheet_Acceptance_screen();
	}

}
