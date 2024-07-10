package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class TrimSheetAcceptancePages extends DriverFactory {
	
	Utilities utilities 		= new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	
	public By modTrims				 	= By.xpath("//span[text()=' Trims ']");
	public By TrimDataEntry			= By.xpath("(//span[text()='Data Entry'])[3]");
	By scrTrimSheetAcceptance	= By.xpath("//a[contains(text(),'Trim Sheet Acceptance')]");
	By infoAcceptRejectedDate	= By.xpath("//small[text()='Accepted /Rejected Date']/following-sibling::p");
	By toastMsgAcceptReject		= By.xpath("//h2[text()='Trim Sheet Status Updated Successfully']");
	By buttRejectTrim			= By.xpath("//button[text()=' Reject Trim Sheet ']");
	By buttAcceptTrim			= By.xpath("//button[text()=' Accept Trim Sheet ']");
	
	By Accepttrim1 = By.xpath("//*[contains(text(),' Accept Trim Sheet ')]");
	By Accepttrim2 = By.xpath("(//button)[6]");
	
	By popReject				= By.xpath("(//div[@class='modal-header'])[1]");
	By buttpopSubmit			= By.xpath("//button[text()='Submit']");
	By buttpopCancel			= By.xpath("//button[text()='Cancel']");
	By valmsgMandatory			= By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Reason					= By.xpath("//textarea[@formcontrolname='reason']");
	By buttViewForPrint			= By.xpath("//button[text()=' View for Print ']");
	By navTrimPrintform			= By.xpath("//td[@class='p-2']/following-sibling::td[1]");
	By buttPFCancel				= By.xpath("(//button[text()='Cancel'])[2]");
	By navTrimSheetAccep		= By.xpath("//h3[text()='Trim Sheet Acceptance']");
	
	

	public void Login_with_the_Trim_Manager() throws Throwable {
		
		driver.findElement(RMUW.txtUN).clear();
		driver.findElement(RMUW.txtUN).sendKeys("Pandurang");
		driver.findElement(RMUW.txtPwd).clear();
		driver.findElement(RMUW.txtPwd).sendKeys("Abcd@123");
		
	}

	public void Navigate_to_Trim_Sheet_Acceptance_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, modTrims);
		driver.findElement(modTrims).click();
		utilities.webDriverWait(driver, TrimDataEntry);
		driver.findElement(TrimDataEntry).click();
		utilities.webDriverWait(driver, scrTrimSheetAcceptance);
		driver.findElement(scrTrimSheetAcceptance).click();
	}

	public void Verify_and_Print_the_Accepted_Rejected_Date() throws Throwable {
		utilities.webDriverWait(driver, infoAcceptRejectedDate);
		String ActRejdate = driver.findElement(infoAcceptRejectedDate).getText();
		System.out.println("Print the Accepted Rejected Date : '"+ActRejdate+"'");
	}

	public void Click_on_the_Reject_Trim_Sheet_button() throws Throwable {
		
        try {
            // Assuming utilities.webDriverWait is a custom method, replace it with WebDriverWait if needed
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(buttRejectTrim));
            acceptButton.click();
            System.out.println("Element clicked successfully");
            
//            combining all the test cases

            WebElement popRejectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(popReject));
            String reject = popRejectElement.getText();
            System.out.println("Print the Rejected window: '" + reject + "'");
            
            utilities.webDriverWait(driver, buttpopCancel);
    		driver.findElement(buttpopCancel).click();
    		
    		acceptButton.click();
    		
    		utilities.webDriverWait(driver, buttpopSubmit);
    		driver.findElement(buttpopSubmit).click();
    		Thread.sleep(1000);
    		driver.findElement(valmsgMandatory).click();
    		
    		utilities.webDriverWait(driver, valmsgMandatory);
    		
    		String mandatory = driver.findElement(valmsgMandatory).getText();
    		System.out.println("Display the validation msg : '"+mandatory+" '");
    		
    		utilities.webDriverWait(driver, Reason);
    		driver.findElement(Reason).click();
    		Thread.sleep(1000);
    		driver.findElement(Reason).sendKeys("Test reason for submitting");
    		
    		utilities.webDriverWait(driver, buttpopSubmit);
    		driver.findElement(buttpopSubmit).click();
