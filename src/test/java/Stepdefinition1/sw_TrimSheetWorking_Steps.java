package Stepdefinition1;

import Page.sw_TrimSheetWorking_Pages;
import io.cucumber.java.en.Then;

public class sw_TrimSheetWorking_Steps {
	
	sw_TrimSheetWorking_Pages swTSW = new sw_TrimSheetWorking_Pages();
	
	
	@Then ("^Navigate to sw Trim Sheet Working screen$")
	public void Navigate_to_sw_Trim_Sheet_Working_screen() throws Throwable {
		swTSW.Navigate_to_sw_Trim_Sheet_Working_screen();
	}
	@Then ("^Clear the data in the Qty per unit field$")
	public void Clear_the_data_in_the_Qty_per_unit_field() throws Throwable {
		swTSW.Clear_the_data_in_the_Qty_per_unit_field();
	}

}
