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
	
	@Then("^Click on Overdue tab$")
	public void Click_on_Overdue_tab() throws Throwable {
		MerchandisingTandADues_Pages.Click_on_Overdue_tab();
	}
	
	@And("^Click on Today tab$")
	public void Click_on_Today_tab() throws Throwable {
		MerchandisingTandADues_Pages.Click_on_Today_tab();
	}
	
	@And("^Click on Upcoming tab$")
	public void Click_on_Upcoming_tab() throws Throwable {
		MerchandisingTandADues_Pages.Click_on_Upcoming_tab();
	}
	
}
