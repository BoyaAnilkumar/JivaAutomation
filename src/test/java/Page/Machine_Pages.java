package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Machine_Pages extends DriverFactory{
	Utilities utilities = new Utilities();

	By Machine = By.xpath("//a[text()='Machine ']");
	By Add_button = By.xpath("//button[text()=' Add ']");
	By Serial_Number = By.xpath("//input[@formcontrolname='serialNumber']");
	By Machine_Model_Name = By.xpath("//input[@formcontrolname='machineModelName']");
	By Min_Gauge = By.xpath("//input[@formcontrolname='minGauge']");
	By Max_Gauge = By.xpath("//input[@formcontrolname='maxGauge']");
	By Save_Button = By.xpath("//button[@type='submit']");
	By Success_Toaster = By.xpath("//h2[@id='swal2-title']");
	By update_Toaster = By.xpath("//h2[@id='swal2-title']");
	
	By Search_Keyword = By.xpath("//input[@placeholder='Search keyword']");
	By Edit_Icon = By.xpath("//a[@title='Edit'][1]");
	
	By Delete_Icon = By.xpath("(//button[@title='Delete'])[1]");
	By Confirmation = By.xpath("//h2[text()='Are You Sure You Want To Delete?']");
	By Yes_Delete = By.xpath("//button[text()='Yes']");
	By No_Delete = By.xpath("//button[text()='No'][2]");
	By Delete_Successfull_Toaster = By.xpath("//h2[@id='swal2-title']");
	
	
	
	public void Click_on_the_Machine_screen() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_Add_button_to_add_the_Machine_details() {
		// TODO Auto-generated method stub
		
	}

	public void Enter_the_mandatory_fields_data_in_Machine() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_Save_button_in_create_Machine_screen() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_Edit_icon_to_update_the_Machine_details() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_delete_icon_to_update_the_Machine_details() {
		// TODO Auto-generated method stub
		
	}
	
}
