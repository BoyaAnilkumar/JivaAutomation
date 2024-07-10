package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class PendingPOreport_pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	
	By Pending_PO_Reports = By.xpath("//a[text()='Pending PO Report']");
	By Card_Header = By.xpath("//div[@class='card-header']");
	By Filters = By.xpath("//a[@type='button']");
	By Buyer = By.xpath("//div[text()='Select Buyer']");
	By Enter_Buyer = By.xpath("//input[@role='textbox']");
	By Buyer_checkbox = By.xpath("//div[@class='p-checkbox-box']");
	By Merchant = By.xpath("//div[text()='Select Merchant']");
	By Enter_Merchant = By.xpath("//input[@role='textbox']");
	By Merchant_Checkbox = By.xpath("//div[@class='p-checkbox-box']");
	By Fabric_Quality = By.xpath("//p-multiselect[@filterby='fabricName']");
	By Enter_Fabric_Quality = By.xpath("//input[@role='textbox']");
	By Fabric_Quality_Checkbox = By.xpath("//div[@class='p-checkbox-box']");
	By PO_Category = By.xpath("//select[@formcontrolname='poType']");
	By Apply_button = By.xpath("//button[text()='Apply']");
	By Reset_button = By.xpath("//button[text()='Reset']");
	By Export_button = By.xpath("//button[text()=' Export']");
	By SortingByColumns = By.xpath("(//tr[@class='ng-star-inserted'])[1]");
	By paginator_forward = By.xpath("//p-paginator/div/button[@type='button']");
	By page_length = By.xpath("//div[@role='button']");
	
	//Validate the grid data with applied filters
	By Buyer_va = By.xpath("(//p-multiselect/div/div/div)[1]");
	By Buyer_va1 = By.xpath("//div[@class='p-element p-multiselect-label-container ng-tns-c92-1']");
	By Merchant_va = By.xpath("//div[@class='p-element p-multiselect-label-container ng-tns-c92-2']");
	
	By Buyer_grid = By.xpath("//div/table/tbody/tr/td[3]");
	

	public void click_on_pending_po_reports() throws Throwable {
		utilities.webDriverWait(driver, Pending_PO_Reports);
		driver.findElement(Pending_PO_Reports).click();
		utilities.MinimumWait(driver);
		
		
		
	}

	public void click_on_Filter_expansion_and_apply_filters_to_get_the_data() throws Throwable {
		utilities.webDriverWait(driver, Filters);
		driver.findElement(Filters).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Enter_Buyer);
		driver.findElement(Enter_Buyer).sendKeys("white");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Buyer_checkbox);
		driver.findElement(Buyer_checkbox).click();
		Thread.sleep(2000);
		
		driver.findElement(Card_Header).click();
		Thread.sleep(3000);
		
		driver.findElement(Merchant).click();
Thread.sleep(2000);
driver.findElement(Enter_Merchant).sendKeys("Lavanya");
Thread.sleep(2000);
driver.findElement(Merchant_Checkbox).click();
Thread.sleep(2000);
driver.findElement(Card_Header).click();
Thread.sleep(2000);

	driver.findElement(Fabric_Quality).click();
	Thread.sleep(2000);
	driver.findElement(Enter_Fabric_Quality).sendKeys("polyester");
	Thread.sleep(3000);
	driver.findElement(Fabric_Quality_Checkbox).click();
	Thread.sleep(2000);
	driver.findElement(Card_Header).click();
	utilities.MinimumWait(driver);
	
driver.findElement(PO_Category).click();
Robot po = new Robot();
po.keyPress(KeyEvent.VK_DOWN);
po.keyPress(KeyEvent.VK_DOWN);
po.keyPress(KeyEvent.VK_ENTER);
utilities.MinimumWait(driver);

	driver.findElement(Apply_button).click();
	utilities.MediumWait(driver);
	
	
	WebElement gridbuyer = driver.findElement(Buyer_grid);
	String BUYERGRID = gridbuyer.getText();
	System.out.println(BUYERGRID);
	
	WebElement filterbuyer = driver.findElement(Buyer_va);
	String BUYER_OPTION = filterbuyer.getText();
	System.out.println("Print selected buyer:  " +  BUYER_OPTION);
	
	
	
//	
//	String MERCHANT_OPTION = driver.findElement(Merchant_va).getText();
//	System.out.println(MERCHANT_OPTION);
//	
	if(BUYERGRID.equals(BUYER_OPTION)) {
		System.out.println("Displaying the selected buyer name");
		
	}
	else {
		driver.findElement(Reset_button).click();
		System.out.println("Clicked on Reset Button");
		Thread.sleep(2000);
	}
	

	}

	public void click_on_export_button_to_download_the_data_into_excel_sheet() throws Throwable {
		
		utilities.webDriverWait(driver, Export_button);
		driver.findElement(Export_button).isDisplayed();
		driver.findElement(Export_button).click();
		Thread.sleep(2000);
		driver.findElement(Filters).click();
		utilities.MinimumWait(driver);
		driver.findElement(Reset_button).click();
		utilities.MinimumWait(driver);
	}

	
	public void click_on_page_numbers_and_page_size() throws Throwable {
		utilities.webDriverWait(driver, page_length);
		driver.findElement(page_length).click();
		utilities.MinimumWait(driver);
		Robot pagelength = new Robot();
		pagelength.keyPress(KeyEvent.VK_DOWN);
		
		
	}
	
	public void Click_on_sorting_icon_to_test_the_functionality() throws Throwable {

		
		utilities.webDriverWait(driver, SortingByColumns);
		
	
		WebElement table = driver.findElement(SortingByColumns);
		
		List<WebElement> columnheader = table.findElements(By.xpath("//th//p-sorticon"));

		for (WebElement header : columnheader) {

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		}
		
	
		
	}

	

}
