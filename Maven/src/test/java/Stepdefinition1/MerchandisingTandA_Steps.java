package Stepdefinition1;


import Page.MerchandisingTandA_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class MerchandisingTandA_Steps {

		MerchandisingTandA_Pages MerchandisingTandA_Pages = new MerchandisingTandA_Pages();

		 @And ("^Click on the T and A Module$")
		 public void Click_on_the_T_and_A_Module() throws Throwable{
		  MerchandisingTandA_Pages.Click_on_the_T_and_A_Module();
}
		 @And ("^Click on the Merchandising T&A Data Entry Screen$")
		 public void Click_on_the_Merchandising_T_and_A_Data_Entry_Screen() throws Throwable{
		  MerchandisingTandA_Pages.Click_on_the_Merchandising_T_and_A_Data_Entry_Screen();
		 
}
		 @And ("^Select the Month$")
		 public void Select_the_Month() throws Throwable{
		  MerchandisingTandA_Pages.Select_the_Month();
		}	 
		 @And ("^Search The IPO and Style$")
		 public void Search_The_IPO_and_Style() throws Throwable{
		  MerchandisingTandA_Pages.Search_The_IPO_and_Style();
		}	
		 @And ("^Verify the Buying house name is displaying or not$")
		 public void Verify_the_Buying_house_name_is_displaying_or_not() throws Throwable{
		  MerchandisingTandA_Pages.Verify_the_Buying_house_name_is_displaying_or_not();
		}	
		 @And ("^Verify the IPO Qty Value is displaying or not$")
		 public void Verify_the_IPO_Qty_Value_is_displaying_or_not() throws Throwable{
		  MerchandisingTandA_Pages.Verify_the_IPO_Qty_Value_is_displaying_or_not();
		}
		 @And ("^Click on the Add button$")
		 public void Click_on_the_Add_button() throws Throwable{
	     MerchandisingTandA_Pages.Click_on_the_Add_button();
}
		 @Given ("^Enter the data in proto commends received field$")
		 public void Enter_the_data_in_proto_commends_received_field() throws Throwable{
	     MerchandisingTandA_Pages.Enter_the_data_in_proto_commends_received_field();
}
		
		 @Given ("^Enter the data in Fit submittion field$")
		 public void Enter_the_data_in_Fit_submittion_field() throws Throwable{
	     MerchandisingTandA_Pages.Enter_the_data_in_Fit_submittion_field();
}
}