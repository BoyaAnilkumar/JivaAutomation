package Stepdefinition1;

import Page.StyleInitail_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StyleInitial {
	StyleInitail_Page StyleInitial = new StyleInitail_Page(); 
	
	
	   @When("^User navigates to Login page$")
    	public void User_navigates_to_Login_page() throws Throwable {
		   StyleInitial.User_navigates_to_Login_page();
    		
      }

	    @Then("^User enters the username and password$")
	    public void User_enters_the_username_and_password() throws Throwable {
	    	StyleInitial.User_enters_the_username_and_password();
	
    }
	
	    @And("^User click on the signIn$")
	    public void User_click_on_the_signIn() throws Throwable {
	    	StyleInitial.User_click_on_the_signIn();
		
      }
	    @And ("^Click on the Woven Module$")
	     public void Click_on_the_Woven_Module() throws Throwable{
	    	StyleInitial.Click_on_the_Woven_Module();

	}
	    @Then ("^click on the Merchandising Module$")
	    public void click_on_the_Merchandising_Module() throws Throwable{
	    	StyleInitial.click_on_the_Merchandising_Module();
	   }
	    @And ("^click on the Style Initail Details screen$")
	    public void click_on_the_Style_Initail_Details_screen() throws Throwable{
	    	StyleInitial.click_on_the_Style_Initail_Details_screen();

	}
	    @When ("^Click on the Styles Expansion$")
	    public void Click_on_the_Styles_Expansion() throws Throwable{
	    	StyleInitial.Click_on_the_Styles_Expansion();

	}
	    @And ("^Click on the Filter Icon$")
	    public void Click_on_the_Filter_Icon() throws Throwable{
	    	StyleInitial.Click_on_the_Filter_Icon();

	}
	    @And ("^Click on the Buyer Field$")
	    public void Click_on_the_Buyer_Field() throws Throwable{
	    	StyleInitial.Click_on_the_Buyer_Field();

	}
	    @Then ("^Select the Buyer$")
	    public void Select_the_Buyer() throws Throwable{
	    	StyleInitial.Select_the_Buyer();

	}
	    @And ("^Click on the Season Field$")
	    public void Click_on_the_Season_Field() throws Throwable{
	    	StyleInitial.Click_on_the_Season_Field();

	}
	    @And ("^Select the Season$")
	    public void Select_the_Season() throws Throwable{
	    	StyleInitial.Select_the_Season();

	}
	    
	    @And ("^Click on the Status Field$")
	       public void Click_on_the_Status_Field() throws Throwable{
		   StyleInitial.Click_on_the_Status_Field();

	  }
	   
	    
	    @And ("^Select the status$")
	       public void Select_the_status() throws Throwable{
		   StyleInitial.Select_the_status();

	  }
	    @And ("^Search the IPO$")
	       public void Search_the_IPO() throws Throwable{
		   StyleInitial.Search_the_IPO();

	  }
	    
	    @And ("^Click on the Apply button$")
	       public void Click_on_the_Apply_button() throws Throwable{
		   StyleInitial.Click_on_the_Apply_button();

	  } 
	    @And ("^Click on the Reset button$")
	       public void Click_on_the_Reset_button() throws Throwable{
		   StyleInitial.Click_on_the_Reset_button();

	  } 
	  
       @And ("^Select IPO/Style$")
       public void Select_IPO() throws Throwable{
	   StyleInitial.Select_IPO();

  }
       @And ("^Verify IPO data$")
       public void Verify_IPO_data() throws Throwable{
	   StyleInitial.Verify_IPO_data();

  }
       @And ("^Verify Style$")
       public void Verify_Style() throws Throwable{
	   StyleInitial.Verify_Style();

  }
       @And ("^Verify Buyer$")
       public void Verify_Buyer() throws Throwable{
	   StyleInitial.Verify_Buyer();

  }
       @And ("^Verify Season$")
       public void Verify_Season() throws Throwable{
	   StyleInitial.Verify_Season();

  }
       @And ("^Select File handover date$")
       public void Select_File_handover_date() throws Throwable{
	   StyleInitial.Select_File_handover_date();

  }
       @And ("^Click on the Add combo button$")
       public void Click_on_the_Add_combo_button() throws Throwable{
	   StyleInitial.Click_on_the_Add_combo_button();

  }
       @And ("^Enter the data in Combo1$")
       public void Enter_the_data_in_Combo1() throws Throwable{
	   StyleInitial.Enter_the_data_in_Combo1();

  }
       @And ("^Click on the Delete Icon1")
       public void Click_on_the_Delete_Icon1() throws Throwable{
	   StyleInitial.Click_on_the_Delete_Icon1();

  }
       @And ("^Enter the data in Combo2$")
       public void Enter_the_data_in_Combo2() throws Throwable{
	   StyleInitial.Enter_the_data_in_Combo2();

  }
       @And ("^Click on the delete Icon2$")
       public void Click_on_the_delete_Icon2() throws Throwable{
	   StyleInitial.Click_on_the_delete_Icon2();

  }
       @And ("^Click on the Add Garment type button$")
       public void Click_on_the_Add_Garment_type_button() throws Throwable{
	   StyleInitial.Click_on_the_Add_Garment_type_button();

  }
       @And ("^Click on the Delete Garment Icon1$")
       public void Click_on_the_Delete_Garment_Icon1() throws Throwable{
	   StyleInitial.Click_on_the_Delete_Garment_Icon1();

  }
       @And ("^Click on the Delete garment Icon2$")
       public void Click_on_the_Delete_garment_Icon2() throws Throwable{
	   StyleInitial.Click_on_the_Delete_garment_Icon2();

  }
       @And ("^Click on the Garment type field$")
       public void Click_on_the_Garment_type_field() throws Throwable{
	   StyleInitial.Click_on_the_Garment_type_field();

  }
       @And ("^Select the Garment type$")
       public void Select_the_Garment_type() throws Throwable{
	   StyleInitial.Select_the_Garment_type();

  }
       @And ("^Click on the Submit Order details button$")
       public void Click_on_the_Submit_Order_details_button() throws Throwable{
	   StyleInitial.Click_on_the_Submit_Order_details_button();

  }
       @And ("^Verify the Alert msg$")
       public void Verify_the_Alert_msg() throws Throwable{
	   StyleInitial.Verify_the_Alert_msg();

  }
}
