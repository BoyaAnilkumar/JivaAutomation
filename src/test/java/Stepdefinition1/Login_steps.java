package Stepdefinition1;


<<<<<<< HEAD
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_steps {
	LoginPage LoginPage = new LoginPage(); 
	
	
	@When("^User navigates to Login page$")
    	public void User_navigates_to_Login_page() throws Throwable {
    		LoginPage.User_navigates_to_Login_page();
    		
      }

	@Then("^User enters the username and password$")
	public void User_enters_the_username_and_password() throws Throwable {
		LoginPage.User_enters_the_username_and_password();
	
    }
	
	@And("^User click on the signIn$")
	public void User_click_on_the_signIn() throws Throwable {
		LoginPage.User_click_on_the_signIn();
		
   }
	 
	@And("^User click on the user icon$")
	public void User_click_on_the_user_icon() throws Throwable {
		LoginPage.User_click_on_the_user_icon();
   }

	@Then("^User click on the security$")
	public void User_click_on_the_security() throws Throwable {
		LoginPage.User_click_on_the_security();
		
   }
	@And("^User click on the Master$")
	public void User_click_on_the_Master() throws Throwable {
		LoginPage.User_click_on_the_Master();
	}
	
	@Then("^Click on the Machine$")
	public void Click_on_the_Machine() throws Throwable {
		LoginPage.Click_on_the_Machine();
		
   }
	@And("^Click on the add button$")
	public void Click_on_the_add_button() throws Throwable {
		LoginPage.Click_on_the_add_button();
		
   }
	@And("^click on the Submit button$")
	public void click_on_the_Submit_button() throws Throwable {
		LoginPage.click_on_the_Submit_button();
		
   }
	@Then("^click on the machine model toggle icon$")
	public void click_on_the_machine_model_toggle_icon() throws Throwable {
		LoginPage.click_on_the_machine_model_toggle_icon();
		
   }
	@And("^click on the min gauge icon$")
	public void click_on_the_min_gauge_icon() throws Throwable {
		LoginPage.click_on_the_min_gauge_icon();
		
   }
	@Then("^click on the max gauge toggle icon$")
	public void click_on_the_max_gauge_toggle_icon() throws Throwable {
		LoginPage.click_on_the_max_gauge_toggle_icon();
		
  }
	
	@When("^User enter the machine model name$")
	public void User_enter_the_machine_model_name() throws Throwable {
		LoginPage.User_enter_the_machine_model_name();
		
  }
	
	@And("^user enter the Min gauge$")
	public void user_enter_the_Min_gauge() throws Throwable {
		LoginPage.user_enter_the_Min_gauge();
		
  }
	
	@When("^user enter the max gauge$")
	public void user_enter_the_max_gauge() throws Throwable {
		LoginPage.user_enter_the_max_gauge();
		
  }
	
	@When("^User enter a valid username$")
    	public void User_enter_a_valid_username() throws Throwable {
    		LoginPage.User_enter_a_valid_username();
	
	}
    
	@And("^User enter an invalid password$")
	public void User_enter_an_invalid_password() throws Throwable {
		LoginPage.User_enter_an_invalid_password();
   }
	@And("^User click on the forgot password$")
	public void User_click_on_the_forgot_password() throws Throwable {
		LoginPage.User_click_on_the_forgot_password();
   }
	
	@Then("^User click on the submit$")
	public void User_click_on_the_submit() throws Throwable {
		LoginPage.User_click_on_the_submit();
  }
	
	@Then("^click on the toggle icon$")
	public void click_on_the_toggle_icon() throws Throwable {
		LoginPage.click_on_the_toggle_icon();
   }
	
	
	@When("^User enter the username$")
	public void User_enter_the_username() throws Throwable {
		LoginPage.User_enter_the_username();
   }
	@When("^User leave the username field empty$")
	public void User_leave_the_username_field_empty() throws Throwable {
		LoginPage.User_leave_the_username_field_empty();
  }
	@And("^User leave the password field empty$")
	public void User_leave_the_password_field_empty() throws Throwable {
		LoginPage.User_leave_the_password_field_empty();
  }
//   @And ("^Click on the Woven Module$")
//   public void Click_on_the_Woven_Module() throws Throwable{
//   LoginPage.Click_on_the_Woven_Module();
//
//}
//   @Then ("^click on the PD Module$")
//   public void click_on_the_PD_Module() throws Throwable{
//	   LoginPage.click_on_the_PD_Module();
//   }
//   @And ("^click on the Style Master screen$")
//   public void click_on_the_Style_Master_screen() throws Throwable{
//   LoginPage.click_on_the_Style_Master_screen();
//
//}
//   @Then ("^click on the Filter Icon$")
//   public void click_on_the_Filter_Icon() throws Throwable{
//	   LoginPage.click_on_the_Filter_Icon();
//   }
//   @And ("^Verify the Filter option page$")
//   public void Verify_the_Filter_option_page() throws Throwable{
//   LoginPage.Verify_the_Filter_option_page();
//   
//   }  
//   
   
=======
import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_steps {
	LoginPage LoginPage = new LoginPage(); 
	
	
	@Given("^User navigates to Login page$")
    	public void User_navigates_to_Login_page() throws Throwable {
    		LoginPage.User_navigates_to_Login_page();
    		
      }

	@Given("^User enters the username and password$")
	public void User_enters_the_username_and_password() throws Throwable {
		LoginPage.User_enters_the_username_and_password();
	
    }
	
	@And("^User click on the signIn$")
	public void User_click_on_the_signIn() throws Throwable {
		LoginPage.User_click_on_the_signIn();
		
   }
	 
	@And("^User click on the user icon$")
	public void User_click_on_the_user_icon() throws Throwable {
		LoginPage.User_click_on_the_user_icon();
   }

	
	
	@When("^User enter a valid username$")
    	public void User_enter_a_valid_username() throws Throwable {
    		LoginPage.User_enter_a_valid_username();
	
	}
    
	@And("^User enter an invalid password$")
	public void User_enter_an_invalid_password() throws Throwable {
		LoginPage.User_enter_an_invalid_password();
   }
	@And("^User click on the forgot password$")
	public void User_click_on_the_forgot_password() throws Throwable {
		LoginPage.User_click_on_the_forgot_password();
   }
	
	@Then("^User click on the submit$")
	public void User_click_on_the_submit() throws Throwable {
		LoginPage.User_click_on_the_submit();
  }
	
	@Then("^click on the toggle icon$")
	public void click_on_the_toggle_icon() throws Throwable {
		LoginPage.click_on_the_toggle_icon();
   }
	
	
	@When("^User enter the username$")
	public void User_enter_the_username() throws Throwable {
		LoginPage.User_enter_the_username();
   }
	@When("^User leave the username field empty$")
	public void User_leave_the_username_field_empty() throws Throwable {
		LoginPage.User_leave_the_username_field_empty();
  }
	@And("^User leave the password field empty$")
	public void User_leave_the_password_field_empty() throws Throwable {
		LoginPage.User_leave_the_password_field_empty();
  }

   @Then("^Click on Logout$")
   public void Click_on_Logout() throws Throwable {
	   LoginPage.Click_on_Logout();
   }
   
   @When("^User enters invalid username and valid password$")
   public void User_enters_invalid_username_and_valid_password() throws Throwable {
	   LoginPage.User_enters_invalid_username_and_valid_password();
   }
   
   @Then("^Incorrect User Name validation message should be displayed$")
   public void Incorrect_User_Name_validation_message_should_be_displayed() throws Throwable {
	   LoginPage.Incorrect_User_Name_validation_message_should_be_displayed();
   }
   
   @When("^User clicks on Forgot password link$")
   public void User_clicks_on_Forgot_password_link() throws Throwable {
	   LoginPage.User_clicks_on_Forgot_password_link();
   }
   
   @Then("^User navigated to the Forgot Password page$")
   public void User_navigated_to_the_Forgot_Password_page() throws Throwable {
	   LoginPage.User_navigated_to_the_Forgot_Password_page();
   }
   
   @When("^User without enters Email Address or Username$")
   public void User_without_enters_Email_Address_or_Username() throws Throwable {
	   LoginPage.User_without_enters_Email_Address_or_Username();
   }
   
   @Then("^validation message should be displayed or not$")
   public void validation_message_should_be_displayed_or_not() throws Throwable {
	   LoginPage.validation_message_should_be_displayed_or_not();
   }
   
   @When("^user enter the valid Email Address$")
   public void user_enter_the_valid_Email_Address() throws Throwable {
	   LoginPage.user_enter_the_valid_Email_Address();
   }
   
   @Then("^click on submit button in forgot password$")
   public void click_on_submit_button_in_forgot_password() throws Throwable {
	   LoginPage.click_on_submit_button_in_forgot_password();
   }
>>>>>>> branch 'master' of https://github.com/BoyaAnilkumar/JivaAutomation.git
}















