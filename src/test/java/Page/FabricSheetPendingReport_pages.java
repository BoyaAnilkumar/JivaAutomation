package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class FabricSheetPendingReport_pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Fabric_Sheet_Pending_Report = By.xpath("//a[text()='Fabric Sheet Pending Report']");
	By Filter_Expansion = By.xpath("//a[text()=' Filters']");
	By Card_Header = By.xpath("//div[@class='card-header']");
	By Buyer_Filter = By.xpath("//div[text()='Select Buyer']");
	By Enter_Buyer = By.xpath("(//input[@type='text'])[2]");
	By Select_buyer = By.xpath("//div[@class='p-checkbox-box']");
	By Merchant_Filter = By.xpath("//div[text()='Select Merchant']");
	By Enter_Merchant = By.xpath("(//input[@type='text'])[3]");
	By Select_Merchant = By.xpath("//div[@class='p-checkbox-box']");
	By Status = By.xpath("//select[@formcontrolname='statusId']");
	By Select_Status = By.xpath("//select[@formcontrolname='statusId']/.//option[text()=' Fabric Sheet Rejected/Revise Fabric Sheet Needed']");
	By Apply_Filter = By.xpath("//button[text()='Apply']");
	By Reset_Filter = By.xpath("//button[text()='Reset']");
	By Column_Filter = By.xpath("(//tr/th/div/p-columnfilter)[6]");
	By Column_Filter_Element = By.xpath("//p-columnfilterformelement/input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By Column_Filter_Apply = By.xpath("//div/button/span[text()='Apply']");
	By Column_Filter_Clear = By.xpath("//div/button/span[text()='Clear']");
	By Column_Grid = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[6]");
	By Export = By.xpath("//button[text()=' Export']");
	By SortingByColumns	= By.xpath("(//tr[@class='ng-star-inserted'])[1]");
	

	public void Click_on_Fabric_Sheet_Pending_Report_screen() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Sheet_Pending_Report);
		driver.findElement(Fabric_Sheet_Pending_Report).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Filter_expansion_in_FSPR() throws Throwable {
		utilities.webDriverWait(driver, Filter_Expansion);
		driver.findElement(Filter_Expansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Buyer_filter_and_select_the_buyer() throws Throwable {
		utilities.webDriverWait(driver, Buyer_Filter);
		driver.findElement(Buyer_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Enter_Buyer).sendKeys("Ann Taylor Sleep");
		Thread.sleep(2000);
		driver.findElement(Select_buyer).click();
		utilities.MinimumWait(driver);
		driver.findElement(Card_Header).click();
		
	}

	public void Click_on_Merchant_filter_and_select_the_merchant() throws Throwable {
		utilities.webDriverWait(driver, Merchant_Filter);
		driver.findElement(Merchant_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Enter_Merchant).sendKeys("Lavanya");
		Thread.sleep(2000);
		driver.findElement(Select_Merchant).click();
		utilities.MinimumWait(driver);
		driver.findElement(Card_Header).click();
		
	}

	public void Click_on_Status_filter_and_select_the_status() throws Throwable {
		utilities.webDriverWait(driver, Status);
		driver.findElement(Status).click();
		Thread.sleep(2000);
		driver.findElement(Select_Status).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Apply_Filter);
		driver.findElement(Apply_Filter).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Filter_Expansion).click();
		Thread.sleep(2000);
		
	}

	public void verify_the_data_is_displaying_in_the_grid() throws Throwable {

		
		utilities.webDriverWait(driver, Column_Grid);
		String status = driver.findElement(Select_Status).getText();
		String Status_Name = driver.findElement(Column_Grid).getText();
		System.out.println("Displaying the Status Name as:  " +  Status_Name);
		if(status.equals(Status_Name)) {
			System.out.println("Status is displaying as per the user selection");
		}else {
			System.out.println("Status is not displaying as per the user selection");
		}
		
	}

	public void click_on_filter_expansion_and_click_on_reset_filter() throws Throwable {
		utilities.webDriverWait(driver, Filter_Expansion);
		driver.findElement(Filter_Expansion).click();
		Thread.sleep(2000);
		driver.findElement(Reset_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Filter_Expansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_filter_functionality_on_grid_column() throws Throwable {
		utilities.webDriverWait(driver, Column_Filter);
		driver.findElement(Column_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Column_Filter_Element).sendKeys("Fabric Sheet Rejected/Revise Fabric Sheet Needed");
		Thread.sleep(2000);
		driver.findElement(Column_Filter_Apply).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_export_button_to_download_the_fabric_sheet_report() throws Throwable {
		utilities.webDriverWait(driver, Export);
		String export_button = driver.findElement(Export).getText();
		System.out.println("Export button is displaying:  " +  export_button);
		Thread.sleep(2000);
		driver.findElement(Export).click();
		utilities.MaximumWait(driver);
		
		
	}

	public void Verify_the_Sorting_functionality_in_grid() throws Throwable {

		driver.findElement(Column_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Column_Filter_Clear).click();
		Thread.sleep(2000);
		driver.findElement(Column_Filter).click();
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, SortingByColumns);
		WebElement table = driver.findElement(SortingByColumns);
		
		List<WebElement> columnheader = table.findElements(By.xpath("p-sorticon"));

		for (WebElement header : columnheader) {

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		}
		
	}
	
}
