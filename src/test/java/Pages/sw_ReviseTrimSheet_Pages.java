package Pages;

import org.openqa.selenium.By;

import Pages.sw_NewTrimSheet_pages;
import util.DriverFactory;
import util.Utilities;

public class sw_ReviseTrimSheet_Pages extends DriverFactory {
	
	Utilities utilities 			= new Utilities();
	sw_NewTrimSheet_pages swNTS 	= new sw_NewTrimSheet_pages();
	
	By scrReviseTrimSheet 			= By.xpath("//li[@class='ng-star-inserted mm-active']//a[text()=' Revised Trim Sheet ']");

	public void Navigate_to_sw_Revise_Trim_Sheet_screen() throws Throwable {
		utilities.webDriverWait(driver, swNTS.modSweater);
		driver.findElement(swNTS.modSweater).click();
		utilities.webDriverWait(driver, swNTS.modMerchandising);
		driver.findElement(swNTS.modMerchandising).click();
		utilities.webDriverWait(driver, swNTS.MerDataEntry);
		driver.findElement(swNTS.MerDataEntry).click();
		utilities.webDriverWait(driver, swNTS.swGenerateTrimSheet);
		driver.findElement(swNTS.swGenerateTrimSheet).click();
		utilities.webDriverWait(driver, scrReviseTrimSheet);
		driver.findElement(scrReviseTrimSheet).click();
	}
	
	

}
