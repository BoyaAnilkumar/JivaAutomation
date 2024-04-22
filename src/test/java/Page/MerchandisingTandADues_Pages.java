package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import util.DriverFactory;
import util.Utilities;

public class MerchandisingTandADues_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By TandA = By.xpath("(//div/span[text()='T&A'])[1]");
	By TandA_Dues = By.xpath("(//ul/li/a[text()='T&A Dues'])[1]");
	By Overdue = By.xpath("//u[text()='Overdue']");
	By TandA_tab = By.xpath("(//div/div/div/ul/li/a[text()='T&A Dues'])[1]");
	By Tab1_TandA_name = By.xpath("(//div[text()=' Merchandising submissions due '])[1]");
	By Tab2_TandA_name = By.xpath("(//div[text()=' Merchandising Approvals due '])[1]");
	By Fabric_Dues = By.xpath("(//div/div/div/ul/li/a[text()='Fabric Dues'])[1]");
	By Fabric_Dues_name1 = By.xpath("(//div[text()=' Submissions due From Fabric Team '])[1]");
	By Fabric_Dues_name2 = By.xpath("(//div[text()=' Approvals due From Fabric Team '])[1]");
	
	By Today = By.xpath("//u[text()='Today']");
	By Today_Tab_1 = By.xpath("(//div/div/div/ul/li/a[text()='T&A Dues'])[2]");
	By Today_Tab_2 = By.xpath("(//div/div/div/ul/li/a[text()='Fabric Dues'])[2]");
	By Today_TandA_name1 = By.xpath("(//div[text()=' Merchandising submissions due '])[2]");
	By Today_TandA_name2 = By.xpath("(//div[text()=' Merchandising Approvals due '])[2]");
	By Today_Fabric_dues_name1 = By.xpath("(//div[text()=' Submissions due From Fabric Team '])[2]");
	By Today_Fabric_Dues_name2 = By.xpath("(//div[text()=' Approvals due From Fabric Team '])[2]");
	
	
	By Upcoming = By.xpath("//u[text()='Upcoming']");
	By Upcoming_Tab_1 = By.xpath("(//div/div/div/ul/li/a[text()='T&A Dues'])[3]");
	By Upcoming_Tab_2 = By.xpath("(//div/div/div/ul/li/a[text()='Fabric Dues'])[3]");
	By Upcoming_TandA_name1 = By.xpath("(//div[text()=' Merchandising submissions due '])[3]");
	By Upcoming_TandA_name2 = By.xpath("(//div[text()=' Merchandising Approvals due '])[3]");
	By Upcoming_Fabric_dues_name1 = By.xpath("(//div[text()=' Submissions due From Fabric Team '])[3]");
	By Upcoming_Fabric_Dues_name2 = By.xpath("(//div[text()=' Approvals due From Fabric Team '])[3]");
	
	
	public void Click_on_TandA() throws Throwable {
	
		utilities.webDriverWait(driver, TandA );
		driver.findElement(TandA).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_TandA_Dues() throws Throwable {

		utilities.webDriverWait(driver, TandA_Dues );
		driver.findElement(TandA_Dues).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Overdue_tab() throws Throwable {
		
		utilities.webDriverWait(driver, Overdue);
		driver.findElement(Overdue).click();
		utilities.MinimumWait(driver);
		driver.findElement(Overdue).click();
		utilities.webDriverWait(driver, TandA_tab);
		String Tab_1 = driver.findElement(TandA_tab).getText();
		System.out.println("Print the tab 1 name:  "  + Tab_1);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Tab1_TandA_name);
		String Tab_1_name = driver.findElement(Tab1_TandA_name).getText();
		System.out.println("Print the Tabel name:  " + Tab_1_name);
		
		utilities.webDriverWait(driver, Tab2_TandA_name);
		String Tab_2_name = driver.findElement(Tab2_TandA_name).getText();
		System.out.println("Print the Tabel name:  " + Tab_2_name);
		
		utilities.webDriverWait(driver, Fabric_Dues);
		String Fabric = driver.findElement(Fabric_Dues).getText();
		driver.findElement(Fabric_Dues).click();
		System.out.println("Print the Tab name: " + Fabric);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabric_Dues_name1);
		String Fabric_name1 = driver.findElement(Fabric_Dues_name1).getText();
		System.out.println("Print the Table name:  " + Fabric_name1);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabric_Dues_name2);
		String Fabric_name2 = driver.findElement(Fabric_Dues_name2).getText();
		System.out.println("Print the Table name:  " + Fabric_name2);
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");

	}

	public void Click_on_Today_tab() throws Throwable {
		utilities.webDriverWait(driver, Today);
		driver.findElement(Today).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Today_Tab_1);
		String Tab_1 = driver.findElement(Today_Tab_1).getText();
		System.out.println("Print the tab 1 name:  "  + Tab_1);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Today_TandA_name1);
		String Tab_1_name = driver.findElement(Today_TandA_name1).getText();
		System.out.println("Print the Tabel name:  " + Tab_1_name);
		
		utilities.webDriverWait(driver, Today_TandA_name2);
		String Tab_2_name = driver.findElement(Today_TandA_name2).getText();
		System.out.println("Print the Tabel name:  " + Tab_2_name);
		
		utilities.webDriverWait(driver, Today_Tab_2);
		String Fabric = driver.findElement(Today_Tab_2).getText();
		driver.findElement(Today_Tab_2).click();
		System.out.println("Print the Tab name: " + Fabric);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Today_Fabric_dues_name1);
		String Fabric_name1 = driver.findElement(Today_Fabric_dues_name1).getText();
		System.out.println("Print the Table name:  " + Fabric_name1);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Today_Fabric_Dues_name2);
		String Fabric_name2 = driver.findElement(Today_Fabric_Dues_name2).getText();
		System.out.println("Print the Table name:  " + Fabric_name2);
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");

		
	}

	public void Click_on_Upcoming_tab() throws Throwable {
		utilities.webDriverWait(driver, Upcoming);
		driver.findElement(Upcoming).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Upcoming_Tab_1);
		String Tab_1 = driver.findElement(Upcoming_Tab_1).getText();
		System.out.println("Print the tab 1 name:  "  + Tab_1);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Upcoming_TandA_name1);
		String Tab_1_name = driver.findElement(Upcoming_TandA_name1).getText();
		System.out.println("Print the Tabel name:  " + Tab_1_name);
		
		utilities.webDriverWait(driver, Upcoming_TandA_name2);
		String Tab_2_name = driver.findElement(Upcoming_TandA_name2).getText();
		System.out.println("Print the Tabel name:  " + Tab_2_name);
		
		utilities.webDriverWait(driver, Upcoming_Tab_2);
		String Fabric = driver.findElement(Upcoming_Tab_2).getText();
		driver.findElement(Upcoming_Tab_2).click();
		System.out.println("Print the Tab name: " + Fabric);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Upcoming_Fabric_dues_name1);
		String Fabric_name1 = driver.findElement(Upcoming_Fabric_dues_name1).getText();
		System.out.println("Print the Table name:  " + Fabric_name1);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Upcoming_Fabric_Dues_name2);
		String Fabric_name2 = driver.findElement(Upcoming_Fabric_Dues_name2).getText();
		System.out.println("Print the Table name:  " + Fabric_name2);
		utilities.MinimumWait(driver);
	}

}
