package Page;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.joda.time.DateTime;
import util.DriverFactory;
import util.Utilities;

public class IPOListPages extends DriverFactory {
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String TodayDate = dateFormat.format(currentDate);
	private String ipon;
	Utilities utilities = new Utilities();

//	Filters functionality
	By txtUN = By.xpath("//input[@id='userName']");
	By txtPwd = By.xpath("//input[@id='userpassword']");
	By btnSignIn = By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
	By Woven = By.xpath("//span[text()='Woven / knit']");
	By Audit = By.xpath("(//span[text()='Audit '])[1]");
	By IPOList = By.xpath("//a[@routerlink='/ipo-list']");
	By Filter_but = By.xpath("//button[@id='navbarDropdown3']");

	By IPOFromDate = By.xpath("//input[@formcontrolname='ipoFromDate']");
	By IPOToDate = By.xpath("//input[@formcontrolname='ipoToDate']");
	By Buyer = By.xpath("//div[@class='p-multiselect-label ng-tns-c92-8 p-placeholder']");
	By Select_Buyer = By.xpath("//li[@aria-label='8 Seconds']");
	By PDMerchant = By.xpath("//input[@class='ng-tns-c93-9 p-autocomplete-input p-inputtext p-component ng-star-inserted']");
	By Select_PDMerchant = By.xpath("//span[text()='Phani L']");
	By Merchant = By.xpath("//div[@class='p-multiselect-label ng-tns-c92-10 p-placeholder']");
	By Select_Merchant = By.xpath("//li[@aria-label='Lavanya K']");
	By AssMthYear = By.xpath("//div[@class='ng-placeholder']");
	By Select_AssMthYear = By.xpath("//span[text()='Jun/2023']");
	By IPOSearch = By.xpath("//input[@formcontrolname='searchText']");
	By Apply = By.xpath("//button[text()='Apply']");
	By Reset = By.xpath("//button[@type='reset']");

	By GenerateExcelSheet = By.xpath("//a[@class='btn btn-primary btn-sm mr-2 mt-sm-1 ng-star-inserted']");
	By AddIPO = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right mt-1 ng-star-inserted']");



	public void Navigates_to_the_Login_page() {
		driver.get(prop.getProperty("url"));

	}

	public void Enter_valid_Username_and_password() throws Throwable {
//		utilities.webDriverWait(driver, txtUN);
		driver.findElement(txtUN).clear();
		driver.findElement(txtUN).sendKeys(prop.getProperty("username"));
		utilities.MinimumWait(driver);
		driver.findElement(txtPwd).clear();
		driver.findElement(txtPwd).sendKeys(prop.getProperty("password"));
	}

	public void Click_on_SignIn() {
		driver.findElement(btnSignIn).click();

	}

	public void Click_on_the_Woven_Modules() throws Throwable {
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();

	}

	public void Click_on_Audit_module() throws Throwable {
		utilities.webDriverWait(driver, Audit);
		driver.findElement(Audit).click();

	}

	public void Click_on_IPO_List_module() throws Throwable {
		utilities.webDriverWait(driver, IPOList);
		driver.findElement(IPOList).isDisplayed();
//		IPO.isEnabled();
		driver.findElement(IPOList).click();

	}

	public void Click_on_the_Filter_button() throws Throwable {
//		utilities.webDriverWait(driver, IPOList);
		driver.findElement(Filter_but).click();

	}

	public void Click_in_the_IPO_From_Date_field() throws Throwable {
		utilities.webDriverWait(driver, IPOFromDate);
		driver.findElement(IPOFromDate).click();
		driver.findElement(IPOFromDate).sendKeys(TodayDate);
		utilities.MediumWait(driver);
		System.out.println("Current date: " + TodayDate);

	}

	public void Click_in_the_IPO_To_Date_field() throws Throwable {
		utilities.webDriverWait(driver, IPOToDate);
		driver.findElement(IPOToDate).click();
		driver.findElement(IPOToDate).sendKeys(TodayDate);
		utilities.MediumWait(driver);
		System.out.println("Current date: " + TodayDate);
	}

	public void Click_in_the_Buyer_field() {
		driver.findElement(Buyer).click();

	}

	public void Select_a_Buyer_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Select_Buyer);
		driver.findElement(Select_Buyer).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

	}

	public void Click_in_the_PD_Merchant_field() {
		driver.findElement(PDMerchant).click();

	}

	public void Enter_a_first_two_letters_of_a_PD_Merchant_name() throws Throwable {
//		driver.findElement(PDMerchant).click();
		driver.findElement(PDMerchant).sendKeys("ph");
		System.out.println("first 2 letter are entered ");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(5000);
//		WebElement PDMer = driver.findElement(Select_PDMerchant);
//		String DisplayPDmer = PDMer.getText();
//		System.out.println("PD Merchant selected in the field is " + DisplayPDmer);
	}
	public void Select_the_PD_Merchant_from_the_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Select_PDMerchant);
		driver.findElement(Select_PDMerchant).click();

		System.out.println("CLicked on the PD merchant");
		WebElement PDMer = driver.findElement(Select_PDMerchant);
		String DisplayPDmer = PDMer.getText();
		System.out.println("PD Merchant selected in the field is " + DisplayPDmer);

	}


	public void Click_in_the_Merchant_field() throws Throwable {
		utilities.webDriverWait(driver, Merchant);
		driver.findElement(Merchant).click();

	}

	public void Select_a_Merchant_from_the_dropdown_list() {
		driver.findElement(Select_Merchant).click();

	}

	public void Click_in_the_Assigned_Month_and_year_field() {
		driver.findElement(AssMthYear).click();

	}

	public void Select_a_Month_or_Year_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Select_AssMthYear);
		driver.findElement(Select_AssMthYear).click();
		WebElement Mthyear = driver.findElement(Select_AssMthYear);
		String DisMthYear = Mthyear.getText();
		System.out.println("Displaying the selected month/year value " + DisMthYear);
	}

	public void Click_in_the_Search_IPO_and_Enter_an_IPO() {
		driver.findElement(IPOSearch).click();

	}

	public void Enter_IPO_Name_in_the_Search_IPO_field() throws Throwable {
		utilities.webDriverWait(driver, IPOSearch);
		driver.findElement(IPOSearch).sendKeys("IPO12");
		Thread.sleep(5000);
		WebElement IPOname = driver.findElement(IPOSearch);
		String ipon = IPOname.getAttribute("value");
		System.out.println("Display the entered IPO Name " + ipon);
	}


	public void Click_on_the_Reset_button() throws Throwable {
		utilities.webDriverWait(driver, Reset);
		driver.findElement(Reset).click();
		System.out.println("Clicked on Reset button");
	}

	public void Click_on_the_Apply_button() throws Throwable {
		utilities.webDriverWait(driver, IPOSearch);
		driver.findElement(IPOSearch).sendKeys("IPO12");
		utilities.webDriverWait(driver, Apply);
		driver.findElement(Apply).click();
		System.out.println("Clicked on Apply button");
		Thread.sleep(5000);
	}

	public void Click_on_Generate_Excel_Sheet_button() {
		// TODO Auto-generated method stub

	}

	public void Clicked_on_Add_IPO_button() {
		// TODO Auto-generated method stub

	}




}
