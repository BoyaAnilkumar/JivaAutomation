package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class sw_TrimSheetAcceptance_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	sw_NewTrimSheet_pages swNTS = new sw_NewTrimSheet_pages();
	
	By modTrims					= By.xpath("//li[@class='ng-star-inserted mm-active']//span[text()=' Trims ']");
	By TrimDataEntry			= By.xpath("//li[@class='ng-star-inserted mm-active']//span[text()='Data Entry']");
	By scrTrimSheetAcceptance	= By.xpath("//li[@class='ng-star-inserted mm-active']//a[text()='Trim Sheet Acceptance']");
	

	public void Navigate_to_sw_Trim_Sheet_Acceptance_screen() throws Throwable {
		utilities.webDriverWait(driver, swNTS.modSweater);
		driver.findElement(swNTS.modSweater).click();
		utilities.webDriverWait(driver, modTrims);
		driver.findElement(modTrims).click();
		utilities.webDriverWait(driver, TrimDataEntry);
		driver.findElement(TrimDataEntry).click();
		utilities.webDriverWait(driver, scrTrimSheetAcceptance);
		driver.findElement(scrTrimSheetAcceptance).click();
		
	}

}
