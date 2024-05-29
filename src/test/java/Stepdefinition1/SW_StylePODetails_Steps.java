package Stepdefinition1;

import Page.SW_StylePODetails_Pages;
import io.cucumber.java.en.And;

public class SW_StylePODetails_Steps {

	SW_StylePODetails_Pages SWStylePO = new SW_StylePODetails_Pages();
	
	
	@And("^Click on Merchandising Module$")
	public void Click_on_Merchandising_Module() throws Throwable {
		SWStylePO.Click_on_Merchandising_Module();
	}
	
	@And("^Click on Merchandising Data Entry$")
	public void Click_on_Merchandising_Data_Entry() throws Throwable {
		SWStylePO.Click_on_Merchandising_Data_Entry();
	}
	
	@And("^Click on Style PO Details$")
	public void Click_on_Style_PO_Details() throws Throwable {
		SWStylePO.Click_on_Style_PO_Details();
	}
}
