package Stepdefinition1;

import Pages.sw_NewTrimSheet_pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sw_NewTrimSheet_steps {
	
	sw_NewTrimSheet_pages swNTS= new sw_NewTrimSheet_pages();
	
	@Given ("^Login with the SW Production Manager$")
	public void Login_with_the_SW_Production_Manager() {
		swNTS.Login_with_the_SW_Production_Manager();
	}
	@Then ("^Navigate to sw New Trim Sheet screen$")
	public void Navigate_to_sw_New_Trim_Sheet_screen() throws Throwable {
		swNTS.Navigate_to_sw_New_Trim_Sheet_screen();
	}

}
