package Stepdefinition1;

import Page.Fabric_Summary_Report_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Fabric_Summary_Report_steps {
   
	Fabric_Summary_Report_Page   Fabric_Summary_Report  = new Fabric_Summary_Report_Page();
	
	@And("^Click on the Fabric Summary Report under the T&A dropdown$")
	public void Click_on_the_Fabric_Summary_Report_under_the_TandA_dropdown() throws Throwable {
		Fabric_Summary_Report.Click_on_the_Fabric_Summary_Report_under_the_TandA_dropdown();
	}
	@Then ("^the Fabric Summary Report Screen is displayed or not$")
	public void the_Fabric_Summary_Report_Screen_is_displayed_or_not() throws Throwable {
		Fabric_Summary_Report.the_Fabric_Summary_Report_Screen_is_displayed_or_not();
	}
}
