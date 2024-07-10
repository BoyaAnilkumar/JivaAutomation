package Pages;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class sw_NewTrimSheet_pages extends DriverFactory {
	
	Utilities utilities 		= new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	
	public By modSweater 				= By.xpath("//span[text()='Sweater ']");
	public By modMerchandising			= By.xpath("//li[@class='ng-star-inserted mm-active']//span[text()='Merchandising ']");
	public By MerDataEntry				= By.xpath("//li[@class='ng-star-inserted mm-active']//li[@class='ng-star-inserted mm-active']//span[text()='Data Entry']");
	public By swGenerateTrimSheet		= By.xpath("//li[@class='ng-star-inserted mm-active']//span[text()='Generate Trim Sheet']");
	public By scrNewTrimSheet			= By.xpath("//li[@class='ng-star-inserted mm-active']//a[text()='New Trim Sheet']");

	public void Login_with_the_SW_Production_Manager() {
		driver.findElement(RMUW.txtUN).clear();
		driver.findElement(RMUW.txtUN).sendKeys("Rajeswari");
		driver.findElement(RMUW.txtPwd).clear();
		driver.findElement(RMUW.txtPwd).sendKeys("Abcd@123");
	}

	public void Navigate_to_sw_New_Trim_Sheet_screen() throws Throwable {
		utilities.webDriverWait(driver, modSweater);
		driver.findElement(modSweater).click();
		utilities.webDriverWait(driver, modMerchandising);
		driver.findElement(modMerchandising).click();
		utilities.webDriverWait(driver, MerDataEntry);
		driver.findElement(MerDataEntry).click();
		utilities.webDriverWait(driver, swGenerateTrimSheet);
		driver.findElement(swGenerateTrimSheet).click();
		utilities.webDriverWait(driver, scrNewTrimSheet);
		driver.findElement(scrNewTrimSheet).click();
		
	}
	
	

}
