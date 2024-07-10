package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_Merch_T_And_A_Dues_Calender extends DriverFactory{
	
	Utilities utilities = new Utilities();

	By T_and_A_dropdown          = By.xpath("(//span[text()='T&A'])[3]");
	By MEr_T_and_A_Dues_Cal      = By.xpath("(//a[text()='T&A Dues Calendar'])[3]");
	By Mer_T_and_A_cal_screen    = By.xpath("//h3[text()='Sweater Merchant T&A Dues Calendar']");
	
	public void Click_on_the_T_and_A_dues_Calender_under_the_T_and_A_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MinimumWait(driver);	
		utilities.webDriverWait(driver, MEr_T_and_A_Dues_Cal);
		driver.findElement(MEr_T_and_A_Dues_Cal).click();
	}

	public void the_Merchandising_T_and_A_Dues_Calender_Screen_is_displayed_or_not() {
		WebElement data = driver.findElement(Mer_T_and_A_cal_screen);
		String Screen_name = data.getText(); 
		System.out.print("Display the Merchant T and A Dues Calender Screen:" + Screen_name);	
		
	}
}
