
package Stepdefinition1;

import Page.Country_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;


public class County_steps {

	
          Country_Page Country_Page = new Country_Page(); 
		
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
		   @And ("^Verify the successfull msg$")
		   public void Verify_the_successfull_msg() throws Throwable{
			   Country_Page.Verify_the_successfull_msg();

		}
		  
		   @And ("^Click on the Edit Icon in country table grid$")
		   public void Click_on_the_Edit_Icon_in_country_table_grid() throws Throwable{
			   Country_Page.Click_on_the_Edit_Icon_in_country_table_grid();

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
		   @And ("^click on the Update button$")
		   public void click_on_the_Update_button() throws Throwable{
			   Country_Page.click_on_the_Update_button();

		}
		   @And ("^Verify the Update msg$")
		   public void Verify_the_Update_msg() throws Throwable{
			   Country_Page.Verify_the_Update_msg();

		}
		   @And ("^Click on the update form Cancel button$")
		   public void Click_on_the_update_form_Cancel_button() throws Throwable{
			   Country_Page.Click_on_the_update_form_Cancel_button();

		}
		   @And ("^Click on the Delete Icon in country$")
		   public void Click_on_the_Delete_Icon_in_country() throws Throwable{
			   Country_Page.Click_on_the_Delete_Icon_in_country();
}
		   @And ("^Verify the Delete msg$")
		   public void Verify_the_Delete_msg() throws Throwable{
			   Country_Page.Verify_the_Delete_msg();
}
		   @And ("^Search the Country name$")
		   public void Search_the_Country_name() throws Throwable{
			   Country_Page.Search_the_Country_name();

     }

		   @And("^click on save button in country add form$")
		   public void click_on_save_button_in_country_add_form() throws Throwable {
			   Country_Page.click_on_save_button_in_country_add_form();
		   }

		   
		   @And("^verify the validation msgs are displaying for the mandatory fields$")
		   public void verify_the_validation_msgs_are_displaying_for_the_mandatory_fields() throws Throwable {
			   Country_Page.verify_the_validation_msgs_are_displaying_for_the_mandatory_fields();
		   }

		 

}

