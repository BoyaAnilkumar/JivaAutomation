package Stepdefinition1;

import Page.Country_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class County_steps {

	
          Country_Page Country_Page = new Country_Page(); 
		
		
		@When("^User navigates to Login page$")
	    	public void User_navigates_to_Login_page() throws Throwable {
			Country_Page.User_navigates_to_Login_page();

		     Country_Page.User_navigates_to_Login_page();
	    		
	      }

		@Then("^User enters the username and password$")
		public void User_enters_the_username_and_password() throws Throwable {
			Country_Page.User_enters_the_username_and_password();
		
	    }
		
		@And("^User click on the signIn$")
		public void User_click_on_the_signIn() throws Throwable {
			Country_Page.User_click_on_the_signIn();
			
	   }
		 @And ("^Click on the Master Module$")
		   public void Click_on_the_Master_Module() throws Throwable{
			 Country_Page.Click_on_the_Master_Module();

		}
		  
		   @And ("^click on the Country screen$")
		   public void click_on_the_Country_screen() throws Throwable{
			   Country_Page.click_on_the_Country_screen();

		}
		   @And ("^Click on the Country Add button$")
		   public void Click_on_the_Country_Add_button() throws Throwable{
			   Country_Page.Click_on_the_Country_Add_button();

		}
		   @And ("^Verify the Alert msg$")
		   public void Verify_the_Alert_msg() throws Throwable{
			   Country_Page.Verify_the_Alert_msg();
		   }
		   @Given ("^Enter the data in Country name field$")
		   public void Enter_the_data_in_Country_name_field() throws Throwable{
			   Country_Page.Enter_the_data_in_Country_name_field();

		}

		   @And ("^Enter the data in Country code field$")
		   public void Enter_the_data_in_Country_code_field() throws Throwable{
			   Country_Page.Enter_the_data_in_Country_code_field();

		}

		   @Then ("^CLick on the Currency type field$")
		   public void CLick_on_the_Currency_type_field() throws Throwable{
			   Country_Page.CLick_on_the_Currency_type_field();

		}

		   @And ("^Select the Currency type$")
		   public void Select_the_Currency_type() throws Throwable{
			   Country_Page.Select_the_Currency_type();

		}
		   @Given ("^Enter the data in Conversion Rate field$")
		   public void Enter_the_data_in_Conversion_Rate_field() throws Throwable{
			   Country_Page.Enter_the_data_in_Conversion_Rate_field();

		}
		   @And ("^Select the Active Check box$")
		   public void Select_the_Active_Check_box() throws Throwable{
			   Country_Page.Select_the_Active_Check_box();

		}
		   @And ("^CLick on the Save button$")
		   public void CLick_on_the_Save_button() throws Throwable{
			   Country_Page.CLick_on_the_Save_button();

		}
		   @And ("^Verify the successfull msg$")
		   public void Verify_the_successfull_msg() throws Throwable{
			   Country_Page.Verify_the_successfull_msg();

		}
		   @And ("^Click on the Cancel button$")
		   public void Click_on_the_Cancel_button() throws Throwable{
			   Country_Page.Click_on_the_Cancel_button();

		}
		   @And ("^Click on the Edit Icon$")
		   public void Click_on_the_Edit_Icon() throws Throwable{
			   Country_Page.Click_on_the_Edit_Icon();

		}
		   @Then ("^Update the Country name$")
		   public void Update_the_Country_name() throws Throwable{
			   Country_Page.Update_the_Country_name();

		}
		   @And ("^Update the Country code$")
		   public void Update_the_Country_code() throws Throwable{
			   Country_Page.Update_the_Country_code();

		}
		   @And ("^Update the Select Country$")
		   public void Update_the_Select_Country() throws Throwable{
			   Country_Page.Update_the_Select_Country();

		}
		   @And ("^Update the Conversion Rate$")
		   public void Update_the_Conversion_Rate() throws Throwable{
			   Country_Page.Update_the_Conversion_Rate();

		}
		   @And ("^Click on the Update button$")
		   public void Click_on_the_Update_button() throws Throwable{
			   Country_Page.Click_on_the_Update_button();

		}
		   @And ("^Verify the Update msg$")
		   public void Verify_the_Update_msg() throws Throwable{
			   Country_Page.Verify_the_Update_msg();

		}
		   @And ("^Click on the update form Cancel button$")
		   public void Click_on_the_update_form_Cancel_button() throws Throwable{
			   Country_Page.Click_on_the_update_form_Cancel_button();

		}
		   @And ("^Click on the Delete Icon$")
		   public void Click_on_the_Delete_Icon() throws Throwable{
			   Country_Page.Click_on_the_Delete_Icon();
}
		   @And ("^Verify the Delete msg$")
		   public void Verify_the_Delete_msg() throws Throwable{
			   Country_Page.Verify_the_Delete_msg();
}
		   @And ("^Search the Country name$")
		   public void Search_the_Country_name() throws Throwable{
			   Country_Page.Search_the_Country_name();
}
}


