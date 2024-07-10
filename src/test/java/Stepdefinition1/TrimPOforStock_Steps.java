package Stepdefinition1;

import Page.TrimPOforStock_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class TrimPOforStock_Steps {
	
	TrimPOforStock_Pages TPOS		=	new TrimPOforStock_Pages();

	
	@Then ("^Navigate to Trim PO for Stock screen$")
	public void Navigate_to_Trim_PO_for_Stock_screen() throws Throwable {
		TPOS.Navigate_to_Trim_PO_for_Stock_screen();
	}
	@Given ("Filter by Search By Style {string}")
	public void Filter_by_Search_By_Style_(String Style) {
		TPOS.Filter_by_Search_By_Style_(Style);
	}
	@Then ("^Verify whether navigated to the Create PO for Stock screen for Trims$")
	public void Verify_whether_navigated_to_the_Create_PO_for_Stock_screen_for_Trims() {
		TPOS.Verify_whether_navigated_to_the_Create_PO_for_Stock_screen_for_Trims();
	}
	@And ("Select Order Type{string}")
	public void Select_Order_Type(String OrderType) {
		TPOS.Select_Order_Type(OrderType);
	}
	@Given ("Enter Rate{string}")
	public void Enter_Rate(String Rate) {
		TPOS.Enter_Rate(Rate);
	}
	@Given ("Enter L-short{string}")
	public void Enter_Lshort(String LShort) {
		TPOS.Enter_Lshort(LShort);
	}
	  
}
