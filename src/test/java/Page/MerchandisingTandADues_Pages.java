package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class MerchandisingTandADues_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By TandA = By.xpath("(//div/span[text()='T&A'])[1]");
	By TandA_Dues = By.xpath("(//ul/li/a[text()='T&A Dues'])[1]");
	By Overdue = By.xpath("//u[text()='Overdue']");
	
	
	
	public void Click_on_TandA() throws Throwable {
	
		utilities.webDriverWait(driver, TandA );
		driver.findElement(TandA).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_TandA_Dues() throws Throwable {

		utilities.webDriverWait(driver, TandA_Dues );
		driver.findElement(TandA_Dues).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Overdue() throws Throwable {
		
		utilities.webDriverWait(driver, Overdue);
		driver.findElement(Overdue).click();
		utilities.MinimumWait(driver);
		
	}

}
