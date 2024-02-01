package Stepdefinition1;

import Page.POForStockPages;
import io.cucumber.java.en.Then;

public class POForStockSteps {
	
	POForStockPages POS = new POForStockPages();
	
	
	@Then ("^Navigate to PO For Stock screen$")
	public void Navigate_to_PO_For_Stock_screen() throws Throwable {
		POS.Navigate_to_PO_For_Stock_screen();
	}
	@Then ("^Click on the Filter showhide button$")
	public void Click_on_the_Filter_showhide_button() throws Throwable {
		POS.Click_on_the_Filter_showhide_button();
	}
	@Then ("^Select a Supplier from dropdown list$")
	public void Select_a_Supplier_from_dropdown_list() throws Throwable {
		POS.Select_a_Supplier_from_dropdown_list();
	}
	@Then ("^Select a Fabric Quality from dropdown list$")
	public void Select_a_Fabric_Quality_from_dropdown_list() throws Throwable {
		POS.Select_a_Fabric_Quality_from_dropdown_list();
	}

}