//    		System.out.println("clicked on submit button in the popup window");
    		Thread.sleep(2000);
    		driver.findElement(toastMsgAcceptReject).click();
    		
//    		utilities.webDriverWait(driver, toastMsgAcceptReject);
    		String Approvereject = driver.findElement(toastMsgAcceptReject).getText();
    		System.out.println("Print the Accept or Rejected toaster msg : '"+Approvereject+"'");
    		
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("The respective IPO is already submitted or Reject button not found");
        }

		
//		    try {
//		    	utilities.webDriverWait(driver, buttRejectTrim);
//		        driver.findElement(buttRejectTrim).click();
//		        System.out.println("Element clicked successfully");
//		        utilities.webDriverWait(driver, popReject);
//				String reject = driver.findElement(popReject).getText();
//				System.out.println("Print the Rejected window : '"+reject+"'");
//		    } catch (Exception e) {
//		        System.out.println("The respective IPO is already submitted or Reject button not found");
//		        driver.quit();
//
//		    }
		    
//		utilities.webDriverWait(driver, buttRejectTrim);
//		WebElement element = driver.findElement(buttRejectTrim);
//		if (element.isDisplayed()) 
//		 {
//			 System.out.println("Entered into if statment");
//	            element.click();
//	            System.out.println("Element clicked successfully");
//	        }
//		 else {
//	        	System.out.println("The respective IPO is already submitted");
//	        }
	}

	public void Verify_whether_the_Reject_Trim_Sheet_popup_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, popReject);
		String reject = driver.findElement(popReject).getText();
		System.out.println("Print the Rejected window : '"+reject+"'");
	}

	public void Click_on_the_Submit_button_in_popup_window() throws Throwable {
		utilities.webDriverWait(driver, buttpopSubmit);
		driver.findElement(buttpopSubmit).click();
	}

	public void Click_on_Cancel_button_in_the_Reject_Trim_Sheet_popup() throws Throwable {
		utilities.webDriverWait(driver, buttpopCancel);
		driver.findElement(buttpopCancel).click();
	}

	public void Enter_the_Reason_for_Rejecting_the_Trim(String reason) throws Throwable {
		utilities.webDriverWait(driver, Reason);
		driver.findElement(Reason).sendKeys(reason);
	}

	public void Print_the_Rejected_successful_msg() throws Throwable {
		utilities.webDriverWait(driver, toastMsgAcceptReject);
		String Approvereject = driver.findElement(toastMsgAcceptReject).getText();
		System.out.println("Print the Accept or Rejected toaster msg : '"+Approvereject+"'");
	}

	public void Click_on_the_Accept_Trim_Sheet_button() throws Throwable {
		
		        try {
		            // Assuming utilities.webDriverWait is a custom method, replace it with WebDriverWait if needed
		            WebDriverWait wait = new WebDriverWait(driver, 10);
		            WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(buttAcceptTrim));
		            acceptButton.click();
		            System.out.println("Element clicked successfully");
		            
//		            combining all the test cases

		            WebElement popRejectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(popReject));
		            String accept = popRejectElement.getText();
		            System.out.println("Print the Accepted window: '" + accept + "'");
		            
		            utilities.webDriverWait(driver, buttpopCancel);
		    		driver.findElement(buttpopCancel).click();
		    		Thread.sleep(1000);
		    		acceptButton.click();
		    		Thread.sleep(1000);		    		
		    		utilities.webDriverWait(driver, Reason);
		    		driver.findElement(Reason).sendKeys("Test reason for submitting");
		    		
		    		utilities.webDriverWait(driver, buttpopSubmit);
		    		driver.findElement(buttpopSubmit).click();
		    		Thread.sleep(2000);
//		    		System.out.println("clicked on submit button in the popup window");
		    		driver.findElement(toastMsgAcceptReject).click();
