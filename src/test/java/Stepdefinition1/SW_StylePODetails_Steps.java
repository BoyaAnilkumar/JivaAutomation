package Stepdefinition1;

import Page.SW_StylePODetails_Pages;
import io.cucumber.java.en.And;

public class SW_StylePODetails_Steps {

	SW_StylePODetails_Pages SWStylePO = new SW_StylePODetails_Pages();
	
	
	
	@And("^Click on the Style PO Details$")
	public void Click_on_the_Style_PO_Details() throws Throwable {
		SWStylePO.Click_on_the_Style_PO_Details();
	}
	@And ("^Click on the Add New PO button in the Style PO Details Screen$")
	public void Click_on_the_Add_New_PO_button_in_the_Style_PO_Details_Screen() throws Throwable {
		SWStylePO.Click_on_the_Add_New_PO_button_in_the_Style_PO_Details_Screen();
	}
}
