package Stepdefinition1;

import Page.Machine_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Machine_Steps {

	Machine_Pages machine = new Machine_Pages();
	
	@And("^Click on the Machine screen$")
	public void Click_on_the_Machine_screen() throws Throwable {
		machine.Click_on_the_Machine_screen();
	}
	
	@Then("^Click on Add button to add the Machine details$")
	public void Click_on_Add_button_to_add_the_Machine_details() throws Throwable {
		machine.Click_on_Add_button_to_add_the_Machine_details();
	}
	
	@And("^Enter the mandatory fields data in Machine$")
	public void Enter_the_mandatory_fields_data_in_Machine() throws Throwable {
		machine.Enter_the_mandatory_fields_data_in_Machine();
	}
	
	@And("^Click on Save button in create Machine screen$")
	public void Click_on_Save_button_in_create_Machine_screen() throws Throwable {
		machine.Click_on_Save_button_in_create_Machine_screen();
	}
	
	@Then("^Click on Edit icon to update the Machine details$")
	public void Click_on_Edit_icon_to_update_the_Machine_details() throws Throwable {
		machine.Click_on_Edit_icon_to_update_the_Machine_details();
	}
	
	@Then("^Click on delete icon to update the Machine details$")
	public void Click_on_delete_icon_to_update_the_Machine_details() throws Throwable {
		machine.Click_on_delete_icon_to_update_the_Machine_details();
	}
	@Then("^User click on the security$")
	public void User_click_on_the_security() throws Throwable {
		machine.User_click_on_the_security();
		
   }
	@And("^User click on the Master$")
	public void User_click_on_the_Master() throws Throwable {
		machine.User_click_on_the_Master();
	}
	
	@Then("^Click on the Machine$")
	public void Click_on_the_Machine() throws Throwable {
		machine.Click_on_the_Machine();
		
   }
	@And("^Click on the add button$")
	public void Click_on_the_add_button() throws Throwable {
		machine.Click_on_the_add_button();
		
   }
	@And("^click on the Submit button$")
	public void click_on_the_Submit_button() throws Throwable {
		machine.click_on_the_Submit_button();
		
   }
	@Then("^click on the machine model toggle icon$")
	public void click_on_the_machine_model_toggle_icon() throws Throwable {
		machine.click_on_the_machine_model_toggle_icon();
		
   }
	@And("^click on the min gauge icon$")
	public void click_on_the_min_gauge_icon() throws Throwable {
		machine.click_on_the_min_gauge_icon();
		
   }
	@Then("^click on the max gauge toggle icon$")
	public void click_on_the_max_gauge_toggle_icon() throws Throwable {
		machine.click_on_the_max_gauge_toggle_icon();
		
  }
	
	@When("^User enter the machine model name$")
	public void User_enter_the_machine_model_name() throws Throwable {
		machine.User_enter_the_machine_model_name();
		
  }
	
	@And("^user enter the Min gauge$")
	public void user_enter_the_Min_gauge() throws Throwable {
		machine.user_enter_the_Min_gauge();
		
  }
	
	@When("^user enter the max gauge$")
	public void user_enter_the_max_gauge() throws Throwable {
		machine.user_enter_the_max_gauge();
		
  }
}
