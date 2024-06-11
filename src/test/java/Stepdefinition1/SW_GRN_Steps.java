package Stepdefinition1;

import Page.SW_GRN_Pages;
import io.cucumber.java.en.And;

public class SW_GRN_Steps {

	SW_GRN_Pages SWGRN = new SW_GRN_Pages();
	
	@And("^Click on the Sweater Module$")
	public void Click_on_the_Sweater_Module() {
		SWGRN.Click_on_the_Sweater_Module();
	}
}
