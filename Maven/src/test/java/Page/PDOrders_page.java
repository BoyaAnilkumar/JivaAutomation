package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class PDOrders_page extends DriverFactory {
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	String Pastdate = DateTime.now().plusDays(-1).toString("dd-MM-yyyy");
	String tomorrow = DateTime.now().plusDays(1).toString("dd-MM-yyyy");
	
	Utilities utilities = new Utilities();
	
	//Login Details and Select PD Orders
		By username = By.xpath("//input[@id='userName']");
		By password = By.xpath("//input[@id='userpassword']");
		By SignIn   = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
		By Woven = By. xpath ("//div[@class='nav_title']//span[text()='Woven / knit']");
		By PD = By.xpath("//ul[@class='mm-collapse mm-show']/..//span[text()='PD ']");
		By PDOrders =By.xpath("(//a[text()='PD Orders '])[1]");
		
	//Create New PD order
		By AddButton = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
		By SrPDmerchant = By.xpath("//input[@placeholder='Search By Name/Email/Ph.no']");
		By Buyer = By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-invalid']");
	
	//Calendar
		By MonthAndYear = By.xpath("//p-calendar[@placeholder='Select Month']");
		By Previousicon = By.xpath("//span[@class='p-datepicker-prev-icon pi pi-chevron-left ng-tns-c81-33']");
		By Nexticon = By.xpath("(//button[@type='button'])[3]");
		By SelectMonth = By.xpath("//span[text()=' Jan ']");
		By Expectedorderqty = By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']");
		
			
		
	public void Login_with_Senior_PD_merchant_credentials_in_Login_page() throws Throwable {
		
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("phanindra");
		driver.findElement(password).sendKeys("Abcd@123");
		driver.findElement(SignIn).click();
		utilities.MediumWait(driver);
	}

	public void Click_on_woven() throws Throwable {
		
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		
	}

	public void Click_on_PD_Module_to_view_the_menu_in_PD_Module() throws Throwable {
		
		utilities.webDriverWait(driver, PD);
		driver.findElement(PD).click();
		
	}

	public void Select_the_PD_Orders_from_the_menu_of_PD_Module() throws Throwable {
		
		utilities.webDriverWait(driver, PDOrders);
		driver.findElement(PDOrders).click();
		
	}

	public void Click_on_Add_button() throws Throwable {
	
		utilities.webDriverWait(driver, AddButton);
		driver.findElement(AddButton).click();
		
	}

	public void Enter_Sr_PD_Merchant() throws Throwable {
	
		utilities.webDriverWait(driver, SrPDmerchant);
		driver.findElement(SrPDmerchant).sendKeys("Phani");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumLongWait(driver);
		
	}

	public void Select_Buyer_from_the_dropdown_list() throws Throwable {
		
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		Robot B = new Robot();
		B.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumLongWait(driver);
		
		
	}

	public void Select_Month_and_Year_from_calendar() throws Throwable {
		
		utilities.webDriverWait(driver, MonthAndYear);
		driver.findElement(MonthAndYear).click();
		utilities.MediumWait(driver);
		driver.findElement(Nexticon).click();
		utilities.MaximumLongWait(driver);
		
		driver.findElement(SelectMonth).click();
		
	}

	public void Enter_Expected_Order_Qty() throws Throwable {
		
		utilities.webDriverWait(driver, AddButton);
		
	}
	

}
