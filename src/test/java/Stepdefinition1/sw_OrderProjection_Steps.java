package Stepdefinition1;


import Page.Sw_OrderProjection_Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sw_OrderProjection_Steps {
	
	Sw_OrderProjection_Pages SWOP = new Sw_OrderProjection_Pages();
	
	@Given ("^Login with the SW Senior PD Merchant$")
	public void Login_with_the_SW_Senior_PD_Merchant() {
		SWOP.Login_with_the_SW_Senior_PD_Merchant();
	}
	@Then ("^Navigate to the Sweater Order Projection screen$")
	public void Navigate_to_the_Sweater_Order_Projection_screen() throws Throwable {
		SWOP.Navigate_to_the_Sweater_Order_Projection_screen();
	}
	@Given ("^Enter the first 2 letters of the Sweater Senior PD Merchant name$")
	public void Enter_the_first_2_letters_of_the_Sweater_Senior_PD_Merchant_name() throws Throwable {
		SWOP.Enter_the_first_2_letters_of_the_Sweater_Senior_PD_Merchant_name();
	}

}
