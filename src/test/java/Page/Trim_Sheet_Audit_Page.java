package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Trim_Sheet_Audit_Page extends DriverFactory{
	
	Utilities utilities = new Utilities();

	By Audit            = By.xpath("(//span[text()='Audit '])[1]");
	By Data_Entry       = By.xpath("(//span[text()='Data Entry'])[2]");
	By Trim_Sheet_Audit = By.xpath("(//a[text()='Trim Sheet Audit'])[1]");
	
	public void Click_on_the_Trim_Sheet_Audit_under_the_Audit_module() throws Throwable {
		utilities.webDriverWait(driver, Audit );
		 driver.findElement(Audit).click();
		 utilities.MediumWait(driver);
		 
		 driver.findElement(Data_Entry).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(Trim_Sheet_Audit).click();	
		 Thread.sleep(2000);
		
	}
	
	
	

}
