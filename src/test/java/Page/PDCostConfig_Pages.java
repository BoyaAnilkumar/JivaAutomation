package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;



public class PDCostConfig_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	By PDcostconfig = By.xpath("//a[text()='PD Cost Configuration']");
	By edit_icon = By.xpath("(//a[@title='Edit'])[1]");
	By value = By.xpath("//input[@formcontrolname='configValue']");
	By update = By.xpath("//button[@type='submit']");
	

	public void Click_on_the_PDCostConfig_screen() throws Throwable {
		utilities.webDriverWait(driver, PDcostconfig);
		driver.findElement(PDcostconfig).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_edit_icon_for_each_row() throws Throwable {
		utilities.webDriverWait(driver, edit_icon);
		driver.findElement(edit_icon).click();
		utilities.MinimumWait(driver);
		
	}

	public void change_the_value_in_edit_form() throws Throwable {
		utilities.webDriverWait(driver, value);
		driver.findElement(value).clear();
		Thread.sleep(2000);
		driver.findElement(value).sendKeys("8");
		Thread.sleep(2000);
		
	}

	public void click_on_update_button_to_update_the_value() throws Throwable {
		utilities.webDriverWait(driver, update);
		driver.findElement(update).click();
		utilities.MinimumWait(driver);
		
	}
	
	
	
}
