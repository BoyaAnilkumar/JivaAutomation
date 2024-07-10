package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Style_Summary_Report_Page extends DriverFactory {
	
	Utilities utilities = new Utilities();
	By T_and_A_dropdown             = By.xpath("(//span[text()='T&A'])[1]");  
	By Style_Summary_Report         = By.xpath("(//a[text()='Style Summary Report '])[1]");
	By Style_Summary_report_Screen  = By.xpath("//h3[text()='Style Summary Report']");
	By fabric_Quality_field         = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[4]");
	By Textfield                    = By.xpath("//input[@role='textbox']");
	By check_Box                    = By.xpath("//div[@role='checkbox']");
	
	
	public void Click_on_the_Merchandising_Style_Summary_Report_under_the_T_and_A_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Style_Summary_Report);
		driver.findElement(Style_Summary_Report).click();
		utilities.MediumWait(driver);
		
	}

	public void the_Style_Summary_Report_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Style_Summary_report_Screen);
		String Screen_name  = driver.findElement(Style_Summary_report_Screen).getText();
		System.out.println("Display the Merchandising Style Summary Report Screen:" +Screen_name);
		
	}
	public void User_select_the_fabric_in_the_filter_page(String Fabric_Quality) throws Throwable {
		driver.findElement(fabric_Quality_field).click();
		Thread.sleep(2000);
		driver.findElement(Textfield).sendKeys(Fabric_Quality);
		utilities.MediumWait(driver);
		driver.findElement(check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(fabric_Quality_field).click();
		utilities.MediumWait(driver);
		
	}
}
