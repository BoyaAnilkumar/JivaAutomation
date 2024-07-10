package Stepdefinition1;

import Pages.sw_ReviseTrimSheet_Pages;
import io.cucumber.java.en.Then;

public class sw_ReviseTrimSheet_Steps {
	
	sw_ReviseTrimSheet_Pages swRTS = new sw_ReviseTrimSheet_Pages();
	
	@Then ("^Navigate to sw Revise Trim Sheet screen$")
	public void Navigate_to_sw_Revise_Trim_Sheet_screen() throws Throwable {
		swRTS.Navigate_to_sw_Revise_Trim_Sheet_screen();
	}

}
