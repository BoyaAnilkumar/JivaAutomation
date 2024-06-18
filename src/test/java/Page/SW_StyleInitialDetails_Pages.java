package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_StyleInitialDetails_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	
	By Sweater = By.xpath("//span[text()='Sweater ']");
	By SW_Merchandising = By.xpath("//span[text()='Merchandising ']");
	By SW_DataEntry = By.xpath("(//span[text()='Data Entry'])[2]");
	By Style_Initial_details = By.xpath("//a[text()='Style Initial Details']");
	By style_expansion = By.xpath("//a[@id='sidebarCollapse']");
	By Select_IPO = By.xpath("//div[@id='v-pills-tab']");
	By FilterIcon = By.xpath("//button[@class='btn btn-primary btn-sm mb-2 float-right']");
	By SearchIPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
    By Apply = By.xpath("//button[@class='btn btn-md btn-primary']");
	By FileHandover = By.xpath("//input[@formcontrolname='handoverDate']");
	By Add_Combination = By.xpath("(//button[@title='Add Combo'])[1]");
	By Enter_Combo_Details1 = By.xpath("(//input[@formcontrolname='comboName'])[1]");
	By Enter_Combo_Details2 = By.xpath("(//input[@formcontrolname='comboName'])[2]");
	By Submit_order_Details = By.xpath("//button[text()=' Submit Order Details']");
	By POQty1 = By.xpath("(//input[@placeholder='Enter PO Qty'])[1]");
    By POQty2 = By.xpath("(//input[@placeholder='Enter PO Qty'])[2]");
    By Submit = By.xpath("(//button[text()=' Submit'])[2]");
    By IPO1 = By.xpath("(//input[@formcontrolname='ipoPercentage'])[1]");
    By IPO2 = By.xpath("(//input[@formcontrolname='ipoPercentage'])[2]");
    
    
	

	public void click_on_the_SW_Merchandising_Module() throws Throwable {
		utilities.webDriverWait(driver, Sweater);
		driver.findElement(Sweater).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SW_Merchandising);
		driver.findElement(SW_Merchandising).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_SW_Data_Entry_dropdown() throws Throwable {
		utilities.webDriverWait(driver, SW_DataEntry);
		driver.findElement(SW_DataEntry).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_SW_Style_Initial_Details_screen() throws Throwable {
		utilities.webDriverWait(driver, Style_Initial_details);
		driver.findElement(Style_Initial_details).click();
		utilities.MinimumWait(driver);
	}

	public void Select_the_IPO_from_the_list_(String ipo) throws Throwable {
		utilities.webDriverWait(driver, FilterIcon);
		driver.findElement(FilterIcon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SearchIPO);
		driver.findElement(SearchIPO).click();
		Thread.sleep(1000);
		driver.findElement(SearchIPO).sendKeys(ipo);
		Thread.sleep(1000);
		
		driver.findElement(Apply).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_IPO);
		driver.findElement(Select_IPO).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, style_expansion);
		driver.findElement(style_expansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_file_handover_date(String date) throws Throwable {
		utilities.webDriverWait(driver, FileHandover);
		driver.findElement(FileHandover).click();
		Thread.sleep(1000);
		driver.findElement(FileHandover).sendKeys(date);
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
		
		
	}

	public void click_on_Add_combination_button_and_enter_combination_names(String combination1, String combination2) throws Throwable {
		utilities.webDriverWait(driver, Add_Combination);
		driver.findElement(Add_Combination).click();
		utilities.MinimumWait(driver);
	
		utilities.webDriverWait(driver, Enter_Combo_Details1);
		driver.findElement(Enter_Combo_Details1).click();
		Thread.sleep(1000);
		driver.findElement(Enter_Combo_Details1).sendKeys(combination1);
		Thread.sleep(1000);
		
		utilities.webDriverWait(driver, Enter_Combo_Details2);
		driver.findElement(Enter_Combo_Details2).click();
		Thread.sleep(1000);
		driver.findElement(Enter_Combo_Details2).sendKeys(combination2);
		Thread.sleep(1000);
		
	}

	public void click_on_Submit_order_details_button() throws Throwable {
		utilities.webDriverWait(driver, Submit_order_Details);
		driver.findElement(Submit_order_Details).click();
		utilities.MinimumWait(driver);
		
	}

	public void User_enter_the_data_in_PO_Qty_field_for_combos() throws Throwable {
		utilities.webDriverWait(driver, POQty1);
		driver.findElement(POQty1).clear();
		driver.findElement(POQty1).sendKeys("1350");
		utilities.MediumWait(driver);
		
		driver.findElement(POQty2).clear();
		driver.findElement(POQty2).sendKeys("1000");
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_data_in_IPO_field_in_order_details() throws Throwable {
		utilities.webDriverWait(driver, POQty1);
		driver.findElement(IPO1).clear();
		driver.findElement(IPO1).sendKeys("4");
		utilities.MediumWait(driver);
		
		driver.findElement(IPO2).clear();
		driver.findElement(IPO2).sendKeys("5");
		utilities.MediumWait(driver);
		
	}
		
	}


	


