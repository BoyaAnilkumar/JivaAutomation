package Stepdefinition1;


import Page.MerchandisingTandA_Pages;
import io.cucumber.java.en.And;

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
}