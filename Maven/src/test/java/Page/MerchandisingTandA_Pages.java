package Page;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class MerchandisingTandA_Pages extends DriverFactory{
	
	Utilities utilities = new Utilities();

	By T_And_A = By.xpath("(//span[text()='T&A'])[1]");
	By Merch_TandA = By.xpath("//a[text()='Merchandising T&A Data Entry']");
	By Month = By.xpath("//select[@formcontrolname='month']");
	By Select_Month = By.xpath("//option[@value='Nov/2023']");
	By Search_IPO = By.xpath("//input[@placeholder='Enter Buyer style # or IPO #']");
	By Buying_House = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	By IPO_Qty = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
    By Add_Button = By.xpath("(//button[@class='btn btn-primary btn-sm float-right'])[1]");
 //   By Proto_comments = By.xpath("//p-inputmask[@formcontrolname='protoCommentsReceived']//input[@class='p-inputtext p-component p-element p-inputmask']");
    By Proto_comments = By.xpath("(//input[@class='p-inputtext p-component p-element p-inputmask'])[1]");
   
    By Fit_Submission1 = By.xpath("(//p-inputmask[@formcontrolname='submissionDate']//input[@class='p-inputtext p-component p-element p-inputmask'])[1]");
    By Fit_Approval1 = By.xpath("(//p-inputmask[@formcontrolname='approvalDate']//input[@class='p-inputtext p-component p-element p-inputmask'])[1]");
    By Fit_Submission2 = By.xpath("(//p-inputmask[@formcontrolname='submissionDate']//input[@class='p-inputtext p-component p-element p-inputmask'])[2]");
    By Fit_Approval2 = By.xpath("(//p-inputmask[@formcontrolname='approvalDate']//input[@class='p-inputtext p-component p-element p-inputmask'])[2]");
    

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
	public void Verify_the_Buying_house_name_is_displaying_or_not() {
		WebElement Data = driver.findElement(Buying_House);
		String Buying = Data.getText();
		System.out.println("Display Buying house name: " +Buying);
		
	}
	public void Verify_the_IPO_Qty_Value_is_displaying_or_not() {
		WebElement Data = driver.findElement(IPO_Qty);
		String Qty = Data.getText();
		System.out.println("Display IPO Qty: " +Qty);	
		
	}
	public void Click_on_the_Add_button() throws Throwable {
		utilities.webDriverWait(driver, Add_Button);
		driver.findElement(Add_Button).click();
	}
	public void Enter_the_data_in_proto_commends_received_field() throws Throwable {
		utilities.webDriverWait(driver, Proto_comments);
		driver.findElement(Proto_comments).click();
		utilities.MinimumWait(driver);
		driver.findElement(Proto_comments).sendKeys("1206");
    }

	
	public void Enter_the_data_in_Fit_submittion_field() throws Throwable {
      utilities.webDriverWait(driver, Fit_Submission1);
      driver.findElement(Fit_Submission1).click();
	  utilities.MinimumWait(driver);
	  driver.findElement(Fit_Submission1).sendKeys("1206");
	  utilities.MediumWait(driver);
	  utilities.webDriverWait(driver, Fit_Approval1);
      driver.findElement(Fit_Approval1).click();
	  utilities.MinimumWait(driver);
	  driver.findElement(Fit_Approval1).sendKeys("1312");
	  utilities.MediumWait(driver);

	  utilities.webDriverWait(driver, Fit_Submission2);
      driver.findElement(Fit_Submission2).click();
	  utilities.MinimumWait(driver);
	  driver.findElement(Fit_Submission2).sendKeys("1412");
	  utilities.MediumWait(driver);

	  utilities.webDriverWait(driver, Fit_Approval2);
      driver.findElement(Fit_Approval2).click();
	  utilities.MinimumWait(driver);
	  driver.findElement(Fit_Approval2).sendKeys("1512");
	  utilities.MediumWait(driver);

    	
		
	}
	public void Enter_the_data_in_Fit_submittion_and_Approval_fields() {
		
		
	}
	public void Enter_the_data_in_Fit_Remarks_Field() {

		
	}
	public void Verify_whether_the_Fabric_Initial_In_House_date_is_prepopulated_in_the_field_or_not() {

		
	}
	public void Click_on_the_Fabric_Initial_In_House_Date_View_button() {

		
	}
	public void Click_on_the_Fabric_Initial_In_House_Date_View_Close_button() {

		
	}
	public void Click_on_the_PP_Add_button() {

		
	}
	public void Enter_the_data_in_PP_Submission_and_Approval() {

		
	}
	
	
}