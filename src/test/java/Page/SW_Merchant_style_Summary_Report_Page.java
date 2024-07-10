package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class SW_Merchant_style_Summary_Report_Page  extends DriverFactory {
	
	Utilities utilities = new Utilities();
	By T_and_A_dropdown             = By.xpath("(//span[text()='T&A'])[3]");
	By Mer_Style_Summary_Report     = By.xpath("(//a[text()='Style Summary Report '])[2]");
	By Mer_Style_Summary_Report_Scr = By.xpath("//h3[text()='Style Summary Report ']");
	By Select_All_check_box         = By.xpath("(//div[@class='e-checkbox-wrapper e-css']//span)[2]");
	
	public void Click_on_the_Style_Summary_Report_under_the_T_and_A_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Mer_Style_Summary_Report);
		driver.findElement(Mer_Style_Summary_Report).click();
		utilities.MediumWait(driver);
		
	}


	public void the_Merchandising_Style_Summary_Report_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Mer_Style_Summary_Report_Scr);
		String Screen_name  = driver.findElement(Mer_Style_Summary_Report_Scr).getText();
		System.out.println("Display the Merchandising Style Summary Report Screen:" +Screen_name);
		
	}


	public void Select_the_Select_All_Column_Option_in_the_column_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Select_All_check_box);
		driver.findElement(Select_All_check_box).click();
		driver.findElement(Select_All_check_box).click();
		utilities.MediumWait(driver);
		
	}

}
