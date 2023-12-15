<<<<<<< HEAD

=======
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/main
>>>>>>> refs/remotes/origin/main
package Stepdefinition1;

import Page.PendingIPO_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PendingIPO_Steps {

	PendingIPO_page PendingIPOpage = new PendingIPO_page();

	@Given("^Login with Audit Manager credentials in Login page$")
	public void Login_with_Audit_Manager_credentials_in_Login_page() throws Throwable {
		PendingIPOpage.Login_with_Audit_Manager_credentials_in_Login_page();
	}
	
	@Then("^Click on WovenKnit Module$")
	public void Click_on_WovenKnit_Module() throws Throwable {
		PendingIPOpage.Click_on_WovenKnit_Module();
	}
	
	@And ("^Click on Audit Module$")
	public void Click_on_Audit_Module() throws Throwable {
		PendingIPOpage.Click_on_Audit_Module();
	}
	
	@Then("^Click on Pending IPO list in menu$")
	public void Click_on_Pending_IPO_list_in_menu() throws Throwable {
		PendingIPOpage.Click_on_Pending_IPO_list_in_menu();
	}
	
	@And("^Verify whether user navigated to Pending IPO list or not$")
	public void Verify_whether_user_navigated_to_Pending_IPO_list_or_not() throws Throwable {
		PendingIPOpage.Verify_whether_user_navigated_to_Pending_IPO_list_or_not();
	}
	
	@And("^Verify whether the data is displaying in grid or not$")
	public void Verify_whether_the_data_is_displaying_in_grid_or_not() throws Throwable {
		PendingIPOpage.Verify_whether_the_data_is_displaying_in_grid_or_not();
	}
	
	@And("^Click on Generate IPO button$")
	public void Click_on_Generate_IPO_button() throws Throwable{
		PendingIPOpage.Click_on_Generate_IPO_button();
	}
	
	@And("^Verify whether Generate IPO screen is displaying or not$")
	public void Verify_whether_Generate_IPO_screen_is_displaying_or_not() {
		PendingIPOpage.Verify_whether_Generate_IPO_screen_is_displaying_or_not();
	}
	
	@And("^Verify whether the current date is displaying for IPO date field or not$")
	public void Verify_whether_the_current_date_is_displaying_for_IPO_date_field_or_not() {
		PendingIPOpage.Verify_whether_the_current_date_is_displaying_for_IPO_date_field_or_not();
	}
	
	@And("^verify whether the Buyer Style is prepopulated or not$")
	public void verify_whether_the_Buyer_Style_is_prepopulated_or_not() {
		PendingIPOpage.verify_whether_the_Buyer_Style_is_prepopulated_or_not();
	}
	
	@And("^Verify whether the IPO field is prepopulated with data or not$")
	public void Verify_whether_the_IPO_field_is_prepopulated_with_data_or_not() throws Throwable {
		PendingIPOpage.Verify_whether_the_IPO_field_is_prepopulated_with_data_or_not();
	}
	
	@And("^Enter IPO number in IPO field$")
	public void Enter_IPO_number_in_IPO_field() throws Throwable {
		PendingIPOpage.Enter_IPO_number_in_IPO_field();
	}
	
	@And("^Verify Buyer is prepopulated or not$")
	public void Verify_Buyer_is_prepopulated_or_not() {
		PendingIPOpage.Verify_Buyer_is_prepopulated_or_not();
	}
}

