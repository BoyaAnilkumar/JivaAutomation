package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class FabricPriceQuotationSubmission_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities(); 
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	
	
	public By FSDataEntry = By.xpath("(//span[text()='Data Entry'])[1]");
	public By modFPQuotation = By.xpath("//span[text()='Fabric Price Quotation']");
	By scrFPQuoSubmission = By.xpath("//a[text()='Submission']");
	By buttAddPricing = By.xpath("//button[text()=' Add Pricing']");
	By buttFPSubmit = By.xpath("//button[text()=' Submit ']");
	public By Process = By.xpath("(//select[@formcontrolname='processId'])[1]");
	By secProcess = By.xpath("(//select[@formcontrolname='processId']//option)[1]");
	public By Supplier = By.xpath("(//input[@formcontrolname='supplierName'])[1]");
	public By ExMillPrice = By.xpath("(//input[@formcontrolname='exMillPrice'])[1]");
	public By LeadTime = By.xpath("(//input[@formcontrolname='leadTime'])[1]");
	public By PaymentTerms =By.xpath("(//input[@formcontrolname='paymentTerms'])[1]");
	public By Remarks = By.xpath("(//input[@formcontrolname='remarks'])[1]");
	public By CallOuts = By.xpath("//input[@formcontrolname='callOut']");
	By buttFPDelete = By.xpath("//button[@class='btn btn-danger btn-sm ng-star-inserted']");
	public By FPQSIPO 			= By.xpath("(//div[@id='v-pills-tab']//a)[4]");
	
	

	public void Navigate_to_the_Fabric_Price_Quotation_Submission_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, RMUW.modFabricSourcing);
		driver.findElement(RMUW.modFabricSourcing).click();
		utilities.webDriverWait(driver, FSDataEntry);
		driver.findElement(FSDataEntry).click();
		utilities.webDriverWait(driver, modFPQuotation);
		driver.findElement(modFPQuotation).click();
		utilities.webDriverWait(driver, scrFPQuoSubmission);
		driver.findElement(scrFPQuoSubmission).click();
	}

	public void Click_on_the_Add_Pricing_button_in_the_Fabric_Price_Quotation_Submission_screen() throws Throwable {
		utilities.webDriverWait(driver, buttAddPricing);
		driver.findElement(buttAddPricing).click();
	}

	public void Click_on_the_Submit_button_in_the_Fabric_Price_Quotation_Submission() throws Throwable {
		utilities.webDriverWait(driver, buttFPSubmit);
		driver.findElement(buttFPSubmit).click();
	}

	public void Click_in_the_Process_field() throws Throwable {
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}

	public void Select_a_Process_Name() throws Throwable {
		utilities.webDriverWait(driver, secProcess);
		driver.findElement(secProcess).click();
	}

	public void Enter_Supplier_Name() throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).sendKeys("supplier1");
	}

	public void Enter_Ex_Mill_Price_value() throws Throwable {
		utilities.webDriverWait(driver, ExMillPrice);
		driver.findElement(ExMillPrice).sendKeys("234.56");
	}

	public void Enter_the_Lead_Time() throws Throwable {
		utilities.webDriverWait(driver, LeadTime);
		driver.findElement(LeadTime).sendKeys("23");
	}

	public void Enter_Payment_Terms_mode() throws Throwable {
		utilities.webDriverWait(driver, PaymentTerms);
		driver.findElement(PaymentTerms).sendKeys("Cash");
	}

	public void Enter_Remarks_for_the_added_Price_records() throws Throwable {
		utilities.webDriverWait(driver, Remarks);
		driver.findElement(Remarks).sendKeys("Remarks 1");
	}

	public void Enter_data_in_the_Call_Outs_field() throws Throwable {
		utilities.webDriverWait(driver, CallOuts);
		driver.findElement(CallOuts).sendKeys("Call Outs Call Outs");
	}

	public void Click_on_the_Delete_button_for_the_added_pricing_record() throws Throwable {
		utilities.webDriverWait(driver, buttFPDelete);
		driver.findElement(buttFPDelete).click();
	}

	public void Select_an_IPO_from_the_Menu_list_in_Submission() throws Throwable {
		utilities.webDriverWait(driver, FPQSIPO);
		driver.findElement(FPQSIPO).click();
	}

}
