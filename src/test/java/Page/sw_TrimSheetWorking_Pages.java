package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class sw_TrimSheetWorking_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	sw_NewTrimSheet_pages swNTS 		= new sw_NewTrimSheet_pages();
	TrimSheetWorking_Pages TSW			= new TrimSheetWorking_Pages();
	sw_TrimSheetAcceptance_Pages swTSA	= new sw_TrimSheetAcceptance_Pages();
	
	By modGenerateTrimMU				= By.xpath("//li[@class='ng-star-inserted mm-active']//span[text() ='Generate Trim Sheet Working']");
	By scrTrimMUWorking					= By.xpath("//a[text()='Trim sheet Working']");
	By FinalReq							= By.xpath("//label[text()='Final Requirement ']//following-sibling::input");
	By TrimRate							= By.xpath("//input[@formcontrolname='trimRatePerUnit']");
	By ConvRate							= By.xpath("//input[@formcontrolname='trimConversionRate']");

	
	public void Navigate_to_sw_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, swNTS.modSweater);
		driver.findElement(swNTS.modSweater).click();
		utilities.webDriverWait(driver, swTSA.modTrims);
		driver.findElement(swTSA.modTrims).click();
		utilities.webDriverWait(driver, swTSA.TrimDataEntry);
		driver.findElement(swTSA.TrimDataEntry).click();
		utilities.webDriverWait(driver, modGenerateTrimMU);
		driver.findElement(modGenerateTrimMU).click();
		utilities.webDriverWait(driver, scrTrimMUWorking);
		driver.findElement(scrTrimMUWorking).click();
	}


	public void Clear_the_data_in_the_Qty_per_unit_field() throws Throwable {
		utilities.webDriverWait(driver, TSW.QtyperUnit);
		driver.findElement(TSW.QtyperUnit).click();
		driver.findElement(TSW.QtyperUnit).clear();
		String Qty = driver.findElement(TSW.QtyperUnit).getAttribute("value");
		System.out.println("Print the Qty :"+Qty);
		Thread.sleep(2000);
//		BlurElementHandler handler = new BlurElementHandler();
		String finalQty = driver.findElement(FinalReq).getAttribute("value");
		System.out.println("Print the Final Required value : '"+finalQty+" '");
		Thread.sleep(2000);

        try {
            WebElement blurredElement = waitForElementVisibility(driver, FinalReq, 10);
            blurredElement.click();
            System.out.println("Blurred element clicked successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
//            driver.quit();
        }
		
//		driver.findElement(FinalReq).click();
//		System.out.println("clicked in the final Required field");
//		Thread.sleep(2000);
		String finalQty1 = driver.findElement(FinalReq).getAttribute("value");
		System.out.println("Print the Final Required value : '"+finalQty1+" '");
		Thread.sleep(2000);
//		utilities.webDriverWait(driver, TrimRate);
//		driver.findElement(TrimRate).click();
//		driver.findElement(TrimRate).clear();
//		System.out.println("Cleared the Rate field value");
//		utilities.webDriverWait(driver, ConvRate);
//		driver.findElement(ConvRate).click();
//		Thread.sleep(2000);
					
	}


	private WebElement waitForElementVisibility(WebDriver driver, By finalReq2, int timeoutInSeconds) {
		 WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(finalReq2));
	}
	
	
	

}
