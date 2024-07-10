package Pages;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class sw_ViewTrimSheet_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	sw_NewTrimSheet_pages swNTS 	= new sw_NewTrimSheet_pages();
	
	By MerReport 			= By.xpath("(//li[@routerlinkactive='mm-active']//child::span[text()='Reports'])[1]");
	By scrswViewTrimSheet	= By.xpath("//a[text()='View Trim Sheet']");
	
	
	public void Navigate_to_sw_View_Trim_Sheet_screen() throws Throwable {
		utilities.webDriverWait(driver, swNTS.modSweater);
		driver.findElement(swNTS.modSweater).click();
		utilities.webDriverWait(driver, swNTS.modMerchandising);
		driver.findElement(swNTS.modMerchandising).click();
		utilities.webDriverWait(driver, MerReport);
		driver.findElement(MerReport).click();
		utilities.webDriverWait(driver, scrswViewTrimSheet);
		driver.findElement(scrswViewTrimSheet).click();
		
	}

}
