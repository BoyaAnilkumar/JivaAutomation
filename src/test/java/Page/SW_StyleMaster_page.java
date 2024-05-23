package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_StyleMaster_page extends DriverFactory {

	Utilities utilities = new Utilities();
	
	By Sweater_Style_Master = By.xpath("//a[text()='Style Master ']");
	By page_title = By.xpath("//h3[text()='Style Master']");
	By Add_New_Style = By.xpath("//button[text()=' Add New Style ']");
	By PD_Merchant_Name = By.xpath("(//input[@placeholder='Search By Name/Email/Ph.no'])[1]");
	By Buyer_Style = By.xpath("(//input[@formcontrolname='buyerStyleNumber'])[1]");
	By Buyer = By.xpath("(//select[@formcontrolname='buyerId'])[1]");
	By Season = By.xpath("(//select[@formcontrolname='seasonTypeId'])[1]");
	By Garment_Type = By.xpath("(//select[@formcontrolname='garmentTypeId'])[1]");
	By Garment_Process = By.xpath("(//select[@formcontrolname='garmentProcessId'])[1]");
	By Garment_Gauge = By.xpath("(//input[@formcontrolname='garmentGuage'])[1]");
	By Expected_Order_Qty = By.xpath("(//input[@formcontrolname='expectedOderQty'])[1]");
	By Expected_Order_Date = By.xpath("(//input[@formcontrolname='expectedOrderDate'])[1]");
	By Save_Button = By.xpath("(//button[text()=' Save'])[1]");
	By Filter_button = By.xpath("//button[@id='navbarDropdown3']");
	By Filter_Search = By.xpath("(//input[@formcontrolname='buyerStyleNumber'])[1]");
	By Filter_Apply = By.xpath("//button[text()='Apply']");
	By Style_Name = By.xpath("//span[text()='Buyer Style: ']/.//a[@href='javascript:void();']");
	
	
	

	public void click_on_Style_master_screen_in_sweater_module() throws Throwable {
		utilities.webDriverWait(driver, Sweater_Style_Master);
		driver.findElement(Sweater_Style_Master).click();
		utilities.MinimumWait(driver);
	
		
		utilities.webDriverWait(driver, page_title);
		WebElement PageTitle = driver.findElement(page_title);
		String Title = PageTitle.getText();
		System.out.println("Page Title is: " + Title);
		
		String ExpectedTitle = "Style Master";
		String ActualTitle = Title;
		
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Paget Titles are equal to Expected and Actual");
		}else {
			System.out.println("Page Title is different");
		}
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Add_Style_button() throws Throwable {
		utilities.webDriverWait(driver, Add_New_Style);
		driver.findElement(Add_New_Style).click();
		utilities.MinimumWait(driver);
		
	}


	public void Enter_PD_Merchant_Name_and_Select() throws Throwable {
		utilities.webDriverWait(driver, PD_Merchant_Name);
		driver.findElement(PD_Merchant_Name).click();
		Thread.sleep(1000);
		driver.findElement(PD_Merchant_Name).sendKeys("Soujanya");
		Thread.sleep(2000);
		Robot PD = new Robot();
		PD.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		PD.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}


	public void Enter_Buyer_Style_name(String buyerstyle) throws Throwable {
		utilities.webDriverWait(driver, Buyer_Style);
		driver.findElement(Buyer_Style).click();
		Thread.sleep(1000);
		driver.findElement(Buyer_Style).sendKeys(buyerstyle);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Buyer_from_the_dropdown_list(String buyer2) throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		WebElement BuyerField = driver.findElement(Buyer);
		Select BuyerDropdown = new Select(BuyerField);
		BuyerDropdown.selectByVisibleText(buyer2);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Season_from_dropddown_list(String season2) throws Throwable {
		utilities.webDriverWait(driver, Season);
		WebElement season = driver.findElement(Season);
		Select seasonDropdown = new Select(season);
		seasonDropdown.selectByVisibleText(season2);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Garment_Type_from_dropdown_list(String garmenttype) throws Throwable {
		utilities.webDriverWait(driver, Garment_Type);
		WebElement garment_type = driver.findElement(Garment_Type);
		Select garmenttype_dropdown = new Select(garment_type);
		garmenttype_dropdown.selectByVisibleText(garmenttype);
		utilities.MinimumWait(driver);
		
	}


	public void Select_Garment_Process_from_dropdown_list(String garmentprocess) throws Throwable {
		utilities.webDriverWait(driver, Garment_Process);
		WebElement garment_process = driver.findElement(Garment_Process);
		Select process_dropdown = new Select(garment_process);
		process_dropdown.selectByVisibleText(garmentprocess);
		utilities.MinimumWait(driver);
		
	}


	public void Enter_the_Garment_Gauge(String garmentgauge) throws Throwable {
		utilities.webDriverWait(driver, Garment_Gauge);
		driver.findElement(Garment_Gauge).click();
		Thread.sleep(1000);
		driver.findElement(Garment_Gauge).sendKeys(garmentgauge);
		Thread.sleep(1000);
		
		
	}


	public void Click_on_Save_button_to_create_style() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Filter_button_in_style_master() throws Throwable {
		utilities.webDriverWait(driver, Filter_button);
		driver.findElement(Filter_button).click();
		utilities.MinimumWait(driver);
		
	}
	

	public void Enter_the_Style_name_in_Search_By_Style(String search) throws Throwable {
		utilities.webDriverWait(driver, Filter_Search);
		driver.findElement(Filter_Search).click();
		Thread.sleep(1000);
		driver.findElement(Filter_Search).sendKeys(search);
		Thread.sleep(1000);
		driver.findElement(Filter_Apply).click();
		Thread.sleep(1000);
		
	}

	
	public void Click_on_style_name() throws Throwable {
		utilities.webDriverWait(driver, Style_Name);
		driver.findElement(Style_Name).click();
		utilities.MinimumWait(driver);
		
	}




	
}
