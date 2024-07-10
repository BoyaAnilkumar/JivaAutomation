package Stepdefinition1;

import Page.SW_Create_PO_For_Stock_Page;
import io.cucumber.java.en.And;

public class SW_Create_PO_For_Stock_Steps {
	SW_Create_PO_For_Stock_Page Sw_Create_Po_Stock = new SW_Create_PO_For_Stock_Page();
	
	@And ("^Click on the Create PO For Stock Screen$") 
	public void Click_on_the_Create_PO_For_Stock_Screen() throws Throwable {
		Sw_Create_Po_Stock.Click_on_the_Create_PO_For_Stock_Screen();
	}
	@And ("^The Create PO For Stock Screen is displayed or not$")
	public void The_Create_PO_For_Stock_Screen_is_displayed_or_not() throws Throwable {
		Sw_Create_Po_Stock.The_Create_PO_For_Stock_Screen_is_displayed_or_not();
	}
	@And ("Select the {string} of Order in the Create PO For Stock Screen")
	public void Select_the_of_Order_in_the_Create_PO_For_Stock_Screen(String Type) throws Throwable {
		Sw_Create_Po_Stock.Select_the_of_Order_in_the_Create_PO_For_Stock_Screen(Type);
	}
	@And ("Enter the data in {string} field in the Create PO for Stock") 
	public void Enter_the_data_in_field_in_the_Create_PO_for_Stock(String Rate) throws Throwable {
		Sw_Create_Po_Stock.Enter_the_data_in_field_in_the_Create_PO_for_Stock(Rate);
	}
	@And ("^Enter the data in the Quantity field$")
	public void Enter_the_data_in_the_Quantity_field() throws Throwable {
		Sw_Create_Po_Stock.Enter_the_data_in_the_Quantity_field();
	}
	@And ("^Select the Sample Check box$")
	public void Select_the_Sample_Check_box() throws Throwable {
		Sw_Create_Po_Stock.Select_the_Sample_Check_box();
	}
	@And ("Enter the data in the {string} Shrinkage field")
	public void Enter_the_data_in_the_Shrinkage_field(String Residual) throws Throwable {
		Sw_Create_Po_Stock.Enter_the_data_in_the_Shrinkage_field(Residual);
	}
	
	@And ("^Enter the data in the Process Loss field$")
	public void Enter_the_data_in_the_Process_Loss_field() throws Throwable {
		Sw_Create_Po_Stock.Enter_the_data_in_the_Process_Loss_field();
	}
	@And ("^Select the Buyer in the Create PO For Stock screen$")
	public void Select_the_Buyer_in_the_Create_PO_For_Stock_screen() throws Throwable {
		Sw_Create_Po_Stock.Select_the_Buyer_in_the_Create_PO_For_Stock_screen();
	}
	@And ("^Enter the data in the Style field$")
	public void Enter_the_data_in_the_Style_field() throws Throwable {
		Sw_Create_Po_Stock.Enter_the_data_in_the_Style_field();
	}
	@And ("Select the {string} color in the Yarn details section")
	public void Select_the_color_in_the_Yarn_details_section(String Color) throws Throwable {
		Sw_Create_Po_Stock.Select_the_color_in_the_Yarn_details_section(Color);
	}
	@And ("^Click on the Reset button the entered data is cleared$")
	public void Click_on_the_Reset_button_the_entered_data_is_cleared() throws Throwable {
		Sw_Create_Po_Stock.Click_on_the_Reset_button_the_entered_data_is_cleared();
	}
	@And ("Select the {string} in the yarn section")
	public void Select_the_in_the_yarn_section(String YarnQuality) throws Throwable {
		Sw_Create_Po_Stock.Select_the_in_the_yarn_section(YarnQuality);
	}
	@And ("^The Save validation message is displayed or not$")
	public void The_Save_validation_message_is_displayed_or_not() throws Throwable {
		Sw_Create_Po_Stock.The_Save_validation_message_is_displayed_or_not();
	}
}
