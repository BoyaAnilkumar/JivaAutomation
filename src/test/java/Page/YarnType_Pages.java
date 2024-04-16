package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class YarnType_Pages extends DriverFactory{
	Utilities utilities = new Utilities();

	By Yarn_Type = By.xpath("//a[text()='Yarn type ']");
	By Add_button = By.xpath("//button[text()=' Add']");
	By Yarn_Name = By.xpath("//input[@formcontrolname='yarnName']");
	By Content = By.xpath("//input[@formcontrolname='content']");
	By Count = By.xpath("//input[@formcontrolname='count']");
	By Save_Button = By.xpath("//button[@type='submit']");
	
	
	
	public void Click_on_the_Yarn_type_screen() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Type);
		driver.findElement(Yarn_Type).click();
		utilities.MinimumWait(driver);
		
	}



	public void Click_on_Add_button_to_add_the_Yarn_type() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		Thread.sleep(2000);
		
	}



	public void Enter_the_mandatory_fields_data_in_Yarn_type() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Name);
		driver.findElement(Yarn_Name).click();
		Thread.sleep(2000);
		driver.findElement(Yarn_Name).sendKeys("MaUthoe");
		Thread.sleep(2000);
		driver.findElement(Content).click();
		Thread.sleep(2000);
		driver.findElement(Content).sendKeys("50%");
		Thread.sleep(2000);
		driver.findElement(Count).click();
		Thread.sleep(2000);
		driver.findElement(Count).sendKeys("25*02/30");
		Thread.sleep(2000);
		
	}



	public void Click_on_Save_button_in_create_Yarn_type_screen() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}
	
}
