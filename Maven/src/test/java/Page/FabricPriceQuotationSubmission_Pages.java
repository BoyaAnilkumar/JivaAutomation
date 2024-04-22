package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class FabricPriceQuotationSubmission_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities(); 
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	
	By modFPQuotation = By.xpath("//span[text()='Fabric Price Quotation']");
	By scrFPQuoSubmission = By.xpath("//a[text()='Submission']");
	By buttAddPricing = By.xpath("//button[text()=' Add Pricing']");
	By buttFPSubmit = By.xpath("//button[text()=' Submit ']");
	By Process = By.xpath("//select[@formcontrolname='processId']");
	By secProcess = By.xpath("//option[text()=' Floral Printing']");
	By Supplier = By.xpath("//input[@formcontrolname='supplierName']");
	By ExMillPrice = By.xpath("//input[@formcontrolname='exMillPrice']");
	By LeadTime = By.xpath("//input[@formcontrolname='leadTime']");
	By PaymentTerms =By.xpath("//input[@formcontrolname='paymentTerms']");
	By Remarks = By.xpath("//input[@formcontrolname='remarks']");
	By CallOuts = By.xpath("//input[@formcontrolname='callOut']");
	By buttFPDelete = By.xpath("//button[@class='btn btn-danger btn-sm ng-star-inserted']");
	
	

	public void Navigate_to_the_Fabric_Price_Quotation_Submission_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, RMUW.modFabricSourcing);
		driver.findElement(RMUW.modFabricSourcing).click();
		utilities.webDriverWait(driver, RMUW.DataEntry);
		driver.findElement(RMUW.DataEntry).click();
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
	}

	public void Select_a_Process_Name() throws Throwable {
		utilities.webDriverWait(driver, secProcess);
		driver.findElement(secProcess).click();
	}

	public void Enter_Supplier_Name() throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
	}

	public void Enter_Ex_Mill_Price_value() throws Throwable {
		utilities.webDriverWait(driver, ExMillPrice);
		driver.findElement(ExMillPrice).click();
	}

	public void Enter_the_Lead_Time() throws Throwable {
		utilities.webDriverWait(driver, LeadTime);
		driver.findElement(LeadTime).click();
	}

	public void Enter_Payment_Terms_mode() throws Throwable {
		utilities.webDriverWait(driver, PaymentTerms);
		driver.findElement(PaymentTerms).click();
	}

	public void Enter_Remarks_for_the_added_Price_records() throws Throwable {
		utilities.webDriverWait(driver, Remarks);
		driver.findElement(Remarks).click();
	}

	public void Enter_data_in_the_Call_Outs_field() throws Throwable {
		utilities.webDriverWait(driver, CallOuts);
		driver.findElement(CallOuts).click();
	}

	public void Click_on_the_Delete_button_for_the_added_pricing_record() throws Throwable {
		utilities.webDriverWait(driver, buttFPDelete);
		driver.findElement(buttFPDelete).click();
	}

}
