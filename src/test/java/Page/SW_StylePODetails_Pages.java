package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_StylePODetails_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Style_PO_Details     = By.xpath("//a[text()='Style PO Details']");
	By StylePO_ScreenName   = By.xpath("//h3[text()='Style PO Details']");
	By Add_New_PO_Button    = By.xpath("//a[@class='btn btn-primary btn-sm ng-star-inserted']");

	public void Click_on_the_Style_PO_Details() throws Throwable {
		utilities.webDriverWait(driver, Style_PO_Details);
		driver.findElement(Style_PO_Details).click();
		utilities.MinimumWait(driver);
		
		WebElement ScreenName = driver.findElement(StylePO_ScreenName);
		String Name = ScreenName.getText();
		System.out.println(Name);
	}
	public void Click_on_the_Add_New_PO_button_in_the_Style_PO_Details_Screen() throws Throwable {
		utilities.webDriverWait(driver, Add_New_PO_Button);
		driver.findElement(Add_New_PO_Button).click();
		utilities.MinimumWait(driver);				
	}
	
	
	
}
