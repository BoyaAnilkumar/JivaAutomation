package Pages;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class TrimPOforStock_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW 		= new RevisedMUWorkingPages();
	TrimSheetAcceptancePages TSA 	= new TrimSheetAcceptancePages();
	TrimPOMasterSheet_Pages TPOMS	= new TrimPOMasterSheet_Pages();
	
	By scrTrimPOStock				= By.xpath("//a[text()='Trim PO For Stock']");

	public void Navigate_to_Trim_PO_for_Stock_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, TSA.modTrims);
		driver.findElement(TSA.modTrims).click();
		utilities.webDriverWait(driver, TSA.TrimDataEntry);
		driver.findElement(TSA.TrimDataEntry).click();
		utilities.webDriverWait(driver, TPOMS.modTrimGeneratePO);
		driver.findElement(TPOMS.modTrimGeneratePO).click();
		utilities.webDriverWait(driver, scrTrimPOStock);
		driver.findElement(scrTrimPOStock).click();
	}

	public void Filter_by_Search_By_Style_(String style) {
		// TODO Auto-generated method stub
		
	}

	public void Verify_whether_navigated_to_the_Create_PO_for_Stock_screen_for_Trims() {
		// TODO Auto-generated method stub
		
	}

	public void Select_Order_Type(String orderType) {
		// TODO Auto-generated method stub
		
	}

	public void Enter_Rate(String rate) {
		// TODO Auto-generated method stub
		
	}

	public void Enter_Lshort(String lShort) {
		// TODO Auto-generated method stub
		
	}

	
}
