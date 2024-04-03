package Stepdefinition1;

import Page.MerchandisingTandADues_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MerchandisingTandADues_Steps {
	MerchandisingTandADues_Pages MerchandisingTandADues_Pages = new MerchandisingTandADues_Pages();
	
	@And("^Click on TandA$")
	public void Click_on_TandA() throws Throwable {
		MerchandisingTandADues_Pages.Click_on_TandA();
	}
	
	@And("^Click on TandA Dues$")
	public void Click_on_TandA_Dues() throws Throwable {
		MerchandisingTandADues_Pages.Click_on_TandA_Dues();
	}
	
	@Then("^Click on Overdue$")
	public void Click_on_Overdue() throws Throwable {
		MerchandisingTandADues_Pages.Click_on_Overdue();
	}
	
	
}
