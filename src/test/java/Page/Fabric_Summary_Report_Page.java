package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Fabric_Summary_Report_Page extends DriverFactory {
	
	Utilities utilities = new Utilities();
        
	    By T_and_A_dropdown        = By.xpath("(//span[text()='T&A'])[2]");
	    By Fabric_Summary_Report   = By.xpath("//a[text()=' Fabric Summary Report']");
	    By Fabric_Summary_Report_Sc= By.xpath("//h3[text()='Fabric Summary Report']");
	
	
	public void Click_on_the_Fabric_Summary_Report_under_the_TandA_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Fabric_Summary_Report);
		driver.findElement(Fabric_Summary_Report).click();
		utilities.MediumWait(driver);
		
	}

	public void the_Fabric_Summary_Report_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Summary_Report_Sc);
		String Screen_name  = driver.findElement(Fabric_Summary_Report_Sc).getText();
		System.out.println("Display the Fabric Summary Report Screen:" +Screen_name);
		
	}

}
