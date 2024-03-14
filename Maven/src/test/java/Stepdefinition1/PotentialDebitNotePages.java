package Stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Page.DailyInInputpages;
import Page.RevisedMUWorkingPages;
import util.DriverFactory;
import util.Utilities;

public class PotentialDebitNotePages extends DriverFactory {

	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	DailyInInputpages DIIP = new DailyInInputpages();
	Utilities utilities = new Utilities();
	
	By FabricStore = By.xpath("//span[text()='Fabric Store ']");
	By FSDataEntry = By.xpath("(//span[text()='Data Entry'])[2]");
	By PotentialNotes = By.xpath("//a[text()='Potential Debit Notes']");
	By buttReqApprovalClose = By.xpath("(//a[@title='Request Approval to Close'])[1]");
	By buttDebitNote = By.xpath("(//i[@class='ti-minus'])[5]");
	By buttCreditNote = By.xpath("(//i[@class='ti-plus'])[5]");
	By buttPrint = By.xpath("(//i[@class='ti-printer'])[1]");
	By navPotentialNotes = By.xpath("//h3[text()='Potential Debit Notes']");
	By ReqApprovalClose_popup = By.xpath("//div[@id='RemarksModal']/div[1]/div[1]/div[1]");
	By Remarks = By.xpath("//textarea[@formcontrolname='approvalorRejectRemarks']");
	By buttSubmit = By.xpath("(//button[@class='btn btn-primary'])[2]");
	By Mandatorymsg = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Successmsg = By.xpath("//h2[text()='Status Updated Successfully']");
	By navDebitNote = By.xpath("//h3[text()='Debit Note Details']");
	By navCerditNote = By.xpath("//h3[text()='Credit Note Details']");
	By Reason = By.xpath("//textarea[@formcontrolname='reason']");
	By buttSubmit_notes = By.xpath("(//button[text()='Submit'])[1]");
	By buttCancel_notes = By.xpath("//button[@id='closepagebutton']//i[1]");
	By Debitsucesssg = By.xpath("//div[@role='alert']");
	
	
	
	
	public void Login_with_the_Fabric_Manager() {
		driver.findElement(RMUW.txtUN).clear();
		driver.findElement(RMUW.txtUN).sendKeys("Lokesh");
		driver.findElement(RMUW.txtPwd).clear();
		driver.findElement(RMUW.txtPwd).sendKeys("Abcd@123");
		
	}

