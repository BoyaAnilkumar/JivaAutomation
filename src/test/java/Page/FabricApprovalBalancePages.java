package Page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class FabricApprovalBalancePages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	DailyInInputpages DIIP = new DailyInInputpages();
	IPOWiseInOutRptPages IWIOR = new IPOWiseInOutRptPages();
	
		
	By scrFabAppBal = By.xpath("//a[text()='Fabric Approval Balance']");
	By FilBuyerName		= By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[2]");
	By Buyer			= By.xpath("//input[@role='textbox']");
	By secBuyer			= By.xpath("(//div[@class='country-item ng-star-inserted']//div)[2]");
	By Quality			= By.xpath("//p-multiselect[@optionlabel='fabricName']");
	By FabQuality		= By.xpath("//input[contains(@class,'p-multiselect-filter p-inputtext')]");
	By secQuality		= By.xpath("//div[@class='country-item ng-star-inserted']//div[1]");
	By Month			= By.xpath("//p-multiselect[@optionlabel='value']");
	By Filmonth			= By.xpath("//input[contains(@class,'p-multiselect-filter p-inputtext')]");
	By secMonth			= By.xpath("//div[@class='country-item ng-star-inserted']");
	By IPOname			= By.xpath("//p-multiselect[@optionlabel='ipoNumber']");
	By ipo				= By.xpath("//input[contains(@class,'p-multiselect-filter p-inputtext')]");
	By secIPO			= By.xpath("//ul[@role='listbox']//li[1]");
	By DisFinalFab		= By.xpath("//input[@id='exampleCheck1']");
	
	
	
	

	public void Navigate_to_Fabric_Approval_Balance_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, DIIP.Fabric_Store);
		driver.findElement(DIIP.Fabric_Store).click();
		utilities.webDriverWait(driver,IWIOR.FStReports);
		driver.findElement(IWIOR.FStReports).click();
		utilities.webDriverWait(driver,IWIOR.modDailyInOut);
		driver.findElement(IWIOR.modDailyInOut).click();
		utilities.webDriverWait(driver,scrFabAppBal);
		driver.findElement(scrFabAppBal).click();
	}

	public void Click_and_select_the_Buyer_in_Buyer_field(String BuyerName) throws Throwable {
		utilities.webDriverWait(driver,FilBuyerName);
		driver.findElement(FilBuyerName).click();
		utilities.webDriverWait(driver,Buyer);
		driver.findElement(Buyer).sendKeys(BuyerName);
		utilities.webDriverWait(driver,secBuyer);
		driver.findElement(secBuyer).click();
		driver.findElement(FilBuyerName).click();
	}

	public void Click_in_the_Fabric_Quality_field(String FabricQuality) throws Throwable {
		utilities.webDriverWait(driver,Quality);
		driver.findElement(Quality).click();
		utilities.webDriverWait(driver,FabQuality);
		driver.findElement(FabQuality).sendKeys(FabricQuality);
		utilities.webDriverWait(driver,secQuality);
		driver.findElement(secQuality).click();
		driver.findElement(Quality).click();
	}

	public void Click_in_the_Month_field(String month) throws Throwable {
		utilities.webDriverWait(driver,Month);
		driver.findElement(Month).click();
		utilities.webDriverWait(driver,Filmonth);
		driver.findElement(Filmonth).sendKeys(month);
		utilities.webDriverWait(driver,secMonth);
		driver.findElement(secMonth).click();
		driver.findElement(Month).click();
	}

	public void Click_in_the_IPO_field(String IPO) throws Throwable {
		utilities.webDriverWait(driver,IPOname);
		driver.findElement(IPOname).click();
		utilities.webDriverWait(driver,ipo);
		driver.findElement(ipo).sendKeys(IPO);
		utilities.webDriverWait(driver,secIPO);
		driver.findElement(secIPO).click();
		driver.findElement(IPOname).click();
	}

	public void Verify_the_Display_Only_Final_Fabric_checkbox_field_status_bydefault() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		utilities.webDriverWait(driver,DisFinalFab);
		wait.until(ExpectedConditions.elementToBeClickable(DisFinalFab));
		driver.findElement(DisFinalFab).click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(DisFinalFab);
	    boolean isEnabled = checkbox.isEnabled();
	    System.out.println("The check box is in : "+isEnabled+" state");
	    boolean isSelected = checkbox.isSelected();
        System.out.println("The checkbox is selected: " + isSelected);
        if (isEnabled) {
            System.out.println("The checkbox is in: enabled state");
        } else {
            System.out.println("The checkbox is in: disabled state");
        }
        

//        // Example assertions
//        assertTrue(status, "Checkbox should be enabled");
//        ass(isSelected, "Checkbox should be selected");
	}

//	private void ass(boolean isSelected, String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void assertTrue(boolean status, String string) {
//		// TODO Auto-generated method stub
//		
//	}

}
