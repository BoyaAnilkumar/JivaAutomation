package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class FabricPriceQuotationApproval_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities(); 
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	FabricPriceQuotationSubmission_Pages FPQS = new FabricPriceQuotationSubmission_Pages();
	String Suppliername, USupplier, BProcess, UProcess, BMillPrice, UMillPrice, BLeadTime, ULeadTime, BPaymentTerms, UPaymentTerms, BRemarks, URemarks;
	
	
	By scrFPQuoApproval = By.xpath("//a[text()='Approval']");
	By buttApprove 		= By.xpath("//button[@title='Approve']");
	By Approvemsg		= By.xpath("//h2[text()='Fabric Price Quotation Approved Successfully']");
	By Process = By.xpath("(//select[@formcontrolname='processId'])[4]");
//	By Supplier			= By.xpath("(//input[@formcontrolname='supplierName'])[3]");
	

	public void Navigate_to_the_Fabric_Price_Quotation_Approval_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, RMUW.modFabricSourcing);
		driver.findElement(RMUW.modFabricSourcing).click();
		utilities.webDriverWait(driver, FPQS.FSDataEntry);
		driver.findElement(FPQS.FSDataEntry).click();
		utilities.webDriverWait(driver, FPQS.modFPQuotation);
		driver.findElement(FPQS.modFPQuotation).click();
		utilities.webDriverWait(driver, scrFPQuoApproval);
		driver.findElement(scrFPQuoApproval).click();
	}

	public void Select_an_IPO_from_the_Menu_list_in_Approval_screen() throws Throwable {
		utilities.webDriverWait(driver, FPQS.FPQSIPO);
		driver.findElement(FPQS.FPQSIPO).click();
	}

	public void Click_on_the_Approval_button() throws Throwable {
		utilities.webDriverWait(driver, buttApprove);
		driver.findElement(buttApprove).click();
	}

	public void Print_the_Approved_msg() throws Throwable {
//		utilities.webDriverWait(driver, Approvemsg);
		driver.findElement(Approvemsg).isDisplayed();
		WebElement Approve = driver.findElement(Approvemsg);
		String ApproveMsg = Approve.getText();
		System.out.println("Display the Save toaster msg : " + ApproveMsg);
	}

	public void Update_any_of_the_value_of_the_Submitted_Record() throws Throwable {
		utilities.webDriverWait(driver, FPQS.Process);
		WebElement BProc = driver.findElement(Process);
		BProcess = BProc.getAttribute("value");
		System.out.println("Print the Process Name : " + BProcess);
		driver.findElement(FPQS.Process).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement AProc = driver.findElement(FPQS.Process);
		UProcess = AProc.getAttribute("value");
		System.out.println("Print the updated Process Name : " + UProcess);
		
		
		utilities.webDriverWait(driver, FPQS.Supplier);
		WebElement BSupp = driver.findElement(FPQS.Supplier);
		Suppliername = BSupp.getAttribute("value");
		System.out.println("Print the Supplier Name : " + Suppliername);
//		utilities.webDriverWait(driver, Supplier);
		driver.findElement(FPQS.Supplier).clear();
		driver.findElement(FPQS.Supplier).sendKeys("UpdateSuppliername");
		WebElement ASupp = driver.findElement(FPQS.Supplier);
		USupplier = ASupp.getAttribute("value");
		System.out.println("Print the updated Supplier name : " + USupplier);
		
		utilities.webDriverWait(driver, FPQS.ExMillPrice);
		WebElement BMill = driver.findElement(FPQS.ExMillPrice);
		BMillPrice = BMill.getAttribute("value");
		System.out.println("Print the ExMillPrice value : " + BMillPrice);
		driver.findElement(FPQS.ExMillPrice).clear();
		driver.findElement(FPQS.ExMillPrice).sendKeys("678");
		UMillPrice = BMill.getAttribute("value");
		System.out.println("Print the updated ExMillPrice value : " + UMillPrice);
		
		utilities.webDriverWait(driver, FPQS.LeadTime);
		WebElement BLead = driver.findElement(FPQS.LeadTime);
		BLeadTime = BLead.getAttribute("value");
		System.out.println("Print the LeadTime days : " + BLeadTime);
		driver.findElement(FPQS.LeadTime).clear();
		driver.findElement(FPQS.LeadTime).sendKeys("8");
		WebElement ULead = driver.findElement(FPQS.LeadTime);
		ULeadTime = ULead.getAttribute("value");
		System.out.println("Print the updated LeadTime days : " + ULeadTime);
		
		utilities.webDriverWait(driver, FPQS.PaymentTerms);
		WebElement BPayment = driver.findElement(FPQS.PaymentTerms);
		BPaymentTerms = BPayment.getAttribute("value");
		System.out.println("Print the PaymentTerms mode : " + BPaymentTerms);
		driver.findElement(FPQS.PaymentTerms).clear();
		driver.findElement(FPQS.PaymentTerms).sendKeys("Online");
		WebElement UPayment = driver.findElement(FPQS.PaymentTerms);
		UPaymentTerms = UPayment.getAttribute("value");
		System.out.println("Print the updated PaymentTerms mode : " + UPaymentTerms);
		
		utilities.webDriverWait(driver, FPQS.Remarks);
		WebElement BRemark = driver.findElement(FPQS.Remarks);
		BRemarks = BRemark.getAttribute("value");
		System.out.println("Print the Remarks : " + BRemarks);
		driver.findElement(FPQS.Remarks).clear();
		driver.findElement(FPQS.Remarks).sendKeys("Test Remarks entered for testing");
		WebElement URemark = driver.findElement(FPQS.Remarks);
		URemarks = URemark.getAttribute("value");
		System.out.println("Print the updated Remarks : " + URemarks);
		
		
	}

	public void Verify_and_Print_the_updated_value() throws Throwable {
		
		if(Suppliername.equals(USupplier)) {
			System.out.println("Supplier Name not updated to '" +USupplier + "'" );
			
		}else {
			System.out.println("Process Name updated to '" + UProcess +"'");
			System.out.println("Supplier Name updated to '" + USupplier +"'");
			System.out.println("ExMillPrice value updated to '" + UMillPrice +"'");
			System.out.println("LeadTime days updated to '" + ULeadTime +"'");
			System.out.println("Payment Terms mode updated to '" + UPaymentTerms +"'");
			System.out.println("Remarks updated to '" + URemarks +"'");
//			System.out.println("Process Name updated to '" + UProcess +"'");
		}
//		UMillPrice, BLeadTime, ULeadTime, BPaymentTerms, UPaymentTerms, BRemarks, URemarks
	}

}
