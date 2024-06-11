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
	By security = By.xpath("//span[text()='Security ']");
	By Masters = By.xpath("//span[text()='Masters ']");
	By machine = By.xpath("//a[text()='Machine ']");
	By Add = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By submit = By.xpath("//button[@type='submit']");
	By machinename = By.xpath("//div[@data-validate='Machine Model Name is required']");
	By mingauge = By.xpath("//div[@data-validate='Min Gauge is required']");
	By maxgauge = By.xpath("//div[@data-validate='Max Gauge is required']");	
	By machinemodel = By.xpath("//input[@placeholder='Enter Machine Model Name']");
	By Min = By.xpath("//input[@placeholder='Enter Min Gauge']");
	By max = By.xpath("//input[@placeholder='Enter Max Gauge']");
	
	public void User_click_on_the_security() throws Throwable {
		utilities.webDriverWait(driver, security);		
		driver.findElement(security).click();
		utilities.MaximumWait(driver);
				
				
		}
	
	
	public void Click_on_the_Machine_screen() throws Throwable {
		utilities.webDriverWait(driver, Machine);
		driver.findElement(Machine).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Add_button_to_add_the_Machine_details() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_mandatory_fields_data_in_Machine() throws Throwable {
		utilities.webDriverWait(driver, Serial_Number);
		String SNo = driver.findElement(Serial_Number).getAttribute("value");
		System.out.println("Serial Number:  " + SNo);
		utilities.MinimumWait(driver);
		
		driver.findElement(Machine_Model_Name).click();
		Thread.sleep(2000);
		driver.findElement(Machine_Model_Name).sendKeys("A-101");
		Thread.sleep(2000);
		String modelname = driver.findElement(Machine_Model_Name).getAttribute("value");
		System.out.println("Machine Model Name:  " + modelname);
		
		driver.findElement(Min_Gauge).click();
		Thread.sleep(2000);
		driver.findElement(Min_Gauge).sendKeys("20");
		Thread.sleep(2000);
		String mingauge = driver.findElement(Min_Gauge).getAttribute("value");
		System.out.println("Machine Min Gauge:  " + mingauge);
		
		driver.findElement(Max_Gauge).click();
		Thread.sleep(2000);
		driver.findElement(Max_Gauge).sendKeys("50");
		Thread.sleep(2000);
		String maxgauge = driver.findElement(Min_Gauge).getAttribute("value");
		System.out.println("Machine Max Gauge:  " + maxgauge);
		
	}

	public void Click_on_Save_button_in_create_Machine_screen() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Edit_icon_to_update_the_Machine_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("A-101");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		Thread.sleep(2000);
		
		driver.findElement(Min_Gauge).click();
		driver.findElement(Min_Gauge).clear();
		Thread.sleep(2000);
		driver.findElement(Min_Gauge).sendKeys("25");
		Thread.sleep(2000);
		
		driver.findElement(Save_Button).click();
		Thread.sleep(2000);
		
		
	}

	public void Click_on_delete_icon_to_update_the_Machine_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("A-101");
		Thread.sleep(2000);
		
		driver.findElement(Delete_Icon).click();
		Thread.sleep(2000);
		driver.findElement(Delete_Successfull_Toaster).click();
		Thread.sleep(2000);
		String delete_toaster = driver.findElement(Delete_Successfull_Toaster).getText();
		System.out.println(delete_toaster);
		
	}
	
	public void User_click_on_the_Master() throws Throwable {
		utilities.webDriverWait(driver, Masters);		
		driver.findElement(Masters).click();
		utilities.MaximumWait(driver);
				
		}

		public void Click_on_the_Machine() throws Throwable {
		utilities.webDriverWait(driver, machine);		
		driver.findElement(machine).click();
		utilities.MaximumWait(driver);
			
		}

		public void Click_on_the_add_button() throws Throwable {
		utilities.webDriverWait(driver, Add);		
		driver.findElement(Add).click();
		utilities.MaximumWait(driver); 
				
		}
		public void click_on_the_Submit_button() throws Throwable {
		utilities.webDriverWait(driver, submit);		
		driver.findElement(submit).click();
		utilities.MaximumWait(driver); 
				
				
		}
		public void click_on_the_machine_model_toggle_icon() throws Throwable {
		utilities.webDriverWait(driver, machinename);		
		driver.findElement(machinename).click();
		utilities.MaximumWait(driver); 
				
		}

		public void click_on_the_min_gauge_icon() throws Throwable {
		utilities.webDriverWait(driver, mingauge);		
		driver.findElement(mingauge).click();
		utilities.MaximumWait(driver);  
			
		}

		public void click_on_the_max_gauge_toggle_icon() throws Throwable {
		utilities.webDriverWait(driver, maxgauge);		
		driver.findElement(maxgauge).click();
		utilities.MaximumWait(driver); 
				
		}

		public void User_enter_the_machine_model_name() throws Throwable {
		utilities.webDriverWait(driver, machinemodel);
		driver.findElement(machinemodel).sendKeys("ASGTr");
		utilities.MediumWait(driver);
				
				
		}

		public void user_enter_the_Min_gauge()throws Throwable {
		utilities.webDriverWait(driver, Min);
		driver.findElement(Min).sendKeys("50");
		utilities.MediumWait(driver); 
				
		}

		public void user_enter_the_max_gauge() throws Throwable {
		utilities.webDriverWait(driver, max);
		driver.findElement(max).sendKeys("60");
		driver.findElement(submit).click();
		utilities.MediumWait(driver);
			
		}
}
