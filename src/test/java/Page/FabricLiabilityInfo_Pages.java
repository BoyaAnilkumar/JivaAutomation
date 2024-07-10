package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class FabricLiabilityInfo_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	By Report = By.xpath("(//span[text()='Reports'])[2]");
	By Fabric_Liability_Info = By.xpath("//a[text()=' Fabric Liability info ']");
	By Select_IPO_Number = By.xpath("//span[text()='Select IPO Number']");
	By Enter_IPO_NUmber = By.xpath("//div[text()='MI ONE']");
	By Select_IPO = By.xpath("//div[text()='MI ONE']");
	By Select_Buyer = By.xpath("//div[text()='Select Buyer']");
	By Enter_Buyer = By.xpath("//input[@role='textbox']");
	By Select_Buyer_Checkbox = By.xpath("//div[@class='p-checkbox-box']");
	By Search_button = By.xpath("//button[text()=' Search']");
	By Clear_button = By.xpath("//button[text()=' Clear']");
	By Header = By.xpath("//h3[text()='Fabric Liability Info']");
	By grid_Data = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	
	
	
	
	public void Click_on_Report_in_Fabric_Store_module() throws Throwable {
		utilities.webDriverWait(driver, Report);
		driver.findElement(Report).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Fabric_Liability_Info() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Liability_Info);
		driver.findElement(Fabric_Liability_Info).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Select_IPO_Number_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO_Number);
		driver.findElement(Select_IPO_Number).click();
		Thread.sleep(5000);
//		driver.findElement(Enter_IPO_NUmber).sendKeys("MI ONE");
//		Thread.sleep(1000);
		driver.findElement(Select_IPO).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Select_buyer_dropdown_field_and_select_buyer() throws Throwable {
		utilities.webDriverWait(driver, Select_Buyer);
		driver.findElement(Select_Buyer).click();
		Thread.sleep(1000);
		driver.findElement(Enter_Buyer).click();
		Thread.sleep(1000);
		driver.findElement(Enter_Buyer).sendKeys("Amazon (Release)");
		Thread.sleep(1000);
		driver.findElement(Select_Buyer_Checkbox).click();
		Thread.sleep(1000);
		driver.findElement(Header);
		Thread.sleep(1000);
		
		
	}

	public void click_on_Search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_button);
		driver.findElement(Search_button).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Verify_the_data_is_displaying_in_grid_after_filter_search() throws Throwable {
		utilities.webDriverWait(driver, grid_Data);
		WebElement grid = driver.findElement(grid_Data);
		String data = grid.getText();
		String gdata = "No Data Found";
		
		if(data.equals(gdata)) {
			System.out.println("Displaying No Data Found ");
		}else {
			System.out.println("Displaying the IPO data in grid " + data);
			
			String[] valueList = data.split(",");
	        WebElement inputField = driver.findElement(grid_Data); // Replace with actual locator

//	        for (String value : valueList) {
//	            inputField.sendKeys(" "); 
//		}
//		
	}


}
}