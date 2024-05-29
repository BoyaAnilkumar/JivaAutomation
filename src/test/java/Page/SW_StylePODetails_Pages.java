package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_StylePODetails_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Merchandising_Module = By.xpath("//span[text()='Merchandising ']");
	By Merchandising_Data_Entry = By.xpath("//span[text()='Data Entry']");
	By Style_PO_Details = By.xpath("//a[text()='Style PO Details']");
	By StylePO_ScreenName = By.xpath("//h3[text()='Style PO Details']");
	

	public void Click_on_Merchandising_Module() throws Throwable {
		utilities.webDriverWait(driver, Merchandising_Data_Entry);
		driver.findElement(Merchandising_Module).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Merchandising_Data_Entry() throws Throwable {
		utilities.webDriverWait(driver, Merchandising_Module);
		driver.findElement(Merchandising_Module).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Style_PO_Details() throws Throwable {
		utilities.webDriverWait(driver, Style_PO_Details);
		driver.findElement(Style_PO_Details).click();
		utilities.MinimumWait(driver);
		
		WebElement ScreenName = driver.findElement(StylePO_ScreenName);
		String Name = ScreenName.getText();
		System.out.println(Name);
	}
	
	
	
}