	public void Navigate_to_the_Potential_Debit_Note_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, FabricStore);
		driver.findElement(FabricStore).click();
		utilities.webDriverWait(driver, DIIP.Data_Entry);
		driver.findElement(DIIP.Data_Entry).click();
		utilities.webDriverWait(driver, PotentialNotes);
		driver.findElement(PotentialNotes).click();
		utilities.webDriverWait(driver, navPotentialNotes);
		driver.findElement(navPotentialNotes).isDisplayed();
		WebElement Potential = driver.findElement(navPotentialNotes);
		String PotentialNotes = Potential.getText();
		System.out.println("Page is navigated to - "+PotentialNotes);
		
		
	}

	public void Verify_the_Action_column() throws Throwable {
		utilities.webDriverWait(driver, buttReqApprovalClose);
		driver.findElement(buttReqApprovalClose).isDisplayed();
		WebElement Request = driver.findElement(buttReqApprovalClose);
		String RequestApp = Request.getTagName();
		System.out.println("Printing the Request Approval to Close button name : " +RequestApp);
		
		utilities.webDriverWait(driver, buttCreditNote);
		driver.findElement(buttCreditNote).isDisplayed();
		WebElement Credit = driver.findElement(buttCreditNote);
		String CreditNote = Credit.getTagName();
		System.out.println("Printing the Credit Note button name : " +CreditNote);
		
		utilities.webDriverWait(driver, buttDebitNote);
		driver.findElement(buttDebitNote).isDisplayed();
		WebElement Debit = driver.findElement(buttDebitNote);
		String DebitNote = Debit.getTagName();
		System.out.println("Printing the Debit Note button name : " +DebitNote);
		
		utilities.webDriverWait(driver, buttPrint);
		driver.findElement(buttPrint).isDisplayed();
		WebElement Print = driver.findElement(buttPrint);
		String Printbutton = Print.getTagName();
		System.out.println("Printing the Print button name : " +Printbutton);
	}

	public void Clicked_on_the_Request_Approval_Closed() throws Throwable {
		utilities.webDriverWait(driver, buttReqApprovalClose);
		driver.findElement(buttReqApprovalClose).click();
		
	}

	public void Check_whether_the_Request_Approval_To_Closed_popup_window_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, ReqApprovalClose_popup);
		driver.findElement(ReqApprovalClose_popup).isDisplayed();
		WebElement popupReq = driver.findElement(ReqApprovalClose_popup);
		String popupReqClose = popupReq.getText();
		System.out.println("Display the pop-up window name : " +popupReqClose);
	}

	public void Click_on_the_Submit_button_in_the_Reuest_Approval_Close_window() throws Throwable {
		utilities.webDriverWait(driver, buttSubmit);
		driver.findElement(buttSubmit).click();
		
	}

	public void Check_the_validation_msg_when_Remarks_field_has_null_values() throws Throwable {
//		utilities.webDriverWait(driver, Mandatorymsg);
		driver.findElement(Mandatorymsg).click();
		WebElement Mandatory = driver.findElement(Mandatorymsg);
		String ValidationMandatory = Mandatory.getText();
		System.out.println("Print the mandatory validation msg : " + ValidationMandatory);
	}

	public void Enter_Remarks_in_the_Reuest_Approval_Close_window() throws Throwable {
		utilities.webDriverWait(driver, Remarks);
		driver.findElement(Remarks).sendKeys("Test Remarks1 entered");
	}

	public void Verify_the_Successfiull_msgn_user_navigates_to_Login_page() throws Throwable {
//		utilities.webDriverWait(driver, Successmsg);
		driver.findElement(Successmsg).click();
		WebElement Success = driver.findElement(Successmsg);
		String Successmsg = Success.getText();
		System.out.println("Print the Successfull validation msg : " + Successmsg);
	}

	public void Click_on_the_Debit_Note_button_under_the_Actions_column() throws Throwable {
		utilities.webDriverWait(driver, buttDebitNote);
		driver.findElement(buttDebitNote).click();
	}

	public void Verify_whether_the_page_is_navigated_to_the_Debite_Note_form() throws Throwable {
		utilities.webDriverWait(driver, navDebitNote);
		driver.findElement(navDebitNote).isDisplayed();
		WebElement debit = driver.findElement(navDebitNote);
		String debitnote = debit.getText();
		System.out.println("Print the debit note form name : " +debitnote);
	}

	public void Verify_whether_the_mandatory_validation_msg_is_displayed() {
		driver.findElement(Mandatorymsg).click();
		WebElement Mandatory = driver.findElement(Mandatorymsg);
		String ValidationMandatory = Mandatory.getText();
		System.out.println("Print the mandatory validation msg : " + ValidationMandatory);
	}

	public void Enter_Reason_in_the_Debit_Note_form() throws Throwable {
		utilities.webDriverWait(driver, Reason);
		driver.findElement(Reason).sendKeys("Test reason1 entered in the field");
		
	}
	
	public void Verify_the_success_msg_on_submitting_the_Notes() {
		driver.findElement(Debitsucesssg).isDisplayed();
		WebElement Debitsucessmsg = driver.findElement(Debitsucesssg);
		String Success = Debitsucessmsg.getText();
		System.out.println("Print the mandatory validation msg : " + Success);
	}


	public void Verify_whether_the_page_is_navigated_to_the_Potential_Debit_Note_screen() throws Throwable {
		utilities.webDriverWait(driver, navDebitNote);
		driver.findElement(navDebitNote).isDisplayed();
		WebElement debit = driver.findElement(navDebitNote);
		String debitnote = debit.getText();
		System.out.println("Print the Debit Note page name : "+debitnote);
 	}

	public void Navigate_to_the_Potential_Credit_Note_screen() throws Throwable {
		utilities.webDriverWait(driver, navPotentialNotes);
		driver.findElement(navPotentialNotes).isDisplayed();
		WebElement Potential = driver.findElement(navPotentialNotes);
		String PotentialNotes = Potential.getText();
		System.out.println("Page is navigated to - "+PotentialNotes);
		
	}

	public void Click_on_the_Credit_Note_button_under_the_Actions_column() throws Throwable {
		utilities.webDriverWait(driver, buttCreditNote);
		driver.findElement(buttCreditNote).click();
	}

	public void Enter_Reason_in_the_Credit_Note_form() throws Throwable {
		utilities.webDriverWait(driver, Reason);
		driver.findElement(Reason).sendKeys("Test Credit reason1 entered in the field");
	}

	public void Verify_whether_the_page_is_navigated_to_the_Potential_Credite_Note_screen() throws Throwable {
		utilities.webDriverWait(driver, navCerditNote);
		driver.findElement(navCerditNote).isDisplayed();
		WebElement credit = driver.findElement(navCerditNote);
		String creditnote = credit.getText();
		System.out.println("Print the Credit Note page name : "+creditnote);	
	}

	public void Verify_the_Successfull_msg() throws Throwable {
//		utilities.webDriverWait(driver, Debitsucesssg);
		driver.findElement(Debitsucesssg).isDisplayed();
		WebElement credit = driver.findElement(Debitsucesssg);
		String creditState = credit.getText();
		System.out.println("Print the successfull msg displayed on submitting the notes : "+creditState);
	}

	public void Click_on_Submit_button_in_the_Dedit_note_form() throws Throwable {
		utilities.webDriverWait(driver, buttSubmit_notes);
		driver.findElement(buttSubmit_notes).click();
	}

	public void Click_on_Submit_button_in_the_Credit_note_form() throws Throwable {
		utilities.webDriverWait(driver, buttSubmit_notes);
		driver.findElement(buttSubmit_notes).click();
	}

//	public void Verify_whether_the_page_is_navigated_to_the_Potential_Credite_Note_screen() {
//		// TODO Auto-generated method stub
//		
//	}


}