//		    		utilities.webDriverWait(driver, toastMsgAcceptReject);
		    		String Approvereject = driver.findElement(toastMsgAcceptReject).getText();
		    		System.out.println("Print the Accept or Rejected toaster msg : '"+Approvereject+"'");
		    		
		        } catch (Exception e) {
		            System.out.println("An error occurred: " + e.getMessage());
		            System.out.println("The respective IPO is already submitted or Accept button not found");
		        }
		
		
//		 try {
//		    	utilities.webDriverWait(driver, buttAcceptTrim);
//		        driver.findElement(buttAcceptTrim).click();
//		        System.out.println("Element clicked successfully");
//		        utilities.webDriverWait(driver, popReject);
//				String accept = driver.findElement(popReject).getText();
//				System.out.println("Print the Accepted window : '"+accept+"'");
//		    } catch (Exception e) {
//		        System.out.println("The respective IPO is already submitted or Accept button not found");
//		        driver.quit();
//
//		    }

//		 try {
////			 another IPO
//		    	utilities.webDriverWait(driver, buttAcceptTrim);
//		        driver.findElement(buttRejectTrim).click();
//		        System.out.println("Element clicked successfully");
//		        utilities.webDriverWait(driver, popReject);
//				String reject = driver.findElement(popReject).getText();
//				System.out.println("Print the Rejected window : '"+reject+"'");
//		    } catch (Exception e) {
//		        System.out.println("The respective IPO is already submitted or Reject button not found");
////		        System.exit(0);
//
//		    }
//		utilities.webDriverWait(driver, Accepttrim1);
//		WebElement element = driver.findElement(Accepttrim1);
//		 if (element.isDisplayed()) {
//			 utilities.MinimumWait(driver);
//	            element.click();
//	            utilities.MinimumWait(driver);
//	            System.out.println("Element clicked successfully");
//	        }
//		 
//		 else {
//	        	System.out.println("The respective IPO is already submitted");
//	        }
	}

	public void Verify_whether_the_Accept_Trim_Sheet_popup_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, popReject);
		String reject = driver.findElement(popReject).getText();
		System.out.println("Print the Accepted window : '"+reject+"'");

	}

	public void Click_on_Cancel_button_in_the_Accept_Trim_Sheet_popup() throws Throwable {
		utilities.webDriverWait(driver, buttpopCancel);
		driver.findElement(buttpopCancel).click();
	}

	public void Enter_the_Reason_for_Accepting_the_Trim(String reason2) throws Throwable {
		utilities.webDriverWait(driver, Reason);
		driver.findElement(Reason).sendKeys(reason2);
	}

	public void Print_the_Accepted_successful_msg() throws Throwable {
		utilities.webDriverWait(driver, toastMsgAcceptReject);
		String Approvereject = driver.findElement(toastMsgAcceptReject).getText();
		System.out.println("Print the Accept or Rejected toaster msg : '"+Approvereject+"'");
	}

	public void Click_on_the_View_for_Print_button() throws Throwable {
		utilities.webDriverWait(driver, buttViewForPrint);
		driver.findElement(buttViewForPrint).click();
	}

	public void Verify_the_Trim_Print_form() throws Throwable {
		utilities.webDriverWait(driver, navTrimPrintform);
		String trimPF = driver.findElement(navTrimPrintform).getText();
		System.out.println("Print the Print Form header : ");
		System.out.println("'"+trimPF+"'");
		System.out.println();
	}

	public void Clicked_on_the_Cancel_button_in_the_Trim_Print_form() throws Throwable {
		utilities.webDriverWait(driver, buttPFCancel);
		driver.findElement(buttPFCancel).click();		
	}

	public void Verify_page_navigated_to_Trim_Sheet_Acceptance() throws Throwable {
		utilities.webDriverWait(driver, navTrimSheetAccep);
		String trimSheetAcc = driver.findElement(navTrimSheetAccep).getText();
		System.out.println("Navigated to : '"+trimSheetAcc+"'");
	}
	

}
