package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class MerchandisingTandA_Pages extends DriverFactory{
	
	Utilities utilities = new Utilities();

	By T_And_A = By.xpath("(//span[text()='T&A'])[1]");
	By Merch_TandA = By.xpath("//a[text()='Merchandising T&A Data Entry']");
	By Month = By.xpath("//select[@formcontrolname='month']");
	By Select_Month = By.xpath("//option[@value='Nov/2023']");
	By Search_IPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
	

	public void Click_on_the_T_and_A_Module() throws Throwable {
		utilities.webDriverWait(driver, T_And_A);
		driver.findElement(T_And_A).click();	
	}
	public void Click_on_the_Merchandising_T_and_A_Data_Entry_Screen() throws Throwable {
		utilities.webDriverWait(driver, Merch_TandA);
		driver.findElement(Merch_TandA).click();		
	}
	public void Select_the_Month() throws Throwable {
		utilities.webDriverWait(driver, Month);
		driver.findElement(Month).click();
		utilities.webDriverWait(driver, Select_Month);
		driver.findElement(Select_Month).click();
		
	}
	public void Search_The_IPO_and_Style() throws Throwable {
		utilities.webDriverWait(driver, Search_IPO);
		driver.findElement(Search_IPO).sendKeys("IPO16/10");
		Thread.sleep(5000);
		WebElement IPOname = driver.findElement(Search_IPO);
		String ipon = IPOname.getAttribute("value");
		System.out.println("Display the entered IPO Name " + ipon);
		
	}
	
}