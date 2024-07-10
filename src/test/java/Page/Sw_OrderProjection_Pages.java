package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import Pages.RevisedMUWorkingPages;
import util.DriverFactory;
import util.Utilities;

public class Sw_OrderProjection_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities(); 
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	
	By modSweater = By.xpath("//span[text()='Sweater ']");
	By swmodPD = By.xpath("(//span[text()='PD '])[2]");
	By swPDDataEntry =By.xpath("(//span[text()='Data Entry'])[1]");
	By swPDscrOrderProjection = By.xpath("//a[text()='Order Projection ']");
	By swPDMername = By.xpath("//input[@placeholder='Search By Name/Email/Ph.no']");
	
	

	public void Login_with_the_SW_Senior_PD_Merchant() {
		driver.findElement(RMUW.txtUN).clear();
		driver.findElement(RMUW.txtUN).sendKeys("Soujanya");
		driver.findElement(RMUW.txtPwd).clear();
		driver.findElement(RMUW.txtPwd).sendKeys("Abcd@123");
	}

	public void Navigate_to_the_Sweater_Order_Projection_screen() throws Throwable {
		utilities.webDriverWait(driver, modSweater);
		driver.findElement(modSweater).click();
		utilities.webDriverWait(driver, swmodPD);
		driver.findElement(swmodPD).click();
		utilities.webDriverWait(driver, swPDDataEntry);
		driver.findElement(swPDDataEntry).click();
		utilities.webDriverWait(driver, swPDscrOrderProjection);
		driver.findElement(swPDscrOrderProjection).click();
	}

	public void Enter_the_first_2_letters_of_the_Sweater_Senior_PD_Merchant_name() throws Throwable {
		utilities.webDriverWait(driver, swPDMername);
		driver.findElement(swPDMername).sendKeys("so");
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

}
