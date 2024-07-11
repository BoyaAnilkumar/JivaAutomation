package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class sw_RevisedTrimSheetWorking_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	sw_NewTrimSheet_pages swNTS 		= new sw_NewTrimSheet_pages();
	TrimSheetWorking_Pages TSW			= new TrimSheetWorking_Pages();
	sw_TrimSheetAcceptance_Pages swTSA	= new sw_TrimSheetAcceptance_Pages();
	sw_TrimSheetWorking_Pages swTSW		= new sw_TrimSheetWorking_Pages();
	
	By scrRevisedTrimMUWorking			= By.xpath("//a[text()=' Revised Trim sheet Working ']");

	public void Navigate_to_sw_Revised_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, swNTS.modSweater);
		driver.findElement(swNTS.modSweater).click();
		utilities.webDriverWait(driver, swTSA.modTrims);
		driver.findElement(swTSA.modTrims).click();
		utilities.webDriverWait(driver, swTSA.TrimDataEntry);
		driver.findElement(swTSA.TrimDataEntry).click();
		utilities.webDriverWait(driver, swTSW.modGenerateTrimMU);
		driver.findElement(swTSW.modGenerateTrimMU).click();
		utilities.webDriverWait(driver, scrRevisedTrimMUWorking);
		driver.findElement(scrRevisedTrimMUWorking).click();
	}
	
	
	

}
